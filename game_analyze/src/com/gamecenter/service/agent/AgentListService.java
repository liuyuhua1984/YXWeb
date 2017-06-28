package com.gamecenter.service.agent;

import java.util.List;
import java.util.Map;

import com.gamecenter.model.OpAgentList;

/** 
 * ClassName:AgentService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月13日 下午3:17:28 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface AgentListService {
	
	
	        /** 
	         * insert:(). <br/> 
	         * TODO().<br/> 
	         * 插入
	         * @author lyh 
	         * @param agent 
	         */  
	        void insert(OpAgentList agent);
	        
		/** 
		 * getChildrenOpAgentList:(). <br/> 
		 * TODO().<br/> 
		 * 获取下级代理列表
		 * @author lyh 
		 * @param agentId
		 * @return 
		 */  
		List<OpAgentList> getChildrenOpAgentList(String name);
		
		/** 
		 * findById:(). <br/> 
		 * TODO().<br/> 
		 * 获取代理通过id
		 * @author lyh 
		 * @param agentId
		 * @return 
		 */  
		OpAgentList findById(long agentId);
		
		/** 
		 * findByName:(). <br/> 
		 * TODO().<br/> 
		 * 
		 * @author lyh 
		 * @param key
		 * @param obj
		 * @return 
		 */  
		OpAgentList findByName(String name);
		
		/** 
		 * update:(). <br/> 
		 * TODO().<br/> 
		 * 更新代理
		 * @author lyh 
		 * @param agent 
		 */  
		void update(OpAgentList agent);
		
		/** 
		 * deleteById:(). <br/> 
		 * TODO().<br/> 
		 * 删除代理
		 * @author lyh 
		 * @param agentId 
		 */  
		void deleteById(long agentId);
		
		
		/** 
		 * findByPhone:(). <br/> 
		 * TODO().<br/> 
		 * 电话号码查找对象
		 * @author lyh 
		 * @param phone
		 * @return 
		 */  
		OpAgentList findByPhone(long phone);
		
		/** 
		 * findByWechat:(). <br/> 
		 * TODO().<br/> 
		 * 微信查找对对象
		 * @author lyh 
		 * @param weChat
		 * @return 
		 */  
		OpAgentList findByWechat(String weChat);
		
		
}
  