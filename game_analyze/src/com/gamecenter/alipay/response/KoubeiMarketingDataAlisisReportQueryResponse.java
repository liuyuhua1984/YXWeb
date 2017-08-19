package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.AlisisReportRow;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-16 20:33:11
 */
public class KoubeiMarketingDataAlisisReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1143635332155661159L;

	/** 
	 * 报表数据
	 */
	@ApiListField("report_data")
	@ApiField("alisis_report_row")
	private List<AlisisReportRow> reportData;

	public void setReportData(List<AlisisReportRow> reportData) {
		this.reportData = reportData;
	}
	public List<AlisisReportRow> getReportData( ) {
		return this.reportData;
	}

}
