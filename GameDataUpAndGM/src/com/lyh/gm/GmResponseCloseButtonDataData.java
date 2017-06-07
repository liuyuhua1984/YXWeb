package com.lyh.gm;

/**
 * ClassName:GMServerToGMPlatform <br/>
 * Function: TODO (GM接入时的返回数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-22 下午2:51:11 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmResponseCloseButtonDataData {
	
	/*** 消息体 status String 状态 -1：失败 ,1：成功 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
