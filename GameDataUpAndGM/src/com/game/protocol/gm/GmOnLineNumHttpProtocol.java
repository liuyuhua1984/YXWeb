package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (服务器当前在线人数). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmOnLineNumHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmOnLineNumHttpProtocol() {
		super(GM_ONLINE_NUM_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** 当前在线人数 **/
	private int onlinenum;
	
	private String serverId;
	
	public int getOnlinenum() {
		return onlinenum;
	}
	
	public void setOnlinenum(int onlinenum) {
		this.onlinenum = onlinenum;
	}
	
}
