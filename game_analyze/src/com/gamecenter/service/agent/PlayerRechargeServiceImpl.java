package com.gamecenter.service.agent;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.game.protocol.gm.GmRechargeHttpProtocol;
import com.game.protocol.gm.GmRechargeProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.Tools;
import com.gamecenter.common.encrypt.MD5;
import com.gamecenter.mapper.OpOperatorRechargeMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOperatorRecharge;
import com.gamecenter.model.OpOperatorRechargeExample;
import com.gamecenter.service.RunLog;

/**
 * ClassName:PlayerRechargeServiceImpl <br/>
 * Function: TODO (玩家充值服务). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月21日 上午9:32:07 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Service
public class PlayerRechargeServiceImpl implements PlayerRechargeService {
	@Resource
	OpOperatorRechargeMapper opOperatorRechargeMapper;
	
	@Override
	public void insert(OpOperatorRecharge t) {
		// TODO Auto-generated method stub
		opOperatorRechargeMapper.insert(t);
	}
	
	@Override
	public void update(OpOperatorRecharge t) {
		// TODO Auto-generated method stub
		opOperatorRechargeMapper.updateByPrimaryKey(t);
	}
	
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		opOperatorRechargeMapper.deleteByPrimaryKey((int) id);
	}
	
	@Override
	public OpOperatorRecharge findById(long id) {
		// TODO Auto-generated method stub
		return opOperatorRechargeMapper.selectByPrimaryKey((int) id);
	}
	
	@Override
	public int recharge(String pssport, String billno, double dPrice,double money, int time, String sid, String flag,OpGameworld opGameworld) {
		
		long status = 0;
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
			// SendReqToGame con = SendReqToGame.getInstance();
			// con.init(BaseApiController.gameip, Integer.parseInt(BaseApiController.gameport));
			// Recharge_request recharge = new Recharge_request();
			// recharge.setBillon(billno);
			// recharge.setOpenid(pssport);
			//
			//
			// recharge.setMoney((int) (money * ratio) + ""); // 金币
			//
			// recharge.setExtendstr("all");
			// recharge.setSigstr(MD5.encodeMD5(recharge.getOpenid() + recharge.getBillon() + recharge.getMoney() + BaseApiController.insidekey));
			// res = con.sendMessage(recharge, BaseApiController.worldid.trim()).toString();
	
			
			GmRechargeProtocolRequest req = new GmRechargeProtocolRequest();
			req.setBillon(billno); // 平台单号
			req.setExtendstr(""+dPrice);
			req.setMoney(""+ money);
			req.setOpenid(pssport);
			
			req.setSigstr(MD5.encodeMD5(req.getOpenid() + req.getBillon() + req.getMoney() + "123456"));
			req.setServerId("" + sid);
			GmRechargeHttpProtocol resp = (GmRechargeHttpProtocol) PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
			res = resp.getResult();
			
			// 日志记录
			if (res.equals("1")) {
				OpOperatorRecharge opOperatorRecharge = new OpOperatorRecharge();
				opOperatorRecharge.setPassport(pssport);
				opOperatorRecharge.setBillno(billno);
				opOperatorRecharge.setMoney(dPrice);
				opOperatorRecharge.setGold((int)money);
				opOperatorRecharge.setTime(time);
				opOperatorRecharge.setSid(sid);
				opOperatorRecharge.setFlag(flag);
				opOperatorRecharge.setAddtime(Tools.getNowDate());
				opOperatorRecharge.setRes(res);
				num = opOperatorRechargeMapper.insertSelective(opOperatorRecharge);
				RunLog.logDao.info("发货结果:单号(" + billno + ") " + res);
			} else {
				RunLog.payLog.error(res+"::充值处理异常：" + billno);
			}
		} catch (Exception e) {
			RunLog.payLog.error("充值异常：", e);
		}
		if (res.equals("1") && num == 1) {
			status = 1;
		} else {
			status = 2;
		}
		return (int)status;
	}

	@Override
	public List<OpOperatorRecharge> findOpOperatorRechargeByWorldIdAndTime(String worldId, String beginTime, String endTime) {
		// TODO Auto-generated method stub
		OpOperatorRechargeExample opOperatorRechargeExample = new OpOperatorRechargeExample();
		OpOperatorRechargeExample.Criteria criteria = opOperatorRechargeExample.createCriteria();
		criteria.andSidEqualTo(worldId);
		criteria.andAddtimeBetween(beginTime, endTime);
		return opOperatorRechargeMapper.selectByExample(opOperatorRechargeExample);
	}

	@Override
	public double payCount(String worldId, String beginTime, String endTime) {
		// TODO Auto-generated method stub
		OpOperatorRechargeExample opOperatorRechargeExample = new OpOperatorRechargeExample();
		OpOperatorRechargeExample.Criteria criteria = opOperatorRechargeExample.createCriteria();
		criteria.andSidEqualTo(worldId);
		criteria.andAddtimeBetween(beginTime, endTime);
		
		return opOperatorRechargeMapper.payCount(opOperatorRechargeExample);
	}
	
}
