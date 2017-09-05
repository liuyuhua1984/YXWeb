package com.gamecenter.common.packets;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-9-6 Time: 下午1:53 To change this template use File | Settings | File Templates.
 */
public class Recharge_response {
	private String result;
	private String billon;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getBillon() {
		return billon;
	}
	
	public void setBillon(String billon) {
		this.billon = billon;
	}
}
