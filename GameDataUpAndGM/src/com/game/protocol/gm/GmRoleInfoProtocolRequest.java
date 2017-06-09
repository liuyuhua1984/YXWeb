package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (角色信息). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRoleInfoProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmRoleInfoProtocolRequest() {
		super(GM_ROLE_INFO_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** 消息体 type String 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** 账号标示； 标示的类型由type决定。 如果标示的类型是角色名称，查询时请使用模糊匹配。 **/
	private String actstr;
	private String serverId;
	
	
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
		// TODO Auto-generated method stub
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
}
