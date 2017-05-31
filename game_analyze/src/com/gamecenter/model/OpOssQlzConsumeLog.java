package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzConsumeLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private String openid;
	
	private Double moneybefore;
	
	private Double moneyafter;
	
	private Double lostmoney;
	
	private String itemid;
	
	private String itemtype;
	
	private Integer itemnum;
	
	private String itemname;
	
	private String time;
	
	private Integer level;
	
	private String rolename;
	
	private String addtime;
	
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
	
	public Double getLostmoney() {
		return lostmoney;
	}
	
	public void setLostmoney(Double lostmoney) {
		this.lostmoney = lostmoney;
	}
	
	public String getItemid() {
		return itemid;
	}
	
	public void setItemid(String itemid) {
		this.itemid = itemid == null ? null : itemid.trim();
	}
	
	public String getItemtype() {
		return itemtype;
	}
	
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype == null ? null : itemtype.trim();
	}
	
	public Integer getItemnum() {
		return itemnum;
	}
	
	public void setItemnum(Integer itemnum) {
		this.itemnum = itemnum;
	}
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname == null ? null : itemname.trim();
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
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
		OpOssQlzConsumeLog other = (OpOssQlzConsumeLog) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getMoneybefore() == null ? other.getMoneybefore() == null : this.getMoneybefore().equals(other.getMoneybefore())) && (this.getMoneyafter() == null ? other.getMoneyafter() == null : this.getMoneyafter().equals(other.getMoneyafter())) && (this.getLostmoney() == null ? other.getLostmoney() == null : this.getLostmoney().equals(other.getLostmoney())) && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid())) && (this.getItemtype() == null ? other.getItemtype() == null : this.getItemtype().equals(other.getItemtype())) && (this.getItemnum() == null ? other.getItemnum() == null : this.getItemnum().equals(other.getItemnum())) && (this.getItemname() == null ? other.getItemname() == null : this.getItemname().equals(other.getItemname())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
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
		result = prime * result + ((getLostmoney() == null) ? 0 : getLostmoney().hashCode());
		result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
		result = prime * result + ((getItemtype() == null) ? 0 : getItemtype().hashCode());
		result = prime * result + ((getItemnum() == null) ? 0 : getItemnum().hashCode());
		result = prime * result + ((getItemname() == null) ? 0 : getItemname().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		return result;
	}
}