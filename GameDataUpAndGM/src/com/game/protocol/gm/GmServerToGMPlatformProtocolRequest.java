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
	
	/** MD5验证 **/
	private String sigstr;
	

	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
	
	
}
