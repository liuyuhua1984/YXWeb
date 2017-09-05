package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzRechargeTx implements Serializable {
	private Integer did;
	
	private String billno;
	
	private String openid;
	
	private String appid;
	
	private String ts;
	
	private String payitem;
	
	private String token;
	
	private String version;
	
	private String zoneid;
	
	private String providetype;
	
	private String amt;
	
	private String payamtCoins;
	
	private String pubacctPayamtCoins;
	
	private String sig;
	
	private String addtime;
	
	private String status;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno == null ? null : billno.trim();
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getTs() {
		return ts;
	}
	
	public void setTs(String ts) {
		this.ts = ts == null ? null : ts.trim();
	}
	
	public String getPayitem() {
		return payitem;
	}
	
	public void setPayitem(String payitem) {
		this.payitem = payitem == null ? null : payitem.trim();
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token == null ? null : token.trim();
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}
	
	public String getZoneid() {
		return zoneid;
	}
	
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid == null ? null : zoneid.trim();
	}
	
	public String getProvidetype() {
		return providetype;
	}
	
	public void setProvidetype(String providetype) {
		this.providetype = providetype == null ? null : providetype.trim();
	}
	
	public String getAmt() {
		return amt;
	}
	
	public void setAmt(String amt) {
		this.amt = amt == null ? null : amt.trim();
	}
	
	public String getPayamtCoins() {
		return payamtCoins;
	}
	
	public void setPayamtCoins(String payamtCoins) {
		this.payamtCoins = payamtCoins == null ? null : payamtCoins.trim();
	}
	
	public String getPubacctPayamtCoins() {
		return pubacctPayamtCoins;
	}
	
	public void setPubacctPayamtCoins(String pubacctPayamtCoins) {
		this.pubacctPayamtCoins = pubacctPayamtCoins == null ? null : pubacctPayamtCoins.trim();
	}
	
	public String getSig() {
		return sig;
	}
	
	public void setSig(String sig) {
		this.sig = sig == null ? null : sig.trim();
	}
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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
		OpOssQlzRechargeTx other = (OpOssQlzRechargeTx) that;
		return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid())) && (this.getBillno() == null ? other.getBillno() == null : this.getBillno().equals(other.getBillno())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs())) && (this.getPayitem() == null ? other.getPayitem() == null : this.getPayitem().equals(other.getPayitem())) && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken())) && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion())) && (this.getZoneid() == null ? other.getZoneid() == null : this.getZoneid().equals(other.getZoneid())) && (this.getProvidetype() == null ? other.getProvidetype() == null : this.getProvidetype().equals(other.getProvidetype())) && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt())) && (this.getPayamtCoins() == null ? other.getPayamtCoins() == null : this.getPayamtCoins().equals(other.getPayamtCoins())) && (this.getPubacctPayamtCoins() == null ? other.getPubacctPayamtCoins() == null : this.getPubacctPayamtCoins().equals(other.getPubacctPayamtCoins())) && (this.getSig() == null ? other.getSig() == null : this.getSig().equals(other.getSig())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
		result = prime * result + ((getBillno() == null) ? 0 : getBillno().hashCode());
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
		result = prime * result + ((getPayitem() == null) ? 0 : getPayitem().hashCode());
		result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
		result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
		result = prime * result + ((getZoneid() == null) ? 0 : getZoneid().hashCode());
		result = prime * result + ((getProvidetype() == null) ? 0 : getProvidetype().hashCode());
		result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
		result = prime * result + ((getPayamtCoins() == null) ? 0 : getPayamtCoins().hashCode());
		result = prime * result + ((getPubacctPayamtCoins() == null) ? 0 : getPubacctPayamtCoins().hashCode());
		result = prime * result + ((getSig() == null) ? 0 : getSig().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		return result;
	}
}