package com.gamecenter.sysmanage.parBean;

/**
 * ztree 树对象节点 Created with IntelliJ IDEA. User: gsb Date: 14-6-19 Time: 下午8:32 To change this template use File | Settings | File Templates.
 */
public class TreeObj {
	private int id;
	private int pId;
	private String name;
	private String open; // 是否打开
	private String isParent; // 是否父节点
	
	public String getIsParent() {
		return isParent;
	}
	
	public void setIsParent(String parent) {
		isParent = parent;
	}
	
	public String getOpen() {
		return open;
	}
	
	public void setOpen(String open) {
		this.open = open;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getpId() {
		return pId;
	}
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
