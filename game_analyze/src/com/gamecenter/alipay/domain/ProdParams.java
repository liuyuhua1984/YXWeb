package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 签约产品属性
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:07
 */
public class ProdParams extends AlipayObject {

	private static final long serialVersionUID = 8161186651122232791L;

	/**
	 * 预授权业务信息
	 */
	@ApiField("auth_biz_params")
	private String authBizParams;

	public String getAuthBizParams() {
		return this.authBizParams;
	}
	public void setAuthBizParams(String authBizParams) {
		this.authBizParams = authBizParams;
	}

}
