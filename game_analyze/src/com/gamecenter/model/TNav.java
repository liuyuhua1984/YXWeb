package com.gamecenter.model;

import java.io.Serializable;

public class TNav implements Serializable {
	private Integer navid;
	
	private String name;
	
	private Short status;
	
	private Short sort;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getNavid() {
		return navid;
	}
	
	public void setNavid(Integer navid) {
		this.navid = navid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
	public Short getStatus() {
		return status;
	}
	
	public void setStatus(Short status) {
		this.status = status;
	}
	
	public Short getSort() {
		return sort;
	}
	
	public void setSort(Short sort) {
		this.sort = sort;
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
		TNav other = (TNav) that;
		return (this.getNavid() == null ? other.getNavid() == null : this.getNavid().equals(other.getNavid())) && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getNavid() == null) ? 0 : getNavid().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
		return result;
	}
}