package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class LoginOutLog implements Serializable {
	private Long id;
	
	private Long appid;
	
	private Date createtime;
	
	private Integer rolelevel;
	
	private String rolename;
	
	private String serverid;
	
	private String serverip;
	
	private String userip;
	
	private String username;
	
	private String newplayerguild;
	
	private Integer viplevel;
	
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
	
	public String getNewplayerguild() {
		return newplayerguild;
	}
	
	public void setNewplayerguild(String newplayerguild) {
		this.newplayerguild = newplayerguild == null ? null : newplayerguild.trim();
	}
	
	public Integer getViplevel() {
		return viplevel;
	}
	
	public void setViplevel(Integer viplevel) {
		this.viplevel = viplevel;
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
		LoginOutLog other = (LoginOutLog) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime())) && (this.getRolelevel() == null ? other.getRolelevel() == null : this.getRolelevel().equals(other.getRolelevel())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getServerid() == null ? other.getServerid() == null : this.getServerid().equals(other.getServerid())) && (this.getServerip() == null ? other.getServerip() == null : this.getServerip().equals(other.getServerip())) && (this.getUserip() == null ? other.getUserip() == null : this.getUserip().equals(other.getUserip())) && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername())) && (this.getNewplayerguild() == null ? other.getNewplayerguild() == null : this.getNewplayerguild().equals(other.getNewplayerguild())) && (this.getViplevel() == null ? other.getViplevel() == null : this.getViplevel().equals(other.getViplevel())) && (this.getIsup() == null ? other.getIsup() == null : this.getIsup().equals(other.getIsup()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
		result = prime * result + ((getRolelevel() == null) ? 0 : getRolelevel().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getServerid() == null) ? 0 : getServerid().hashCode());
		result = prime * result + ((getServerip() == null) ? 0 : getServerip().hashCode());
		result = prime * result + ((getUserip() == null) ? 0 : getUserip().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((getNewplayerguild() == null) ? 0 : getNewplayerguild().hashCode());
		result = prime * result + ((getViplevel() == null) ? 0 : getViplevel().hashCode());
		result = prime * result + ((getIsup() == null) ? 0 : getIsup().hashCode());
		return result;
	}
}