package com.gamecenter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.gamecenter.sysmanage.parBean.PermitAction;

public class OaModule implements Serializable {
	private Integer mid;
	
	private Integer pid;
	
	private String modulename;
	
	private String moduleurl;
	
	private Integer sort;
	
	private String status;
	
	private String info;
	
	private String icon;
	
	private String type;
	
	private String joinid;
	
	private Integer level;
	
	private static final long serialVersionUID = 1L;
	
	private String actions; // 动作
	private List<PermitAction> actionList = new ArrayList<PermitAction>(); // 动作列表
	
	private List<OaModule> childList = new ArrayList<OaModule>(); // 子模块
	
	public List<OaModule> getChildList() {
		return childList;
	}
	
	public void setChildList(List<OaModule> childList) {
		this.childList = childList;
	}
	
	public List<PermitAction> getActionList() {
		return actionList;
	}
	
	public void setActionList(List<PermitAction> actionList) {
		this.actionList = actionList;
	}
	
	public String getActions() {
		return actions;
	}
	
	public void setActions(String actions) {
		this.actions = actions;
	}
	
	public Integer getMid() {
		return mid;
	}
	
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	
	public Integer getPid() {
		return pid;
	}
	
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	public String getModulename() {
		return modulename;
	}
	
	public void setModulename(String modulename) {
		this.modulename = modulename == null ? null : modulename.trim();
	}
	
	public String getModuleurl() {
		return moduleurl;
	}
	
	public void setModuleurl(String moduleurl) {
		this.moduleurl = moduleurl == null ? null : moduleurl.trim();
	}
	
	public Integer getSort() {
		return sort;
	}
	
	public void setSort(Integer sort) {
		this.sort = sort;
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
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}
	
	public String getJoinid() {
		return joinid;
	}
	
	public void setJoinid(String joinid) {
		this.joinid = joinid == null ? null : joinid.trim();
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
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
		OaModule other = (OaModule) that;
		return (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid())) && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid())) && (this.getModulename() == null ? other.getModulename() == null : this.getModulename().equals(other.getModulename())) && (this.getModuleurl() == null ? other.getModuleurl() == null : this.getModuleurl().equals(other.getModuleurl())) && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon())) && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType())) && (this.getJoinid() == null ? other.getJoinid() == null : this.getJoinid().equals(other.getJoinid())) && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
		result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
		result = prime * result + ((getModulename() == null) ? 0 : getModulename().hashCode());
		result = prime * result + ((getModuleurl() == null) ? 0 : getModuleurl().hashCode());
		result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getJoinid() == null) ? 0 : getJoinid().hashCode());
		result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
		return result;
	}
}