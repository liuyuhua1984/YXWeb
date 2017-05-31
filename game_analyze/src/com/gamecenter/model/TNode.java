package com.gamecenter.model;

import java.io.Serializable;

public class TNode implements Serializable {
	private Integer nodeid;
	
	private String action;
	
	private String actionName;
	
	private Byte status;
	
	private String module;
	
	private String moduleName;
	
	private Integer navid;
	
	private Short sort;
	
	private Byte authType;
	
	private Byte isShow;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getNodeid() {
		return nodeid;
	}
	
	public void setNodeid(Integer nodeid) {
		this.nodeid = nodeid;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action == null ? null : action.trim();
	}
	
	public String getActionName() {
		return actionName;
	}
	
	public void setActionName(String actionName) {
		this.actionName = actionName == null ? null : actionName.trim();
	}
	
	public Byte getStatus() {
		return status;
	}
	
	public void setStatus(Byte status) {
		this.status = status;
	}
	
	public String getModule() {
		return module;
	}
	
	public void setModule(String module) {
		this.module = module == null ? null : module.trim();
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName == null ? null : moduleName.trim();
	}
	
	public Integer getNavid() {
		return navid;
	}
	
	public void setNavid(Integer navid) {
		this.navid = navid;
	}
	
	public Short getSort() {
		return sort;
	}
	
	public void setSort(Short sort) {
		this.sort = sort;
	}
	
	public Byte getAuthType() {
		return authType;
	}
	
	public void setAuthType(Byte authType) {
		this.authType = authType;
	}
	
	public Byte getIsShow() {
		return isShow;
	}
	
	public void setIsShow(Byte isShow) {
		this.isShow = isShow;
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
		TNode other = (TNode) that;
		return (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid())) && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction())) && (this.getActionName() == null ? other.getActionName() == null : this.getActionName().equals(other.getActionName())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getModule() == null ? other.getModule() == null : this.getModule().equals(other.getModule())) && (this.getModuleName() == null ? other.getModuleName() == null : this.getModuleName().equals(other.getModuleName())) && (this.getNavid() == null ? other.getNavid() == null : this.getNavid().equals(other.getNavid())) && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort())) && (this.getAuthType() == null ? other.getAuthType() == null : this.getAuthType().equals(other.getAuthType())) && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
		result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
		result = prime * result + ((getActionName() == null) ? 0 : getActionName().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getModule() == null) ? 0 : getModule().hashCode());
		result = prime * result + ((getModuleName() == null) ? 0 : getModuleName().hashCode());
		result = prime * result + ((getNavid() == null) ? 0 : getNavid().hashCode());
		result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
		result = prime * result + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
		result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
		return result;
	}
}