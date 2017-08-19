package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 18:17:16
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8813778823743327738L;

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
