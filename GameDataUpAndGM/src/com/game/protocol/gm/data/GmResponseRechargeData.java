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
public class GmResponseRechargeData {
	/** 验证结果 -1：消息校验错误。 -2：账户不存在 -3：充值失败 1：成功 **/
	public String result;
	
	/** billon String 充值流水号，用于对账。 **/
	private String billon;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getBillon() {
		return billon;
	}
	
	public void setBillon(String billon) {
		this.billon = billon;
	}
}
