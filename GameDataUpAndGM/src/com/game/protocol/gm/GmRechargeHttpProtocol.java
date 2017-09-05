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
public class GmRechargeHttpProtocol extends DataUpBase implements IMsgCode{
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmRechargeHttpProtocol() {
		super(GM_RECHARGE_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
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
