package com.gamecenter.parBean.updataObj;

/**
 * 控制指令。。。 Created with IntelliJ IDEA. User: gsb Date: 14-5-10 Time: 下午2:00 To change this template use File | Settings | File Templates.
 */
public class StatusConCommand {
	private String worldId;
	private int act; // 1：开始 0 停止
	
	public String getWorldId() {
		return worldId;
	}
	
	public void setWorldId(String worldId) {
		this.worldId = worldId;
	}
	
	public int getAct() {
		return act;
	}
	
	public void setAct(int act) {
		this.act = act;
	}
	
}
