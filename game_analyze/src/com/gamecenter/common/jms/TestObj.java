package com.gamecenter.common.jms;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-9 Time: 上午11:24 To change this template use File | Settings | File Templates.
 */
public class TestObj implements Serializable {
	
	private String name;
	private int act;
	
	public TestObj(String name, int x) {
		this.name = name;
		this.act = x;
	}
	
	public TestObj() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAct() {
		return act;
	}
	
	public void setAct(int act) {
		this.act = act;
	}
}
