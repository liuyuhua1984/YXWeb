package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.ListListSmMockModel;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.mobile.public.mock.listsmlist.api response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:33:04
 */
public class AlipayMobilePublicMockListsmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 6551294191764911993L;

	/** 
	 * 简单模型嵌套list
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
