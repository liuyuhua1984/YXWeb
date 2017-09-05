package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OnlineNumLog;
import com.gamecenter.model.OnlineNumLogExample;

public interface OnlineNumLogMapper {
	int countByExample(OnlineNumLogExample example);
	
	int deleteByExample(OnlineNumLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(OnlineNumLog record);
	
	int insertSelective(OnlineNumLog record);
	
	List<OnlineNumLog> selectByExample(OnlineNumLogExample example);
	
	OnlineNumLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") OnlineNumLog record, @Param("example") OnlineNumLogExample example);
	
	int updateByExample(@Param("record") OnlineNumLog record, @Param("example") OnlineNumLogExample example);
	
	int updateByPrimaryKeySelective(OnlineNumLog record);
	
	int updateByPrimaryKey(OnlineNumLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<OnlineNumLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}