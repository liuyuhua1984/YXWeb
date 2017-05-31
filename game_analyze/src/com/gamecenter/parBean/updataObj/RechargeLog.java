package com.gamecenter.parBean.updataObj;

import java.io.Serializable;
import java.util.Date;

public class RechargeLog implements Serializable {
	private Long id;
	
	private Long appid;
	
	private Date createtime;
	
	private Integer goldadd;
	
	private Integer goldafter;
	
	private Integer goldbefore;
	
	private Integer rechargechannel;
	
	private Integer rolelevel;
	
	private String rolename;
	
	private String serverid;
	
	private String serverip;
	
	private String userip;
	
	private String username;
	
	private String billno;
	
	private String isup;
	
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
	
	public Integer getGoldadd() {
		return goldadd;
	}
	
	public void setGoldadd(Integer goldadd) {
		this.goldadd = goldadd;
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
	
	public Integer getRechargechannel() {
		return rechargechannel;
	}
	
	public void setRechargechannel(Integer rechargechannel) {
		this.rechargechannel = rechargechannel;
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
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno == null ? null : billno.trim();
	}
	
	public String getIsup() {
		return isup;
	}
	
	public void setIsup(String isup) {
		this.isup = isup == null ? null : isup.trim();
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
		RechargeLog other = (RechargeLog) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime())) && (this.getGoldadd() == null ? other.getGoldadd() == null : this.getGoldadd().equals(other.getGoldadd())) && (this.getGoldafter() == null ? other.getGoldafter() == null : this.getGoldafter().equals(other.getGoldafter())) && (this.getGoldbefore() == null ? other.getGoldbefore() == null : this.getGoldbefore().equals(other.getGoldbefore())) && (this.getRechargechannel() == null ? other.getRechargechannel() == null : this.getRechargechannel().equals(other.getRechargechannel())) && (this.getRolelevel() == null ? other.getRolelevel() == null : this.getRolelevel().equals(other.getRolelevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getServerid() == null ? other.getServerid() == null : this.getServerid().equals(other.getServerid())) && (this.getServerip() == null ? other.getServerip() == null : this.getServerip().equals(other.getServerip())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername())) && (this.getBillno() == null ? other.getBillno() == null : this.getBillno().equals(other.getBillno())) && (this.getIsup() == null ? other.getIsup() == null : this.getIsup().equals(other.getIsup()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
		result = prime * result + ((getGoldadd() == null) ? 0 : getGoldadd().hashCode());
		result = prime * result + ((getGoldafter() == null) ? 0 : getGoldafter().hashCode());
		result = prime * result + ((getGoldbefore() == null) ? 0 : getGoldbefore().hashCode());
		result = prime * result + ((getRechargechannel() == null) ? 0 : getRechargechannel().hashCode());
		result = prime * result + ((getRolelevel() == null) ? 0 : getRolelevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getServerid() == null) ? 0 : getServerid().hashCode());
		result = prime * result + ((getServerip() == null) ? 0 : getServerip().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((getBillno() == null) ? 0 : getBillno().hashCode());
		result = prime * result + ((getIsup() == null) ? 0 : getIsup().hashCode());
		return result;
	}
}