package com.gamecenter.model;

import java.io.Serializable;

public class OpGmtNotice implements Serializable {
	private Integer did;
	
	private String appid;
	
	private Integer worldid;
	
	private Integer type;
	
	private String content;
	
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
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
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
		OpGmtNotice other = (OpGmtNotice) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType())) && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent())) && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg())) && (this.getOptres() == null ? other.getOptres() == null : this.getOptres().equals(other.getOptres())) && (this.getOpttime() == null ? other.getOpttime() == null : this.getOpttime().equals(other.getOpttime())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
		result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
		result = prime * result + ((getOptres() == null) ? 0 : getOptres().hashCode());
		result = prime * result + ((getOpttime() == null) ? 0 : getOpttime().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		return result;
	}
}