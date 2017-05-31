package com.gamecenter.parBean.updataObj;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
	private Long id;
	
	private Long appid;
	
	private Date createtime;
	
	private Integer rolelevel;
	
	private String rolename;
	
	private String serverid;
	
	private String userip;
	
	private String username;
	
	private String serverip;
	
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
	
	public String getServerip() {
		return serverip;
	}
	
	public void setServerip(String serverip) {
		this.serverip = serverip == null ? null : serverip.trim();
	}
}