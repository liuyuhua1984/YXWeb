package com.gamecenter.service.agent;

import java.util.List;

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
public interface AgentConfigService extends BaseService<OpAgentConfig> {

	
	/** 
	 * getAgentConfigList:(). <br/> 
	 * TODO().<br/> 
	 * 得到全部的配置文件
	 * @author lyh 
	 * @return 
	 */  
	List<OpAgentConfig> getAgentConfigList();
}
  