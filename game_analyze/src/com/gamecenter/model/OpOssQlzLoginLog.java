package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzLoginLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private String userip;
	
	private String logintime;
	
	private String openid;
	
	private Integer level;
	
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
	
	public String getLogintime() {
		return logintime;
	}
	
	public void setLogintime(String logintime) {
		this.logintime = logintime == null ? null : logintime.trim();
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
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
		OpOssQlzLoginLog other = (OpOssQlzLoginLog) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getLogintime() == null ? other.getLogintime() == null : this.getLogintime().equals(other.getLogintime())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getLogintime() == null) ? 0 : getLogintime().hashCode());
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		return result;
	}
}