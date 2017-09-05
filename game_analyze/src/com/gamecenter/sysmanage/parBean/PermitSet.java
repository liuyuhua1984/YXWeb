package com.gamecenter.sysmanage.parBean;

/**
 * 权限设置 Created with IntelliJ IDEA. User: gsb Date: 14-7-3 Time: 上午10:59 To change this template use File | Settings | File Templates.
 */
public class PermitSet {
	private String[] permits;
	private int type;
	private int sourceid;
	
	public String[] getPermits() {
		return permits;
	}
	
	public void setPermits(String[] permits) {
		this.permits = permits;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getSourceid() {
		return sourceid;
	}
	
	public void setSourceid(int sourceid) {
		this.sourceid = sourceid;
	}
}
