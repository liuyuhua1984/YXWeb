package com.gamecenter.parBean;

import java.util.Date;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-4-12 Time: 上午9:42 To change this template use File | Settings | File Templates.
 */
public class Par_jlTeam {
	private Integer tid;
	
	private String tname;
	
	private Date time;
	
	private String info;
	
	private Integer oid;
	
	private String oname; // 班组的名称
	
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
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Integer getOid() {
		return oid;
	}
	
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	
	public String getOname() {
		return oname;
	}
	
	public void setOname(String oname) {
		this.oname = oname;
	}
}
