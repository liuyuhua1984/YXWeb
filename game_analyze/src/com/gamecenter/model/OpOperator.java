package com.gamecenter.model;

import java.io.Serializable;

public class OpOperator implements Serializable {
	private Integer optid;
	
	private String opcode;
	
	private String optname;
	
	private String status;
	
	private String info;
	
	private static final long serialVersionUID = 1L;
	
	private String flag;
	
	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public Integer getOptid() {
		return optid;
	}
	
	public void setOptid(Integer optid) {
		this.optid = optid;
	}
	
	public String getOpcode() {
		return opcode;
	}
	
	public void setOpcode(String opcode) {
		this.opcode = opcode == null ? null : opcode.trim();
	}
	
	public String getOptname() {
		return optname;
	}
	
	public void setOptname(String optname) {
		this.optname = optname == null ? null : optname.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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
		OpOperator other = (OpOperator) that;
		return (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getOpcode() == null ? other.getOpcode() == null : this.getOpcode().equals(other.getOpcode())) && (this.getOptname() == null ? other.getOptname() == null : this.getOptname().equals(other.getOptname())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getOptid() == null) ? 0 : getOptid().hashCode());
		result = prime * result + ((getOpcode() == null) ? 0 : getOpcode().hashCode());
		result = prime * result + ((getOptname() == null) ? 0 : getOptname().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}