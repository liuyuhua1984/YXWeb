package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 用户分组删除接口
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:01:33
 */
public class AlipayOpenPublicGroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8374756649621161138L;

	/**
	 * 需要删除的用户分组的id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
