package com.gamecenter.service.agent;

import java.util.List;

import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpAgentRechargeRequest;

/** 
 * ClassName:AgentRechargeRequestService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:26:25 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface AgentRechargeRequestService extends BaseService<OpAgentRechargeRequest>{
	
	
	/** 
	 * getAgentRechargeRequestList:(). <br/> 
	 * TODO().<br/> 
	 *充值请求列表
	 * @author lyh 
	 * @param agentName
	 * @return 
	 */  
	public List<OpAgentRechargeRequest> getAgentRechargeRequestList(String agentName);
}
  