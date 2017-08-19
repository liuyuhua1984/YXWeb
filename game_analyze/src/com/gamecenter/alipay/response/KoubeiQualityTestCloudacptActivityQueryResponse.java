package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.OpenActivity;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-15 15:07:41
 */
public class KoubeiQualityTestCloudacptActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6399419568635739876L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("open_activity")
	private List<OpenActivity> activityList;

	public void setActivityList(List<OpenActivity> activityList) {
		this.activityList = activityList;
	}
	public List<OpenActivity> getActivityList( ) {
		return this.activityList;
	}

}
