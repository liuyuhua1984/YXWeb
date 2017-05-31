package com.gamecenter.service.dataUploadServices;

import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.parBean.vo.OnlineDataByDay;
import com.gamecenter.parBean.vo.OnlineDataByHour;

import java.util.List;

/**
 * 区服在线人数处理 Created with IntelliJ IDEA. User: gsb Date: 14-4-30 Time: 下午1:53 To change this template use File | Settings | File Templates.
 */
public interface WorldOnlineService {
	
	/**
	 * 添加记录
	 * 
	 * @param obj
	 * @return
	 */
	public int insert(OpOssQlzOnlinecurLog obj);
	
	/**
	 * 日在线数据的汇总
	 * 
	 * @param time
	 * @param worldid
	 * @return
	 */
	public OnlineDataByDay selectOnlineDataByDay(String time, String worldid);
	
	/**
	 * 实时在线PCU
	 * 
	 * @param time
	 * @param worldid
	 * @return
	 */
	public List<OnlineDataByHour> onlineDayByHour(String time, String worldid);
}
