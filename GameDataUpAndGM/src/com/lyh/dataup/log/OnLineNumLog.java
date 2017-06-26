package com.lyh.dataup.log;

import java.sql.Timestamp;

/**
 * ClassName:LoginLog <br/>
 * Function: TODO (同时在线log). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-23 上午9:36:05 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class OnLineNumLog extends DataUpBase {
	
	public OnLineNumLog() {
		super(DATAUP_ONLINE_NUM_LOG_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}

	/****/
	private static final long serialVersionUID = -3567292500542507409L;
	
	/** APPID 应用的惟一标识 **/
	private String appId;
	
	/** 登录时间 **/
	private Timestamp createTime;
	
	/** 服务器IP **/
	private String serverIp;
	
	/** 在线人数 **/
	private int onlineNum;
	
	
	/**记录在线人数时间**/  
	private long recordTime;
	
	/**邀请码**/  
	private String inviteCode;
	
	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	
	public String getAppId() {
		return appId;
	}
	
	public void setAppId(String appId) {
		this.appId = appId;
	}

	
	public Timestamp getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	public String getServerIp() {
		return serverIp;
	}
	
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	
	public int getOnlineNum() {
		return onlineNum;
	}
	
	public void setOnlineNum(int onlineNum) {
		this.onlineNum = onlineNum;
	}

	public long getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(long recordTime) {
		this.recordTime = recordTime;
	}
	
}
