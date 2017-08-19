package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.OpenBatch;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-15 15:06:46
 */
public class KoubeiQualityTestCloudacptBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2779693542226588283L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次列表
	 */
	@ApiListField("batch_list")
	@ApiField("open_batch")
	private List<OpenBatch> batchList;

	/** 
	 * 单品批次数
	 */
	@ApiField("batch_num")
	private String batchNum;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setBatchList(List<OpenBatch> batchList) {
		this.batchList = batchList;
	}
	public List<OpenBatch> getBatchList( ) {
		return this.batchList;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}
	public String getBatchNum( ) {
		return this.batchNum;
	}

}
