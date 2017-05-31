package com.gamecenter.model;

import java.io.Serializable;

public class OpOperatorProduct implements Serializable {
	private Integer id;
	
	private Integer optid;
	
	private String appid;
	
	private String appkey;
	
	private String checkip;
	
	private String pfurl;
	
	private Integer wnum;
	
	private String status;
	
	private String info;
	
	private String appname;
	private String optname;
	
	private static final long serialVersionUID = 1L;
	
	private String flag;
	
	public String getAppname() {
		return appname;
	}
	
	public void setAppname(String appname) {
		this.appname = appname;
	}
	
	public String getOptname() {
		return optname;
	}
	
	public void setOptname(String optname) {
		this.optname = optname;
	}
	
	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getOptid() {
		return optid;
	}
	
	public void setOptid(Integer optid) {
		this.optid = optid;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getAppkey() {
		return appkey;
	}
	
	public void setAppkey(String appkey) {
		this.appkey = appkey == null ? null : appkey.trim();
	}
	
	public String getCheckip() {
		return checkip;
	}
	
	public void setCheckip(String checkip) {
		this.checkip = checkip == null ? null : checkip.trim();
	}
	
	public String getPfurl() {
		return pfurl;
	}
	
	public void setPfurl(String pfurl) {
		this.pfurl = pfurl == null ? null : pfurl.trim();
	}
	
	public Integer getWnum() {
		return wnum;
	}
	
	public void setWnum(Integer wnum) {
		this.wnum = wnum;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
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
		OpOperatorProduct other = (OpOperatorProduct) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getAppkey() == null ? other.getAppkey() == null : this.getAppkey().equals(other.getAppkey())) && (this.getCheckip() == null ? other.getCheckip() == null : this.getCheckip().equals(other.getCheckip())) && (this.getPfurl() == null ? other.getPfurl() == null : this.getPfurl().equals(other.getPfurl())) && (this.getWnum() == null ? other.getWnum() == null : this.getWnum().equals(other.getWnum())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getOptid() == null) ? 0 : getOptid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getAppkey() == null) ? 0 : getAppkey().hashCode());
		result = prime * result + ((getCheckip() == null) ? 0 : getCheckip().hashCode());
		result = prime * result + ((getPfurl() == null) ? 0 : getPfurl().hashCode());
		result = prime * result + ((getWnum() == null) ? 0 : getWnum().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}