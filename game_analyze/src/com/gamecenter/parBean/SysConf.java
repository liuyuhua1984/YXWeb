package com.gamecenter.parBean;

import java.io.Serializable;

/**
 * 系统参数对象 Created by IntelliJ IDEA. User: Administrator Date: 12-2-23 Time: 上午11:26 To change this template use File | Settings | File Templates.
 */
public class SysConf implements Serializable {
	private String payurl; // 充值中心
	private String juugoourl; // 聚购网
	private String safeurl; // 安全中心
	private String passporturl; // 登陆注册中心
	
	public String getPassporturl() {
		return passporturl;
	}
	
	public void setPassporturl(String passporturl) {
		this.passporturl = passporturl;
	}
	
	public String getPayurl() {
		return payurl;
	}
	
	public void setPayurl(String payurl) {
		this.payurl = payurl;
	}
	
	public String getJuugoourl() {
		return juugoourl;
	}
	
	public void setJuugoourl(String juugoourl) {
		this.juugoourl = juugoourl;
	}
	
	public String getSafeurl() {
		return safeurl;
	}
	
	public void setSafeurl(String safeurl) {
		this.safeurl = safeurl;
	}
}
