package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 蚂蚁电子发票平台用户发票抬头列表获取
 *
 * @author auto create
 * @since 1.0, 2017-06-07 16:24:17
 */
public class AlipayEbppInvoiceTitleListGetModel extends AlipayObject {

	private static final long serialVersionUID = 7684237925626933737L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}