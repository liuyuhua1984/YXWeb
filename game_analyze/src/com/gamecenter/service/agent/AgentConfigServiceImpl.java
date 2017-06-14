package com.gamecenter.service.agent;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentConfigMapper;
import com.gamecenter.model.OpAgentConfig;

/** 
 * ClassName:AgentConfigService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:36:17 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentConfigServiceImpl implements AgentConfigService {
	@Resource
	private OpAgentConfigMapper mapper;
	@Override
	public void insert(OpAgentConfig t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpAgentConfig t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpAgentConfig findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

}
  