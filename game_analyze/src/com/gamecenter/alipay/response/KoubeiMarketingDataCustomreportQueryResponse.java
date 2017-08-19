package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.ReportDataItem;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: koubei.marketing.data.customreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-13 15:42:37
 */
public class KoubeiMarketingDataCustomreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6183736442295218118L;

	/** 
	 * 数据量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 满足自定义报表规则的报表数据
	 */
	@ApiListField("report_data")
	@ApiField("report_data_item")
	private List<ReportDataItem> reportData;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setReportData(List<ReportDataItem> reportData) {
		this.reportData = reportData;
	}
	public List<ReportDataItem> getReportData( ) {
		return this.reportData;
	}

}
