package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.InvoiceTitleModel;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.list.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-07 16:47:33
 */
public class AlipayEbppInvoiceTitleListGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4819378557616598587L;

	/** 
	 * 抬头列表
	 */
	@ApiListField("title_list")
	@ApiField("invoice_title_model")
	private List<InvoiceTitleModel> titleList;

	public void setTitleList(List<InvoiceTitleModel> titleList) {
		this.titleList = titleList;
	}
	public List<InvoiceTitleModel> getTitleList( ) {
		return this.titleList;
	}

}
