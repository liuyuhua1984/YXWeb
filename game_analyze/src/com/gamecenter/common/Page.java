package com.gamecenter.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Page implements Serializable {
	
	private int currentPage;
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	private int pageSize = 30;
	
	private List data;
	
	private int totalCount;
	
	private int size;
	
	public Page() {
		this(0, 0, 10, new ArrayList());
	}
	
	public Page(int currentPage, int totalSize, int pageSize, List data) {
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalCount = totalSize;
		this.data = data;
		this.size = data.size();
	}
	
	public int getTotalSize() {
		return this.totalCount;
	}
	
	public int getTotalPageCount() {
		if (totalCount % pageSize == 0)
			return totalCount / pageSize;
		else
			return totalCount / pageSize + 1;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public List getResult() {
		return data;
	}
	
	public boolean hasNextPage() {
		return (this.currentPage < this.getTotalPageCount() - 1);
	}
	
	public boolean hasPreviousPage() {
		return (this.currentPage > 1);
	}
	
	protected static int getStartOfPage(int pageNo) {
		return getStartOfPage(pageNo, 8);
	}
	
	public static int getStartOfPage(int pageNo, int pageSize) {
		return (pageNo - 1) * pageSize;
	}
	
	public int getSize() {
		return this.size;
	}
	
}
