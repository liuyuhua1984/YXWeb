package com.gamecenter.parBean;

import java.util.Date;

import com.gamecenter.common.PageListNum;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-5-18 Time: 上午9:41 To change this template use File | Settings | File Templates.
 */
public class Par_meterLog extends PageListNum {
	
	private Integer id;
	
	private String checkunit;
	
	private String info;
	
	private String name;
	
	private Date time;
	
	private Integer mid;
	
	private String mname; // 器具名称
	private String number; // 器号
	private String passport;
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCheckunit() {
		return checkunit;
	}
	
	public void setCheckunit(String checkunit) {
		this.checkunit = checkunit;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
	
	public Integer getMid() {
		return mid;
	}
	
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	
	public String getMname() {
		return mname;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
