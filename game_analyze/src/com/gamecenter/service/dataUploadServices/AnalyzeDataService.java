package com.gamecenter.service.dataUploadServices;

import java.util.Map;

/**
 * 数据分析服务 Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 上午11:52 To change this template use File | Settings | File Templates.
 */
public interface AnalyzeDataService {
	/**
	 * 在线人数分析
	 * 
	 * @param time
	 * @return
	 */
	public int onlineNum(String time);
	
	public int clearOnlineNum(String time);
	
	/**
	 * 玩家在线日报
	 * 
	 * @param time
	 * @return
	 */
	public int userDayReport(String time);
	
	public int clearUserDayReport(String time);
	
	/**
	 * 收入统计日报
	 * 
	 * @param time
	 * @return
	 */
	public int payDayReport(String time);
	
	public int clearPayDayReport(String time);
	
	/**
	 * 用户留存计算
	 * 
	 * @param map 目标时间 上一天时间
	 * @return
	 */
	public double remainUser(Map map);
	
	/**
	 * 消费分析
	 * 
	 * @param time
	 * @return
	 */
	public int consumeDayReport(String time);
	
	public int clearconsumeDayReport(String time);
	
}
