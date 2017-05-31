package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzPassport implements Serializable {
	private String openid;
	
	private String worldid;
	
	private String rolename;
	
	private Integer grade;
	
	private Double curmoney;
	
	private Double totalmoney;
	
	private Integer career;
	
	private Integer isonline;
	
	private Integer status;
	
	private String lastloginip;
	
	private Integer logincount;
	
	private String fristlogintime;
	
	private String lastlogintime;
	
	private String regtime;
	
	private String info;
	
	private Integer totalonline;
	
	private Double totalconsume;
	
	private Integer vipgrade;
	
	private String fristpaytime;
	
	private String lastpaytime;
	
	private String optid;
	
	private String guidenum;
	
	private String sfrom;
	
	private static final long serialVersionUID = 1L;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}
	
	public Integer getGrade() {
		return grade;
	}
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	public Double getCurmoney() {
		return curmoney;
	}
	
	public void setCurmoney(Double curmoney) {
		this.curmoney = curmoney;
	}
	
	public Double getTotalmoney() {
		return totalmoney;
	}
	
	public void setTotalmoney(Double totalmoney) {
		this.totalmoney = totalmoney;
	}
	
	public Integer getCareer() {
		return career;
	}
	
	public void setCareer(Integer career) {
		this.career = career;
	}
	
	public Integer getIsonline() {
		return isonline;
	}
	
	public void setIsonline(Integer isonline) {
		this.isonline = isonline;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getLastloginip() {
		return lastloginip;
	}
	
	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip == null ? null : lastloginip.trim();
	}
	
	public Integer getLogincount() {
		return logincount;
	}
	
	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}
	
	public String getFristlogintime() {
		return fristlogintime;
	}
	
	public void setFristlogintime(String fristlogintime) {
		this.fristlogintime = fristlogintime == null ? null : fristlogintime.trim();
	}
	
	public String getLastlogintime() {
		return lastlogintime;
	}
	
	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
	}
	
	public String getRegtime() {
		return regtime;
	}
	
	public void setRegtime(String regtime) {
		this.regtime = regtime == null ? null : regtime.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public Integer getTotalonline() {
		return totalonline;
	}
	
	public void setTotalonline(Integer totalonline) {
		this.totalonline = totalonline;
	}
	
	public Double getTotalconsume() {
		return totalconsume;
	}
	
	public void setTotalconsume(Double totalconsume) {
		this.totalconsume = totalconsume;
	}
	
	public Integer getVipgrade() {
		return vipgrade;
	}
	
	public void setVipgrade(Integer vipgrade) {
		this.vipgrade = vipgrade;
	}
	
	public String getFristpaytime() {
		return fristpaytime;
	}
	
	public void setFristpaytime(String fristpaytime) {
		this.fristpaytime = fristpaytime == null ? null : fristpaytime.trim();
	}
	
	public String getLastpaytime() {
		return lastpaytime;
	}
	
	public void setLastpaytime(String lastpaytime) {
		this.lastpaytime = lastpaytime == null ? null : lastpaytime.trim();
	}
	
	public String getOptid() {
		return optid;
	}
	
	public void setOptid(String optid) {
		this.optid = optid == null ? null : optid.trim();
	}
	
	public String getGuidenum() {
		return guidenum;
	}
	
	public void setGuidenum(String guidenum) {
		this.guidenum = guidenum == null ? null : guidenum.trim();
	}
	
	public String getSfrom() {
		return sfrom;
	}
	
	public void setSfrom(String sfrom) {
		this.sfrom = sfrom == null ? null : sfrom.trim();
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
		OpOssQlzPassport other = (OpOssQlzPassport) that;
		return (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getWorldid() == null ? other.getWorldid() == null : this.getWorldid().equals(other.getWorldid())) && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename())) && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade())) && (this.getCurmoney() == null ? other.getCurmoney() == null : this.getCurmoney().equals(other.getCurmoney())) && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney())) && (this.getCareer() == null ? other.getCareer() == null : this.getCareer().equals(other.getCareer())) && (this.getIsonline() == null ? other.getIsonline() == null : this.getIsonline().equals(other.getIsonline())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip())) && (this.getLogincount() == null ? other.getLogincount() == null : this.getLogincount().equals(other.getLogincount())) && (this.getFristlogintime() == null ? other.getFristlogintime() == null : this.getFristlogintime().equals(other.getFristlogintime())) && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime())) && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getTotalonline() == null ? other.getTotalonline() == null : this.getTotalonline().equals(other.getTotalonline())) && (this.getTotalconsume() == null ? other.getTotalconsume() == null : this.getTotalconsume().equals(other.getTotalconsume())) && (this.getVipgrade() == null ? other.getVipgrade() == null : this.getVipgrade().equals(other.getVipgrade())) && (this.getFristpaytime() == null ? other.getFristpaytime() == null : this.getFristpaytime().equals(other.getFristpaytime())) && (this.getLastpaytime() == null ? other.getLastpaytime() == null : this.getLastpaytime().equals(other.getLastpaytime())) && (this.getOptid() == null ? other.getOptid() == null : this.getOptid().equals(other.getOptid())) && (this.getGuidenum() == null ? other.getGuidenum() == null : this.getGuidenum().equals(other.getGuidenum())) && (this.getSfrom() == null ? other.getSfrom() == null : this.getSfrom().equals(other.getSfrom()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getWorldid() == null) ? 0 : getWorldid().hashCode());
		result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
		result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
		result = prime * result + ((getCurmoney() == null) ? 0 : getCurmoney().hashCode());
		result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
		result = prime * result + ((getCareer() == null) ? 0 : getCareer().hashCode());
		result = prime * result + ((getIsonline() == null) ? 0 : getIsonline().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
		result = prime * result + ((getLogincount() == null) ? 0 : getLogincount().hashCode());
		result = prime * result + ((getFristlogintime() == null) ? 0 : getFristlogintime().hashCode());
		result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
		result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getTotalonline() == null) ? 0 : getTotalonline().hashCode());
		result = prime * result + ((getTotalconsume() == null) ? 0 : getTotalconsume().hashCode());
		result = prime * result + ((getVipgrade() == null) ? 0 : getVipgrade().hashCode());
		result = prime * result + ((getFristpaytime() == null) ? 0 : getFristpaytime().hashCode());
		result = prime * result + ((getLastpaytime() == null) ? 0 : getLastpaytime().hashCode());
		result = prime * result + ((getOptid() == null) ? 0 : getOptid().hashCode());
		result = prime * result + ((getGuidenum() == null) ? 0 : getGuidenum().hashCode());
		result = prime * result + ((getSfrom() == null) ? 0 : getSfrom().hashCode());
		return result;
	}
}