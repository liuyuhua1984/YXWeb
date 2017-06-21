package com.gamecenter.parBean;

import java.io.Serializable;

import com.gamecenter.model.OpAgentList;

/** 
 * ClassName:AgentFetch <br/> 
 * Function: TODO (玩家提成). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月21日 下午4:22:46 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class AgentFetch  implements Serializable{
	
	/**代理**/  
	private OpAgentList agent;
	
	/**推广人数**/  
	private int extendNum;
	
	/**累计收益**/  
	private int totalMoney;
	
	/**可提金额**/  
	private int enableMoney;

	public OpAgentList getAgent() {
		return agent;
	}

	public void setAgent(OpAgentList agent) {
		this.agent = agent;
	}

	public int getExtendNum() {
		return extendNum;
	}

	public void setExtendNum(int extendNum) {
		this.extendNum = extendNum;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getEnableMoney() {
		return enableMoney;
	}

	public void setEnableMoney(int enableMoney) {
		this.enableMoney = enableMoney;
	}
	
}
  