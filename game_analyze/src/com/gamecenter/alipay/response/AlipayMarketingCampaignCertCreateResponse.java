package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.campaign.cert.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-23 14:21:57
 */
public class AlipayMarketingCampaignCertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3765495374237299649L;

	/** 
	 * 凭证id
	 */
	@ApiField("lot_number")
	private String lotNumber;

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getLotNumber( ) {
		return this.lotNumber;
	}

}
