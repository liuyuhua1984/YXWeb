package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.offline.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:22:19
 */
public class AlipayMarketingCampaignActivityOfflineCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4752515664229649568L;

	/** 
	 * 创建成功的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 创建成功的券模版id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

}
