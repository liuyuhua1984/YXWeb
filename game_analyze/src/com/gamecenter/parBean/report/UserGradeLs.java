package com.gamecenter.parBean.report;

/**
 * 用户等级流失 Created with IntelliJ IDEA. User: gsb Date: 14-6-17 Time: 下午1:44 To change this template use File | Settings | File Templates.
 */
public class UserGradeLs {
	private int grade;
	private int zs; // 总数
	private int sy; // 剩余
	private int ls; // 流失
	
	private int ljz; // 累计总
	private int ljsy; // 累计剩余
	private double lsper; // 流失率
	
	public double getLsper() {
		return lsper;
	}
	
	public void setLsper(double lsper) {
		this.lsper = lsper;
	}
	
	public int getLjz() {
		return ljz;
	}
	
	public void setLjz(int ljz) {
		this.ljz = ljz;
	}
	
	public int getLjsy() {
		return ljsy;
	}
	
	public void setLjsy(int ljsy) {
		this.ljsy = ljsy;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getZs() {
		return zs;
	}
	
	public void setZs(int zs) {
		this.zs = zs;
	}
	
	public int getSy() {
		return sy;
	}
	
	public void setSy(int sy) {
		this.sy = sy;
	}
	
	public int getLs() {
		return ls;
	}
	
	public void setLs(int ls) {
		this.ls = ls;
	}
}
