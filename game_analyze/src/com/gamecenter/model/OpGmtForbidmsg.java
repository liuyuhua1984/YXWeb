package com.gamecenter.model;

import java.io.Serializable;

public class OpGmtForbidmsg implements Serializable {
	private Integer did;
	
	private Integer ptype;
	
	private String passport;
	
	private String appid;
	
	private Integer worldid;
	
	private Integer opttype;
	
	private Integer forbidtime;
	
	private String ip;
	
	private String msg;
	
	private String optres;
	
	private String opttime;
	
	private String username;
	
	// 附加
	private String optname;
	private String appname;
	private String worldname;
	
	private static final long serialVersionUID = 1L;
	
	public String getOptname() {
		return optname;
	}
	
	public void setOptname(String optname) {
		this.optname = optname;
	}
	
	public String getAppname() {
		return appname;
	}
	
	public void setAppname(String appname) {
		this.appname = appname;
	}
	
	public String getWorldname() {
		return worldname;
	}
	
	public void setWorldname(String worldname) {
		this.worldname = worldname;
	}
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public Integer getPtype() {
		return ptype;
	}
	
	public void setPtype(Integer ptype) {
		this.ptype = ptype;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport == null ? null : passport.trim();
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public Integer getWorldid() {
		return worldid;
	}
	
	public void setWorldid(Integer worldid) {
		this.worldid = worldid;
	}
	
	public Integer getOpttype() {
		return opttype;
	}
	
	public void setOpttype(Integer opttype) {
		this.opttype = opttype;
	}
	
	public Integer getForbidtime() {
		return forbidtime;
	}
	
	public void setForbidtime(Integer forbidtime) {
		this.forbidtime = forbidtime;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg == null ? null : msg.trim();
	}
	
	public String getOptres() {
		return optres;
	}
	
	public void setOptres(String optres) {
		this.optres = optres == null ? null : optres.trim();
	}
	
	public String getOpttime() {
		return opttime;
	}
	
	public void setOpttime(String opttime) {
		this.opttime = opttime == null ? null : opttime.trim();
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
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
		OpGmtForbidmsg other = (OpGmtForbidmsg) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getPtype() == null ? other.getPtype() == null : this.getPtype().equals(other.getPtype())) && (this.getPassport() == null ? other.getPassport() == null : this.getPassport().equals(other.getPassport())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOpttype() == null ? other.getOpttype() == null : this.getOpttype().equals(other.getOpttype())) && (this.getForbidtime() == null ? other.getForbidtime() == null : this.getForbidtime().equals(other.getForbidtime())) && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp())) && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg())) && (this.getOptres() == null ? other.getOptres() == null : this.getOptres().equals(other.getOptres())) && (this.getOpttime() == null ? other.getOpttime() == null : this.getOpttime().equals(other.getOpttime())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getPtype() == null) ? 0 : getPtype().hashCode());
		result = prime * result + ((getPassport() == null) ? 0 : getPassport().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getOpttype() == null) ? 0 : getOpttype().hashCode());
		result = prime * result + ((getForbidtime() == null) ? 0 : getForbidtime().hashCode());
		result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
		result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
		result = prime * result + ((getOptres() == null) ? 0 : getOptres().hashCode());
		result = prime * result + ((getOpttime() == null) ? 0 : getOpttime().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		return result;
	}
}