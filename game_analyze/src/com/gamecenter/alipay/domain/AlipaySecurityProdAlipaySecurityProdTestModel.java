package com.gamecenter.alipay.domain;

import java.util.List;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * 安全业务操作
 *
 * @author auto create
 * @since 1.0, 2016-03-02 10:47:05
 */
public class AlipaySecurityProdAlipaySecurityProdTestModel extends AlipayObject {

	private static final long serialVersionUID = 5376847675418567772L;

	/**
	 * ddd
	 */
	@ApiListField("cds")
	@ApiField("string")
	private List<String> cds;

	/**
	 * aaa
	 */
	@ApiField("ddd")
	private String ddd;

	public List<String> getCds() {
		return this.cds;
	}
	public void setCds(List<String> cds) {
		this.cds = cds;
	}

	public String getDdd() {
		return this.ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
