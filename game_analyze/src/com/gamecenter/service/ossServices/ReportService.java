package com.gamecenter.service.ossServices;

import com.gamecenter.model.OpOssConsumeDayreport;
import com.gamecenter.model.OpOssOnlineDayreport;
import com.gamecenter.model.OpOssPayDayreport;
import com.gamecenter.model.OpOssUserDayreport;
import com.gamecenter.parBean.report.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 下午2:27 To change this template use File | Settings | File Templates.
 */
public interface ReportService {
	
	/**
	 * 全服汇总概况
	 * 
	 * @param time
	 * @return
	 */
	public DayAllSurvey selectSurvey(String time);
	
	/**
	 * 实时概况
	 * 
	 * @param time
	 * @return
	 */
	public DayCurSurvey selectCurSurvey(String time, String worldid);
	
	/**
	 * 日报查询
	 * 
	 * @param time
	 * @return
	 */
	public List<DayReport> selectDayReport(String time);
	
	/**
	 * 新增玩家监控
	 * 
	 * @param time
	 * @param worldid
	 * @return
	 */
	public List<NewUserMonitor> selectNewUsers(String time, String worldid);
	
	/**
	 * 获取充值日报
	 * 
	 * @param beginTime
	 * @param endTime
	 * @param worldid
	 * @return
	 */
	public List<OpOssPayDayreport> getPayDayReport(String beginTime, String endTime, String worldid);
	
	/**
	 * 获取充值排行
	 * 
	 * @param worldid
	 * @return
	 */
	public List<Paytop> getPayTop(String worldid);
	
	/**
	 * 付费行为习惯
	 * 
	 * @param worldids
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	public List<Payhabit> getPayhabitList(String worldids, String begintime, String endtime);
	
	/**
	 * 获取日活跃的列表
	 * 
	 * @param worldids
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	public List<OpOssUserDayreport> getDauList(String worldids, String begintime, String endtime);
	
	/**
	 * 用户在线报表
	 * 
	 * @param worldids
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	public List<OpOssOnlineDayreport> getUserOnlineList(String worldids, String begintime, String endtime);
	
	/**
	 * 用户在线报表 --- 小时 天
	 * 
	 * @param worldids
	 * @param time
	 * @return
	 */
	public List<OpOssOnlineDayreport> getUserOnlineByHourList(String worldids, String time);
	
	/**
	 * 等级分布
	 * 
	 * @param worldid
	 * @return
	 */
	public List<UserGrade> getUserGrade(String worldid);
	
	/**
	 * 等级详细
	 * 
	 * @param worldid
	 * @return
	 */
	public List<UserGradeDetail> getUserGradeDetails(String worldid);
	
	/**
	 * 等级范围
	 * 
	 * @param worldid
	 * @return
	 */
	public List<UserGrade> usergradescope(String worldid);
	
	/**
	 * 获取消费日报
	 * 
	 * @param worldid
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	public List<OpOssConsumeDayreport> getConsumeList(String worldid, String begintime, String endtime);
	
	/**
	 * 等级流失列表
	 * 
	 * @param worldid
	 * @param time
	 * @return
	 */
	public List<UserGradeLs> greadeLsList(String worldid, String time);
	
}
