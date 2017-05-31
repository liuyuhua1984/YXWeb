package com.gamecenter.model;

import java.io.Serializable;

public class TRoleAccessKey implements Serializable {
	private Integer nodeid;
	
	private Integer roleid;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getNodeid() {
		return nodeid;
	}
	
	public void setNodeid(Integer nodeid) {
		this.nodeid = nodeid;
	}
	
	public Integer getRoleid() {
		return roleid;
	}
	
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
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
		TRoleAccessKey other = (TRoleAccessKey) that;
		return (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid())) && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
		result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
		return result;
	}
}