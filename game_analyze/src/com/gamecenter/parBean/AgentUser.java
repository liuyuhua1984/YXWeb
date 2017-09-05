package com.gamecenter.parBean;

import java.io.Serializable;

/** 
 * ClassName:AgentUser <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月15日 下午3:21:49 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class AgentUser implements Serializable {
	/****/  
	private static final long serialVersionUID = 7792395471680622643L;

	private long id;
	
	/**代理名**/  
	private String agentName;

	private int level;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
  