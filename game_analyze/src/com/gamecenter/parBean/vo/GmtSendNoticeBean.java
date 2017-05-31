package com.gamecenter.parBean.vo;

/**
 * GMT 发送公告 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午10:54 To change this template use File | Settings | File Templates.
 */
public class GmtSendNoticeBean {
	private String act = "5100";
	private String content;
	private String msg;
	private String type = "1"; // 发送的内容 1:一次性 2:循环
	private String time = "1"; // 循环间隔时间
	
	private int wid;
	private String appid;
	private String user; // 操作人员
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getAct() {
		return act;
	}
	
	public void setAct(String act) {
		this.act = act;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public int getWid() {
		return wid;
	}
	
	public void setWid(int wid) {
		this.wid = wid;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
}
