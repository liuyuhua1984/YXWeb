package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (充值信息). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRechargeProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmRechargeProtocolRequest() {
		super(GM_RECHARGE_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
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
