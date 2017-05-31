package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzOnlinecurLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private Integer onlinenum;
	
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
	
	public Integer getOnlinenum() {
		return onlinenum;
	}
	
	public void setOnlinenum(Integer onlinenum) {
		this.onlinenum = onlinenum;
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
		OpOssQlzOnlinecurLog other = (OpOssQlzOnlinecurLog) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOnlinenum() == null ? other.getOnlinenum() == null : this.getOnlinenum().equals(other.getOnlinenum())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getOnlinenum() == null) ? 0 : getOnlinenum().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		return result;
	}
}