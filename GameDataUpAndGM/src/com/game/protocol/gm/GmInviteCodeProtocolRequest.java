package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmLoopNoticeHttpProtocol <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (发送公告). <br/>
 * Date: 2015-1-7 上午10:35:07 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmInviteCodeProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmInviteCodeProtocolRequest() {
		super(GM_INVITE_CODE_HTTP_PROTOCOL);
	}
	
	/** 账号 **/
	private String openId ;
	
	/** 邀请码 **/
	private String inviteCode;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	
	
}
