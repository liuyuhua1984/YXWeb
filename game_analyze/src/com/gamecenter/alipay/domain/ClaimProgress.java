package com.gamecenter.alipay.domain;

import java.util.Date;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 赔案进度
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:37:03
 */
public class ClaimProgress extends AlipayObject {

	private static final long serialVersionUID = 6816493144784663729L;

	/**
	 * 更新内容
	 */
	@ApiField("update_content")
	private String updateContent;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public String getUpdateContent() {
		return this.updateContent;
	}
	public void setUpdateContent(String updateContent) {
		this.updateContent = updateContent;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
