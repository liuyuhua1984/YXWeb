package com.gamecenter.alipay.domain;

import java.util.List;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * 零七二五
 *
 * @author auto create
 * @since 1.0, 2017-07-25 08:39:52
 */
public class AlipayOpenAppLingqierwuLingqierquQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5888448293983824655L;

	/**
	 * 12
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	public List<String> getTest() {
		return this.test;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}

}
