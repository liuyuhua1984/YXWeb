package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.code.upload response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-23 17:58:11
 */
public class AlipayOfflineMarketingVoucherCodeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198334522319699493L;

	/** 
	 * 码库id
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

	public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
	}
	public String getCodeInventoryId( ) {
		return this.codeInventoryId;
	}

}
