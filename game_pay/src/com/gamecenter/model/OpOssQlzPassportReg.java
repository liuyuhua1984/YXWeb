package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzPassportReg implements Serializable {
	private String openid;
	
	private String worldid;
	
	private String lastloginip;
	
	private Integer logincount;
	
	private String lastlogintime;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getLastloginip() {
		return lastloginip;
	}
	
	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip == null ? null : lastloginip.trim();
	}
	
	public Integer getLogincount() {
		return logincount;
	}
	
	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}
	
	public String getLastlogintime() {
		return lastlogintime;
	}
	
	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
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
		OpOssQlzPassportReg other = (OpOssQlzPassportReg) that;
		return (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip())) && (this.getLogincount() == null ? other.getLogincount() == null : this.getLogincount().equals(other.getLogincount())) && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
		result = prime * result + ((getLogincount() == null) ? 0 : getLogincount().hashCode());
		result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}