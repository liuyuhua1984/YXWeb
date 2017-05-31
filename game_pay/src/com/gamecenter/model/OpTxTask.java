package com.gamecenter.model;

import java.io.Serializable;

public class OpTxTask implements Serializable {
	private Integer tid;
	
	private String cmd;
	
	private String openid;
	
	private String pf;
	
	private String ts;
	
	private String appid;
	
	private String version;
	
	private String contractid;
	
	private String step;
	
	private String payitem;
	
	private String billno;
	
	private String providetype;
	
	private String sig;
	
	private String res;
	
	private String addtime;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getTid() {
		return tid;
	}
	
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
	public String getCmd() {
		return cmd;
	}
	
	public void setCmd(String cmd) {
		this.cmd = cmd == null ? null : cmd.trim();
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public String getPf() {
		return pf;
	}
	
	public void setPf(String pf) {
		this.pf = pf == null ? null : pf.trim();
	}
	
	public String getTs() {
		return ts;
	}
	
	public void setTs(String ts) {
		this.ts = ts == null ? null : ts.trim();
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid == null ? null : appid.trim();
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}
	
	public String getContractid() {
		return contractid;
	}
	
	public void setContractid(String contractid) {
		this.contractid = contractid == null ? null : contractid.trim();
	}
	
	public String getStep() {
		return step;
	}
	
	public void setStep(String step) {
		this.step = step == null ? null : step.trim();
	}
	
	public String getPayitem() {
		return payitem;
	}
	
	public void setPayitem(String payitem) {
		this.payitem = payitem == null ? null : payitem.trim();
	}
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno == null ? null : billno.trim();
	}
	
	public String getProvidetype() {
		return providetype;
	}
	
	public void setProvidetype(String providetype) {
		this.providetype = providetype == null ? null : providetype.trim();
	}
	
	public String getSig() {
		return sig;
	}
	
	public void setSig(String sig) {
		this.sig = sig == null ? null : sig.trim();
	}
	
	public String getRes() {
		return res;
	}
	
	public void setRes(String res) {
		this.res = res == null ? null : res.trim();
	}
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
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
		OpTxTask other = (OpTxTask) that;
		return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid())) && (this.getCmd() == null ? other.getCmd() == null : this.getCmd().equals(other.getCmd())) && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid())) && (this.getPf() == null ? other.getPf() == null : this.getPf().equals(other.getPf())) && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs())) && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid())) && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion())) && (this.getContractid() == null ? other.getContractid() == null : this.getContractid().equals(other.getContractid())) && (this.getStep() == null ? other.getStep() == null : this.getStep().equals(other.getStep())) && (this.getPayitem() == null ? other.getPayitem() == null : this.getPayitem().equals(other.getPayitem())) && (this.getBillno() == null ? other.getBillno() == null : this.getBillno().equals(other.getBillno())) && (this.getProvidetype() == null ? other.getProvidetype() == null : this.getProvidetype().equals(other.getProvidetype())) && (this.getSig() == null ? other.getSig() == null : this.getSig().equals(other.getSig())) && (this.getRes() == null ? other.getRes() == null : this.getRes().equals(other.getRes())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
		result = prime * result + ((getCmd() == null) ? 0 : getCmd().hashCode());
		result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
		result = prime * result + ((getPf() == null) ? 0 : getPf().hashCode());
		result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
		result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
		result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
		result = prime * result + ((getContractid() == null) ? 0 : getContractid().hashCode());
		result = prime * result + ((getStep() == null) ? 0 : getStep().hashCode());
		result = prime * result + ((getPayitem() == null) ? 0 : getPayitem().hashCode());
		result = prime * result + ((getBillno() == null) ? 0 : getBillno().hashCode());
		result = prime * result + ((getProvidetype() == null) ? 0 : getProvidetype().hashCode());
		result = prime * result + ((getSig() == null) ? 0 : getSig().hashCode());
		result = prime * result + ((getRes() == null) ? 0 : getRes().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		return result;
	}
}