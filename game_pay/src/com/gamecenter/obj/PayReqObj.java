package com.gamecenter.obj;

import java.util.HashMap;

/**
 * 充值请求对象 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 上午11:55 To change this template use File | Settings | File Templates.
 */
public class PayReqObj {
	private String openid;
	private String appid;
	private String ts;
	private String payitem;
	private String token;
	private String billno;
	private String version;
	private String zoneid;
	private String providetype;
	private String amt;
	private String payamt_coins;
	private String pubacct_payamt_coins;
	private String sig;
	
	public HashMap<String, String> putHash() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("openid", getOpenid());
		map.put("appid", getAppid());
		map.put("ts", getTs());
		map.put("payitem", getPayitem());
		map.put("token", getToken());
		map.put("billno", getBillno());
		map.put("version", getVersion());
		map.put("zoneid", getZoneid());
		map.put("providetype", getProvidetype());
		map.put("amt", getAmt());
		map.put("payamt_coins", getPayamt_coins());
		map.put("pubacct_payamt_coins", getPubacct_payamt_coins());
		
		// 打印
		System.out.println("*****************参数***************");
		System.out.println("openid：" + openid);
		System.out.println("appid：" + appid);
		System.out.println("ts：" + ts);
		System.out.println("payitem：" + payitem);
		System.out.println("token：" + token);
		System.out.println("billno：" + billno);
		System.out.println("version：" + version);
		System.out.println("zoneid：" + zoneid);
		System.out.println("providetype：" + providetype);
		System.out.println("amt：" + amt);
		System.out.println("payamt_coins：" + payamt_coins);
		System.out.println("pubacct_payamt_coins：" + pubacct_payamt_coins);
		System.out.println("**************************************");
		System.out.println("");
		System.out.println("");
		return map;
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
	
	public String getTs() {
		return ts;
	}
	
	public void setTs(String ts) {
		this.ts = ts;
	}
	
	public String getPayitem() {
		return payitem;
	}
	
	public void setPayitem(String payitem) {
		this.payitem = payitem;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getZoneid() {
		return zoneid;
	}
	
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}
	
	public String getProvidetype() {
		return providetype;
	}
	
	public void setProvidetype(String providetype) {
		this.providetype = providetype;
	}
	
	public String getAmt() {
		return amt;
	}
	
	public void setAmt(String amt) {
		this.amt = amt;
	}
	
	public String getPayamt_coins() {
		return payamt_coins;
	}
	
	public void setPayamt_coins(String payamt_coins) {
		this.payamt_coins = payamt_coins;
	}
	
	public String getPubacct_payamt_coins() {
		return pubacct_payamt_coins;
	}
	
	public void setPubacct_payamt_coins(String pubacct_payamt_coins) {
		this.pubacct_payamt_coins = pubacct_payamt_coins;
	}
	
	public String getSig() {
		return sig;
	}
	
	public void setSig(String sig) {
		this.sig = sig;
	}
}
