package com.gamecenter.model;

import java.io.Serializable;

public class OpGmtSendmoney implements Serializable {
	private Integer applyid;
	
	private String appid;
	
	private String worldid;
	
	private Integer type;
	
	private String content;
	
	private String addtime;
	
	private String username;
	
	private String status;
	
	private String checkmsg;
	
	private static final long serialVersionUID = 1L;
	
	// 扩展
	private String appname;
	private String worldname;
	
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
	
	public Integer getApplyid() {
		return applyid;
	}
	
	public void setApplyid(Integer applyid) {
		this.applyid = applyid;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
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
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getCheckmsg() {
		return checkmsg;
	}
	
	public void setCheckmsg(String checkmsg) {
		this.checkmsg = checkmsg == null ? null : checkmsg.trim();
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
		OpGmtSendmoney other = (OpGmtSendmoney) that;
		return (this.getApplyid() == null ? other.getApplyid() == null : this.getApplyid().equals(other.getApplyid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType())) && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getCheckmsg() == null ? other.getCheckmsg() == null : this.getCheckmsg().equals(other.getCheckmsg()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getApplyid() == null) ? 0 : getApplyid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getCheckmsg() == null) ? 0 : getCheckmsg().hashCode());
		return result;
	}
}