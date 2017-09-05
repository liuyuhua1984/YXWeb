package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 用户打标接口失败的匹配器
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:25:22
 */
public class ErrorMatcher extends AlipayObject {

	private static final long serialVersionUID = 1267632632131753111L;

	/**
	 * 失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 用户打标接口出错的匹配器
	 */
	@ApiField("matcher")
	private Matcher matcher;

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Matcher getMatcher() {
		return this.matcher;
	}
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}