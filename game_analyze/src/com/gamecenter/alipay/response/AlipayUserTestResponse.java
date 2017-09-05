package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.user.test response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-14 17:47:44
 */
public class AlipayUserTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 1672261255994548888L;

	/** 
	 * 返回值
	 */
	@ApiField("ret1")
	private String ret1;

	public void setRet1(String ret1) {
		this.ret1 = ret1;
	}
	public String getRet1( ) {
		return this.ret1;
	}

}
