package com.game.protocol.gm;

import com.lyh.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (禁角色). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmDisblockRoleProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmDisblockRoleProtocolRequest() {
		super(GM_ROLE_DISBLOCK_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** type String 1 或者 2 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** actstr String 账号标示； 标示的类型由type决定。 **/
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
}
