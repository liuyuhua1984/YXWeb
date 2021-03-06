package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 服务商接单操作
 *
 * @author auto create
 * @since 1.0, 2016-08-25 11:11:41
 */
public class AlipayOpenServicemarketOrderAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 2155624714532621827L;

	/**
	 * 服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

}
