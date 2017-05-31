package com.gamecenter.parBean.vo;

/**
 * GMT封禁参数对象 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午10:54 To change this template use File | Settings | File Templates.
 */
public class GmtForbidBean {
	private String act;
	private String passport;
	private String type;
	private String time;
	private String ip;
	private String msg;
	
	private int wid; // 区服ID
	private String appid;
	private String user; // 操作人员
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getAct() {
		return act;
	}
	
	public void setAct(String act) {
		this.act = act;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
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
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
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
}
