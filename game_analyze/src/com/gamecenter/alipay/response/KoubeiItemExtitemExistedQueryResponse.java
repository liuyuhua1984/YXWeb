package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: koubei.item.extitem.existed.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:15
 */
public class KoubeiItemExtitemExistedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8592473781877544589L;

	/** 
	 * 商品库中存在的商品编码
	 */
	@ApiListField("existed_list")
	@ApiField("string")
	private List<String> existedList;

	public void setExistedList(List<String> existedList) {
		this.existedList = existedList;
	}
	public List<String> getExistedList( ) {
		return this.existedList;
	}

}
