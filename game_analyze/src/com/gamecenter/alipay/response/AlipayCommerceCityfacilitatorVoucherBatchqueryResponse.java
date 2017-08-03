package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.TicketDetailInfo;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-03 16:11:01
 */
public class AlipayCommerceCityfacilitatorVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8218266685893958373L;

	/** 
	 * 查询到的订单信息列表
	 */
	@ApiListField("tickets")
	@ApiField("ticket_detail_info")
	private List<TicketDetailInfo> tickets;

	public void setTickets(List<TicketDetailInfo> tickets) {
		this.tickets = tickets;
	}
	public List<TicketDetailInfo> getTickets( ) {
		return this.tickets;
	}

}
