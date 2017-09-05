package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

/**
 * 充值请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class Recharge_request implements PacketBuildUp {
	private String openid;
	private String billon;
	private String money;
	private String extendstr;
	private String sigstr;
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(500);
		
//		tempData.putInt(Integer.MIN_VALUE);
//		tempData.putInt(-1);
//		tempData.putInt(-1);
//		tempData.putShort((short) 0x5010);
//		tempData.putShort((short) JSONObject.fromObject(this).toString().getBytes().length);
//		tempData.put(JSONObject.fromObject(this).toString().getBytes());
//		tempData.putInt(0, (int) (tempData.position() - 4));
//		System.out.println("Recharge_request:" + JSONObject.fromObject(this).toString());
		
		tempData.flip();
		return tempData;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getBillon() {
		return billon;
	}
	
	public void setBillon(String billon) {
		this.billon = billon;
	}
	
	public String getMoney() {
		return money;
	}
	
	public void setMoney(String money) {
		this.money = money;
	}
	
	public String getExtendstr() {
		return extendstr;
	}
	
	public void setExtendstr(String extendstr) {
		this.extendstr = extendstr;
	}
	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
}
