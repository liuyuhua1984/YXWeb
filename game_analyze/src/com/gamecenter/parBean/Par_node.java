package com.gamecenter.parBean;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-4-2 Time: 下午10:44 To change this template use File | Settings | File Templates.
 */
public class Par_node {
	
	private Integer nodeid;
	
	private String action;
	
	private String action_name;
	
	private Byte status;
	
	private String module;
	
	private String module_name;
	
	private String navid;
	
	private String navName; // 存的菜单的名称
	
	private Short sort;
	
	private String auth_type;
	
	private String is_show;
	
	public String getNavName() {
		return navName;
	}
	
	public void setNavName(String navName) {
		this.navName = navName;
	}
	
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
		this.action = action;
	}
	
	public String getAction_name() {
		return action_name;
	}
	
	public void setAction_name(String action_name) {
		this.action_name = action_name;
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
		this.module = module;
	}
	
	public String getModule_name() {
		return module_name;
	}
	
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	
	public String getNavid() {
		return navid;
	}
	
	public void setNavid(String navid) {
		this.navid = navid;
	}
	
	public Short getSort() {
		return sort;
	}
	
	public void setSort(Short sort) {
		this.sort = sort;
	}
	
	public String getAuth_type() {
		return auth_type;
	}
	
	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}
	
	public String getIs_show() {
		return is_show;
	}
	
	public void setIs_show(String is_show) {
		this.is_show = is_show;
	}
}
