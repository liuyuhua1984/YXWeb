package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (平台的奖励). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmOpenRewardActivitiesProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmOpenRewardActivitiesProtocolRequest() {
		super(GM_OPEN_REWARD_ACTIVITIES_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** 消息体 type String 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** 账号标示； 标示的类型由type决定。 如果标示的类型是角色名称，查询时请使用模糊匹配。 **/
	private String actstr;
	
	/** 服务器ID **/
	private String serverId;
	
	/**
	 * 大类型 * 小类型 * 数量 （以上为一个奖励，多个以#号隔开）,大类型（1装备或道具，2货币）,小类型（当大类型为1时，此处填写装备或道具ID ，否则，填写：1表示金币，2表示索尼，3表示阅历，4表示声望）,数量（奖励值）
	 **/
	private String accessory;
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	

	public String getActstr() {
		return actstr;
	}
	
	public void setActstr(String actstr) {
		this.actstr = actstr;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	public String getAccessory() {
		return accessory;
	}
	
	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
}
