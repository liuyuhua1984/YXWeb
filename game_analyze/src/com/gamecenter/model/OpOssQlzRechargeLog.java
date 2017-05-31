package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzRechargeLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private String openid;
	
	private Double moneybefore;
	
	private Double moneyafter;
	
	private Double moneyadd;
	
	private String time;
	
	private String sfrom;
	
	private Integer level;
	
	private String rolename;
	
	private String addtime;
	
	private String billon;
	
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
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public Double getMoneybefore() {
		return moneybefore;
	}
	
	public void setMoneybefore(Double moneybefore) {
		this.moneybefore = moneybefore;
	}
	
	public Double getMoneyafter() {
		return moneyafter;
	}
	
	public void setMoneyafter(Double moneyafter) {
		this.moneyafter = moneyafter;
	}
	
	public Double getMoneyadd() {
		return moneyadd;
	}
	
	public void setMoneyadd(Double moneyadd) {
		this.moneyadd = moneyadd;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
	
	public String getSfrom() {
		return sfrom;
	}
	
	public void setSfrom(String sfrom) {
		this.sfrom = sfrom == null ? null : sfrom.trim();
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
	
	public String getBillon() {
		return billon;
	}
	
	public void setBillon(String billon) {
		this.billon = billon == null ? null : billon.trim();
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
		OpOssQlzRechargeLog other = (OpOssQlzRechargeLog) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getMoneybefore() == null ? other.getMoneybefore() == null : this.getMoneybefore().equals(other.getMoneybefore())) && (this.getMoneyafter() == null ? other.getMoneyafter() == null : this.getMoneyafter().equals(other.getMoneyafter())) && (this.getMoneyadd() == null ? other.getMoneyadd() == null : this.getMoneyadd().equals(other.getMoneyadd())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getSfrom() == null ? other.getSfrom() == null : this.getSfrom().equals(other.getSfrom())) && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime())) && (this.getBillon() == null ? other.getBillon() == null : this.getBillon().equals(other.getBillon()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getMoneybefore() == null) ? 0 : getMoneybefore().hashCode());
		result = prime * result + ((getMoneyafter() == null) ? 0 : getMoneyafter().hashCode());
		result = prime * result + ((getMoneyadd() == null) ? 0 : getMoneyadd().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getSfrom() == null) ? 0 : getSfrom().hashCode());
		result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		result = prime * result + ((getBillon() == null) ? 0 : getBillon().hashCode());
		return result;
	}
}