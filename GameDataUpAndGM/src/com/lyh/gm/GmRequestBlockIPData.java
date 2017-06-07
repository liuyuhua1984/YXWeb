package com.lyh.gm;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (禁言IP请求的数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRequestBlockIPData {
	/*** ip String Ip地址串：如127.0.0.1 ***/
	private String ip;
	
	/** time String 禁言时间，单位分钟。 **/
	private int time;
	private String serverId;
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
		if (this.ip == null || ip.equals("")) {
			ip = "1";
		}
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
}
