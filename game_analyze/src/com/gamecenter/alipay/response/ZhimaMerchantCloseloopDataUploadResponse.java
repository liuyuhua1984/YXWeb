package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.merchant.closeloop.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-07 14:12:15
 */
public class ZhimaMerchantCloseloopDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8437468565318785777L;

	/** 
	 * 公用回传参数（非必填），这个字段由商户传入，系统透传给商户。
	 */
	@ApiField("biz_ext_params")
	private String bizExtParams;

	/** 
	 * 每次上传都会生成一个任务号
	 */
	@ApiField("task_id")
	private String taskId;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams( ) {
		return this.bizExtParams;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
