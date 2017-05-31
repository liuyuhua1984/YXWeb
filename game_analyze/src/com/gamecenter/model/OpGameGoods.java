package com.gamecenter.model;

import java.io.Serializable;

public class OpGameGoods implements Serializable {
	private Integer gid;
	
	private String gtype;
	
	private String gcode;
	
	private String gname;
	
	private String info;
	
	private String appid;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getGid() {
		return gid;
	}
	
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	
	public String getGtype() {
		return gtype;
	}
	
	public void setGtype(String gtype) {
		this.gtype = gtype == null ? null : gtype.trim();
	}
	
	public String getGcode() {
		return gcode;
	}
	
	public void setGcode(String gcode) {
		this.gcode = gcode == null ? null : gcode.trim();
	}
	
	public String getGname() {
		return gname;
	}
	
	public void setGname(String gname) {
		this.gname = gname == null ? null : gname.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
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
		OpGameGoods other = (OpGameGoods) that;
		return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid())) && (this.getGtype() == null ? other.getGtype() == null : this.getGtype().equals(other.getGtype())) && (this.getGcode() == null ? other.getGcode() == null : this.getGcode().equals(other.getGcode())) && (this.getGname() == null ? other.getGname() == null : this.getGname().equals(other.getGname())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
		result = prime * result + ((getGtype() == null) ? 0 : getGtype().hashCode());
		result = prime * result + ((getGcode() == null) ? 0 : getGcode().hashCode());
		result = prime * result + ((getGname() == null) ? 0 : getGname().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		return result;
	}
}