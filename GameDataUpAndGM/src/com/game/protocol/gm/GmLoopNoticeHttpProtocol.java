package com.game.protocol.gm;  

import com.lyh.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/** 
 * ClassName:GmLoopNoticeHttpProtocol <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2015-1-7 上午10:35:07 <br/> 
 * @author   lxx
 * @version   
 * @see       
 */
public class GmLoopNoticeHttpProtocol extends DataUpBase implements IMsgCode {

	/****/  
	private static final long serialVersionUID = 1L;

	public GmLoopNoticeHttpProtocol() {
		super(GM_LOOP_NOTICE_HTTP_PROTOCOL);
	}
	
	/*** 消息体 status String 状态 -1：失败 ,1：成功,2 异常**/
	private int status;	
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
  