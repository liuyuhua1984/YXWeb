package com.gamecenter.qqsdk.parBean.vo;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-23 Time: 上午11:01 To change this template use File | Settings | File Templates.
 */
public class TaskReq {
	
	private String cmd;
	private String openid;
	private String appid;
	private String pf;
	private String ts;
	private String version;
	private String contractid;
	private String step;
	private String payitem;
	private String billno;
	private String providetype;
	private String sig;
	
	public HashMap<String, String> putHash() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("openid", getOpenid());
		map.put("appid", getAppid());
		map.put("ts", getTs());
		map.put("payitem", getPayitem());
		map.put("cmd", getCmd());
		map.put("step", getStep() + "");
		map.put("billno", getBillno());
		map.put("version", getVersion());
		map.put("providetype", getProvidetype());
		map.put("pf", getPf());
		map.put("contractid", getContractid());
		return map;
	}
	
	public String getCmd() {
		return cmd;
	}
	
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getPf() {
		return pf;
	}
	
	public void setPf(String pf) {
		this.pf = pf;
	}
	
	public String getTs() {
		return ts;
	}
	
	public void setTs(String ts) {
		this.ts = ts;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getContractid() {
		return contractid;
	}
	
	public void setContractid(String contractid) {
		this.contractid = contractid;
	}
	
	public String getStep() {
		return step;
	}
	
	public void setStep(String step) {
		this.step = step;
	}
	
	public String getPayitem() {
		return payitem;
	}
	
	public void setPayitem(String payitem) {
		this.payitem = payitem;
	}
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno;
	}
	
	public String getProvidetype() {
		return providetype;
	}
	
	public void setProvidetype(String providetype) {
		this.providetype = providetype;
	}
	
	public String getSig() {
		return sig;
	}
	
	public void setSig(String sig) {
		this.sig = sig;
	}
}
