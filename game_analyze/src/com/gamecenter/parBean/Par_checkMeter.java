package com.gamecenter.parBean;

import com.gamecenter.common.PageListNum;

import java.util.Date;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-4-22 Time: 下午10:15 To change this template use File | Settings | File Templates.
 */
public class Par_checkMeter extends PageListNum {
	
	private Integer id;
	
	private Integer mid;
	
	private String mname;
	
	private String type;
	
	private String staus;
	
	private String unit;
	
	private String person;
	
	private Double paymoney;
	
	private String info;
	
	private Date time;
	
	private String tname;
	
	private String oname;
	
	private Integer oid;
	
	private Integer tid;
	
	private String beginTime;
	
	private String endTime;
	
	public String getBeginTime() {
		return beginTime;
	}
	
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public Integer getOid() {
		return oid;
	}
	
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	
	public Integer getTid() {
		return tid;
	}
	
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
	public String getTname() {
		return tname;
	}
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public String getOname() {
		return oname;
	}
	
	public void setOname(String oname) {
		this.oname = oname;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getStaus() {
		return staus;
	}
	
	public void setStaus(String staus) {
		this.staus = staus;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getPerson() {
		return person;
	}
	
	public void setPerson(String person) {
		this.person = person;
	}
	
	public Double getPaymoney() {
		return paymoney;
	}
	
	public void setPaymoney(Double paymoney) {
		this.paymoney = paymoney;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
}
