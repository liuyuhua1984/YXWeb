package com.gamecenter.alipay.domain;

import java.util.List;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * isv 回传的门店商品信息上传接口
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:10:01
 */
public class KoubeiRetailShopitemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3143737625855158787L;

	/**
	 * 上传的商品集合
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item")
	private List<RequestExtShopItem> shopItems;

	public List<RequestExtShopItem> getShopItems() {
		return this.shopItems;
	}
	public void setShopItems(List<RequestExtShopItem> shopItems) {
		this.shopItems = shopItems;
	}

}
