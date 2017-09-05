package com.gamecenter.parBean;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-2-16 Time: 下午5:28 To change this template use File | Settings | File Templates.
 */
public class PayBean implements Serializable {
	
	private String productName = "聚购平台"; // 产品名称 ,默认聚购平台 1
	private String areaName; // 区服名称
	private String payName;
	private String payBank;
	private String passport;
	private String money;
	private double point;
	private String phone;
	private int uid;
	private String orderNo;
	private String curUrl;
	
	public String getAreaName() {
		return areaName;
	}
	
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	public String getCurUrl() {
		return curUrl;
	}
	
	public void setCurUrl(String curUrl) {
		this.curUrl = curUrl;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getMoney() {
		return money;
	}
	
	public void setMoney(String money) {
		this.money = money;
	}
	
	public int getUid() {
		
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	private String ip;
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getPayName() {
		return payName;
	}
	
	public void setPayName(String payName) {
		this.payName = payName;
	}
	
	public String getPayBank() {
		return payBank;
	}
	
	public void setPayBank(String payBank) {
		this.payBank = payBank;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public double getPoint() {
		return point;
	}
	
	public void setPoint(double point) {
		this.point = point;
	}
}
