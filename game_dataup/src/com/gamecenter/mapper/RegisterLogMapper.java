package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.RegisterLog;
import com.gamecenter.model.RegisterLogExample;

public interface RegisterLogMapper {
	int countByExample(RegisterLogExample example);
	
	int deleteByExample(RegisterLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(RegisterLog record);
	
	int insertSelective(RegisterLog record);
	
	List<RegisterLog> selectByExample(RegisterLogExample example);
	
	RegisterLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") RegisterLog record, @Param("example") RegisterLogExample example);
	
	int updateByExample(@Param("record") RegisterLog record, @Param("example") RegisterLogExample example);
	
	int updateByPrimaryKeySelective(RegisterLog record);
	
	int updateByPrimaryKey(RegisterLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<RegisterLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}