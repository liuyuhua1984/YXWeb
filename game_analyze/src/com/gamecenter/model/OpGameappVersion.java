package com.gamecenter.model;

import java.io.Serializable;

public class OpGameappVersion implements Serializable {
	private String id;
	
	private String appid;
	
	private String vsid;
	
	private String vname;
	
	private String info;
	
	private String sendtime;
	
	private static final long serialVersionUID = 1L;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
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
	
	public String getVname() {
		return vname;
	}
	
	public void setVname(String vname) {
		this.vname = vname == null ? null : vname.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public String getSendtime() {
		return sendtime;
	}
	
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime == null ? null : sendtime.trim();
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
		OpGameappVersion other = (OpGameappVersion) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getVsid() == null ? other.getVsid() == null : this.getVsid().equals(other.getVsid())) && (this.getVname() == null ? other.getVname() == null : this.getVname().equals(other.getVname())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getVsid() == null) ? 0 : getVsid().hashCode());
		result = prime * result + ((getVname() == null) ? 0 : getVname().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
		return result;
	}
}