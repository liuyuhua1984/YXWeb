package com.lyh.gm;

/**
 * ClassName:GmResponseAddWhiteNameData <br/>
 * Function: TODO ("GM检查任务集市中任务是否完成返回"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午4:04:40 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmResponseCheckIsFinishData {
	/*** 消息体 status String 状态 -1：未完成 ,1：完成 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
