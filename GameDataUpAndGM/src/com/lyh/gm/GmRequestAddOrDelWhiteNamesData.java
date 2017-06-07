package com.lyh.gm;

import java.util.List;

/**
 * ClassName:GmAddWhiteNamesData <br/>
 * Function: TODO ("添加或删除白名单"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:54:58 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmRequestAddOrDelWhiteNamesData {
	
	/** 1：添加 2：删除 */
	private int type;
	
	/** 名单列表 */
	private List<String> lists;
	
	private String serverId;
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public List<String> getLists() {
		return lists;
	}
	
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
}
