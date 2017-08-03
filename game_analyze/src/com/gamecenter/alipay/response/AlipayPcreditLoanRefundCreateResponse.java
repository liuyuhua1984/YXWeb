package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.pcredit.loan.refund.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-25 10:32:15
 */
public class AlipayPcreditLoanRefundCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8757761784723397666L;

	/** 
	 * 受理的还款申请单号
	 */
	@ApiField("loan_repay_no")
	private String loanRepayNo;

	public void setLoanRepayNo(String loanRepayNo) {
		this.loanRepayNo = loanRepayNo;
	}
	public String getLoanRepayNo( ) {
		return this.loanRepayNo;
	}

}
