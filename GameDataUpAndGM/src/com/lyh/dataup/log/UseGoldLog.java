package com.lyh.dataup.log;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ClassName:LoginLog <br/>
 * Function: TODO (消费log). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-23 上午9:36:05 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class UseGoldLog extends DataUpBase {
	
	public UseGoldLog() {
		super(DATAUP_USE_GOLD_LOG_HTTP_PROTOCOL);
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
	
	/** 加金币前的数量 **/
	private int goldBefore;
	
	/** 消费金币的数量 **/
	private int lostGold;
	
	/** 加金币后的数量 **/
	private int goldAfter;
	
	/** 道ID **/
	private long itemId;
	
	/** 道具类型 **/
	private int itemType;
	
	/** 道具数量 **/
	private int itemNum;
	
	/** 道名称 **/
	private String itemName;
	
	/** 是否已上报 **/
	private String isUp = "0";
	
	/**使用道具时间**/  
	private long useGoldTime;
	
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
	
	public int getGoldBefore() {
		return goldBefore;
	}
	
	public void setGoldBefore(int goldBefore) {
		this.goldBefore = goldBefore;
	}
	
	public int getGoldAfter() {
		return goldAfter;
	}
	
	public void setGoldAfter(int goldAfter) {
		this.goldAfter = goldAfter;
	}
	
	public int getLostGold() {
		return lostGold;
	}
	
	public void setLostGold(int lostGold) {
		this.lostGold = lostGold;
	}
	
	public long getItemId() {
		return itemId;
	}
	
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	public int getItemType() {
		return itemType;
	}
	
	public void setItemType(int itemType) {
		this.itemType = itemType;
	}
	
	public int getItemNum() {
		return itemNum;
	}
	
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getIsUp() {
		return isUp;
	}
	
	public void setIsUp(String isUp) {
		this.isUp = isUp;
	}

	public long getUseGoldTime() {
		return useGoldTime;
	}

	public void setUseGoldTime(long useGoldTime) {
		this.useGoldTime = useGoldTime;
	}
	
}
