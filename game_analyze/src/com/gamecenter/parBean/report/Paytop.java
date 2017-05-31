package com.gamecenter.parBean.report;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-22 Time: 下午6:24 To change this template use File | Settings | File Templates.
 */
public class Paytop {
	private String openid;
	private String rolename;
	private String worldid;
	private double totalmoney;
	private double totalconsume;
	private double curmoney;
	private double avgpay;
	
	private String lastpaytime;
	private String fristpaytime;
	private int grade;
	private int paycount;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid;
	}
	
	public double getTotalmoney() {
		return totalmoney;
	}
	
	public void setTotalmoney(double totalmoney) {
		this.totalmoney = totalmoney;
	}
	
	public double getTotalconsume() {
		return totalconsume;
	}
	
	public void setTotalconsume(double totalconsume) {
		this.totalconsume = totalconsume;
	}
	
	public double getCurmoney() {
		return curmoney;
	}
	
	public void setCurmoney(double curmoney) {
		this.curmoney = curmoney;
	}
	
	public double getAvgpay() {
		return avgpay;
	}
	
	public void setAvgpay(double avgpay) {
		this.avgpay = avgpay;
	}
	
	public String getLastpaytime() {
		return lastpaytime;
	}
	
	public void setLastpaytime(String lastpaytime) {
		this.lastpaytime = lastpaytime;
	}
	
	public String getFristpaytime() {
		return fristpaytime;
	}
	
	public void setFristpaytime(String fristpaytime) {
		this.fristpaytime = fristpaytime;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getPaycount() {
		return paycount;
	}
	
	public void setPaycount(int paycount) {
		this.paycount = paycount;
	}
}
