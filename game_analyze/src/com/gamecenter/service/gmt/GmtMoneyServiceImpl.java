package com.gamecenter.service.gmt;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.game.protocol.gm.GmRechargeHttpProtocol;
import com.game.protocol.gm.GmRechargeProtocolRequest;
import com.gamecenter.common.Page;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.Tools;
import com.gamecenter.common.encrypt.MD5;
import com.gamecenter.mapper.OpGmtSendmoneyLogMapper;
import com.gamecenter.mapper.OpGmtSendmoneyMapper;
import com.gamecenter.mapper.OpGmtSendmoneyPayMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtSendmoney;
import com.gamecenter.model.OpGmtSendmoneyExample;
import com.gamecenter.model.OpGmtSendmoneyLog;
import com.gamecenter.model.OpGmtSendmoneyLogExample;
import com.gamecenter.model.OpGmtSendmoneyPay;
import com.gamecenter.model.OpGmtSendmoneyPayExample;
import com.gamecenter.parBean.vo.GmtSendMoneyBean;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.DataUpHandleService;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-8 Time: 上午11:44 To change this template use File | Settings | File Templates.
 */
@Repository
public class GmtMoneyServiceImpl implements GmtMoneyService {
	
	@Resource
	OpGmtSendmoneyMapper opGmtSendmoneyMapper;
	@Resource
	DataUpHandleService dataUpHandleService;
	@Resource
	WorldService worldService;
	@Resource
	OpGmtSendmoneyPayMapper opGmtSendmoneyPayMapper;
	@Resource
	OpGmtSendmoneyLogMapper opGmtSendmoneyLogMapper;
	
	public int insertApply(OpGmtSendmoney opGmtSendmoney) {
		
		int res = opGmtSendmoneyMapper.insertSelective(opGmtSendmoney);
		return res;
	}
	
	public List<OpGmtSendmoney> getApplyList() {
		OpGmtSendmoneyExample opGmtSendmoneyExample = new OpGmtSendmoneyExample();
		OpGmtSendmoneyExample.Criteria criteria = opGmtSendmoneyExample.createCriteria();
		opGmtSendmoneyExample.setOrderByClause("addtime desc");
		
		List<OpGmtSendmoney> opGmtSendmoneys = opGmtSendmoneyMapper.selectByExample(opGmtSendmoneyExample);
		return opGmtSendmoneys;
	}
	
	public OpGmtSendmoney getApplyListById(int applyId) {
		OpGmtSendmoney opGmtSendmoney = opGmtSendmoneyMapper.selectByPrimaryKey(applyId);
		return opGmtSendmoney; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public int checkApply(OpGmtSendmoney opGmtSendmoney) {
		OpGmtSendmoneyExample opGmtSendmoneyExample = new OpGmtSendmoneyExample();
		OpGmtSendmoneyExample.Criteria criteria = opGmtSendmoneyExample.createCriteria();
		criteria.andAppidEqualTo(opGmtSendmoney.getAppid());
		
		int res = opGmtSendmoneyMapper.updateByExampleSelective(opGmtSendmoney, opGmtSendmoneyExample);
		
		return res; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public String sendMoney(GmtSendMoneyBean gmtSendMoneyBean) {
		
		String res = "";
		// 获取账号信息
		List<String> passports = new ArrayList<String>();
		if (gmtSendMoneyBean.getType().equals("1")) { // 指定账号发放
			if (gmtSendMoneyBean.getPassports() != null) {
				String[] pps = gmtSendMoneyBean.getPassports().split(",");
				for (String pid : pps) {
					passports.add(pid);
				}
			}
			
		} else if (gmtSendMoneyBean.getType().equals("2")) { // 全部账号发放
			passports = dataUpHandleService.getPassportIdsStr(gmtSendMoneyBean.getWid() + "");
		}
		
		// 获取区服信息
		OpGameworld opGameworld = worldService.getWorldByWid(gmtSendMoneyBean.getWid());
		
		// 发放动作
		
		// 记录发放日志
		OpGmtSendmoneyLog opGmtSendmoneyLog = new OpGmtSendmoneyLog();
		opGmtSendmoneyLog.setAppid(gmtSendMoneyBean.getAppid());
		opGmtSendmoneyLog.setWorldid(gmtSendMoneyBean.getWid() + "");
		opGmtSendmoneyLog.setApplyid(Integer.parseInt(gmtSendMoneyBean.getApplyid()));
		opGmtSendmoneyLog.setMsg(gmtSendMoneyBean.getMsg());
		opGmtSendmoneyLog.setPassports(Integer.parseInt(gmtSendMoneyBean.getType()) == 1 ? gmtSendMoneyBean.getPassports() : "全服");
		opGmtSendmoneyLog.setType(Integer.parseInt(gmtSendMoneyBean.getType()));
		opGmtSendmoneyLog.setOpttime(Tools.getNowDate());
		opGmtSendmoneyLog.setOptres(res); // 发放结果
		opGmtSendmoneyLog.setUsername(gmtSendMoneyBean.getUser());
		opGmtSendmoneyLogMapper.insertSelective(opGmtSendmoneyLog);
		
		//内充
		StringBuffer failStr = new StringBuffer(); // 发送失败的账号
		int num = 0;
		for (String pid : passports) {
			try {
				GmRechargeProtocolRequest req = new GmRechargeProtocolRequest();
				req.setBillon("lyh:" + System.currentTimeMillis()); // 平台单号
				req.setExtendstr("0");
				req.setMoney(gmtSendMoneyBean.getMoney());
				req.setOpenid(pid);
				req.setSigstr(MD5.encodeMD5(req.getOpenid() + req.getBillon() + req.getMoney() + "123456"));
				req.setServerId(opGameworld.getWorldid());
				GmRechargeHttpProtocol resp = (GmRechargeHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				res = resp.getResult();
				//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(recharge_request, opGameworld.getWorldid()).toString();
				System.out.println("发送金币：" + res + ",openid:" + pid);
				
				// 记录充值日志。
				if (res.equals("1")) {
					num++;
					OpGmtSendmoneyPay opGmtSendmoneyPay = new OpGmtSendmoneyPay();
					opGmtSendmoneyPay.setAddtime(Tools.getNowDate());
					opGmtSendmoneyPay.setAppid(gmtSendMoneyBean.getAppid());
					opGmtSendmoneyPay.setWorldid(opGameworld.getWorldid() + "");
					opGmtSendmoneyPay.setOrderid(System.currentTimeMillis() + "");
					opGmtSendmoneyPay.setMoney(Double.parseDouble(gmtSendMoneyBean.getMoney()));
					opGmtSendmoneyPay.setPassport(pid);
					opGmtSendmoneyPay.setSendid(opGmtSendmoneyLog.getDid());
					opGmtSendmoneyPayMapper.insertSelective(opGmtSendmoneyPay);
				} else {
					failStr.append(pid + ",");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
		// 发送失败的账号
		String fails = failStr.toString();
		if (fails != null && fails.length() > 0) {
			fails = fails.substring(0, fails.length() - 1);
			res = "失败账户：" + fails;
		} else {
			res = "ok";
		}
		// 更新本次发送结果
		OpGmtSendmoneyLog obj = new OpGmtSendmoneyLog();
		obj.setDid(opGmtSendmoneyLog.getDid());
		obj.setOptres(res + ",成功发送" + num + "个");
		opGmtSendmoneyLogMapper.updateByPrimaryKeySelective(obj);
		
		return res;
	}
	
	public List<OpGmtSendmoneyLog> getSendLogList() {
		OpGmtSendmoneyLogExample opGmtSendmoneyLogExample = new OpGmtSendmoneyLogExample();
		OpGmtSendmoneyLogExample.Criteria criteria = opGmtSendmoneyLogExample.createCriteria();
		opGmtSendmoneyLogExample.setOrderByClause("opttime desc");
		
		List<OpGmtSendmoneyLog> opGmtSendmoneyLogs = opGmtSendmoneyLogMapper.selectByExample(opGmtSendmoneyLogExample);
		return opGmtSendmoneyLogs;
	}
	
	public Page getMoneyList(OpGmtSendmoneyPay obj, int pageSize, int pageNumber) {
		OpGmtSendmoneyPayExample example = new OpGmtSendmoneyPayExample();
		OpGmtSendmoneyPayExample.Criteria criteria = example.createCriteria();
		if (obj != null) {
			if (obj.getAddtime() != null) {
				criteria.andAddtimeBetween(obj.getAddtime().split("#")[0], obj.getAddtime().split("#")[1]);
			}
			if (obj.getWorldid() != null) {
				criteria.andWorldidEqualTo(obj.getWorldid());
			}
		}
		example.setOrderByClause("addtime desc");
		// 获取总的记录数量
		int count = this.opGmtSendmoneyPayMapper.countByExample(example);
		
		// 获取指定的页码数据
		example.setBeginNum((pageNumber - 1) * pageSize);
		example.setEndNum(pageSize);
		List<OpGmtSendmoneyPay> list = this.opGmtSendmoneyPayMapper.getPageList(example);
		
		// 组合返回page
		Page page = new Page(pageNumber, count, pageSize, list);
		return page;
	}
	
	public double getPayCount(OpGmtSendmoneyPay obj) {
		OpGmtSendmoneyPayExample example = new OpGmtSendmoneyPayExample();
		OpGmtSendmoneyPayExample.Criteria criteria = example.createCriteria();
		if (obj != null) {
			if (obj.getAddtime() != null) {
				criteria.andAddtimeBetween(obj.getAddtime().split("#")[0], obj.getAddtime().split("#")[1]);
			}
			if (obj.getWorldid() != null) {
				criteria.andWorldidEqualTo(obj.getWorldid());
			}
		}
		double count = opGmtSendmoneyPayMapper.paycount(example);
		return count;
	}
}
