package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.QueryExtension;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-27 18:17:28
 */
public class AlipayOpenPublicPersonalizedExtensionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1514683621779162117L;

	/** 
	 * 扩展区套数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 扩展区信息
	 */
	@ApiListField("extensions")
	@ApiField("query_extension")
	private List<QueryExtension> extensions;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setExtensions(List<QueryExtension> extensions) {
		this.extensions = extensions;
	}
	public List<QueryExtension> getExtensions( ) {
		return this.extensions;
	}

}
