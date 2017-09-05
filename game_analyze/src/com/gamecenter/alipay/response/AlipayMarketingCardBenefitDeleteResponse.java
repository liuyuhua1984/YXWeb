package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.card.benefit.delete response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:27
 */
public class AlipayMarketingCardBenefitDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6712449272638632238L;

	/** 
	 * 权益删除结果；true成功，false失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
