package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMProtocol <br/>
 * Function: TODO (GM消息接入验证). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-22 上午11:22:13 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmServerToGMPlatformProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 6215974659551468586L;
	
	public GmServerToGMPlatformProtocolRequest() {
		super(GM_CONNECT_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** 游戏服务器 **/
	private String worldid;
	
	/** MD5验证 **/
	private String sigstr;
	
	private String serverId;
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid;
	}
	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
	
	
}
