package com.game.protocol.gm.data;

/**
 * ClassName:GmAddWhiteNamesData <br/>
 * Function: TODO ("GM检查任务集市中任务是否完成请求"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:54:58 <br/>
 * 
 * @author lxx	
 * @version
 * @see
 */
public class GmRequestCheckIsFinishData {
	
	/** 验证类型 **/
	private String cmd;
	
	/** 账号 **/
	private String openid;
	
	/** 任务配置表Id */
	private int taskid;
	
	/** 服务器id **/
	private String serverId;
	
	public String getCmd() {
		return cmd;
	}
	
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public int getTaskid() {
		return taskid;
	}
	
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
}
