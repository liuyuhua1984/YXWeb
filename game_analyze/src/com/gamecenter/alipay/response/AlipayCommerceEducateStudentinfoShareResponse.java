package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.EduStudentInfoShareResult;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.commerce.educate.studentinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-19 14:49:22
 */
public class AlipayCommerceEducateStudentinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 5839118851425549971L;

	/** 
	 * 学生信息
	 */
	@ApiField("student_info_share_result")
	private EduStudentInfoShareResult studentInfoShareResult;

	public void setStudentInfoShareResult(EduStudentInfoShareResult studentInfoShareResult) {
		this.studentInfoShareResult = studentInfoShareResult;
	}
	public EduStudentInfoShareResult getStudentInfoShareResult( ) {
		return this.studentInfoShareResult;
	}

}
