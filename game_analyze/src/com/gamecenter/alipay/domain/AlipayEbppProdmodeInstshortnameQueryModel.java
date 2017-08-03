package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 查询机构英文名称
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:17:10
 */
public class AlipayEbppProdmodeInstshortnameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5596871637762599561L;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

	public String getChargeinstCnName() {
		return this.chargeinstCnName;
	}
	public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}

}
