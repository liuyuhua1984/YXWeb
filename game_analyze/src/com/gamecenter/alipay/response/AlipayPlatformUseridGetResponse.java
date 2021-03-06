package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.platform.userid.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-29 19:56:03
 */
public class AlipayPlatformUseridGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3311365596999815383L;

	/** 
	 * id字典，key为openId，value为userId
	 */
	@ApiField("dict")
	private String dict;

	public void setDict(String dict) {
		this.dict = dict;
	}
	public String getDict( ) {
		return this.dict;
	}

}
