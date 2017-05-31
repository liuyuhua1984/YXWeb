package com.gamecenter.model;

import java.io.Serializable;

public class OpActivity implements Serializable {
	private Integer aid;
	
	private String name;
	
	private String content;
	
	private String keyword;
	
	private String begintime;
	
	private String endtime;
	
	private String info;
	
	private String status;
	
	private String addtime;
	
	private String isbing;
	
	private Integer joincount;
	
	private String appid;
	
	private String worldids;
	
	private Integer cardnum;
	
	private Integer usenum;
	
	private String award;
	
	private static final long serialVersionUID = 1L;
	
	private String gids[];
	private String wids[];
	private String wtype;
	
	public String[] getWids() {
		return wids;
	}
	
	public void setWids(String[] wids) {
		this.wids = wids;
	}
	
	public String getWtype() {
		return wtype;
	}
	
	public void setWtype(String wtype) {
		this.wtype = wtype;
	}
	
	public String[] getGids() {
		return gids;
	}
	
	public void setGids(String[] gids) {
		this.gids = gids;
	}
	
	public Integer getAid() {
		return aid;
	}
	
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword == null ? null : keyword.trim();
	}
	
	public String getBegintime() {
		return begintime;
	}
	
	public void setBegintime(String begintime) {
		this.begintime = begintime == null ? null : begintime.trim();
	}
	
	public String getEndtime() {
		return endtime;
	}
	
	public void setEndtime(String endtime) {
		this.endtime = endtime == null ? null : endtime.trim();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
	}
	
	public String getIsbing() {
		return isbing;
	}
	
	public void setIsbing(String isbing) {
		this.isbing = isbing == null ? null : isbing.trim();
	}
	
	public Integer getJoincount() {
		return joincount;
	}
	
	public void setJoincount(Integer joincount) {
		this.joincount = joincount;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getWorldids() {
		return worldids;
	}
	
	public void setWorldids(String worldids) {
		this.worldids = worldids == null ? null : worldids.trim();
	}
	
	public Integer getCardnum() {
		return cardnum;
	}
	
	public void setCardnum(Integer cardnum) {
		this.cardnum = cardnum;
	}
	
	public Integer getUsenum() {
		return usenum;
	}
	
	public void setUsenum(Integer usenum) {
		this.usenum = usenum;
	}
	
	public String getAward() {
		return award;
	}
	
	public void setAward(String award) {
		this.award = award == null ? null : award.trim();
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
		OpActivity other = (OpActivity) that;
		return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid())) && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName())) && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent())) && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword())) && (this.getBegintime() == null ? other.getBegintime() == null : this.getBegintime().equals(other.getBegintime())) && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime())) && (this.getIsbing() == null ? other.getIsbing() == null : this.getIsbing().equals(other.getIsbing())) && (this.getJoincount() == null ? other.getJoincount() == null : this.getJoincount().equals(other.getJoincount())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getWorldids() == null ? other.getWorldids() == null : this.getWorldids().equals(other.getWorldids())) && (this.getCardnum() == null ? other.getCardnum() == null : this.getCardnum().equals(other.getCardnum())) && (this.getUsenum() == null ? other.getUsenum() == null : this.getUsenum().equals(other.getUsenum())) && (this.getAward() == null ? other.getAward() == null : this.getAward().equals(other.getAward()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
		result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
		result = prime * result + ((getBegintime() == null) ? 0 : getBegintime().hashCode());
		result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		result = prime * result + ((getIsbing() == null) ? 0 : getIsbing().hashCode());
		result = prime * result + ((getJoincount() == null) ? 0 : getJoincount().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getWorldids() == null) ? 0 : getWorldids().hashCode());
		result = prime * result + ((getCardnum() == null) ? 0 : getCardnum().hashCode());
		result = prime * result + ((getUsenum() == null) ? 0 : getUsenum().hashCode());
		result = prime * result + ((getAward() == null) ? 0 : getAward().hashCode());
		return result;
	}
}