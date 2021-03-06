package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 公众号标签管理-添加标签
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7365771511518961892L;

	/**
	 * 标签名
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
