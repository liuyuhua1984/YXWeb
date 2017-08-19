package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmAddWhiteNameProtocol <br/>
 * Function: TODO ("实名认证"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmAuthCardIdHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmAuthCardIdHttpProtocol() {
		super(GM_AUTH_PLAYER_HTTP_PROTOCOL);
	}
	
	/*** 消息体 status String 状态 -1：失败 ,1：成功 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
