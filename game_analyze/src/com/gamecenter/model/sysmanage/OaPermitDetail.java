package com.gamecenter.sysmanage.model;

import java.io.Serializable;

public class OaPermitDetail implements Serializable {
	private Integer did;
	
	private Integer sourceid;
	
	private Integer permitid;
	
	private Integer type;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public Integer getSourceid() {
		return sourceid;
	}
	
	public void setSourceid(Integer sourceid) {
		this.sourceid = sourceid;
	}
	
	public Integer getPermitid() {
		return permitid;
	}
	
	public void setPermitid(Integer permitid) {
		this.permitid = permitid;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
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
		OaPermitDetail other = (OaPermitDetail) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getSourceid() == null ? other.getSourceid() == null : this.getSourceid().equals(other.getSourceid())) && (this.getPermitid() == null ? other.getPermitid() == null : this.getPermitid().equals(other.getPermitid())) && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getSourceid() == null) ? 0 : getSourceid().hashCode());
		result = prime * result + ((getPermitid() == null) ? 0 : getPermitid().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		return result;
	}
}