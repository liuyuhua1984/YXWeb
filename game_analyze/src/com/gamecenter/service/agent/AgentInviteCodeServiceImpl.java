package com.gamecenter.service.agent;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentInviteCodeMapper;
import com.gamecenter.model.OpAgentInviteCode;

/** 
 * ClassName:AgentRechargeService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:10:03 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentInviteCodeServiceImpl implements AgentInviteCodeService{

	@Resource
	private OpAgentInviteCodeMapper mapper;
	
	@Override
	public void insert(OpAgentInviteCode t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpAgentInviteCode t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpAgentInviteCode findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}
	
}
  