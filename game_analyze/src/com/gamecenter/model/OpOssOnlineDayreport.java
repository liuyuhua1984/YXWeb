package com.gamecenter.model;

import java.io.Serializable;

public class OpOssOnlineDayreport implements Serializable {
	private Integer id;
	
	private String appid;
	
	private String worldid;
	
	private String ctime;
	
	private Integer maxval;
	
	private Integer minval;
	
	private Integer avgval;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getCtime() {
		return ctime;
	}
	
	public void setCtime(String ctime) {
		this.ctime = ctime == null ? null : ctime.trim();
	}
	
	public Integer getMaxval() {
		return maxval;
	}
	
	public void setMaxval(Integer maxval) {
		this.maxval = maxval;
	}
	
	public Integer getMinval() {
		return minval;
	}
	
	public void setMinval(Integer minval) {
		this.minval = minval;
	}
	
	public Integer getAvgval() {
		return avgval;
	}
	
	public void setAvgval(Integer avgval) {
		this.avgval = avgval;
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
		OpOssOnlineDayreport other = (OpOssOnlineDayreport) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime())) && (this.getMaxval() == null ? other.getMaxval() == null : this.getMaxval().equals(other.getMaxval())) && (this.getMinval() == null ? other.getMinval() == null : this.getMinval().equals(other.getMinval())) && (this.getAvgval() == null ? other.getAvgval() == null : this.getAvgval().equals(other.getAvgval()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
		result = prime * result + ((getMaxval() == null) ? 0 : getMaxval().hashCode());
		result = prime * result + ((getMinval() == null) ? 0 : getMinval().hashCode());
		result = prime * result + ((getAvgval() == null) ? 0 : getAvgval().hashCode());
		return result;
	}
}