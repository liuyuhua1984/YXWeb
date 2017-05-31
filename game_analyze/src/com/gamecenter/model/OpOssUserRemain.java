package com.gamecenter.model;

import java.io.Serializable;

public class OpOssUserRemain implements Serializable {
	private Integer id;
	
	private String appid;
	
	private String worldid;
	
	private String goaltime;
	
	private Double lc2;
	
	private Double lc3;
	
	private Double lc7;
	
	private Double lc30;
	
	private static final long serialVersionUID = 1L;
	
	private String opentime;
	
	public String getOpentime() {
		return opentime;
	}
	
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	
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
	
	public String getGoaltime() {
		return goaltime;
	}
	
	public void setGoaltime(String goaltime) {
		this.goaltime = goaltime == null ? null : goaltime.trim();
	}
	
	public Double getLc2() {
		return lc2;
	}
	
	public void setLc2(Double lc2) {
		this.lc2 = lc2;
	}
	
	public Double getLc3() {
		return lc3;
	}
	
	public void setLc3(Double lc3) {
		this.lc3 = lc3;
	}
	
	public Double getLc7() {
		return lc7;
	}
	
	public void setLc7(Double lc7) {
		this.lc7 = lc7;
	}
	
	public Double getLc30() {
		return lc30;
	}
	
	public void setLc30(Double lc30) {
		this.lc30 = lc30;
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
		OpOssUserRemain other = (OpOssUserRemain) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getGoaltime() == null ? other.getGoaltime() == null : this.getGoaltime().equals(other.getGoaltime())) && (this.getLc2() == null ? other.getLc2() == null : this.getLc2().equals(other.getLc2())) && (this.getLc3() == null ? other.getLc3() == null : this.getLc3().equals(other.getLc3())) && (this.getLc7() == null ? other.getLc7() == null : this.getLc7().equals(other.getLc7())) && (this.getLc30() == null ? other.getLc30() == null : this.getLc30().equals(other.getLc30()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getGoaltime() == null) ? 0 : getGoaltime().hashCode());
		result = prime * result + ((getLc2() == null) ? 0 : getLc2().hashCode());
		result = prime * result + ((getLc3() == null) ? 0 : getLc3().hashCode());
		result = prime * result + ((getLc7() == null) ? 0 : getLc7().hashCode());
		result = prime * result + ((getLc30() == null) ? 0 : getLc30().hashCode());
		return result;
	}
}