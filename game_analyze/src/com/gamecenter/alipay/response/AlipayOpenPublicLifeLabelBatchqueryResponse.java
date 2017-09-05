package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.LifeLabel;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.open.public.life.label.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-27 17:51:44
 */
public class AlipayOpenPublicLifeLabelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2544811685356648472L;

	/** 
	 * 标签列表
	 */
	@ApiListField("labels")
	@ApiField("life_label")
	private List<LifeLabel> labels;

	public void setLabels(List<LifeLabel> labels) {
		this.labels = labels;
	}
	public List<LifeLabel> getLabels( ) {
		return this.labels;
	}

}
