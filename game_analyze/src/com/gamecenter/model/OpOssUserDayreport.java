package com.gamecenter.model;

import java.io.Serializable;

public class OpOssUserDayreport implements Serializable {
	private Integer id;
	
	private String appid;
	
	private String worldid;
	
	private String optid;
	
	private String sfrom;
	
	private String ctime;
	
	private Integer regnum;
	
	private Integer createnum;
	
	private Integer dau;
	
	private Integer newdau;
	
	private Integer acu;
	
	private Integer pcu;
	
	private Integer maxtime;
	
	private Integer avgtime;
	
	private Integer avglogin;
	
	private Double createper;
	
	private static final long serialVersionUID = 1L;
	
	private String opentime;
	
	public String getOpentime() {
		return opentime;
	}
	
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	
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
	
	public Integer getRegnum() {
		return regnum;
	}
	
	public void setRegnum(Integer regnum) {
		this.regnum = regnum;
	}
	
	public Integer getCreatenum() {
		return createnum;
	}
	
	public void setCreatenum(Integer createnum) {
		this.createnum = createnum;
	}
	
	public Integer getDau() {
		return dau;
	}
	
	public void setDau(Integer dau) {
		this.dau = dau;
	}
	
	public Integer getNewdau() {
		return newdau;
	}
	
	public void setNewdau(Integer newdau) {
		this.newdau = newdau;
	}
	
	public Integer getAcu() {
		return acu;
	}
	
	public void setAcu(Integer acu) {
		this.acu = acu;
	}
	
	public Integer getPcu() {
		return pcu;
	}
	
	public void setPcu(Integer pcu) {
		this.pcu = pcu;
	}
	
	public Integer getMaxtime() {
		return maxtime;
	}
	
	public void setMaxtime(Integer maxtime) {
		this.maxtime = maxtime;
	}
	
	public Integer getAvgtime() {
		return avgtime;
	}
	
	public void setAvgtime(Integer avgtime) {
		this.avgtime = avgtime;
	}
	
	public Integer getAvglogin() {
		return avglogin;
	}
	
	public void setAvglogin(Integer avglogin) {
		this.avglogin = avglogin;
	}
	
	public Double getCreateper() {
		return createper;
	}
	
	public void setCreateper(Double createper) {
		this.createper = createper;
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
		OpOssUserDayreport other = (OpOssUserDayreport) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getSfrom() == null ? other.getSfrom() == null : this.getSfrom().equals(other.getSfrom())) && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime())) && (this.getRegnum() == null ? other.getRegnum() == null : this.getRegnum().equals(other.getRegnum())) && (this.getCreatenum() == null ? other.getCreatenum() == null : this.getCreatenum().equals(other.getCreatenum())) && (this.getDau() == null ? other.getDau() == null : this.getDau().equals(other.getDau())) && (this.getNewdau() == null ? other.getNewdau() == null : this.getNewdau().equals(other.getNewdau())) && (this.getAcu() == null ? other.getAcu() == null : this.getAcu().equals(other.getAcu())) && (this.getPcu() == null ? other.getPcu() == null : this.getPcu().equals(other.getPcu())) && (this.getMaxtime() == null ? other.getMaxtime() == null : this.getMaxtime().equals(other.getMaxtime())) && (this.getAvgtime() == null ? other.getAvgtime() == null : this.getAvgtime().equals(other.getAvgtime())) && (this.getAvglogin() == null ? other.getAvglogin() == null : this.getAvglogin().equals(other.getAvglogin())) && (this.getCreateper() == null ? other.getCreateper() == null : this.getCreateper().equals(other.getCreateper()));
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
		result = prime * result + ((getRegnum() == null) ? 0 : getRegnum().hashCode());
		result = prime * result + ((getCreatenum() == null) ? 0 : getCreatenum().hashCode());
		result = prime * result + ((getDau() == null) ? 0 : getDau().hashCode());
		result = prime * result + ((getNewdau() == null) ? 0 : getNewdau().hashCode());
		result = prime * result + ((getAcu() == null) ? 0 : getAcu().hashCode());
		result = prime * result + ((getPcu() == null) ? 0 : getPcu().hashCode());
		result = prime * result + ((getMaxtime() == null) ? 0 : getMaxtime().hashCode());
		result = prime * result + ((getAvgtime() == null) ? 0 : getAvgtime().hashCode());
		result = prime * result + ((getAvglogin() == null) ? 0 : getAvglogin().hashCode());
		result = prime * result + ((getCreateper() == null) ? 0 : getCreateper().hashCode());
		return result;
	}
}