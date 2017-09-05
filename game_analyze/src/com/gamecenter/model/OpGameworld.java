package com.gamecenter.model;

import java.io.Serializable;

public class OpGameworld implements Serializable {
	private Integer wid;
	
	private String appid;
	
	private String vsid;
	
	private String wname;
	
	private String worldid;
	
	private String status;
	
	private String domain;
	
	private String ip;
	
	private String serverurl;
	
	private String info;
	
	private String ismingle;
	
	private String time;
	
	private String opentime;
	
	private static final long serialVersionUID = 1L;
	
	private String number;
	private int optid;
	private String optname;
	
	public String getOptname() {
		return optname;
	}
	
	public void setOptname(String optname) {
		this.optname = optname;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getOptid() {
		return optid;
	}
	
	public void setOptid(int optid) {
		this.optid = optid;
	}
	
	// 上报状态
	private String upstatus;
	
	public String getUpstatus() {
		return upstatus;
	}
	
	public void setUpstatus(String upstatus) {
		this.upstatus = upstatus;
	}
	
	public Integer getWid() {
		return wid;
	}
	
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getVsid() {
		return vsid;
	}
	
	public void setVsid(String vsid) {
		this.vsid = vsid == null ? null : vsid.trim();
	}
	
	public String getWname() {
		return wname;
	}
	
	public void setWname(String wname) {
		this.wname = wname == null ? null : wname.trim();
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getDomain() {
		return domain;
	}
	
	public void setDomain(String domain) {
		this.domain = domain == null ? null : domain.trim();
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}
	
	public String getServerurl() {
		return serverurl;
	}
	
	public void setServerurl(String serverurl) {
		this.serverurl = serverurl == null ? null : serverurl.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public String getIsmingle() {
		return ismingle;
	}
	
	public void setIsmingle(String ismingle) {
		this.ismingle = ismingle == null ? null : ismingle.trim();
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
	
	public String getOpentime() {
		return opentime;
	}
	
	public void setOpentime(String opentime) {
		this.opentime = opentime == null ? null : opentime.trim();
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
		OpGameworld other = (OpGameworld) that;
		return (this.getWid() == null ? other.getWid() == null : this.getWid().equals(other.getWid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getVsid() == null ? other.getVsid() == null : this.getVsid().equals(other.getVsid())) && (this.getWname() == null ? other.getWname() == null : this.getWname().equals(other.getWname())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getDomain() == null ? other.getDomain() == null : this.getDomain().equals(other.getDomain())) && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp())) && (this.getServerurl() == null ? other.getServerurl() == null : this.getServerurl().equals(other.getServerurl())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getIsmingle() == null ? other.getIsmingle() == null : this.getIsmingle().equals(other.getIsmingle())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getOpentime() == null ? other.getOpentime() == null : this.getOpentime().equals(other.getOpentime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getWid() == null) ? 0 : getWid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getVsid() == null) ? 0 : getVsid().hashCode());
		result = prime * result + ((getWname() == null) ? 0 : getWname().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getDomain() == null) ? 0 : getDomain().hashCode());
		result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
		result = prime * result + ((getServerurl() == null) ? 0 : getServerurl().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getIsmingle() == null) ? 0 : getIsmingle().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getOpentime() == null) ? 0 : getOpentime().hashCode());
		return result;
	}
}