package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.point.balance.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 19:01:40
 */
public class AlipayPointBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2287673744519424783L;

	/** 
	 * 用户的集分宝余额
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}
	public Long getPointAmount( ) {
		return this.pointAmount;
	}

}
