package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 用户已获得的优惠信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-17 10:53:57
 */
public class KoubeiMarketingDataMallDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6192137496822194156L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
