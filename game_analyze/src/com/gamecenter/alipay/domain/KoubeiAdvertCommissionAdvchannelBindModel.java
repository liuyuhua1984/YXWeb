package com.gamecenter.alipay.domain;

import java.util.List;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * 添加广告的渠道关系接口
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:28
 */
public class KoubeiAdvertCommissionAdvchannelBindModel extends AlipayObject {

	private static final long serialVersionUID = 2594646565485736684L;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID列表
	 */
	@ApiListField("channel_id_list")
	@ApiField("string")
	private List<String> channelIdList;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public List<String> getChannelIdList() {
		return this.channelIdList;
	}
	public void setChannelIdList(List<String> channelIdList) {
		this.channelIdList = channelIdList;
	}

}
