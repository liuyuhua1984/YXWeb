package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzCompars implements Serializable {
	private String openid;
	
	private String pars;
	
	private String time;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public String getPars() {
		return pars;
	}
	
	public void setPars(String pars) {
		this.pars = pars == null ? null : pars.trim();
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
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
		OpOssQlzCompars other = (OpOssQlzCompars) that;
		return (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getPars() == null ? other.getPars() == null : this.getPars().equals(other.getPars())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getPars() == null) ? 0 : getPars().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}