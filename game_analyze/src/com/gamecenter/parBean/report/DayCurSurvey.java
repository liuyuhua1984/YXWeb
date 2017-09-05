package com.gamecenter.parBean.report;

/**
 * 实时汇总概况 Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 下午2:29 To change this template use File | Settings | File Templates.
 */
public class DayCurSurvey {
	private int chuangjue;
	private int dau;
	private int apa;
	private double paysum;
	private double payper; // 付费渗透率
	private double arpu;
	
	public int getChuangjue() {
		return chuangjue;
	}
	
	public void setChuangjue(int chuangjue) {
		this.chuangjue = chuangjue;
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
	
	public double getPaysum() {
		return paysum;
	}
	
	public void setPaysum(double paysum) {
		this.paysum = paysum;
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
