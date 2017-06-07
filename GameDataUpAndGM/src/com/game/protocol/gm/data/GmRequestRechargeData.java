package com.game.protocol.gm.data;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (充值客户端请求的数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRequestRechargeData {
	
	/** 充值账号; */
	private String openid;
	
	/** billon String 充值流水号，用于对账。 */
	private String billon;
	
	/** 充值的金额（金币） **/
	private String money;
	
	/** extendstr String 扩展信息，预留为”” **/
	private String extendstr;
	
	/** MD5验证码 MD5 32位加密串,MD5[openid+money+key],key为约定秘钥。 **/
	private String sigstr;
	
	private String serverId;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
	
	public String getMoney() {
		return money;
	}
	
	public void setMoney(String money) {
		this.money = money;
	}
	
	public String getBillon() {
		return billon;
	}
	
	public void setBillon(String billon) {
		this.billon = billon;
	}
	
	public String getExtendstr() {
		return extendstr;
	}
	
	public void setExtendstr(String extendstr) {
		this.extendstr = extendstr;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
}
