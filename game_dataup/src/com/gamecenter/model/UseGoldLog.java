package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class UseGoldLog implements Serializable {
	private Long id;
	
	private Long appid;
	
	private Date createtime;
	
	private Integer goldafter;
	
	private Integer goldbefore;
	
	private Long itemid;
	
	private String itemname;
	
	private Integer itemnum;
	
	private Integer itemtype;
	
	private Integer lostgold;
	
	private Integer rolelevel;
	
	private String rolename;
	
	private String serverid;
	
	private String serverip;
	
	private String userip;
	
	private String username;
	
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
	
	public Integer getGoldafter() {
		return goldafter;
	}
	
	public void setGoldafter(Integer goldafter) {
		this.goldafter = goldafter;
	}
	
	public Integer getGoldbefore() {
		return goldbefore;
	}
	
	public void setGoldbefore(Integer goldbefore) {
		this.goldbefore = goldbefore;
	}
	
	public Long getItemid() {
		return itemid;
	}
	
	public void setItemid(Long itemid) {
		this.itemid = itemid;
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
	
	public Integer getItemtype() {
		return itemtype;
	}
	
	public void setItemtype(Integer itemtype) {
		this.itemtype = itemtype;
	}
	
	public Integer getLostgold() {
		return lostgold;
	}
	
	public void setLostgold(Integer lostgold) {
		this.lostgold = lostgold;
	}
	
	public Integer getRolelevel() {
		return rolelevel;
	}
	
	public void setRolelevel(Integer rolelevel) {
		this.rolelevel = rolelevel;
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
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
	
	public String getUserip() {
		return userip;
	}
	
	public void setUserip(String userip) {
		this.userip = userip == null ? null : userip.trim();
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
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
		UseGoldLog other = (UseGoldLog) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime())) && (this.getGoldafter() == null ? other.getGoldafter() == null : this.getGoldafter().equals(other.getGoldafter())) && (this.getGoldbefore() == null ? other.getGoldbefore() == null : this.getGoldbefore().equals(other.getGoldbefore())) && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid())) && (this.getItemname() == null ? other.getItemname() == null : this.getItemname().equals(other.getItemname())) && (this.getItemnum() == null ? other.getItemnum() == null : this.getItemnum().equals(other.getItemnum())) && (this.getItemtype() == null ? other.getItemtype() == null : this.getItemtype().equals(other.getItemtype())) && (this.getLostgold() == null ? other.getLostgold() == null : this.getLostgold().equals(other.getLostgold())) && (this.getRolelevel() == null ? other.getRolelevel() == null : this.getRolelevel().equals(other.getRolelevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getServerid() == null ? other.getServerid() == null : this.getServerid().equals(other.getServerid())) && (this.getServerip() == null ? other.getServerip() == null : this.getServerip().equals(other.getServerip())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
		result = prime * result + ((getGoldafter() == null) ? 0 : getGoldafter().hashCode());
		result = prime * result + ((getGoldbefore() == null) ? 0 : getGoldbefore().hashCode());
		result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
		result = prime * result + ((getItemname() == null) ? 0 : getItemname().hashCode());
		result = prime * result + ((getItemnum() == null) ? 0 : getItemnum().hashCode());
		result = prime * result + ((getItemtype() == null) ? 0 : getItemtype().hashCode());
		result = prime * result + ((getLostgold() == null) ? 0 : getLostgold().hashCode());
		result = prime * result + ((getRolelevel() == null) ? 0 : getRolelevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getServerid() == null) ? 0 : getServerid().hashCode());
		result = prime * result + ((getServerip() == null) ? 0 : getServerip().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		return result;
	}
}