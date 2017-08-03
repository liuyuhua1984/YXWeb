package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.AlipayCodeRecoResult;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.data.dataservice.code.reco response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-02 14:27:04
 */
public class AlipayDataDataserviceCodeRecoResponse extends AlipayResponse {

	private static final long serialVersionUID = 8191513246658922461L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private AlipayCodeRecoResult result;

	public void setResult(AlipayCodeRecoResult result) {
		this.result = result;
	}
	public AlipayCodeRecoResult getResult( ) {
		return this.result;
	}

}
