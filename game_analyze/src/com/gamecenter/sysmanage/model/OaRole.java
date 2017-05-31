package com.gamecenter.sysmanage.model;

import java.io.Serializable;

public class OaRole implements Serializable {
	private Integer roleid;
	
	private String rolename;
	
	private String status;
	
	private String info;
	
	private String pgids;
	
	private static final long serialVersionUID = 1L;
	
	private String unames; // 角色包含的用户
	
	public String getUnames() {
		return unames;
	}
	
	public void setUnames(String unames) {
		this.unames = unames;
	}
	
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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public String getPgids() {
		return pgids;
	}
	
	public void setPgids(String pgids) {
		this.pgids = pgids == null ? null : pgids.trim();
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
		OaRole other = (OaRole) that;
		return (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getPgids() == null ? other.getPgids() == null : this.getPgids().equals(other.getPgids()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getPgids() == null) ? 0 : getPgids().hashCode());
		return result;
	}
}