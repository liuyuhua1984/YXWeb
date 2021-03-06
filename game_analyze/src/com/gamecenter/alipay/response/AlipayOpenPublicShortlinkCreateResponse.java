package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.open.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-04 10:40:37
 */
public class AlipayOpenPublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7852338315682467628L;

	/** 
	 * 生成的带参推广短链接
	 */
	@ApiField("shortlink")
	private String shortlink;

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
