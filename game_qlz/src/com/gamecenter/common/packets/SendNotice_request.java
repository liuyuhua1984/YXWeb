package com.gamecenter.common.packets;

import java.nio.ByteBuffer;

/**
 * 发送公告请求 Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午2:22 To change this template use File | Settings | File Templates.
 */
public class SendNotice_request implements PacketBuildUp {
	private String content;
	
	public ByteBuffer data() {
		ByteBuffer tempData = ByteBuffer.allocate(500);
		
		try {
//			tempData.putInt(Integer.MIN_VALUE);
//			tempData.putInt(-1);
//			tempData.putInt(-1);
//			tempData.putShort((short) 0x5100);
//			tempData.putShort((short) JSONObject.fromObject(this).toString().getBytes("UTF-8").length);
//			tempData.put(JSONObject.fromObject(this).toString().getBytes("UTF-8"));
//			tempData.putInt(0, (int) (tempData.position() - 4));
//			System.out.println("PassportMsg_request:" + JSONObject.fromObject(this).toString());
			
			tempData.flip();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempData;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
