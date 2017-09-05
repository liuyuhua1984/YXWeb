package com.gamecenter.sysmanage.parBean;

/**
 * 功能权限 Created with IntelliJ IDEA. User: gsb Date: 14-7-2 Time: 下午4:52 To change this template use File | Settings | File Templates.
 */
public class PermitAction {
	private String permitid;
	private String aid;
	private String actionname;
	private String actioncode;
	
	public String getPermitid() {
		return permitid;
	}
	
	public void setPermitid(String permitid) {
		this.permitid = permitid;
	}
	
	public String getAid() {
		return aid;
	}
	
	public void setAid(String aid) {
		this.aid = aid;
	}
	
	public String getActionname() {
		return actionname;
	}
	
	public void setActionname(String actionname) {
		this.actionname = actionname;
	}
	
	public String getActioncode() {
		return actioncode;
	}
	
	public void setActioncode(String actioncode) {
		this.actioncode = actioncode;
	}
}
