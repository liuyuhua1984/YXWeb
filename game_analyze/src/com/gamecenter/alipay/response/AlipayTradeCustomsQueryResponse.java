package com.gamecenter.alipay.response;

import java.util.List;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.domain.CustomsDeclareRecordInfo;
import com.gamecenter.alipay.internal.mapping.ApiField;
import com.gamecenter.alipay.internal.mapping.ApiListField;

/**
 * ALIPAY API: alipay.trade.customs.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 00:47:36
 */
public class AlipayTradeCustomsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3556413194394377866L;

	/** 
	 * 不存在记录的报关请求号。多个值用逗号分隔，单次最多10个;每个报关请求号String(32)
	 */
	@ApiField("not_found")
	private String notFound;

	/** 
	 * 匹配到的列表。每个记录代表一条报关记录
	 */
	@ApiListField("records")
	@ApiField("customs_declare_record_info")
	private List<CustomsDeclareRecordInfo> records;

	public void setNotFound(String notFound) {
		this.notFound = notFound;
	}
	public String getNotFound( ) {
		return this.notFound;
	}

	public void setRecords(List<CustomsDeclareRecordInfo> records) {
		this.records = records;
	}
	public List<CustomsDeclareRecordInfo> getRecords( ) {
		return this.records;
	}

}
