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
public class GmJHPlayerProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 6215974659551468586L;
	
	public GmJHPlayerProtocolRequest() {
		super(GM_JH_PLAYER_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/**玩家名称 **/
	private String playerName;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}
