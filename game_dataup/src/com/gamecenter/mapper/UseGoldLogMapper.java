package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.UseGoldLog;
import com.gamecenter.model.UseGoldLogExample;

public interface UseGoldLogMapper {
	int countByExample(UseGoldLogExample example);
	
	int deleteByExample(UseGoldLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(UseGoldLog record);
	
	int insertSelective(UseGoldLog record);
	
	List<UseGoldLog> selectByExample(UseGoldLogExample example);
	
	UseGoldLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") UseGoldLog record, @Param("example") UseGoldLogExample example);
	
	int updateByExample(@Param("record") UseGoldLog record, @Param("example") UseGoldLogExample example);
	
	int updateByPrimaryKeySelective(UseGoldLog record);
	
	int updateByPrimaryKey(UseGoldLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<UseGoldLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}