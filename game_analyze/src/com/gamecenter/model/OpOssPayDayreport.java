package com.gamecenter.model;

import java.io.Serializable;

public class OpOssPayDayreport implements Serializable {
	private Integer id;
	
	private String appid;
	
	private String worldid;
	
	private String optid;
	
	private String sfrom;
	
	private String ctime;
	
	private Integer apa;
	
	private Integer newapa;
	
	private Double total;
	
	private Double arpu;
	
	private Double payper;
	
	private Integer paycount;
	
	private Double maxpay;
	
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
	
	public Integer getApa() {
		return apa;
	}
	
	public void setApa(Integer apa) {
		this.apa = apa;
	}
	
	public Integer getNewapa() {
		return newapa;
	}
	
	public void setNewapa(Integer newapa) {
		this.newapa = newapa;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Double getArpu() {
		return arpu;
	}
	
	public void setArpu(Double arpu) {
		this.arpu = arpu;
	}
	
	public Double getPayper() {
		return payper;
	}
	
	public void setPayper(Double payper) {
		this.payper = payper;
	}
	
	public Integer getPaycount() {
		return paycount;
	}
	
	public void setPaycount(Integer paycount) {
		this.paycount = paycount;
	}
	
	public Double getMaxpay() {
		return maxpay;
	}
	
	public void setMaxpay(Double maxpay) {
		this.maxpay = maxpay;
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
		OpOssPayDayreport other = (OpOssPayDayreport) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getSfrom() == null ? other.getSfrom() == null : this.getSfrom().equals(other.getSfrom())) && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime())) && (this.getApa() == null ? other.getApa() == null : this.getApa().equals(other.getApa())) && (this.getNewapa() == null ? other.getNewapa() == null : this.getNewapa().equals(other.getNewapa())) && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal())) && (this.getArpu() == null ? other.getArpu() == null : this.getArpu().equals(other.getArpu())) && (this.getPayper() == null ? other.getPayper() == null : this.getPayper().equals(other.getPayper())) && (this.getPaycount() == null ? other.getPaycount() == null : this.getPaycount().equals(other.getPaycount())) && (this.getMaxpay() == null ? other.getMaxpay() == null : this.getMaxpay().equals(other.getMaxpay()));
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
		result = prime * result + ((getApa() == null) ? 0 : getApa().hashCode());
		result = prime * result + ((getNewapa() == null) ? 0 : getNewapa().hashCode());
		result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
		result = prime * result + ((getArpu() == null) ? 0 : getArpu().hashCode());
		result = prime * result + ((getPayper() == null) ? 0 : getPayper().hashCode());
		result = prime * result + ((getPaycount() == null) ? 0 : getPaycount().hashCode());
		result = prime * result + ((getMaxpay() == null) ? 0 : getMaxpay().hashCode());
		return result;
	}
}