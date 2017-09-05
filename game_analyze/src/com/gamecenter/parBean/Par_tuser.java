package com.gamecenter.parBean;

import java.util.Date;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-4-12 Time: 下午2:14 To change this template use File | Settings | File Templates.
 */
public class Par_tuser {
	private Integer uid;
	
	private String name;
	
	private String pwd;
	
	private Date regtime;
	
	private Date lastlogintime;
	
	private String lastloginip;
	
	private Integer count;
	
	private Short status;
	
	private Integer roleid;
	
	private String roleName;
	
	private String realname;
	
	private String tel;
	
	public String getRealname() {
		return realname;
	}
	
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Integer getUid() {
		return uid;
	}
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Date getRegtime() {
		return regtime;
	}
	
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	
	public Date getLastlogintime() {
		return lastlogintime;
	}
	
	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	
	public String getLastloginip() {
		return lastloginip;
	}
	
	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public Short getStatus() {
		return status;
	}
	
	public void setStatus(Short status) {
		this.status = status;
	}
	
	public Integer getRoleid() {
		return roleid;
	}
	
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
}
