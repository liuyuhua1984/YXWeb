package com.gamecenter.model;

import java.io.Serializable;

public class OaAction implements Serializable {
	private Integer aid;
	
	private String actionname;
	
	private String actioncode;
	
	private String icon;
	
	private Integer sort;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	private Integer mid;
	
	public Integer getMid() {
		return mid;
	}
	
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	
	public Integer getAid() {
		return aid;
	}
	
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	public String getActionname() {
		return actionname;
	}
	
	public void setActionname(String actionname) {
		this.actionname = actionname == null ? null : actionname.trim();
	}
	
	public String getActioncode() {
		return actioncode;
	}
	
	public void setActioncode(String actioncode) {
		this.actioncode = actioncode == null ? null : actioncode.trim();
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}
	
	public Integer getSort() {
		return sort;
	}
	
	public void setSort(Integer sort) {
		this.sort = sort;
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
		OaAction other = (OaAction) that;
		return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid())) && (this.getActionname() == null ? other.getActionname() == null : this.getActionname().equals(other.getActionname())) && (this.getActioncode() == null ? other.getActioncode() == null : this.getActioncode().equals(other.getActioncode())) && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon())) && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
		result = prime * result + ((getActionname() == null) ? 0 : getActionname().hashCode());
		result = prime * result + ((getActioncode() == null) ? 0 : getActioncode().hashCode());
		result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
		result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}