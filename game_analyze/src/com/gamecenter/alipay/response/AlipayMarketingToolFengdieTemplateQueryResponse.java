package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.FengdieTemplate;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:23
 */
public class AlipayMarketingToolFengdieTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5123219122182838245L;

	/** 
	 * 开发者开发上传的H5模板列表
	 */
	@ApiListField("template")
	@ApiField("fengdie_template")
	private List<FengdieTemplate> template;

	public void setTemplate(List<FengdieTemplate> template) {
		this.template = template;
	}
	public List<FengdieTemplate> getTemplate( ) {
		return this.template;
	}

}
