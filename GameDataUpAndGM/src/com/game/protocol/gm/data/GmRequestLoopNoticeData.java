package com.game.protocol.gm.data;

/**
 * ClassName:GmRequestLoopNoticeData <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2015-1-7 上午11:18:13 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmRequestLoopNoticeData {
	
	/** 公告ID **/
	private int notice_id;
	
	/** 内容 **/
	private String content;
	
	/** 开始时间 **/  
	private long begin_time;
	
	/** 循环次数 **/  
	private int loop_num;
	
	/** 间隔 **/  
	private long interval;
	
	/** 1、添加，2、删除**/  
	private int type;

	public int getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(long begin_time) {
		this.begin_time = begin_time;
	}

	public int getLoop_num() {
		return loop_num;
	}

	public void setLoop_num(int loop_num) {
		this.loop_num = loop_num;
	}

	public long getInterval() {
		return interval;
	}

	public void setInterval(long interval) {
		this.interval = interval;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
