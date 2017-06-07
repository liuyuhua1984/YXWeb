package com.game.protocol.gm;

import com.lyh.IMsgCode;
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
public class GmServerToGMPlatformHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 6215974659551468586L;
	
	public GmServerToGMPlatformHttpProtocol() {
		super(GM_CONNECT_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** 验证结果 **/
	public String result;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
}
