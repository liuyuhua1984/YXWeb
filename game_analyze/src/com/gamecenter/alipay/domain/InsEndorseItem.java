package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 保险批单项
 *
 * @author auto create
 * @since 1.0, 2016-12-29 17:49:22
 */
public class InsEndorseItem extends AlipayObject {

	private static final long serialVersionUID = 5383863214129175327L;

	/**
	 * 批单项新值
	 */
	@ApiField("new_value")
	private String newValue;

	/**
	 * 批单项旧值
	 */
	@ApiField("old_value")
	private String oldValue;

	/**
	 * 批单类型;303:保单改期;311:批改保单标的
	 */
	@ApiField("type")
	private Long type;

	public String getNewValue() {
		return this.newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return this.oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
