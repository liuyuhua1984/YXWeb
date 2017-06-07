package com.game.protocol.gm.data;

/**
 * ClassName:GmLoopResponseNoticeData <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2015-1-7 上午10:35:50 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmResponseLoopNoticeData {
	
	/*** 消息体 status String 状态 -1：失败 ,1：成功,2 异常**/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
