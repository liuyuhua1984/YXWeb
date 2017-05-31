package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

import com.alibaba.fastjson.JSONObject;

/**
 * 腾讯 充值请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class RechargeForTx_request implements PacketBuildUp {
	private String openid;
	private String ts;
	private String payitem;
	private String token;
	private String billno;
	private String sigstr;
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(500);
		
		tempData.putInt(Integer.MIN_VALUE);
		tempData.putInt(-1);
		tempData.putInt(-1);
		tempData.putShort((short) 0x5011);
//		tempData.putShort((short) JSONObject.fromObject(this).toString().getBytes().length);
//		tempData.put(JSONObject.fromObject(this).toString().getBytes());
//		tempData.putInt(0, (int) (tempData.position() - 4));
//		System.out.println("RechargeForTx_request:" + JSONObject.fromObject(this).toString());
		
		tempData.flip();
		return tempData;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getTs() {
		return ts;
	}
	
	public void setTs(String ts) {
		this.ts = ts;
	}
	
	public String getPayitem() {
		return payitem;
	}
	
	public void setPayitem(String payitem) {
		this.payitem = payitem;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getBillno() {
		return billno;
	}
	
	public void setBillno(String billno) {
		this.billno = billno;
	}
	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
}
