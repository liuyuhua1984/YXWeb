package com.gamecenter.model;

import java.io.Serializable;

public class OpGmtNoticeCycle implements Serializable {
	private Integer did;
	
	private String appid;
	
	private String worldid;
	
	private Integer type;
	
	private Integer cycletime;
	
	private String content;
	
	private String msg;
	
	private String opttime;
	
	private String username;
	
	private String settime;
	
	private String status;
	
	// ----附加 ----
	private long lastsendtime = 0; // 最近发送时间
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
	
	public long getLastsendtime() {
		return lastsendtime;
	}
	
	public void setLastsendtime(long lastsendtime) {
		this.lastsendtime = lastsendtime;
	}
	
	private static final long serialVersionUID = 1L;
	
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
	
	public Integer getCycletime() {
		return cycletime;
	}
	
	public void setCycletime(Integer cycletime) {
		this.cycletime = cycletime;
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
	
	public String getSettime() {
		return settime;
	}
	
	public void setSettime(String settime) {
		this.settime = settime == null ? null : settime.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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
		OpGmtNoticeCycle other = (OpGmtNoticeCycle) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType())) && (this.getCycletime() == null ? other.getCycletime() == null : this.getCycletime().equals(other.getCycletime())) && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent())) && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg())) && (this.getOpttime() == null ? other.getOpttime() == null : this.getOpttime().equals(other.getOpttime())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername())) && (this.getSettime() == null ? other.getSettime() == null : this.getSettime().equals(other.getSettime())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getCycletime() == null) ? 0 : getCycletime().hashCode());
		result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
		result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
		result = prime * result + ((getOpttime() == null) ? 0 : getOpttime().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((getSettime() == null) ? 0 : getSettime().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		return result;
	}
}