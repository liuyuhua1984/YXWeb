package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OnlineNumLog implements Serializable {
	private Long id;
	
	private Long appid;
	
	private Date createtime;
	
	private Integer onlinenum;
	
	private String serverid;
	
	private String serverip;
	
	private static final long serialVersionUID = 1L;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getAppid() {
		return appid;
	}
	
	public void setAppid(Long appid) {
		this.appid = appid;
	}
	
	public Date getCreatetime() {
		return createtime;
	}
	
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	public Integer getOnlinenum() {
		return onlinenum;
	}
	
	public void setOnlinenum(Integer onlinenum) {
		this.onlinenum = onlinenum;
	}
	
	public String getServerid() {
		return serverid;
	}
	
	public void setServerid(String serverid) {
		this.serverid = serverid == null ? null : serverid.trim();
	}
	
	public String getServerip() {
		return serverip;
	}
	
	public void setServerip(String serverip) {
		this.serverip = serverip == null ? null : serverip.trim();
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
		OnlineNumLog other = (OnlineNumLog) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime())) && (this.getOnlinenum() == null ? other.getOnlinenum() == null : this.getOnlinenum().equals(other.getOnlinenum())) && (this.getServerid() == null ? other.getServerid() == null : this.getServerid().equals(other.getServerid())) && (this.getServerip() == null ? other.getServerip() == null : this.getServerip().equals(other.getServerip()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
		result = prime * result + ((getOnlinenum() == null) ? 0 : getOnlinenum().hashCode());
		result = prime * result + ((getServerid() == null) ? 0 : getServerid().hashCode());
		result = prime * result + ((getServerip() == null) ? 0 : getServerip().hashCode());
		return result;
	}
}