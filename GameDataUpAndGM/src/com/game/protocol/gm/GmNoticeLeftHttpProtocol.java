package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmAddWhiteNameProtocol <br/>
 * Function: TODO ("添加公告"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmNoticeLeftHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmNoticeLeftHttpProtocol() {
		super(GM_NOTICE_LEFT_HTTP_PROTOCOL);
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
