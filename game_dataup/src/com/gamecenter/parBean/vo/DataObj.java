package com.gamecenter.parBean.vo;

/**
 * 数据对象 Created with IntelliJ IDEA. User: gsb Date: 14-5-27 Time: 下午4:12 To change this template use File | Settings | File Templates.
 */
public class DataObj {
	private String time;
	private Object data;
	private int type;
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
