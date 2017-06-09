package com.gamecenter.sysmanage.model;

import java.io.Serializable;

public class OaUser implements Serializable {
	private Integer uid;
	
	private String passport;
	
	private String pwd;
	
	private String uname;
	
	private String tel;
	
	private String email;
	
	private String regtime;
	
	private Integer logincount;
	
	private String lastlogintime;
	
	private String status;
	
	private String isonine;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getUid() {
		return uid;
	}
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport == null ? null : passport.trim();
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname == null ? null : uname.trim();
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}
	
	public String getRegtime() {
		return regtime;
	}
	
	public void setRegtime(String regtime) {
		this.regtime = regtime == null ? null : regtime.trim();
	}
	
	public Integer getLogincount() {
		return logincount;
	}
	
	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}
	
	public String getLastlogintime() {
		return lastlogintime;
	}
	
	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getIsonine() {
		return isonine;
	}
	
	public void setIsonine(String isonine) {
		this.isonine = isonine == null ? null : isonine.trim();
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
		OaUser other = (OaUser) that;
		return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid())) && (this.getPassport() == null ? other.getPassport() == null : this.getPassport().equals(other.getPassport())) && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd())) && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname())) && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel())) && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail())) && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime())) && (this.getLogincount() == null ? other.getLogincount() == null : this.getLogincount().equals(other.getLogincount())) && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getIsonine() == null ? other.getIsonine() == null : this.getIsonine().equals(other.getIsonine()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
		result = prime * result + ((getPassport() == null) ? 0 : getPassport().hashCode());
		result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
		result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
		result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
		result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
		result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
		result = prime * result + ((getLogincount() == null) ? 0 : getLogincount().hashCode());
		result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getIsonine() == null) ? 0 : getIsonine().hashCode());
		return result;
	}
}