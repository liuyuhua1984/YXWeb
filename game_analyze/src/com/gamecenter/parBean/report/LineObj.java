package com.gamecenter.parBean.report;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-26 Time: 下午3:53 To change this template use File | Settings | File Templates.
 */
public class LineObj {
	private String name;
	private List<Object> data = new ArrayList<Object>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Object> getData() {
		return data;
	}
	
	public void setData(List<Object> data) {
		this.data = data;
	}
}
