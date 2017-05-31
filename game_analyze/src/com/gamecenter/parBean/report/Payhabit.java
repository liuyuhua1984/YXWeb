package com.gamecenter.parBean.report;

import com.gamecenter.model.OpGameworld;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 付费习惯 Created with IntelliJ IDEA. User: gsb Date: 14-5-23 Time: 上午11:44 To change this template use File | Settings | File Templates.
 */
public class Payhabit {
	
	private String worldid;
	private double paytotal;
	private int usernum;
	private int paycount;
	private double arpu;
	private String info;
	
	private String pietotal; // 画图数据
	private String pieusernum; // 画图数据
	private String piepaycount; // 画图数据
	
	private Map<String, Payhabit> detail = new ConcurrentHashMap<String, Payhabit>();
	
	public String getPietotal() {
		return pietotal;
	}
	
	public void setPietotal(String pietotal) {
		this.pietotal = pietotal;
	}
	
	public String getPieusernum() {
		return pieusernum;
	}
	
	public void setPieusernum(String pieusernum) {
		this.pieusernum = pieusernum;
	}
	
	public String getPiepaycount() {
		return piepaycount;
	}
	
	public void setPiepaycount(String piepaycount) {
		this.piepaycount = piepaycount;
	}
	
	public Map<String, Payhabit> getDetail() {
		return detail;
	}
	
	public void setDetail(Map<String, Payhabit> detail) {
		this.detail = detail;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid;
	}
	
	public double getPaytotal() {
		return paytotal;
	}
	
	public void setPaytotal(double paytotal) {
		this.paytotal = paytotal;
	}
	
	public int getUsernum() {
		return usernum;
	}
	
	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}
	
	public int getPaycount() {
		return paycount;
	}
	
	public void setPaycount(int paycount) {
		this.paycount = paycount;
	}
	
	public double getArpu() {
		return arpu;
	}
	
	public void setArpu(double arpu) {
		this.arpu = arpu;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}
