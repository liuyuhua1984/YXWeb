package com.game.protocol.gm;

import java.util.List;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmAddWhiteNameProtocol <br/>
 * Function: TODO ("介绍玩法"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmHowToPlayProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	/**介绍类型 1=红中,2=跑得快**/  
	private int playType;
	private String txt;
	
	public GmHowToPlayProtocolRequest() {
		super(GM_HOW_TO_PLAY_HTTP_PROTOCOL);
	}
	
	public int getPlayType() {
		return playType;
	}

	public String getTxt() {
		return txt;
	}

	public void setPlayType(int playType) {
		this.playType = playType;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	
	
	
	
	
}
