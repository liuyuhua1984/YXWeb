package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.AccountRecord;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.user.account.search response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 18:02:23
 */
public class AlipayUserAccountSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5363574979248227657L;

	/** 
	 * 支付宝用户账务明细信息
	 */
	@ApiListField("account_records")
	@ApiField("account_record")
	private List<AccountRecord> accountRecords;

	/** 
	 * 总页面数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setAccountRecords(List<AccountRecord> accountRecords) {
		this.accountRecords = accountRecords;
	}
	public List<AccountRecord> getAccountRecords( ) {
		return this.accountRecords;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
