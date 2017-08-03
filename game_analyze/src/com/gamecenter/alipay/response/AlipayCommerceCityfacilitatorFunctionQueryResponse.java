package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.SupportFunction;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-15 11:19:03
 */
public class AlipayCommerceCityfacilitatorFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8535334652211728178L;

	/** 
	 * 支持的功能列表
	 */
	@ApiListField("functions")
	@ApiField("support_function")
	private List<SupportFunction> functions;

	public void setFunctions(List<SupportFunction> functions) {
		this.functions = functions;
	}
	public List<SupportFunction> getFunctions( ) {
		return this.functions;
	}

}
