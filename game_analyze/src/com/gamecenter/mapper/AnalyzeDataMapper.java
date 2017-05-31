package com.gamecenter.mapper;

import com.gamecenter.model.OpGameappExample;

import java.util.Map;

/**
 * 数据分析 Created with IntelliJ IDEA. User: gsb Date: 14-5-20 Time: 下午1:57 To change this template use File | Settings | File Templates.
 */
public interface AnalyzeDataMapper {
	
	/**
	 * 在线人数分析
	 * 
	 * @param time
	 * @return
	 */
	int onlineNum(String time);
	
	/**
	 * 玩家在线日报
	 * 
	 * @param time
	 * @return
	 */
	int userDayReport(String time);
	
	/**
	 * 收入统计日报
	 * 
	 * @param time
	 * @return
	 */
	int payDayReport(String time);
	
	/**
	 * 用户留存计算
	 * 
	 * @param map 目标时间 上一天时间 区域
	 * @return
	 */
	double remainUser(Map map);
	
	/**
	 * 消费日报分析
	 * 
	 * @param time
	 * @return
	 */
	int consumeDayReport(String time);
}
