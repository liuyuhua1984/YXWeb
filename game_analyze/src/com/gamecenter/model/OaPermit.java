package com.gamecenter.model;

import java.io.Serializable;

public class OaPermit implements Serializable {
	private Integer permitid;
	
	private Integer mid;
	
	private Integer aid;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getPermitid() {
		return permitid;
	}
	
	public void setPermitid(Integer permitid) {
		this.permitid = permitid;
	}
	
	public Integer getMid() {
		return mid;
	}
	
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	
	public Integer getAid() {
		return aid;
	}
	
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
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
		OaPermit other = (OaPermit) that;
		return (this.getPermitid() == null ? other.getPermitid() == null : this.getPermitid().equals(other.getPermitid())) && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid())) && (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getPermitid() == null) ? 0 : getPermitid().hashCode());
		result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
		result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}