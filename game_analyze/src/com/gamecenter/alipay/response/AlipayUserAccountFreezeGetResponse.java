package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.AccountFreeze;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.user.account.freeze.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 15:48:05
 */
public class AlipayUserAccountFreezeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1665999842743598255L;

	/** 
	 * 冻结金额列表
	 */
	@ApiListField("freeze_items")
	@ApiField("account_freeze")
	private List<AccountFreeze> freezeItems;

	/** 
	 * 冻结总条数
	 */
	@ApiField("total_results")
	private String totalResults;

	public void setFreezeItems(List<AccountFreeze> freezeItems) {
		this.freezeItems = freezeItems;
	}
	public List<AccountFreeze> getFreezeItems( ) {
		return this.freezeItems;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public String getTotalResults( ) {
		return this.totalResults;
	}

}
