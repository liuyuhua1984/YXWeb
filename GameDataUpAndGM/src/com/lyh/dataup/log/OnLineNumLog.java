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
	private long appId;
	
	/** 服务器ID **/
	private String serverId;
	
	/** 登录时间 **/
	private Timestamp createTime;
	
	/** 服务器IP **/
	private String serverIp;
	
	/** 在线人数 **/
	private int onlineNum;
	
	/** 是否已上报 **/
	private String isUp = "0";
	
	/**记录在线人数时间**/  
	private long recordTime;
	
	public long getAppId() {
		return appId;
	}
	
	public void setAppId(long appId) {
		this.appId = appId;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
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
	
	public String getIsUp() {
		return isUp;
	}
	
	public void setIsUp(String isUp) {
		this.isUp = isUp;
	}

	public long getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(long recordTime) {
		this.recordTime = recordTime;
	}
	
}
