package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.QueryGroup;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.open.public.group.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-14 11:01:42
 */
public class AlipayOpenPublicGroupBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5274367159925232727L;

	/** 
	 * 用户分组列表，包含每个分组的id、name、以及规则模型
	 */
	@ApiListField("groups")
	@ApiField("query_group")
	private List<QueryGroup> groups;

	public void setGroups(List<QueryGroup> groups) {
		this.groups = groups;
	}
	public List<QueryGroup> getGroups( ) {
		return this.groups;
	}

}
