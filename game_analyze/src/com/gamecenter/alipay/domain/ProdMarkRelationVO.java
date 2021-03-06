package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 产品外标关系
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ProdMarkRelationVO extends AlipayObject {

	private static final long serialVersionUID = 5796615331619384838L;

	/**
	 * 产品外标编码
	 */
	@ApiField("mark_code")
	private String markCode;

	/**
	 * 产品外标类型
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	public String getMarkCode() {
		return this.markCode;
	}
	public void setMarkCode(String markCode) {
		this.markCode = markCode;
	}

	public String getMarkType() {
		return this.markType;
	}
	public void setMarkType(String markType) {
		this.markType = markType;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

}
