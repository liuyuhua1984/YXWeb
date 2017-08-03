package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.ErrorMatcher;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.open.public.matchuser.label.delete response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-01 11:25:22
 */
public class AlipayOpenPublicMatchuserLabelDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7355712959761781753L;

	/** 
	 * 用户打标失败数量
	 */
	@ApiField("error_count")
	private Long errorCount;

	/** 
	 * 出错的匹配器列表
	 */
	@ApiListField("error_matchers")
	@ApiField("error_matcher")
	private List<ErrorMatcher> errorMatchers;

	public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
	}
	public Long getErrorCount( ) {
		return this.errorCount;
	}

	public void setErrorMatchers(List<ErrorMatcher> errorMatchers) {
		this.errorMatchers = errorMatchers;
	}
	public List<ErrorMatcher> getErrorMatchers( ) {
		return this.errorMatchers;
	}

}
