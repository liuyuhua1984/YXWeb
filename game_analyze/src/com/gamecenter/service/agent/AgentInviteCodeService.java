package com.gamecenter.service.agent;

import java.util.List;

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
public interface AgentInviteCodeService extends BaseService<OpAgentInviteCode>{
	
	
	/** 
	 * getOpAgentInviteCodeList:(). <br/> 
	 * TODO().<br/> 
	 * 邀请码列表
	 * @author lyh 
	 * @return 
	 */  
	public List<OpAgentInviteCode> getOpAgentInviteCodeList(long agentId);
	
	
	/** 
	 * findOpAgentInviteCodeByCode:(). <br/> 
	 * TODO().<br/> 
	 * 用邀请码查找对象
	 * @author lyh 
	 * @param invteCode
	 * @return 
	 */  
	public OpAgentInviteCode findOpAgentInviteCodeByCode(String invteCode);
	
	/** 
	 * remainInviteCode:(). <br/> 
	 * TODO().<br/> 
	 * 剩余数量
	 * @author lyh 
	 * @return 
	 */  
	public long  remainInviteCode();
		
	
}
  