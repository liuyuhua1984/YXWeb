package com.lyh.gm;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (解禁角色结果). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmResponseBlockRoleData {
	
	/*** 消息体 status String 状态 -1：不存在账号角色 -2：失败 1：成功 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
