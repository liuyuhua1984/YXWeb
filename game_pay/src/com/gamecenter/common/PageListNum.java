package com.gamecenter.common;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 11-7-11 Time: 上午9:42 To change this template use File | Settings | File Templates.
 */
public class PageListNum {
	public int beginNum = 0;
	public int endNum = 0;
	public int pageSize = 0;
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getBeginNum() {
		return beginNum;
	}
	
	public void setBeginNum(int beginNum) {
		this.beginNum = beginNum;
	}
	
	public int getEndNum() {
		return endNum;
	}
	
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
}
