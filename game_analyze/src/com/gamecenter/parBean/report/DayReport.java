package com.gamecenter.parBean.report;

/**
 * 综合日报表 t3.appid,t3.worldid,t3.ctime,t3.regnum,t3.createnum,t3.dau,t3.newdau,t3.acu,t3.pcu, t3.apa,t3.newapa,t3.total,t3.payper,t3.arpu
 * 
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 下午3:40 To change this template use File | Settings | File Templates.
 */
public class DayReport {
	
	private String appid;
	private String worldid;
	private String wname;
	private String ctime;
	
	private int regnum;
	private int createnum;
	private int dau;
	private int newdau;
	private int acu;
	private int pcu;
	
	private int apa;
	private int newapa;
	private double total;
	private double payper;
	private double arpu;
	
	public String getWname() {
		return wname;
	}
	
	public void setWname(String wname) {
		this.wname = wname;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid;
	}
	
	public String getCtime() {
		return ctime;
	}
	
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	
	public int getRegnum() {
		return regnum;
	}
	
	public void setRegnum(int regnum) {
		this.regnum = regnum;
	}
	
	public int getCreatenum() {
		return createnum;
	}
	
	public void setCreatenum(int createnum) {
		this.createnum = createnum;
	}
	
	public int getDau() {
		return dau;
	}
	
	public void setDau(int dau) {
		this.dau = dau;
	}
	
	public int getNewdau() {
		return newdau;
	}
	
	public void setNewdau(int newdau) {
		this.newdau = newdau;
	}
	
	public int getAcu() {
		return acu;
	}
	
	public void setAcu(int acu) {
		this.acu = acu;
	}
	
	public int getPcu() {
		return pcu;
	}
	
	public void setPcu(int pcu) {
		this.pcu = pcu;
	}
	
	public int getApa() {
		return apa;
	}
	
	public void setApa(int apa) {
		this.apa = apa;
	}
	
	public int getNewapa() {
		return newapa;
	}
	
	public void setNewapa(int newapa) {
		this.newapa = newapa;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
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
