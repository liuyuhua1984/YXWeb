package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.open.app.codetesttest response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-12 20:55:36
 */
public class AlipayOpenAppCodetesttestResponse extends AlipayResponse {

	private static final long serialVersionUID = 3843711446348482499L;

	/** 
	 * 测试测试测试
	 */
	@ApiField("testtesttest")
	private String testtesttest;

	public void setTesttesttest(String testtesttest) {
		this.testtesttest = testtesttest;
	}
	public String getTesttesttest( ) {
		return this.testtesttest;
	}

}
