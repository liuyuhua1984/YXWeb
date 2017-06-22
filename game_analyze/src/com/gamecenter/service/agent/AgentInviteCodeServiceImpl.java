package com.gamecenter.service.agent;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpAgentInviteCodeMapper;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.model.OpAgentInviteCodeExample;

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

	@Override
	public List<OpAgentInviteCode> getOpAgentInviteCodeList(long agentId) {
		// TODO Auto-generated method stub
		OpAgentInviteCodeExample opAgentInviteCodeExample = new OpAgentInviteCodeExample();
		OpAgentInviteCodeExample.Criteria criteria = opAgentInviteCodeExample.createCriteria();
		criteria.andAgentIdEqualTo(agentId);
		criteria.andIsUseEqualTo((byte)0);
		criteria.andIsPutOutEqualTo((byte)0);
		return mapper.selectByExample(opAgentInviteCodeExample);
	}

	@Override
	public OpAgentInviteCode findOpAgentInviteCodeByCode(String invteCode) {
		// TODO Auto-generated method stub
		OpAgentInviteCodeExample opAgentInviteCodeExample = new OpAgentInviteCodeExample();
		OpAgentInviteCodeExample.Criteria criteria = opAgentInviteCodeExample.createCriteria();
		criteria.andInviteCodeEqualTo(invteCode);
		List<OpAgentInviteCode> list = mapper.selectByExample(opAgentInviteCodeExample);
		return list.size() > 0 ? list.get(0): null;
	}

	@Override
	public long remainInviteCode(long agentId) {
		// TODO Auto-generated method stub
		OpAgentInviteCodeExample opAgentInviteCodeExample = new OpAgentInviteCodeExample();
		OpAgentInviteCodeExample.Criteria criteria = opAgentInviteCodeExample.createCriteria();
		criteria.andAgentIdEqualTo(agentId);
		criteria.andIsUseEqualTo((byte)0);
		criteria.andIsPutOutEqualTo((byte)0);
		return mapper.countByExample(opAgentInviteCodeExample);
	}
	
}
  