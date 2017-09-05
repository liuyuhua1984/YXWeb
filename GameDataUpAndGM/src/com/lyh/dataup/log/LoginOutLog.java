package com.lyh.dataup.log;

import java.sql.Timestamp;

/**
 * ClassName:LoginLog <br/>
 * Function: TODO (登出log). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-23 上午9:36:05 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class LoginOutLog extends DataUpBase {
	
	public LoginOutLog() {
		super(DATAUP_LOGIN_OUT_LOG_HTTP_PROTOCOL);
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
	
//	/**玩家id**/  
//	private long playerId;
	
	/** 角色名 **/
	private String roleName;
	
	/** 角色等级 **/
	private int roleLevel;
	
	/** 登录时间 **/
	private Timestamp createTime;
	
	/** 服务器IP **/
	private String serverIp;
	
	/** VIP等级 **/
	private int vipLevel;
	
	/** 新手引导 **/
	private String newPlayerGuild;
	
	/** 在线时间 **/
	private int onlineTime;
	
	/**退出 时间**/  
	private long loginOutTime;
	
	
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
	
	public int getVipLevel() {
		return vipLevel;
	}
	
	public void setVipLevel(int vipLevel) {
		this.vipLevel = vipLevel;
	}
	
	public String getNewPlayerGuild() {
		return newPlayerGuild;
	}
	
	public void setNewPlayerGuild(String newPlayerGuild) {
		this.newPlayerGuild = newPlayerGuild;
	}


	public int getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}

	public long getLoginOutTime() {
		return loginOutTime;
	}

	public void setLoginOutTime(long loginOutTime) {
		this.loginOutTime = loginOutTime;
	}

//	public long getPlayerId() {
//		return playerId;
//	}
//
//	public void setPlayerId(long playerId) {
//		this.playerId = playerId;
//	}
	
}
