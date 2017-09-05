package com.gamecenter.service.agent;

import java.util.List;

import com.gamecenter.model.OpAgentRequest;

/** 
 * ClassName:AgentReqeust <br/> 
 * Function: TODO (代理申请). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:33:41 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface AgentRequestService extends BaseService<OpAgentRequest> {

	/** 
	 * getAgentRequestList:(). <br/> 
	 * TODO().<br/> 
	 * 代理申请列表
	 * @author lyh 
	 * @param agentName
	 * @return 
	 */  
	public List<OpAgentRequest> getAgentRequestList(String agentName);
}
  