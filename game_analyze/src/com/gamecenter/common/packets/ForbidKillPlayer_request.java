package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

/**
 * 踢人请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class ForbidKillPlayer_request implements PacketBuildUp {
	private String type;
	private String actstr;
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(100);
		
//		tempData.putInt(Integer.MIN_VALUE);
//		tempData.putInt(-1);
//		tempData.putInt(-1);
//		tempData.putShort((short) 0x5070);
//		tempData.putShort((short) JSONObject.fromObject(this).toString().getBytes().length);
//		tempData.put(JSONObject.fromObject(this).toString().getBytes());
//		tempData.putInt(0, (int) (tempData.position() - 4));
//		System.out.println("ForbidKillPlayer_request:" + JSONObject.fromObject(this).toString());
		
		tempData.flip();
		return tempData;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getActstr() {
		return actstr;
	}
	
	public void setActstr(String actstr) {
		this.actstr = actstr;
	}
	
}
