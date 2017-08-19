package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 查询用户常缴机构与城市接口
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:16:20
 */
public class AlipayEbppUserChargeinstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4859485731373696167L;

	/**
	 * 用户ID
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
