package com.gamecenter.common.packets;

/**
 * 包的超类 包的类型
 * 
 * @author okg
 */
public class PacketSuper {
	protected byte firstType; // 一级包类型
	
	public byte getFirstType() {
		return firstType;
	}
	
	public void setFirstType(byte firstType) {
		this.firstType = firstType;
	}
}
