package com.gamecenter.controller.webservice.cdk;

/**
 * ckd验证返回 Created with IntelliJ IDEA. User: gsb Date: 14-6-6 Time: 下午2:05 To change this template use File | Settings | File Templates.
 */
public class ParCdkReturn {
	private String status;
	private String msg;
	private String gift;
	private String isopen;
	private String title;
	private String content;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getGift() {
		return gift;
	}
	
	public void setGift(String gift) {
		this.gift = gift;
	}
	
	public String getIsopen() {
		return isopen;
	}
	
	public void setIsopen(String isopen) {
		this.isopen = isopen;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
