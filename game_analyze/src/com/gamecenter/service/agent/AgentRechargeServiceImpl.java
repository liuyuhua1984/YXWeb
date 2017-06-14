package com.gamecenter.service.agent;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentRechargeMapper;
import com.gamecenter.model.OpAgentRecharge;

/** 
 * ClassName:AgentRechargeServiceImp <br/> 
 * Function: TODO (). <br/> 
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
	
}
  