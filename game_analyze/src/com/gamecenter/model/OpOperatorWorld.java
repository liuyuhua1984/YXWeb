package com.gamecenter.model;

import java.io.Serializable;

public class OpOperatorWorld implements Serializable {
	private Integer id;
	
	private Integer optid;
	
	private Integer wid;
	
	private String number;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getOptid() {
		return optid;
	}
	
	public void setOptid(Integer optid) {
		this.optid = optid;
	}
	
	public Integer getWid() {
		return wid;
	}
	
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number == null ? null : number.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
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
		OpOperatorWorld other = (OpOperatorWorld) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getWid() == null ? other.getWid() == null : this.getWid().equals(other.getWid())) && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getOptid() == null) ? 0 : getOptid().hashCode());
		result = prime * result + ((getWid() == null) ? 0 : getWid().hashCode());
		result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}