package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.CustomReportCondition;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.marketing.data.customreport.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-17 11:58:23
 */
public class KoubeiMarketingDataCustomreportDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7135222968361223118L;

	/** 
	 * 自定义报表规则条件的详细信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

	public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}
	public CustomReportCondition getReportConditionInfo( ) {
		return this.reportConditionInfo;
	}

}
