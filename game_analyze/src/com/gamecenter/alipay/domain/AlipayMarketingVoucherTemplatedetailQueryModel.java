package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 查询模板详情
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:27:10
 */
public class AlipayMarketingVoucherTemplatedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4732549961347847442L;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
