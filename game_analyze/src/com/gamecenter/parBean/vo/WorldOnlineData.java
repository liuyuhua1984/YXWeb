package com.gamecenter.parBean.vo;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-30 Time: 下午4:53 To change this template use File | Settings | File Templates.
 */
public class WorldOnlineData {
	public int curNum;
	public int maxNum;
	public int minNum;
	public int avgNum;
	public int getNum;
	public ConcurrentLinkedQueue<Integer> onlineData = null;
	
	public int chuangjue;
	public int dau;
}
