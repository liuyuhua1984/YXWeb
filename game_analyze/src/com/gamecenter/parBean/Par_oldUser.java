package com.gamecenter.parBean;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-3-24 Time: 下午11:56 To change this template use File | Settings | File Templates.
 */
public class Par_oldUser implements Serializable {
	
	private String userNames = "";
	
	public String getUserNames() {
		return userNames;
	}
	
	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}
	
}
