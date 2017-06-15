package com.gamecenter.service.agent;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentRequestMapper;
import com.gamecenter.model.OpAgentRequest;
import com.gamecenter.model.OpAgentRequestExample;


/** 
 * ClassName:AgentReqeust <br/> 
 * Function: TODO (代理申请). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:33:41 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentRequestServiceImpl implements  AgentRequestService {

	@Resource
	private OpAgentRequestMapper mapper;
	@Override
	public void insert(OpAgentRequest t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpAgentRequest t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpAgentRequest findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<OpAgentRequest> getAgentRequestList(String agentName) {
		// TODO Auto-generated method stub
		OpAgentRequestExample opAgentRequestExample = new OpAgentRequestExample();
		OpAgentRequestExample.Criteria criteria = opAgentRequestExample.createCriteria();
		criteria.andParentNameEqualTo(agentName);
		return mapper.selectByExample(opAgentRequestExample);
	}

}
  