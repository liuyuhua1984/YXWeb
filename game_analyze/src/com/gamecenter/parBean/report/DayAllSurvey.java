package com.gamecenter.parBean.report;

/**
 * 汇总概况 Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 下午2:29 To change this template use File | Settings | File Templates.
 */
public class DayAllSurvey {
	
	private String time;
	private int newdau;
	private int dau;
	private int apa;
	private double totalpay;
	private double payper; // 付费渗透率
	private double arpu;
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public int getNewdau() {
		return newdau;
	}
	
	public void setNewdau(int newdau) {
		this.newdau = newdau;
	}
	
	public int getDau() {
		return dau;
	}
	
	public void setDau(int dau) {
		this.dau = dau;
	}
	
	public int getApa() {
		return apa;
	}
	
	public void setApa(int apa) {
		this.apa = apa;
	}
	
	public double getTotalpay() {
		return totalpay;
	}
	
	public void setTotalpay(double totalpay) {
		this.totalpay = totalpay;
	}
	
	public double getPayper() {
		return payper;
	}
	
	public void setPayper(double payper) {
		this.payper = payper;
	}
	
	public double getArpu() {
		return arpu;
	}
	
	public void setArpu(double arpu) {
		this.arpu = arpu;
	}
}
