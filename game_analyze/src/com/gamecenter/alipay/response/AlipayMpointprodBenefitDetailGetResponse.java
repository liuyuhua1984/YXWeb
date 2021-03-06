package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.BenefitInfo;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.mpointprod.benefit.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-01-29 15:46:36
 */
public class AlipayMpointprodBenefitDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2813454168257776441L;

	/** 
	 * 权益详情列表
	 */
	@ApiListField("benefit_infos")
	@ApiField("benefit_info")
	private List<BenefitInfo> benefitInfos;

	/** 
	 * 响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 响应描述
	 */
	@ApiField("msg")
	private String msg;

	public void setBenefitInfos(List<BenefitInfo> benefitInfos) {
		this.benefitInfos = benefitInfos;
	}
	public List<BenefitInfo> getBenefitInfos( ) {
		return this.benefitInfos;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
