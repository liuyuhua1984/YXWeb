package com.gamecenter.common;

public class PageTool3 {
	private String url;
	private Page page;
	private int currentPage = 1;
	private int pageSize = 10;
	private int totalPageCount;
	private int cursor = 5;
	private int lineCursor = 5;
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getTotalPageCount() {
		return totalPageCount;
	}
	
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public Page getPage() {
		return page;
	}
	
	public void setPage(Page page) {
		this.page = page;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public PageTool3() {
	}
	
	public String getPageString(String url, Page page) {
		if (url.indexOf("?") != -1) {
			this.url = "<a class='not_current_page'href='" + url + "&page=";
		} else {
			this.url = "<a class='not_current_page'href='" + url + "?page=";
		}
		// this.url = "<a class='not_current_page'href='" + url + "?page=";
		this.page = page;
		this.currentPage = page.getCurrentPage();
		this.pageSize = page.getPageSize();
		this.totalPageCount = page.getTotalPageCount();
		return "" + " " + getLeftTools() + getCenter() + getRightTools() + "";
	}
	
	public String getPageStringForjs(String url, Page page) {
		this.page = page;
		this.currentPage = page.getCurrentPage();
		this.pageSize = page.getPageSize();
		this.totalPageCount = page.getTotalPageCount();
		return getLeftTools2() + getCenter2() + getRightTools2();
	}
	
	private String getLeftTools() {
		StringBuffer leftString;
		if (currentPage == 1) {
			leftString = new StringBuffer("");
		} else {
			leftString = new StringBuffer(getUrl() + "1'><font class='page_up_down'>« 首页</font></a>" + getUrl() + (getCurrentPage() - 1) + "'<font class='page_up_down'>上一页</font></a>");
		}
		return leftString.toString();
	}
	
	private String getLeftTools2() {
		StringBuffer leftString;
		if (currentPage == 1) {
			leftString = new StringBuffer("");
		} else {
			leftString = new StringBuffer("<a href='javascript:;' num=1><font class='page_up_down'>« 首页</font></a><a href='javascript:;' num='" + (getCurrentPage() - 1) + "'><font class='page_up_down'>上一页</font></a>");
		}
		return leftString.toString();
	}
	
	private String getRightTools() {
		StringBuffer rightString;
		if (currentPage == totalPageCount || totalPageCount == 0) {
			rightString = new StringBuffer("");
		} else {
			rightString = new StringBuffer(getUrl() + (getCurrentPage() + 1) + "'><font class='page_up_down'>下一页</font></a>" + getUrl() + (getTotalPageCount()) + "'<font class='page_up_down'>尾页 »</font></a>");
		}
		return rightString.toString();
	}
	
	private String getRightTools2() {
		StringBuffer rightString;
		if (currentPage == totalPageCount || totalPageCount == 0) {
			rightString = new StringBuffer("");
		} else {
			rightString = new StringBuffer("<a href='javascript:;' num='" + (getCurrentPage() + 1) + "'><font class='page_up_down'>下一页</font></a><a href='javascript:;' num='" + (getTotalPageCount()) + "'><font class='page_up_down'>尾页 »</font></a>");
		}
		return rightString.toString();
	}
	
	private String getCenter() {
		StringBuffer centerString = new StringBuffer("");
		if (totalPageCount <= lineCursor) {
			for (int i = 1; i < this.totalPageCount + 1; i++) {
				if (i == this.currentPage) {
					centerString.append("<a href='javascript:;' class='on'>" + i + "</a>");
				} else {
					centerString.append(getUrl() + i + "'>" + i + "</a>  ");
				}
			}
		} else {
			int s = currentPage - cursor;
			if (s < 0) {
				for (int i = 1; i < lineCursor + 1; i++) {
					if (i == this.currentPage) {
						centerString.append("<a href='javascript:;' class='on'>" + i + "</a>");
					} else {
						centerString.append(getUrl() + i + "'>" + i + "</a>  ");
					}
				}
			} else {
				if (s + lineCursor > totalPageCount) {
					for (int i = totalPageCount - lineCursor + 1; i <= totalPageCount; i++) {
						if (i == this.currentPage) {
							centerString.append("<a href='javascript:;' class='on'>" + i + "</a>");
						} else {
							centerString.append(getUrl() + i + "'>" + i + "</a> ");
						}
					}
				} else {
					for (int i = s + 1; i < lineCursor + s + 1; i++) {
						if (i == this.currentPage) {
							centerString.append("<a href='javascript:;' class='on'>" + i + "</a>");
						} else {
							centerString.append(getUrl() + i + "'>" + i + "</a> ");
						}
					}
				}
			}
		}
		return centerString.toString();
	}
	
	private String getCenter2() {
		StringBuffer centerString = new StringBuffer("");
		if (totalPageCount <= lineCursor) {
			for (int i = 1; i < this.totalPageCount + 1; i++) {
				if (i == this.currentPage) {
					centerString.append("<a   href='javascript:;' class='on'>" + i + "</a>");
				} else {
					centerString.append("<a href='javascript:;' num='" + i + "'>" + i + "</a>");
				}
			}
		} else {
			int s = currentPage - cursor;
			if (s < 0) {
				for (int i = 1; i < lineCursor + 1; i++) {
					if (i == this.currentPage) {
						centerString.append("<a  href='javascript:;' class='on'>" + i + "</a>");
					} else {
						centerString.append("<a href='javascript:;' num='" + i + "'>" + i + "</a>");
					}
				}
			} else {
				if (s + lineCursor > totalPageCount) {
					for (int i = totalPageCount - lineCursor + 1; i <= totalPageCount; i++) {
						if (i == this.currentPage) {
							centerString.append("<a   href='javascript:;' class='on'>" + i + "</a>");
						} else {
							centerString.append("<a href='javascript:;' num='" + i + "'>" + i + "</a>");
						}
					}
				} else {
					for (int i = s + 1; i < lineCursor + s + 1; i++) {
						if (i == this.currentPage) {
							centerString.append("<a  href='javascript:;' class='on'>" + i + "</a>");
						} else {
							centerString.append("<a href='javascript:;' num='" + i + "'>" + i + "</a>");
						}
					}
				}
			}
		}
		return centerString.toString();
	}
}
