package com.gamecenter.common.jms;

import java.io.Serializable;

public class FooMessage implements Serializable {
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
