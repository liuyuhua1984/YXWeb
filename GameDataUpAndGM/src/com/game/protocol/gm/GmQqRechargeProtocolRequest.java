package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (QQ充值). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmQqRechargeProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmQqRechargeProtocolRequest() {
		super(GM_QQ_RECHARGE_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	/** 充值账号; */
	private String openid;
	
	/** ts String Linux 时间戳 **/
	private String ts;
	
	/** payitem String 物品信息。 */
	private String payitem;
	
	/** token String 交易token **/
	private String token;
	
	/** billno String 支付流水号。 **/
	private String billno;
	
	/** sigstr String MD5 32位加密串,MD5[openid+ payitem +billno +key],key为约定秘钥。 **/
	private String sigstr;
	
	
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
}
