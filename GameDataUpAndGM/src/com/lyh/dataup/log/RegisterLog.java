package com.lyh.dataup.log;

import java.sql.Timestamp;

/**
 * ClassName:LoginLog <br/>
 * Function: TODO (注册log). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-23 上午9:36:05 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class RegisterLog extends DataUpBase {
	
	public RegisterLog() {
		super(DATAUP_REGISTER_LOG_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}

	/****/
	private static final long serialVersionUID = -3567292500542507409L;
	
	/** APPID 应用的惟一标识 **/
	private String appId;
	
	/** 用户IP,转化成主机字节序 **/
	private String userIp;
	
	/** 用户名 **/
	private String userName;
	
	
	/** 登录时间 **/
	private Timestamp createTime;
	
	/** 服务器IP **/
	private String serverIp;
	
	/**注册时间**/  
	private long registerTime;
	
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
	
	public String getUserIp() {
		return userIp;
	}
	
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
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


	public long getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(long registerTime) {
		this.registerTime = registerTime;
	}
	
}
