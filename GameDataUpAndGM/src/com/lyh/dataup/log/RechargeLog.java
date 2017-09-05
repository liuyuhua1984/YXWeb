package com.lyh.dataup.log;

import java.sql.Timestamp;

/**
 * ClassName:LoginLog <br/>
 * Function: TODO (充值log). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-23 上午9:36:05 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class RechargeLog extends DataUpBase {
	
	public RechargeLog() {
		super(DATAUP_RECHARGE_LOG_HTTP_PROTOCOL);
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
	
	/** 加金币前的数量 **/
	private int goldBefore;
	
	/** 加入金币的数量 **/
	private int goldAdd;
	
	/** 加金币后的数量 **/
	private int goldAfter;
	
	/** 充值渠道 **/
	private String rechargeChannel;
	
	/** 流水号 **/
	private String billOrder;
	

	
	private long payTime;
	
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
	
	public int getGoldBefore() {
		return goldBefore;
	}
	
	public void setGoldBefore(int goldBefore) {
		this.goldBefore = goldBefore;
	}
	
	public int getGoldAdd() {
		return goldAdd;
	}
	
	public void setGoldAdd(int goldAdd) {
		this.goldAdd = goldAdd;
	}
	
	public int getGoldAfter() {
		return goldAfter;
	}
	
	public void setGoldAfter(int goldAfter) {
		this.goldAfter = goldAfter;
	}
	
	public String getRechargeChannel() {
		return rechargeChannel;
	}
	
	public void setRechargeChannel(String rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}
	

	public String getBillOrder() {
		return billOrder;
	}

	public void setBillOrder(String billOrder) {
		this.billOrder = billOrder;
	}

	public long getPayTime() {
		return payTime;
	}

	public void setPayTime(long payTime) {
		this.payTime = payTime;
	}

//	public long getPlayerId() {
//		return playerId;
//	}
//
//	public void setPlayerId(long playerId) {
//		this.playerId = playerId;
//	}
	
}
