package com.gamecenter.service.ossServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OpOssPayDayreportMapper;
import com.gamecenter.mapper.OpOssUserDayreportMapper;
import com.gamecenter.mapper.ReportMapper;
import com.gamecenter.model.OpOssConsumeDayreport;
import com.gamecenter.model.OpOssOnlineDayreport;
import com.gamecenter.model.OpOssPayDayreport;
import com.gamecenter.model.OpOssPayDayreportExample;
import com.gamecenter.model.OpOssUserDayreport;
import com.gamecenter.model.OpOssUserDayreportExample;
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
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 下午2:34 To change this template use File | Settings | File Templates.
 */
@Repository
public class ReportServiceImpl implements ReportService {
	
	@Resource
	ReportMapper reportMapper;
	@Resource
	OpOssPayDayreportMapper opOssPayDayreportMapper;
	@Resource
	OpOssUserDayreportMapper opOssUserDayreportMapper;
	
	public DayAllSurvey selectSurvey(String time) {
		DayAllSurvey dayAllSurvey = reportMapper.getSurvey(time);
		return dayAllSurvey;
	}
	
	public DayCurSurvey selectCurSurvey(String time, String worldid) {
		Par_survey par_survey = new Par_survey();
		par_survey.setTime(time + "%");
		par_survey.setWorldid(worldid);
		DayCurSurvey dayCurSurvey = reportMapper.getCurSurvey(par_survey);
		return dayCurSurvey;
	}
	
	public List<DayReport> selectDayReport(String time) {
		List<DayReport> dayReport = reportMapper.getDayReport(time);
		return dayReport;
	}
	
	public List<NewUserMonitor> selectNewUsers(String time, String worldid) {
		Map map = new HashMap();
		map.put("time", "'" + time + "%'");
		map.put("worldid", "'" + worldid + "'");
		List<NewUserMonitor> newUserMonitors = reportMapper.monitorNewUser(map);
		return newUserMonitors;
	}
	
	public List<OpOssPayDayreport> getPayDayReport(String beginTime, String endTime, String worldid) {
		OpOssPayDayreportExample opOssPayDayreportExample = new OpOssPayDayreportExample();
		OpOssPayDayreportExample.Criteria criteria = opOssPayDayreportExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		criteria.andCtimeBetween(beginTime, endTime);
		
		List<OpOssPayDayreport> opOssPayDayreports = opOssPayDayreportMapper.selectByExample(opOssPayDayreportExample);
		
		return opOssPayDayreports;
	}
	
	public List<Paytop> getPayTop(String worldid) {
		List<Paytop> paytops = reportMapper.paytop(worldid);
		return paytops;
	}
	
	public List<Payhabit> getPayhabitList(String worldids, String begintime, String endtime) {
		Map map = new HashMap();
		map.put("worldids", "'" + worldids + "'");
		map.put("begintime", "'" + begintime + "'");
		map.put("endtime", "'" + endtime + "'");
		List<Payhabit> payhabits = reportMapper.payhabitlist(map);
		return payhabits;
	}
	
	public List<OpOssUserDayreport> getDauList(String worldids, String begintime, String endtime) {
		List<String> wlist = new ArrayList<String>();
		String w[] = worldids.split(",");
		for (String wid : w) {
			wlist.add(wid);
		}
		OpOssUserDayreportExample opOssUserDayreportExample = new OpOssUserDayreportExample();
		OpOssUserDayreportExample.Criteria criteria = opOssUserDayreportExample.createCriteria();
		criteria.andWorldidIn(wlist);
		criteria.andCtimeBetween(begintime, endtime);
		opOssUserDayreportExample.setOrderByClause("ctime desc");
		List<OpOssUserDayreport> opOssUserDayreports = opOssUserDayreportMapper.selectByExample(opOssUserDayreportExample);
		return opOssUserDayreports;
	}
	
	public List<OpOssOnlineDayreport> getUserOnlineList(String worldids, String begintime, String endtime) {
		Map map = new HashMap();
		if (worldids.equals("0")) { // 所有
			map.put("worldids", "");
		} else { // 单区
			map.put("worldids", "t1.worldid = '" + worldids + "' and");
		}
		map.put("begintime", "'" + begintime + "'");
		map.put("endtime", "'" + endtime + " 23:59:59'");
		
		List<OpOssOnlineDayreport> opOssOnlineDayreports = reportMapper.userOnlineReport(map);
		return opOssOnlineDayreports;
	}
	
	public List<OpOssOnlineDayreport> getUserOnlineByHourList(String worldids, String time) {
		Map map = new HashMap();
		if (worldids.equals("0")) { // 所有
			map.put("worldids", "");
		} else { // 单区
			map.put("worldids", "t1.worldid = '" + worldids + "' and");
		}
		map.put("time", "'" + time + "%'");
		
		List<OpOssOnlineDayreport> opOssOnlineDayreports = reportMapper.userOnlineReportByhour(map);
		return opOssOnlineDayreports;
	}
	
	public List<UserGrade> getUserGrade(String worldid) {
		List<UserGrade> userGrades = reportMapper.usergrade(worldid);
		return userGrades;
	}
	
	public List<UserGradeDetail> getUserGradeDetails(String worldid) {
		List<UserGradeDetail> lists = reportMapper.usergradedetail(worldid);
		return lists;
	}
	
	public List<UserGrade> usergradescope(String worldid) {
		List<UserGrade> userGrades = reportMapper.usergradescope(worldid);
		return userGrades;
	}
	
	public List<OpOssConsumeDayreport> getConsumeList(String worldid, String begintime, String endtime) {
		Map map = new HashMap();
		map.put("worldid", "'" + worldid + "'");
		map.put("begintime", "'" + begintime + "'");
		map.put("endtime", "'" + endtime + "'");
		List<OpOssConsumeDayreport> lists = reportMapper.consumeDayReport(map);
		return lists;
	}
	
	public List<UserGradeLs> greadeLsList(String worldid, String time) {
		Map map = new HashMap();
		map.put("worldid", "'" + worldid + "'");
		map.put("time", "'" + time + "'");
		List<UserGradeLs> lists = reportMapper.usergradels(map);
		return lists;
	}
	
}
