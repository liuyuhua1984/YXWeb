package com.game.protocol.gm;

import com.lyh.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (踢人信息). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmKickRoleHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmKickRoleHttpProtocol() {
		super(GM_KICK_ROLE_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/*** 消息体 status String 状态 -1：不存在账号角色 -2：失败 1：成功 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
