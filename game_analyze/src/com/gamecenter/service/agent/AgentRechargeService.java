package com.gamecenter.service.agent;

import java.util.List;

import com.gamecenter.model.OpAgentRecharge;

/** 
 * ClassName:AgentRechargeService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:10:03 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface AgentRechargeService extends BaseService<OpAgentRecharge>{
	

	/** 
	 * getOpAgentRechargeBuyList:(). <br/> 
	 * TODO().<br/> 
	 * 代理获取自己的购买记录
	 * @author lyh 
	 * @param agentName
	 * @return 
	 */  
	public List<OpAgentRecharge> getOpAgentRechargeBuyList(String agentName);
	
	/** 
	 * getOpAgentRechargeSellList:(). <br/> 
	 * TODO().<br/> 
	 * 代理获取自己的售卡记录
	 * @author lyh 
	 * @param upAgentName
	 * @return 
	 */  
	public List<OpAgentRecharge> getOpAgentRechargeSellList(String upAgentName);
	
	/** 
	 * getOpAgentRechargeFetchList:(). <br/> 
	 * TODO().<br/> 
	 * 提现结算申请
	 * @author lyh 
	 * @param upAgentName
	 * @param isFetch
	 * @return 
	 */  
	public List<OpAgentRecharge> getOpAgentRechargeFetchList(String upAgentName,int isFetch,int level);
	
	
	
}
  