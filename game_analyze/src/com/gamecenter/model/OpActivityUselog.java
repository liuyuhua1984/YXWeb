package com.gamecenter.model;

import java.io.Serializable;

public class OpActivityUselog implements Serializable {
	private Integer id;
	
	private String cdkcode;
	
	private Integer aid;
	
	private String userid;
	
	private String worldid;
	
	private String time;
	
	private String userip;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
	
	public String getUserip() {
		return userip;
	}
	
	public void setUserip(String userip) {
		this.userip = userip == null ? null : userip.trim();
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
		OpActivityUselog other = (OpActivityUselog) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getCdkcode() == null ? other.getCdkcode() == null : this.getCdkcode().equals(other.getCdkcode())) && (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid())) && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getCdkcode() == null) ? 0 : getCdkcode().hashCode());
		result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
		result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}