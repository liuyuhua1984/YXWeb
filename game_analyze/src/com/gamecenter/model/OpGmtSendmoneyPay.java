package com.gamecenter.model;

import java.io.Serializable;

public class OpGmtSendmoneyPay implements Serializable {
	private String orderid;
	
	private String appid;
	
	private String worldid;
	
	private String passport;
	
	private Double money;
	
	private Integer sendid;
	
	private String status;
	
	private String info;
	
	private String addtime;
	
	private static final long serialVersionUID = 1L;
	
	private String rolename;
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	public String getOrderid() {
		return orderid;
	}
	
	public void setOrderid(String orderid) {
		this.orderid = orderid == null ? null : orderid.trim();
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport == null ? null : passport.trim();
	}
	
	public Double getMoney() {
		return money;
	}
	
	public void setMoney(Double money) {
		this.money = money;
	}
	
	public Integer getSendid() {
		return sendid;
	}
	
	public void setSendid(Integer sendid) {
		this.sendid = sendid;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
	}
	
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		OpGmtSendmoneyPay other = (OpGmtSendmoneyPay) that;
		return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getPassport() == null ? other.getPassport() == null : this.getPassport().equals(other.getPassport())) && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney())) && (this.getSendid() == null ? other.getSendid() == null : this.getSendid().equals(other.getSendid())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getPassport() == null) ? 0 : getPassport().hashCode());
		result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
		result = prime * result + ((getSendid() == null) ? 0 : getSendid().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		return result;
	}
}