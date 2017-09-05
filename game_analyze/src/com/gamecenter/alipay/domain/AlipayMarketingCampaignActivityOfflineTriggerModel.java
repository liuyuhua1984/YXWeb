package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 商户创建活动后，需营销核心平台，来发奖。
 *
 * @author auto create
 * @since 1.0, 2016-10-27 16:28:06
 */
public class AlipayMarketingCampaignActivityOfflineTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 1197422779467428451L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
