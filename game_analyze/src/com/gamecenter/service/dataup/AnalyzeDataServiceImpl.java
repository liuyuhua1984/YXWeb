package com.gamecenter.service.dataup;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.AnalyzeDataMapper;
import com.gamecenter.mapper.OpOssConsumeDayreportMapper;
import com.gamecenter.mapper.OpOssOnlineDayreportMapper;
import com.gamecenter.mapper.OpOssPayDayreportMapper;
import com.gamecenter.mapper.OpOssUserDayreportMapper;
import com.gamecenter.model.OpOssConsumeDayreportExample;
import com.gamecenter.model.OpOssOnlineDayreportExample;
import com.gamecenter.model.OpOssPayDayreportExample;
import com.gamecenter.model.OpOssUserDayreportExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 上午11:52 To change this template use File | Settings | File Templates.
 */
@Repository
public class AnalyzeDataServiceImpl implements AnalyzeDataService {
	@Resource
	AnalyzeDataMapper analyzeDataMapper;
	@Resource
	OpOssOnlineDayreportMapper opOssOnlineDayreportMapper;
	@Resource
	OpOssUserDayreportMapper opOssUserDayreportMapper;
	@Resource
	OpOssPayDayreportMapper opOssPayDayreportMapper;
	@Resource
	OpOssConsumeDayreportMapper opOssConsumeDayreportMapper;
	
	public int onlineNum(String time) {
		int num = analyzeDataMapper.onlineNum(time + "%");
		return num;
	}
	
	public int clearOnlineNum(String time) {
		OpOssOnlineDayreportExample opOssOnlineDayreportExample = new OpOssOnlineDayreportExample();
		OpOssOnlineDayreportExample.Criteria criteria = opOssOnlineDayreportExample.createCriteria();
		criteria.andCtimeEqualTo(time);
		int num = opOssOnlineDayreportMapper.deleteByExample(opOssOnlineDayreportExample);
		return num;
	}
	
	public int userDayReport(String time) {
		int num = analyzeDataMapper.userDayReport(time + "%");
		return num; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public int clearUserDayReport(String time) {
		OpOssUserDayreportExample opOssUserDayreportExample = new OpOssUserDayreportExample();
		OpOssUserDayreportExample.Criteria criteria = opOssUserDayreportExample.createCriteria();
		criteria.andCtimeEqualTo(time);
		int num = opOssUserDayreportMapper.deleteByExample(opOssUserDayreportExample);
		return num;
	}
	
	public int payDayReport(String time) {
		int num = analyzeDataMapper.payDayReport(time + "%");
		return num; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public int clearPayDayReport(String time) {
		OpOssPayDayreportExample opOssPayDayreportExample = new OpOssPayDayreportExample();
		OpOssPayDayreportExample.Criteria criteria = opOssPayDayreportExample.createCriteria();
		criteria.andCtimeEqualTo(time);
		
		int num = opOssPayDayreportMapper.deleteByExample(opOssPayDayreportExample);
		return num;
	}
	
	public double remainUser(Map map) {
		double num = analyzeDataMapper.remainUser(map);
		return num;
	}
	
	public int consumeDayReport(String time) {
		int num = analyzeDataMapper.consumeDayReport(time + "%");
		return num;
	}
	
	public int clearconsumeDayReport(String time) {
		OpOssConsumeDayreportExample example = new OpOssConsumeDayreportExample();
		OpOssConsumeDayreportExample.Criteria criteria = example.createCriteria();
		criteria.andCtimeEqualTo(time);
		int num = opOssConsumeDayreportMapper.deleteByExample(example);
		return num;
	}
}
