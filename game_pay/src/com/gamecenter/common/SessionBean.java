package com.gamecenter.common;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA. User: hanson Date: 11-7-1 Time: 下午3:52 To change this template use File | Settings | File Templates.
 */
public class SessionBean implements Serializable {
	/****/  
        private static final long serialVersionUID = -5830595760070232245L;

	private String userId;
	
	private String userEmail;
	
	public SessionBean() {
	}
	
	public SessionBean(String userId, String userEmail) {
		this.userId = userId;
		this.userEmail = userEmail;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
