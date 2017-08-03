package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.ListListSmMockModel;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listsmlist.api response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:34:02
 */
public class AlipayMobilePublicStdMockListsmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 4548186429959737171L;

	/** 
	 * 简单对象嵌套List
	 */
	@ApiListField("list_sm_model_list")
	@ApiField("list_list_sm_mock_model")
	private List<ListListSmMockModel> listSmModelList;

	public void setListSmModelList(List<ListListSmMockModel> listSmModelList) {
		this.listSmModelList = listSmModelList;
	}
	public List<ListListSmMockModel> getListSmModelList( ) {
		return this.listSmModelList;
	}

}
