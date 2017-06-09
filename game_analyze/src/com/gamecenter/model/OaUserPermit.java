package com.gamecenter.model;

import java.io.Serializable;

public class OaUserPermit implements Serializable {
	private Integer uid;
	
	private Integer deptid;
	
	private Integer posid;
	
	private Integer roleid;
	
	private Integer pgid;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getUid() {
		return uid;
	}
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public Integer getDeptid() {
		return deptid;
	}
	
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	
	public Integer getPosid() {
		return posid;
	}
	
	public void setPosid(Integer posid) {
		this.posid = posid;
	}
	
	public Integer getRoleid() {
		return roleid;
	}
	
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	
	public Integer getPgid() {
		return pgid;
	}
	
	public void setPgid(Integer pgid) {
		this.pgid = pgid;
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
		OaUserPermit other = (OaUserPermit) that;
		return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid())) && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid())) && (this.getPosid() == null ? other.getPosid() == null : this.getPosid().equals(other.getPosid())) && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid())) && (this.getPgid() == null ? other.getPgid() == null : this.getPgid().equals(other.getPgid())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
		result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
		result = prime * result + ((getPosid() == null) ? 0 : getPosid().hashCode());
		result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
		result = prime * result + ((getPgid() == null) ? 0 : getPgid().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}