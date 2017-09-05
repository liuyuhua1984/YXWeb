package com.gamecenter.api.parBean.vo;

/**
 * 运营商产品相关信息 Created with IntelliJ IDEA. User: gsb Date: 14-7-31 Time: 上午10:53 To change this template use File | Settings | File Templates.
 */
public class Par_OperatorMsg {
	private int optid;
	private String optname;
	private String opcode;
	private String appkey;
	private String pfurl;
	private String checkip;
	private int status; // 产品状态
	private String number; // 运营商对其标号
	private String ip; // 区服ip
	private String port; // 区服端口
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getPort() {
		return port;
	}
	
	public void setPort(String port) {
		this.port = port;
	}
	
	public int getOptid() {
		return optid;
	}
	
	public void setOptid(int optid) {
		this.optid = optid;
	}
	
	public String getOptname() {
		return optname;
	}
	
	public void setOptname(String optname) {
		this.optname = optname;
	}
	
	public String getOpcode() {
		return opcode;
	}
	
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}
	
	public String getAppkey() {
		return appkey;
	}
	
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	
	public String getPfurl() {
		return pfurl;
	}
	
	public void setPfurl(String pfurl) {
		this.pfurl = pfurl;
	}
	
	public String getCheckip() {
		return checkip;
	}
	
	public void setCheckip(String checkip) {
		this.checkip = checkip;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
