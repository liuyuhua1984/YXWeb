package com.gamecenter.service.agent;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentRechargeFetchMapper;
import com.gamecenter.model.OpAgentRechargeFetch;
import com.gamecenter.model.OpAgentRechargeFetchExample;

/** 
 * ClassName:AgentRechargeRequestService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:26:25 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentRechargeFetchServiceImpl implements AgentRechargeFetchService{

	@Resource
	private OpAgentRechargeFetchMapper mapper;
	
	@Override
	public void insert(OpAgentRechargeFetch t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpAgentRechargeFetch t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpAgentRechargeFetch findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<OpAgentRechargeFetch> getAgentRechargeFetchList(String agentName) {
		// TODO Auto-generated method stub
		OpAgentRechargeFetchExample opAgentRechargeRequestExample = new OpAgentRechargeFetchExample();
		OpAgentRechargeFetchExample.Criteria criteria = opAgentRechargeRequestExample.createCriteria();
		criteria.andNameEqualTo(agentName);
		return mapper.selectByExample(opAgentRechargeRequestExample);
	}

	@Override
	public int countFetchSize(String agentName) {
		// TODO Auto-generated method stub
		OpAgentRechargeFetchExample opAgentRechargeRequestExample = new OpAgentRechargeFetchExample();
		OpAgentRechargeFetchExample.Criteria criteria = opAgentRechargeRequestExample.createCriteria();
		criteria.andNameEqualTo(agentName);
		return (int)mapper.countByExample(opAgentRechargeRequestExample);
	}
	
}
  