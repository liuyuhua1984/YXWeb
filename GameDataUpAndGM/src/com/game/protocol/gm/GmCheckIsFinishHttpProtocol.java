package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmCheckIsFinishProtocol <br/>
 * Function: TODO ("GM检查任务集市中任务是否完成"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmCheckIsFinishHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmCheckIsFinishHttpProtocol() {
		super(GM_CHECK_IS_FINISH_HTTP_PROTOCOL);
	}
	
	/*** 消息体 status String 状态 -1：未完成 ,1：完成 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
