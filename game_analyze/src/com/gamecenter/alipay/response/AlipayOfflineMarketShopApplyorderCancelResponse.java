package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.offline.market.shop.applyorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-06 11:11:47
 */
public class AlipayOfflineMarketShopApplyorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1575883375135756885L;

	/** 
	 * 申请撤销成功接口同步返回的支付宝申请流水号。
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
