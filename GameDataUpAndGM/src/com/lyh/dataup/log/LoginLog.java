package com.lyh.dataup.log;

import java.sql.Timestamp;

/**
 * ClassName:LoginLog <br/>
 * Function: TODO (登录log). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-23 上午9:36:05 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class LoginLog extends DataUpBase {
	
	public LoginLog() {
		super(DATAUP_LOGIN_LOG_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}

	/****/
	private static final long serialVersionUID = -3567292500542507409L;
	
	/** APPID 应用的惟一标识 **/
	private long appId;
	
	/** 用户IP,转化成主机字节序 **/
	private String userIp;
	
	/** 用户名 **/
	private String userName;
	
	/** 服务器ID **/
	private String serverId;
	
	/** 角色名 **/
	private String roleName;
	
	/** 角色等级 **/
	private int roleLevel;
	
	/** 登录时间 **/
	private Timestamp createTime;
	
	/** 服务器IP **/
	private String serverIp;
	
	/** 是否已上报 **/
	private String isUp = "0";
	
	/**登录时间**/  
	private long loginTime;
	
	public long getAppId() {
		return appId;
	}
	
	public void setAppId(long appId) {
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
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public int getRoleLevel() {
		return roleLevel;
	}
	
	public void setRoleLevel(int roleLevel) {
		this.roleLevel = roleLevel;
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
	
	public String getIsUp() {
		return isUp;
	}
	
	public void setIsUp(String isUp) {
		this.isUp = isUp;
	}

	public long getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}
	
}
