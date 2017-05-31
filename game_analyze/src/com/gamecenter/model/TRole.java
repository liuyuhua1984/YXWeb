package com.gamecenter.model;

import java.io.Serializable;

public class TRole implements Serializable {
	private Integer roleid;
	
	private String rolename;
	
	private Short status;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getRoleid() {
		return roleid;
	}
	
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}
	
	public Short getStatus() {
		return status;
	}
	
	public void setStatus(Short status) {
		this.status = status;
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
		TRole other = (TRole) that;
		return (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		return result;
	}
}