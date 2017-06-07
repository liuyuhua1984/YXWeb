package com.game.protocol.gm.data;

/**
 * ClassName:GmResponseAddWhiteNameData <br/>
 * Function: TODO ("添加或删除白名单"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午4:04:40 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmResponseAddOrDelWhiteNameData {
	/*** 消息体 status String 状态 -1：失败 ,1：成功 **/
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
