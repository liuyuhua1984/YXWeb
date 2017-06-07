package com.lyh.gm;

/**
 * ClassName:GMServerToGMPlatform <br/>
 * Function: TODO (GM接入时的数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-22 下午2:51:11 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmServerToGMPlatformData {
	/** 游戏服务器 **/
	private String worldid;
	
	/** MD5验证 **/
	private String sigstr;
	
	private String serverId;
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid;
	}
	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
	
}
