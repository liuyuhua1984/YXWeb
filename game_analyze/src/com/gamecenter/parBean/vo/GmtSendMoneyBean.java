package com.gamecenter.parBean.vo;

/**
 * GMT 金币发放 请求 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午10:54 To change this template use File | Settings | File Templates.
 */
public class GmtSendMoneyBean {
	private String act = "5010";
	private String passports;
	private String money; // 发放的金额
	private String msg;
	private String type = "1"; // 发送的内容 1:指定账号 2:全服
	private String applyid; // 申请ID
	
	private int wid;
	private String appid;
	private String user; // 操作人员
	
	public String getApplyid() {
		return applyid;
	}
	
	public void setApplyid(String applyid) {
		this.applyid = applyid;
	}
	
	public String getMoney() {
		return money;
	}
	
	public void setMoney(String money) {
		this.money = money;
	}
	
	public String getAct() {
		return act;
	}
	
	public void setAct(String act) {
		this.act = act;
	}
	
	public String getPassports() {
		return passports;
	}
	
	public void setPassports(String passports) {
		this.passports = passports;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
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
