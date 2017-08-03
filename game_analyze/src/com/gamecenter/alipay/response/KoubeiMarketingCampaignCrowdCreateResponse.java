package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-21 17:30:18
 */
public class KoubeiMarketingCampaignCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5152532228582249748L;

	/** 
	 * 返回的人群组的唯一标识
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}
	public String getCrowdGroupId( ) {
		return this.crowdGroupId;
	}

}
