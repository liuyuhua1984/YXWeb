package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.CityFunction;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.city.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-15 11:19:13
 */
public class AlipayCommerceCityfacilitatorCityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8577928369992875133L;

	/** 
	 * 城市列表
	 */
	@ApiListField("citys")
	@ApiField("city_function")
	private List<CityFunction> citys;

	public void setCitys(List<CityFunction> citys) {
		this.citys = citys;
	}
	public List<CityFunction> getCitys( ) {
		return this.citys;
	}

}
