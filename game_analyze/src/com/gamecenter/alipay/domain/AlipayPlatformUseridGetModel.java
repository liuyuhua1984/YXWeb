package com.gamecenter.alipay.domain;

import java.util.List;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * 根据OpenId获取UserId
 *
 * @author auto create
 * @since 1.0, 2016-02-19 20:04:41
 */
public class AlipayPlatformUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 8277953562447728978L;

	/**
	 * openId的列表
	 */
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

	public List<String> getOpenIds() {
		return this.openIds;
	}
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

}
