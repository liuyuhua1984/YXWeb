package com.gamecenter.model;

import java.io.Serializable;

public class OpActivityCdk implements Serializable {
	private String cdkcode;
	
	private Integer aid;
	
	private String time;
	
	private String status;
	
	private static final long serialVersionUID = 1L;
	
	private String name; // 活动名称
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCdkcode() {
		return cdkcode;
	}
	
	public void setCdkcode(String cdkcode) {
		this.cdkcode = cdkcode == null ? null : cdkcode.trim();
	}
	
	public Integer getAid() {
		return aid;
	}
	
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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
		OpActivityCdk other = (OpActivityCdk) that;
		return (this.getCdkcode() == null ? other.getCdkcode() == null : this.getCdkcode().equals(other.getCdkcode())) && (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getCdkcode() == null) ? 0 : getCdkcode().hashCode());
		result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		return result;
	}
}