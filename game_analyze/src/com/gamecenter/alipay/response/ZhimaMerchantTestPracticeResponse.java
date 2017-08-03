package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.XXXXsdasdasd;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.merchant.test.practice response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-30 10:16:33
 */
public class ZhimaMerchantTestPracticeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2469791916245319775L;

	/** 
	 * xxxx
	 */
	@ApiField("dddd")
	private XXXXsdasdasd dddd;

	/** 
	 * ccc
	 */
	@ApiField("sss")
	private String sss;

	public void setDddd(XXXXsdasdasd dddd) {
		this.dddd = dddd;
	}
	public XXXXsdasdasd getDddd( ) {
		return this.dddd;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}
	public String getSss( ) {
		return this.sss;
	}

}
