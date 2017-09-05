package com.gamecenter.parBean;

import java.io.Serializable;

/**
 * 用户信息session对象
 * <p/>
 * Created by IntelliJ IDEA. User: Administrator Date: 12-2-17 Time: 上午11:44 To change this template use File | Settings | File Templates.
 */
public class UserMsg implements Serializable {
	/****/  
	private static final long serialVersionUID = 5275396851411595990L;
	private long uid;
	private String passport;
	private String name;
	/**代理**/  
	private boolean bAgent;
	
	public long getUid() {
		return uid;
	}
	
	public void setUid(long uid) {
		this.uid = uid;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isbAgent() {
		return bAgent;
	}

	public void setbAgent(boolean bAgent) {
		this.bAgent = bAgent;
	}
}
