package com.game.protocol.gm.data;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (充值验证结果). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmResponseQqRechargeData {
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
