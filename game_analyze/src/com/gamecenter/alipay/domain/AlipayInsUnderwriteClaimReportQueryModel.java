package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 理赔案件信息查询
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:48:56
 */
public class AlipayInsUnderwriteClaimReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6392318249467745951L;

	/**
	 * 理赔申请报案号，通过理赔申请【alipay.ins.scene.claim.apply】接口的返回字段claim_report_no获取
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

}
