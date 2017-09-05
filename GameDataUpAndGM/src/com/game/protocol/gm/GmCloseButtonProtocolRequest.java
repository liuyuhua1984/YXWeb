package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMCloseButtonProtocol <br/>
 * Function: TODO ("GM发起关闭界面按钮"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-23 下午5:45:55 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmCloseButtonProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = -2884634672283686655L;
	
	public GmCloseButtonProtocolRequest() {
		super(GM_CLOSE_BUTTON_HTTP_PROTOCOL);
	}
	
	/** 结果 **/
	private int type;
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
