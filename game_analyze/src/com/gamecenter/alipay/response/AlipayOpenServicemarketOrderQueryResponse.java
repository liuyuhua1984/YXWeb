package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.OrderItem;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.open.servicemarket.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-01 16:20:58
 */
public class AlipayOpenServicemarketOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846725469358827274L;

	/** 
	 * 订购服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/** 
	 * 当前查询页（本接口支持最多查询100条记录）
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 订单明细列表
	 */
	@ApiListField("order_items")
	@ApiField("order_item")
	private List<OrderItem> orderItems;

	/** 
	 * 用于区分同一个服务的不同版本
	 */
	@ApiField("specifications")
	private String specifications;

	/** 
	 * MERCHANT_ORDED（待服务商接单）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityId( ) {
		return this.commodityId;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public List<OrderItem> getOrderItems( ) {
		return this.orderItems;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getSpecifications( ) {
		return this.specifications;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
