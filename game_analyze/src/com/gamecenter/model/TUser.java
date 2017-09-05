package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class TUser implements Serializable {
	private Integer uid;
	
	private String name;
	
	private String pwd;
	
	private String realname;
	
	private Date regtime;
	
	private Date lastlogintime;
	
	private String lastloginip;
	
	private Integer count;
	
	private Short status;
	
	private Integer roleid;
	
	private String tel;
	
	private static final long serialVersionUID = 1L;
	
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
		this.name = name == null ? null : name.trim();
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}
	
	public String getRealname() {
		return realname;
	}
	
	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
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
		this.lastloginip = lastloginip == null ? null : lastloginip.trim();
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
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}
	
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		TUser other = (TUser) that;
		return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid())) && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName())) && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd())) && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname())) && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime())) && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime())) && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip())) && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid())) && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
		result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
		result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
		result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
		result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
		result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
		result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
		return result;
	}
}