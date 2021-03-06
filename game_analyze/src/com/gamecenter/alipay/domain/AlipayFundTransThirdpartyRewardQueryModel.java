package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 支付宝打赏订单查询接口，返回打赏订单明细及状态
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:18
 */
public class AlipayFundTransThirdpartyRewardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5883223265373467394L;

	/**
	 * 场景码，接入时找业务方分配
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 付款方支付宝UserId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 打赏单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSenderUserId() {
		return this.senderUserId;
	}
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

	public String getTransferNo() {
		return this.transferNo;
	}
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

}
