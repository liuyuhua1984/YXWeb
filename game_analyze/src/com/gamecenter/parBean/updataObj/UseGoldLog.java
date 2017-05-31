package com.gamecenter.parBean.updataObj;

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
}