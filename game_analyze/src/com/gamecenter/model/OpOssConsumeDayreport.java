package com.gamecenter.model;

import java.io.Serializable;

public class OpOssConsumeDayreport implements Serializable {
	private Integer id;
	
	private String appid;
	
	private String worldid;
	
	private String optid;
	
	private String sfrom;
	
	private String ctime;
	
	private String itemtype;
	
	private String itemname;
	
	private Integer itemnum;
	
	private Integer usernum;
	
	private Double money;
	
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
	
	public String getOptid() {
		return optid;
	}
	
	public void setOptid(String optid) {
		this.optid = optid == null ? null : optid.trim();
	}
	
	public String getSfrom() {
		return sfrom;
	}
	
	public void setSfrom(String sfrom) {
		this.sfrom = sfrom == null ? null : sfrom.trim();
	}
	
	public String getCtime() {
		return ctime;
	}
	
	public void setCtime(String ctime) {
		this.ctime = ctime == null ? null : ctime.trim();
	}
	
	public String getItemtype() {
		return itemtype;
	}
	
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype == null ? null : itemtype.trim();
	}
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname == null ? null : itemname.trim();
	}
	
	public Integer getItemnum() {
		return itemnum;
	}
	
	public void setItemnum(Integer itemnum) {
		this.itemnum = itemnum;
	}
	
	public Integer getUsernum() {
		return usernum;
	}
	
	public void setUsernum(Integer usernum) {
		this.usernum = usernum;
	}
	
	public Double getMoney() {
		return money;
	}
	
	public void setMoney(Double money) {
		this.money = money;
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
		OpOssConsumeDayreport other = (OpOssConsumeDayreport) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getSfrom() == null ? other.getSfrom() == null : this.getSfrom().equals(other.getSfrom())) && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime())) && (this.getItemtype() == null ? other.getItemtype() == null : this.getItemtype().equals(other.getItemtype())) && (this.getItemname() == null ? other.getItemname() == null : this.getItemname().equals(other.getItemname())) && (this.getItemnum() == null ? other.getItemnum() == null : this.getItemnum().equals(other.getItemnum())) && (this.getUsernum() == null ? other.getUsernum() == null : this.getUsernum().equals(other.getUsernum())) && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getOptid() == null) ? 0 : getOptid().hashCode());
		result = prime * result + ((getSfrom() == null) ? 0 : getSfrom().hashCode());
		result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
		result = prime * result + ((getItemtype() == null) ? 0 : getItemtype().hashCode());
		result = prime * result + ((getItemname() == null) ? 0 : getItemname().hashCode());
		result = prime * result + ((getItemnum() == null) ? 0 : getItemnum().hashCode());
		result = prime * result + ((getUsernum() == null) ? 0 : getUsernum().hashCode());
		result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
		return result;
	}
}