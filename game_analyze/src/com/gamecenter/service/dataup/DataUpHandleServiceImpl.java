package com.gamecenter.service.dataup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.gamecenter.common.Page;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.common.jms.DataMessageCreator;
import com.gamecenter.mapper.OpOssQlzConsumeLogMapper;
import com.gamecenter.mapper.OpOssQlzCreateroleLogMapper;
import com.gamecenter.mapper.OpOssQlzLoginLogMapper;
import com.gamecenter.mapper.OpOssQlzOnlinecurLogMapper;
import com.gamecenter.mapper.OpOssQlzOutLogMapper;
import com.gamecenter.mapper.OpOssQlzPassportMapper;
import com.gamecenter.mapper.OpOssQlzPassportRegMapper;
import com.gamecenter.mapper.OpOssQlzRechargeLogMapper;
import com.gamecenter.model.OpOssQlzConsumeLog;
import com.gamecenter.model.OpOssQlzCreateroleLog;
import com.gamecenter.model.OpOssQlzLoginLog;
import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.model.OpOssQlzOutLog;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpOssQlzPassportExample;
import com.gamecenter.model.OpOssQlzPassportReg;
import com.gamecenter.model.OpOssQlzRechargeLog;
import com.gamecenter.parBean.jmsMsg.StatusConCommand;

/**
 * 数据上报的处理 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 下午10:49 To change this template use File | Settings | File Templates.
 */
@Repository
public class DataUpHandleServiceImpl implements DataUpHandleService {
	@Resource
	OpOssQlzLoginLogMapper opOssQlzLoginLogMapper;
	@Resource
	OpOssQlzOutLogMapper opOssQlzOutLogMapper;
	@Resource
	OpOssQlzCreateroleLogMapper opOssQlzCreateroleLogMapper;
	@Resource
	OpOssQlzRechargeLogMapper opOssQlzRechargeLogMapper;
	@Resource
	OpOssQlzConsumeLogMapper opOssQlzConsumeLogMapper;
	@Resource
	OpOssQlzPassportRegMapper opOssQlzPassportRegMapper;
	@Resource
	OpOssQlzPassportMapper opOssQlzPassportMapper;
	@Resource
	OpOssQlzOnlinecurLogMapper opOssQlzOnlinecurLogMapper;
	
	@Resource
	private JmsTemplate jmsTempalte;
	@Resource
	private ActiveMQTopic statusConTopic;
	
	public int upDataStatusCon(String worldId, int act) {
		int res = 0;
		StatusConCommand statusCon = new StatusConCommand(worldId, act);
		try {

			String msg = JSON.toJSONString(statusCon);
			
			DataMessageCreator dataMessageCreator = new DataMessageCreator();
			dataMessageCreator.obj = statusCon;
			// jmsTempalte.send(statusConTopic, dataMessageCreator);
			jmsTempalte.convertAndSend(statusConTopic, msg);
			res = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int addLoginLog(OpOssQlzLoginLog opOssQlzLoginLog) {
		int res = opOssQlzLoginLogMapper.insertSelective(opOssQlzLoginLog);
		return res;
	}
	
	public int addLoginOutLog(OpOssQlzOutLog opOssQlzOutLog) {
		int res = opOssQlzOutLogMapper.insertSelective(opOssQlzOutLog);
		return res;
	}
	
	public int addCreateRoleLog(OpOssQlzCreateroleLog opOssQlzCreateroleLog) {
		int res = opOssQlzCreateroleLogMapper.insertSelective(opOssQlzCreateroleLog);
		return res;
	}
	
	public int addRechargeLog(OpOssQlzRechargeLog opOssQlzRechargeLog) {
		int res = opOssQlzRechargeLogMapper.insertSelective(opOssQlzRechargeLog);
		return res;
	}
	
	public int addConsumeLog(OpOssQlzConsumeLog opOssQlzConsumeLog) {
		int res = opOssQlzConsumeLogMapper.insertSelective(opOssQlzConsumeLog);
		return res;
	}
	
	public int addOnlineLog(OpOssQlzOnlinecurLog ossQlzOnlinecurLog) {
		int res = opOssQlzOnlinecurLogMapper.insertSelective(ossQlzOnlinecurLog);
		return res;
	}
	
	public int addRegister(OpOssQlzPassportReg opOssQlzPassportReg) {
		int res = 0;
		try {
			res = opOssQlzPassportRegMapper.insertSelective(opOssQlzPassportReg);
		} catch (Exception e) {
			
		}
		return res;
	}
	
	public int updatePassportReg(OpOssQlzPassportReg opOssQlzPassportReg) {
		int res = opOssQlzPassportRegMapper.updateByPrimaryKeySelective(opOssQlzPassportReg);
		opOssQlzPassportRegMapper.addLoginCount(opOssQlzPassportReg.getOpenid());
		return res;
	}
	
	public int addPassport(OpOssQlzPassport opOssQlzPassport) {
		int res = opOssQlzPassportMapper.insertSelective(opOssQlzPassport);
		return res;
	}
	
	public OpOssQlzPassport updatePassport(OpOssQlzPassport opOssQlzPassport, String type) {
		int res = 0;
		
		res = opOssQlzPassportMapper.updateByPrimaryKeySelective(opOssQlzPassport);
		
		if (type.equals("login")) {
			opOssQlzPassportMapper.addLoginCount(opOssQlzPassport.getOpenid()); // 累计登陆次数
			
		} else if (type.equals("out")) { // 登出
		
			if (opOssQlzPassport.getInfo() != null && Integer.parseInt(opOssQlzPassport.getInfo()) != 0) {
				Map map = new HashMap();
				map.put("time", Integer.parseInt(opOssQlzPassport.getInfo()));
				map.put("openid", "'" + opOssQlzPassport.getOpenid() + "'");
				opOssQlzPassportMapper.addOnlineTime(map); // 累计时长
			}
			
		} else if (type.equals("refresh")) {
			
		} else if (type.equals("recharge")) {
			if (opOssQlzPassport.getInfo().split("#")[1].contains("reku")) { // 平台订单
			} else {
				Map map = new HashMap();
				map.put("openid", "'" + opOssQlzPassport.getOpenid() + "'");
				map.put("money", Integer.parseInt(opOssQlzPassport.getInfo().split("#")[0]));
				opOssQlzPassportMapper.addTotalMoney(map); // 累计充值
			}
			
		} else if (type.equals("consume")) {
			Map map = new HashMap();
			map.put("openid", "'" + opOssQlzPassport.getOpenid() + "'");
			map.put("money", Integer.parseInt(opOssQlzPassport.getInfo()));
			opOssQlzPassportMapper.addConsumeMoney(map); // 累计消费
		}
		
		return opOssQlzPassportMapper.selectByPrimaryKey(opOssQlzPassport.getOpenid());
	}
	
	public OpOssQlzPassport getPassportByOpenid(String openid) {
		OpOssQlzPassport opOssQlzPassport = opOssQlzPassportMapper.selectByPrimaryKey(openid);
		return opOssQlzPassport;
	}
	
	public Page getPassportList(OpOssQlzPassport obj, int pageSize, int pageNumber) {
		OpOssQlzPassportExample example = new OpOssQlzPassportExample();
		OpOssQlzPassportExample.Criteria criteria = example.createCriteria();
		
		if (obj.getInfo() == null) {
			example.setOrderByClause("grade desc");
		} else {
			example.setOrderByClause(obj.getInfo());
		}
		
		if (obj.getWorldid() != null) {
			criteria.andWorldidEqualTo(obj.getWorldid());
		}
		if (obj.getOpenid() != null) {
			criteria.andOpenidLike("%" + obj.getOpenid() + "%");
		}
		if (obj.getRolename() != null) {
			criteria.andRolenameLike("%" + obj.getRolename() + "%");
		}
		
		// 获取总的记录数量
		long count = this.opOssQlzPassportMapper.countByExample(example);
		
		// 获取指定的页码数据
		example.setBeginNum((pageNumber - 1) * pageSize);
		example.setEndNum(pageSize);
		List<OpOssQlzPassport> list = this.opOssQlzPassportMapper.getPageList(example);
		
		// 组合返回page
		Page page = new Page(pageNumber, (int)count, pageSize, list);
		return page;
	}
	
	public List<OpOssQlzPassport> getPassportList(String worldid) {
		OpOssQlzPassportExample opOssQlzPassportExample = new OpOssQlzPassportExample();
		OpOssQlzPassportExample.Criteria criteria = opOssQlzPassportExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		
		List<OpOssQlzPassport> opOssQlzPassports = opOssQlzPassportMapper.selectByExample(opOssQlzPassportExample);
		return opOssQlzPassports;
	}
	
	public List<OpOssQlzPassport> getActivePassportList() {
		String time = Tools.getDate(Tools.getNowDate(), 1, -7).substring(0, 10);
		List<OpOssQlzPassport> opOssQlzPassports = opOssQlzPassportMapper.getActivePassportList(time);
		return opOssQlzPassports;
	}
	
	public List<String> getPassportIdsStr(String wid) {
		List<String> openidList = opOssQlzPassportMapper.getPassportIdsStr(wid);
		return openidList;
	}
	
	public List<OpOssQlzPassportReg> regLastList() {
		return null; // To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public OpOssQlzPassport getPassportByName(String name, String worldId) {
		// TODO Auto-generated method stub
		OpOssQlzPassportExample  opOssQlzPassportExample = new OpOssQlzPassportExample();
		OpOssQlzPassportExample.Criteria criteria = opOssQlzPassportExample.createCriteria();
		criteria.andRolenameEqualTo(name);
		if (!ToolUtils.isStringNull(worldId)){
			criteria.andWorldidEqualTo(worldId);
		}
		List<OpOssQlzPassport> list = opOssQlzPassportMapper.selectByExample(opOssQlzPassportExample);
		return list.size() > 0 ?list.get(0) : null;
	}
	
}
