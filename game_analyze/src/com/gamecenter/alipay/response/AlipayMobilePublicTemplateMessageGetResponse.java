package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.mobile.public.template.message.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:42:55
 */
public class AlipayMobilePublicTemplateMessageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2685435858134359224L;

	/** 
	 * 消息模板id--商户领取母版后生成的唯一模板id
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/** 
	 * 模板内容
	 */
	@ApiField("template")
	private String template;

	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}
	public String getMsgTemplateId( ) {
		return this.msgTemplateId;
	}

	public void setTemplate(String template) {
		this.template = template;
	}
	public String getTemplate( ) {
		return this.template;
	}

}
