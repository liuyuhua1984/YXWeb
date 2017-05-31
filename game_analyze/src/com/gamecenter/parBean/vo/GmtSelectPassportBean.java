package com.gamecenter.parBean.vo;

/**
 * GMT 发送公告 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午10:54 To change this template use File | Settings | File Templates.
 */
public class GmtSelectPassportBean {
	private String act = "5030";
	private String passport;
	private String type = "1";
	
	private int wid;
	private String appid;
	private String user; // 操作人员
	
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
