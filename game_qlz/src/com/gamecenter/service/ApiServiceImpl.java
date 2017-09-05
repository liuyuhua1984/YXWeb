package com.gamecenter.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.common.MD5;
import com.gamecenter.common.Tools;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.PassportMsg_request;
import com.gamecenter.common.packets.PassportMsg_response;
import com.gamecenter.common.packets.Recharge_request;
import com.gamecenter.controller.BaseApiController;
import com.gamecenter.mapper.OpOperatorRechargeMapper;
import com.gamecenter.model.OpOperatorRecharge;
import com.gamecenter.model.OpOperatorRechargeExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-26 Time: 下午5:39 To change this template use File | Settings | File Templates.
 */
@Repository
public class ApiServiceImpl implements ApiService {
	
	@Resource
	OpOperatorRechargeMapper opOperatorRechargeMapper;
	
	public int recharge(String pssport, String billno, double money, int time, int sid, String flag) {
		
		int status = 0;
		int num = 0;
		String res = ""; // 发货结果
		try {
			// 核实订单是否存在
			OpOperatorRechargeExample opOperatorRechargeExample = new OpOperatorRechargeExample();
			OpOperatorRechargeExample.Criteria criteria = opOperatorRechargeExample.createCriteria();
			criteria.andBillnoEqualTo(billno);
			status = opOperatorRechargeMapper.countByExample(opOperatorRechargeExample);
			if (status > 0) {
				RunLog.logDao.info("单号(" + billno + ") 重复.");
				return 4;
			}
			
			// 发货
			SendReqToGame con = SendReqToGame.getInstance();
			con.init(BaseApiController.gameip, Integer.parseInt(BaseApiController.gameport));
			Recharge_request recharge = new Recharge_request();
			recharge.setBillon(billno);
			recharge.setOpenid(pssport);
			
			int ratio = 10; // 比率
			try {
				ratio = Integer.parseInt(BaseApiController.rechargeRatio.substring(2));
			} catch (Exception e) {
				ratio = 10;
			}
			recharge.setMoney((int) (money * ratio) + ""); // 金币
			
			recharge.setExtendstr("all");
			recharge.setSigstr(MD5.encodeMD5(recharge.getOpenid() + recharge.getBillon() + recharge.getMoney() + BaseApiController.insidekey));
			res = con.sendMessage(recharge, BaseApiController.worldid.trim()).toString();
			RunLog.logDao.info("发货结果:单号(" + billno + ") " + res);
			
			// 日志记录
			OpOperatorRecharge opOperatorRecharge = new OpOperatorRecharge();
			opOperatorRecharge.setPassport(pssport);
			opOperatorRecharge.setBillno(billno);
			opOperatorRecharge.setMoney(money);
			opOperatorRecharge.setTime(time);
			opOperatorRecharge.setSid(sid);
			opOperatorRecharge.setFlag(flag);
			opOperatorRecharge.setAddtime(Tools.getNowDate());
			opOperatorRecharge.setRes(res);
			num = opOperatorRechargeMapper.insertSelective(opOperatorRecharge);
			
		} catch (Exception e) {
			RunLog.payLog.error("充值处理异常：", e);
		}
		if (res.equals("1") && num == 1) {
			status = 1;
		} else {
			status = 2;
		}
		return status;
	}
	
	public Object checkUser(String pssport, int sid) {
		String status = "0";
		try {
			PassportMsg_request passportMsg_request = new PassportMsg_request();
			passportMsg_request.setType("1");
			passportMsg_request.setActstr(pssport);
			
			SendReqToGame con = SendReqToGame.getInstance();
			con.init(BaseApiController.gameip, Integer.parseInt(BaseApiController.gameport));
			Object res = SendReqToGame.getInstance().sendMessage(passportMsg_request, BaseApiController.worldid.trim());
			
			PassportMsg_response passportMsg_response = null;
			if (res instanceof String) {
				passportMsg_response = new PassportMsg_response();
				if (res.equals("-1000")) {
					passportMsg_response.setResult("链接失败！");
				} else if (res.equals("-1001") || res.equals("-1002")) {
					passportMsg_response.setResult("登入失败！");
				} else {
					passportMsg_response.setResult("res:" + res);
				}
				status = "2";
				
			} else if (res instanceof PassportMsg_response) {
				
				passportMsg_response = (PassportMsg_response) res;
				if (passportMsg_response.getResult().equals("-1")) {
					passportMsg_response.setResult("不存在的账号!");
					status = "5";
					RunLog.logDao.info("账号获取:不存在的账号!");
				} else {
					return res;
				}
			}
		} catch (Exception e) {
			RunLog.logDao.info("账号获取异常:" + e.toString());
			status = "2";
		}
		return status;
	}
}
