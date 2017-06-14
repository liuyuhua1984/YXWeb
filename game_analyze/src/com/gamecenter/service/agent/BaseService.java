package com.gamecenter.service.agent;

import com.gamecenter.model.OpAgentRecharge;

/** 
 * ClassName:BaseService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午3:27:10 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface BaseService<T> {
	
	void insert(T t);
	
	void update(T t);
	
	void delete(long id);
	
	
	 T findById(long id);
}
  