package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.RechargeLog;
import com.gamecenter.model.RechargeLogExample;

public interface RechargeLogMapper {
	int countByExample(RechargeLogExample example);
	
	int deleteByExample(RechargeLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(RechargeLog record);
	
	int insertSelective(RechargeLog record);
	
	List<RechargeLog> selectByExample(RechargeLogExample example);
	
	RechargeLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") RechargeLog record, @Param("example") RechargeLogExample example);
	
	int updateByExample(@Param("record") RechargeLog record, @Param("example") RechargeLogExample example);
	
	int updateByPrimaryKeySelective(RechargeLog record);
	
	int updateByPrimaryKey(RechargeLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<RechargeLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}