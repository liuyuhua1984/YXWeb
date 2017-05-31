package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

import com.alibaba.fastjson.JSON;

/**
 * 在线人数请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class OnlineNum_request implements PacketBuildUp {
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(100);
		
		tempData.putInt(Integer.MIN_VALUE);
		tempData.putInt(-1);
		tempData.putInt(-1);
		tempData.putShort((short) 0x5040);
		tempData.putShort((short) JSON.toJSONString(this).getBytes().length);
		tempData.put(JSON.toJSONString(this).getBytes());
		tempData.putInt(0, (int) (tempData.position() - 4));
		System.out.println("OnlineNum_request:" + JSON.toJSONString(this));
		
		tempData.flip();
		return tempData;
	}
	
}
