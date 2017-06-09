package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import com.gamecenter.model.OpOssConsumeDayreport;
import com.gamecenter.model.OpOssOnlineDayreport;
import com.gamecenter.parBean.report.DayAllSurvey;
import com.gamecenter.parBean.report.DayCurSurvey;
import com.gamecenter.parBean.report.DayReport;
import com.gamecenter.parBean.report.NewUserMonitor;
import com.gamecenter.parBean.report.Par_survey;
import com.gamecenter.parBean.report.Payhabit;
import com.gamecenter.parBean.report.Paytop;
import com.gamecenter.parBean.report.UserGrade;
import com.gamecenter.parBean.report.UserGradeDetail;
import com.gamecenter.parBean.report.UserGradeLs;

/**
 * 数据分析 Created with IntelliJ IDEA. User: gsb Date: 14-5-20 Time: 下午1:57 To change this template use File | Settings | File Templates.
 */
public interface ReportMapper {
	
	/**
	 * 概况分析汇总
	 * 
	 * @param time
	 * @return
	 */
	DayAllSurvey getSurvey(String time);
	
	/**
	 * 实时概况
	 * 
	 * @param par_survey
	 * @return
	 */
	DayCurSurvey getCurSurvey(Par_survey par_survey);
	
	/**
	 * 综合日报查询
	 * 
	 * @param time
	 * @return
	 */
	List<DayReport> getDayReport(String time);
	
	/**
	 * 新增玩家监控
	 * 
	 * @param map
	 * @return
	 */
	List<NewUserMonitor> monitorNewUser(Map map);
	
	/**
	 * 获取区服的充值排行
	 * 
	 * @param worldid
	 * @return
	 */
	List<Paytop> paytop(String worldid);
	
	/**
	 * 付费习惯列表
	 * 
	 * @param map
	 * @return
	 */
	List<Payhabit> payhabitlist(Map map);
	
	/**
	 * 用户在线报表
	 * 
	 * @param map
	 * @return
	 */
	List<OpOssOnlineDayreport> userOnlineReport(Map map);
	
	/**
	 * 用户在线报表 -- 小时 天
	 * 
	 * @param map
	 * @return
	 */
	List<OpOssOnlineDayreport> userOnlineReportByhour(Map map);
	
	/**
	 * 用户等级分布
	 * 
	 * @param worldid
	 * @return
	 */
	List<UserGrade> usergrade(String worldid);
	
	/**
	 * 用户等级分布 详细
	 * 
	 * @param worldid
	 * @return
	 */
	List<UserGradeDetail> usergradedetail(String worldid);
	
	/**
	 * 用户等级分布 范围
	 * 
	 * @param worldid
	 * @return
	 */
	List<UserGrade> usergradescope(String worldid);
	
	/**
	 * 消费日报
	 * 
	 * @param map
	 * @return
	 */
	List<OpOssConsumeDayreport> consumeDayReport(Map map);
	
	/**
	 * 用户等级流失
	 * 
	 * @param map
	 * @return
	 */
	List<UserGradeLs> usergradels(Map map);
}
