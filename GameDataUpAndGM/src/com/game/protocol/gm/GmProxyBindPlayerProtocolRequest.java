package com.game.protocol.gm;

import java.util.List;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmAddWhiteNameProtocol <br/>
 * Function: TODO ("代理绑定玩家"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmProxyBindPlayerProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmProxyBindPlayerProtocolRequest() {
		super(GM_PROXY_BIND_PLAYER_HTTP_PROTOCOL);
	}
	
	/**
	 * 旧的玩家Id
	 */
	private String oldPlayerId;
	/**
	 * 新的玩家id
	 */
	private String newPlayerId;
	
	/**
	 * 代理id
	 */
	private String proxyId;

	public String getOldPlayerId() {
		return oldPlayerId;
	}

	public void setOldPlayerId(String oldPlayerId) {
		this.oldPlayerId = oldPlayerId;
	}

	public String getNewPlayerId() {
		return newPlayerId;
	}

	public void setNewPlayerId(String newPlayerId) {
		this.newPlayerId = newPlayerId;
	}

	public String getProxyId() {
		return proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
	}
	
	
	
}
