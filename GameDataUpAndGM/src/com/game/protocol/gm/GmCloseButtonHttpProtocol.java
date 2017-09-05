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
public class GmCloseButtonHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = -2884634672283686655L;
	
	public GmCloseButtonHttpProtocol() {
		super(GM_CLOSE_BUTTON_HTTP_PROTOCOL);
	}
	
	/*** 消息体 status String 状态 -1：失败 ,1：成功 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
