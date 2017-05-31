package com.gamecenter.common.packets;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午1:53 To change this template use File | Settings | File Templates.
 */
public class PassportMsg_response {
	private String result;
	private String openid;
	private String name;
	private String grade;
	private String career;
	private String money;
	private String ip;
	private String isonline;
	private String status;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getCareer() {
		return career;
	}
	
	public void setCareer(String career) {
		this.career = career;
	}
	
	public String getMoney() {
		return money;
	}
	
	public void setMoney(String money) {
		this.money = money;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getIsonline() {
		return isonline;
	}
	
	public void setIsonline(String isonline) {
		this.isonline = isonline;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
