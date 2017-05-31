package com.gamecenter.service.tasks;

import java.util.HashMap;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.annotation.Resource;

import com.gamecenter.controller.webservice.PayReqObj;
import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.parBean.vo.ComPars;
import com.gamecenter.service.PayTxService;
import com.gamecenter.service.RunLog;

/**
 * 发货通知处理 Created by IntelliJ IDEA. User: Administrator Date: 13-8-15 Time: 下午3:38 To change this template use File | Settings | File Templates.
 */
public class PayHandle {
	
	@Resource
	PayTxService payTxService;
	
	/**
	 * 充值发货处理
	 */
	public static final ConcurrentLinkedQueue<PayReqObj> payReqObjs = new ConcurrentLinkedQueue<PayReqObj>();
	
	public static String appkey;
	public static String msgkey;
	public static String serverurl;
	public static String appid;
	public static String stoptime;
	
	public static int handleNum = 0;
	public static int errorNum = 0;
	public static int okNum = 0;
	
	/**
	 * 任务入口，3秒
	 */
	public synchronized void work() {
		
		int res = 0;
		int size = payReqObjs.size(); // 本次操作执行次数
		
		PayReqObj obj = null;
		
		while (size > 0) {
			obj = payReqObjs.poll();
			if (obj != null) {
				res = logic((PayReqObj) obj);
				if (res == -1) {
					payReqObjs.add(obj);
					errorNum++;
				} else {
					okNum++;
				}
				RunLog.payLog.info("派发动作结束：（" + (res == 1 ? "成功" : "失败") + "）");
			}
			size--;
		}
		
	}
	
	/**
	 * 配置初始化
	 */
	public void init() {
		System.out.println("数据初始化");
		ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		msgkey = bundle.getString("msgkey");
		appkey = bundle.getString("appkey");
		serverurl = bundle.getString("serverurl");
		appid = bundle.getString("appid");
		stoptime = bundle.getString("stoptime");
	}
	
	/**
	 * 发货逻辑处理
	 */
	private int logic(PayReqObj reqObj) {
		RunLog.payLog.info("");
		RunLog.payLog.info("********派发动作：单号(" + reqObj.getBillno() + ")************");
		RunLog.payLog.info("单号：" + reqObj.getBillno());
		RunLog.payLog.info("账号：" + reqObj.getOpenid());
		RunLog.payLog.info("物品：" + reqObj.getPayitem());
		RunLog.payLog.info("分区：" + reqObj.getZoneid());
		RunLog.payLog.info("Q点：" + reqObj.getAmt());
		
		handleNum++;
		
		// 核实该单号 是否存在
		boolean isexist = false;
		try {
			isexist = payTxService.isExist(reqObj.getBillno());
		} catch (Exception e) {
			e.printStackTrace();
			RunLog.payLog.error("", e);
			return -1; // 数据库异常
		}
		
		// 保存数据
		if (!isexist) { // 不存在的单号
			RunLog.payLog.info("记录入库操作...");
			OpOssQlzRechargeTx opOssQlzRechargeTx = new OpOssQlzRechargeTx();
			opOssQlzRechargeTx.setAmt(reqObj.getAmt());
			opOssQlzRechargeTx.setAppid(reqObj.getAppid());
			opOssQlzRechargeTx.setBillno(reqObj.getBillno());
			opOssQlzRechargeTx.setOpenid(reqObj.getOpenid());
			opOssQlzRechargeTx.setPayamtCoins(reqObj.getPayamt_coins());
			opOssQlzRechargeTx.setPayitem(reqObj.getPayitem());
			if (reqObj.getPubacct_payamt_coins() == null || reqObj.getPubacct_payamt_coins().equals("")) {
				reqObj.setPubacct_payamt_coins("0");
			}
			opOssQlzRechargeTx.setPubacctPayamtCoins(reqObj.getPubacct_payamt_coins());
			opOssQlzRechargeTx.setSig(reqObj.getSig());
			opOssQlzRechargeTx.setProvidetype(reqObj.getProvidetype());
			opOssQlzRechargeTx.setZoneid(reqObj.getZoneid());
			opOssQlzRechargeTx.setVersion(reqObj.getVersion());
			opOssQlzRechargeTx.setToken(reqObj.getToken());
			opOssQlzRechargeTx.setTs(reqObj.getTs());
			try {
				payTxService.insert(opOssQlzRechargeTx);
			} catch (Exception e) {
				e.printStackTrace();
				RunLog.payLog.error("", e);
				return -1;
			}
		}
		
		confirmOk(reqObj);
		
		return 1;
	}
	
	/**
	 * 确认充值ok (应用-->平台）
	 * 
	 * @param reqObj
	 */
	private int confirmOk(PayReqObj reqObj) {
		RunLog.payLog.info("派发确认...");
		
		// 获取公共参数
		ComPars comPars = payTxService.getComPars(reqObj.getOpenid());
		
		// 构造调用参数
		HashMap<String, String> parmap = new HashMap<String, String>();
		parmap.put("openid", comPars.getOpenid());
		parmap.put("openkey", comPars.getOpenkey());
		parmap.put("appid", comPars.getAppid());
		parmap.put("pf", comPars.getPf());
		parmap.put("ts", "" + (System.currentTimeMillis() / 1000));
		parmap.put("payitem", reqObj.getPayitem());
		parmap.put("token_id", reqObj.getToken());
		parmap.put("billno", reqObj.getBillno());
		parmap.put("version", reqObj.getVersion());
		parmap.put("zoneid", reqObj.getZoneid());
		parmap.put("providetype", reqObj.getProvidetype());
		parmap.put("provide_errno", "0");
		parmap.put("provide_errmsg", "ok");
		parmap.put("amt", reqObj.getAmt());
		parmap.put("payamt_coins", reqObj.getPayamt_coins());
		parmap.put("pubacct_payamt_coins", reqObj.getPubacct_payamt_coins());
		
		PayConfirm.confirmMap.add(new Object[] { parmap, 10 });
		
		return 1;
	}
	
}
