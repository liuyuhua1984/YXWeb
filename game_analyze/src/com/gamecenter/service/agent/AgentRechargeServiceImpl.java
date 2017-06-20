package com.gamecenter.service.agent;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentRechargeMapper;
import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpAgentRechargeExample;

/** 
 * ClassName:AgentRechargeServiceImp <br/> 
 * Function: TODO (充值服务). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:16:06 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentRechargeServiceImpl implements AgentRechargeService {
	
	@Resource
	private OpAgentRechargeMapper mapper;
	
	@Override
	public void insert(OpAgentRecharge agentRecharge) {
		// TODO Auto-generated method stub
		mapper.insert(agentRecharge);
	}
	
	@Override
	public void update(OpAgentRecharge agentRecharge) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(agentRecharge);
	}
	
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpAgentRecharge findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<OpAgentRecharge> getOpAgentRechargeBuyList(String agentName) {
		// TODO Auto-generated method stub
		OpAgentRechargeExample  opAgentRechargeExample  = new OpAgentRechargeExample();
		OpAgentRechargeExample.Criteria criteria = opAgentRechargeExample.createCriteria();
		criteria.andNameEqualTo(agentName);
		return mapper.selectByExample(opAgentRechargeExample);
	}

	@Override
	public List<OpAgentRecharge> getOpAgentRechargeSellList(String upAgentName) {
		// TODO Auto-generated method stub
		OpAgentRechargeExample  opAgentRechargeExample  = new OpAgentRechargeExample();
		OpAgentRechargeExample.Criteria criteria = opAgentRechargeExample.createCriteria();
		criteria.andAgentNameEqualTo(upAgentName);
		return mapper.selectByExample(opAgentRechargeExample);
	}

	
}
  