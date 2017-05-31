package com.gamecenter.parBean;

import java.io.Serializable;

/**
 * 用户信息session对象
 * <p/>
 * Created by IntelliJ IDEA. User: Administrator Date: 12-2-17 Time: 上午11:44 To change this template use File | Settings | File Templates.
 */
public class UserMsg implements Serializable {
	private int uid;
	private String passport;
	private String name;
	
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
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
}
