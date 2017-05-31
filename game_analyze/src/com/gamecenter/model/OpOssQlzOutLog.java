package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzOutLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private String userip;
	
	private String outtime;
	
	private String openid;
	
	private Integer onlinetime;
	
	private Integer level;
	
	private String rolename;
	
	private String addtime;
	
	private Integer vipgrade;
	
	private String guidenum;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getUserip() {
		return userip;
	}
	
	public void setUserip(String userip) {
		this.userip = userip == null ? null : userip.trim();
	}
	
	public String getOuttime() {
		return outtime;
	}
	
	public void setOuttime(String outtime) {
		this.outtime = outtime == null ? null : outtime.trim();
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public Integer getOnlinetime() {
		return onlinetime;
	}
	
	public void setOnlinetime(Integer onlinetime) {
		this.onlinetime = onlinetime;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
	}
	
	public Integer getVipgrade() {
		return vipgrade;
	}
	
	public void setVipgrade(Integer vipgrade) {
		this.vipgrade = vipgrade;
	}
	
	public String getGuidenum() {
		return guidenum;
	}
	
	public void setGuidenum(String guidenum) {
		this.guidenum = guidenum == null ? null : guidenum.trim();
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
		OpOssQlzOutLog other = (OpOssQlzOutLog) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getOuttime() == null ? other.getOuttime() == null : this.getOuttime().equals(other.getOuttime())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getOnlinetime() == null ? other.getOnlinetime() == null : this.getOnlinetime().equals(other.getOnlinetime())) && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime())) && (this.getVipgrade() == null ? other.getVipgrade() == null : this.getVipgrade().equals(other.getVipgrade())) && (this.getGuidenum() == null ? other.getGuidenum() == null : this.getGuidenum().equals(other.getGuidenum()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getOuttime() == null) ? 0 : getOuttime().hashCode());
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getOnlinetime() == null) ? 0 : getOnlinetime().hashCode());
		result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		result = prime * result + ((getVipgrade() == null) ? 0 : getVipgrade().hashCode());
		result = prime * result + ((getGuidenum() == null) ? 0 : getGuidenum().hashCode());
		return result;
	}
}