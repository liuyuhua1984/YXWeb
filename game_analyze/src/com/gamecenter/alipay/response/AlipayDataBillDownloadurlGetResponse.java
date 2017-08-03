package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.data.bill.downloadurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 11:43:02
 */
public class AlipayDataBillDownloadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3734857478958546959L;

	/** 
	 * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}
