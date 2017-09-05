package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

import com.alibaba.fastjson.JSON;

/**
 * 账号信息请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class PassportMsg_request implements PacketBuildUp {
	private String type;
	private String actstr;
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(300);
		try {
			tempData.putInt(Integer.MIN_VALUE);
			tempData.putInt(-1);
			tempData.putInt(-1);
			tempData.putShort((short) 0x5030);
			tempData.putShort((short) JSON.toJSONString(this).getBytes("UTF-8").length);
			tempData.put(JSON.toJSONString(this).getBytes("UTF-8"));
			tempData.putInt(0, (int) (tempData.position() - 4));
			System.out.println("PassportMsg_request:" + JSON.toJSONString(this));
			
			tempData.flip();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
