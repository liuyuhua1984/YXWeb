package com.gamecenter.service.agent;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentListMapper;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentListExample;

/** 
 * ClassName:AgentServiceImpl <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月13日 下午3:22:54 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentServiceImpl implements AgentService {
	@Autowired
	private  OpAgentListMapper maper;
	@Override
	public List<OpAgentList> getNextOpAgentList(long agentId) {
		// TODO Auto-generated method stub
		OpAgentListExample example = new OpAgentListExample();
		OpAgentListExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(agentId);
		return maper.selectByExample(example);
	}

	@Override
	public OpAgentList findById(long agentId) {
		// TODO Auto-generated method stub
		return maper.selectByPrimaryKey(agentId);
	}

	@Override
	public void update(OpAgentList agent) {
		// TODO Auto-generated method stub
		maper.updateByPrimaryKey(agent);
	}

	@Override
	public void deleteById(long agentId) {
		// TODO Auto-generated method stub
		maper.deleteByPrimaryKey(agentId);
	}

	@Override
	public OpAgentList findByName(String name) {
		// TODO Auto-generated method stub
		OpAgentListExample example = new OpAgentListExample();
		OpAgentListExample.Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		 List<OpAgentList> list = maper.selectByExample(example);
		 if (list != null && list.size() > 0){
			 return list.get(0);
		 }
		return null;
	}
	
	
}
  