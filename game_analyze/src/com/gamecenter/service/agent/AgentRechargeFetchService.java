package com.gamecenter.service.agent;

import java.util.List;

import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpAgentRechargeFetch;

/** 
 * ClassName:AgentRechargeRequestService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:26:25 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface AgentRechargeFetchService extends BaseService<OpAgentRechargeFetch>{
	
	
	/** 
	 * getAgentRechargeRequestList:(). <br/> 
	 * TODO().<br/> 
	 *结算请求列表
	 * @author lyh 
	 * @param agentName
	 * @return 
	 */  
	public List<OpAgentRechargeFetch> getAgentRechargeFetchList(String agentName);
	
	/** 
	 * countFetchSize:(). <br/> 
	 * TODO().<br/> 
	 * 结算列表的条数
	 * @author lyh 
	 * @param agentName
	 * @return 
	 */  
	public int countFetchSize(String agentName);
}
  