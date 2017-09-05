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
public class GmQqRechargeHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmQqRechargeHttpProtocol() {
		super(GM_QQ_RECHARGE_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** 验证结果标示说明： -1：消息校验错误。 -2：账户不存在 -3：token过期 -4：token不存在 -5：充值失败，系统繁忙 1：成功 **/
	public String result;
	
	/** billno String 支付流水号。 **/
	private String billno;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno;
	}
}
