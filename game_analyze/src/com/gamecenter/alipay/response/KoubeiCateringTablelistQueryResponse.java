package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.TableInfoResult;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.catering.tablelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:12
 */
public class KoubeiCateringTablelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6559943647249717596L;

	/** 
	 * 返回tablelistresult列表
	 */
	@ApiField("tableinfo_result")
	private TableInfoResult tableinfoResult;

	public void setTableinfoResult(TableInfoResult tableinfoResult) {
		this.tableinfoResult = tableinfoResult;
	}
	public TableInfoResult getTableinfoResult( ) {
		return this.tableinfoResult;
	}

}
