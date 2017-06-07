package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (禁言IP). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmDisblockIPProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmDisblockIPProtocolRequest() {
		super(GM_ROLE_IP_DISBLOCK_SAY_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/*** ip String Ip地址串：如127.0.0.1 ***/
	private String ip;
	
	private String serverId;
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
}
