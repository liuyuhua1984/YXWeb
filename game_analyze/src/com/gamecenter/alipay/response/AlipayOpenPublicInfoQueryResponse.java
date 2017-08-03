package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.open.public.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 00:52:57
 */
public class AlipayOpenPublicInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7615846581554699215L;

	/** 
	 * 服务窗名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 服务窗审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 服务窗审核状态，对于系统商而言，只有四个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核状态（当前没有处于审核过程的工单）
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 服务窗是否上线，T表示上线，F表示未上线
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 服务窗是否上架，T表示上架，上架即可在支付宝客户端被搜索到，F表示未上架
	 */
	@ApiField("is_release")
	private String isRelease;

	/** 
	 * 服务窗头像地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 服务窗欢迎语
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsRelease(String isRelease) {
		this.isRelease = isRelease;
	}
	public String getIsRelease( ) {
		return this.isRelease;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}
	public String getPublicGreeting( ) {
		return this.publicGreeting;
	}

}
