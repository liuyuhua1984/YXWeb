package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzCreateroleLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private String userip;
	
	private String time;
	
	private String openid;
	
	private String rolename;
	
	private String addtime;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getUserip() {
		return userip;
	}
	
	public void setUserip(String userip) {
		this.userip = userip == null ? null : userip.trim();
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
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
		OpOssQlzCreateroleLog other = (OpOssQlzCreateroleLog) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		return result;
	}
}