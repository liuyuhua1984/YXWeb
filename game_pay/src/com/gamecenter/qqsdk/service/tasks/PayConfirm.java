package com.gamecenter.qqsdk.service.tasks;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.annotation.Resource;

import org.apache.avro.data.Json;

import com.alibaba.fastjson.JSON;
import com.game.protocol.gm.GmQqRechargeHttpProtocol;
import com.game.protocol.gm.GmQqRechargeProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.HttpClient;
import com.gamecenter.common.MD5;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.RechargeForTx_request;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.qqsdk.common.com.qq.open.OpenApiV3;
import com.gamecenter.qqsdk.common.org.json.JSONObject;
import com.gamecenter.qqsdk.service.PayTxService;
import com.gamecenter.qqsdk.service.RunLog;
import com.gamecenter.qqsdk.service.WorldService;
import com.lyh.dataup.convert.GameConvertData;

/**
 * 订单的确认发货 Created by IntelliJ IDEA. User: Administrator Date: 13-8-15 Time: 下午3:38 To change this template use File | Settings | File Templates.
 */
public class PayConfirm {
	@Resource
	PayTxService payTxService;
	@Resource
	WorldService worldService;
	
	/**
	 * 重复确认信息
	 */
	public static final ConcurrentLinkedQueue<Object[]> confirmMap = new ConcurrentLinkedQueue<Object[]>();
	
	/**
	 * 任务入口，3秒
	 */
	public synchronized void work() {
		
		int res = 0;
		int size = 0;
		
		// 订单的核对出来
		size = confirmMap.size();
		int cishu = 0;
		while (size > 0) {
			Object[] optobj = confirmMap.poll();
			cishu = Integer.parseInt(optobj[1].toString());
			
			if (cishu > 0) {
				res = checkMsg((HashMap<String, String>) optobj[0]);
				cishu = cishu - 1;
				if (res != 0 && cishu > 0) {
					optobj[1] = cishu;
					confirmMap.add(optobj);
					
				} else if (res == 0) {
					RunLog.payLog.info("定单[" + ((HashMap<String, String>) optobj[0]).get("billno") + "]已经确认成功!");
					
				} else {
					RunLog.payLog.warn("注意:定单[" + ((HashMap<String, String>) optobj[0]).get("billno") + "]已经确认N次还是失败!");
				}
			}
			size--;
		}
		
	}
	
	/**
	 * 发送确认信息
	 * 
	 * @param parmap
	 * @return
	 */
	private int checkMsg(HashMap<String, String> parmap) {
		RunLog.payLog.info(">>确认动作:单号：(" + parmap.get("billno") + ")");
		
		int res = 0;
		String resMsg = "";
		try {
			OpenApiV3 openApiV3 = new OpenApiV3(PayHandle.appid, PayHandle.appkey);
			openApiV3.setServerName(PayHandle.serverurl);
			
			parmap.remove("ts");
			parmap.put("ts", "" + (System.currentTimeMillis() / 1000));
			
			resMsg = openApiV3.api("/v3/pay/confirm_delivery", parmap, "https");
			
			JSONObject jo = null;
			try {
				jo = new JSONObject(resMsg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 检测ret值
			res = jo.optInt("ret", 0);
			
		} catch (Exception e) {
			e.printStackTrace();
			RunLog.payLog.info("发送确定异常:" + e);
			res = -1;
		}
		// 信息更新
		payTxService.payConfirm(parmap.get("billno"), res);
		
		RunLog.payLog.info("结果resMsg:" + resMsg);
		
		// 核对成功发货
		if (res == 0) {
			sendMoney(parmap);
		}
		return res;
	}
	
	/**
	 * 发货逻辑
	 * 
	 * @param parmap
	 * @return
	 */
	private String sendMoney(HashMap<String, String> parmap) {
		RunLog.payLog.info(">>发货动作：单号(" + parmap.get("billno") + ")");
		// 发货逻辑
		String result = "-1";
		try {
			// 根据分区ID，获取服务器的IP，端口
			
			OpGameworld opGameworld = worldService.getWoldByAppIdAndWorldId(parmap.get("appid"), parmap.get("zoneid"));
			if (opGameworld != null) {
				
				// 发货
				GmQqRechargeProtocolRequest req = new GmQqRechargeProtocolRequest();
				req.setBillno(parmap.get("billno"));
				req.setOpenid(parmap.get("openid"));
				req.setPayitem(parmap.get("payitem"));
				req.setToken(parmap.get("token_id"));
				req.setTs("" + System.currentTimeMillis() / 1000);
				req.setSigstr(MD5.encodeMD5(parmap.get("openid") + parmap.get("payitem") + parmap.get("billno") + PayHandle.msgkey));
				req.setServerId(parmap.get("zoneid"));
				
				
				GmQqRechargeHttpProtocol resp = (GmQqRechargeHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(),opGameworld.getServerurl(), req);
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				result = SendReqToGame.getInstance().sendMessage(rechargeForTx_request, parmap.get("zoneid")).toString();
				result = resp.result;
				RunLog.payLog.info("充值结果：result>" + result);
			} else {
				RunLog.payLog.warn("发货异常：单号(" + parmap.get("billno") + ")");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunLog.payLog.warn("发货异常：单号(" + parmap.get("billno") + ")", e);
			return "-1";
		}
		
		if (result.equals("1")) {
			try {
				payTxService.payOk(parmap.get("billno"));
			} catch (Exception e) {
				RunLog.payLog.warn("[关键]状态更新失败，成功发货：单号(" + parmap.get("billno") + ")");
				e.printStackTrace();
			}
		} else {
			RunLog.payLog.warn("发货不成功：单号(" + parmap.get("billno") + ")，充值结果状态（" + result + "）");
			return "-1";
		}
		return result;
	}
	
}
