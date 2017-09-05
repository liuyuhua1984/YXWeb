package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

/**
 * 接入请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class Login_request implements PacketBuildUp {
	private String worldid;
	private String sigstr;
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(100);
//		
//		tempData.putInt(Integer.MIN_VALUE);
//		tempData.putInt(-1);
//		tempData.putInt(-1);
//		tempData.putShort((short) 0x5001);
//		System.out.println("Login_request:" + JSONObject.fromObject(this).toString());
//		tempData.putShort((short) JSONObject.fromObject(this).toString().getBytes().length);
//		tempData.put(JSONObject.fromObject(this).toString().getBytes());
//		
//		tempData.putInt(0, tempData.position() - 4);
//		tempData.flip();
		return tempData;
	}
	
	public String getSigstr() {
		return sigstr;
	}
	
	public void setSigstr(String sigstr) {
		this.sigstr = sigstr;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid;
	}
}
