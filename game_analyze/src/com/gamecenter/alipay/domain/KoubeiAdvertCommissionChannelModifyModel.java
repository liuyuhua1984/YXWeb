package com.gamecenter.alipay.domain;

import java.util.List;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * 口碑客渠道管理接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:56
 */
public class KoubeiAdvertCommissionChannelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1533786629195736329L;

	/**
	 * 修改渠道信息(新增、删除、修改渠道不可同时为空)
	 */
	@ApiListField("channels")
	@ApiField("kb_advert_modify_channel_request")
	private List<KbAdvertModifyChannelRequest> channels;

	public List<KbAdvertModifyChannelRequest> getChannels() {
		return this.channels;
	}
	public void setChannels(List<KbAdvertModifyChannelRequest> channels) {
		this.channels = channels;
	}

}
