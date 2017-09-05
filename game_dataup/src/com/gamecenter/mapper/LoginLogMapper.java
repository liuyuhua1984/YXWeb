package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.LoginLog;
import com.gamecenter.model.LoginLogExample;

public interface LoginLogMapper {
	int countByExample(LoginLogExample example);
	
	int deleteByExample(LoginLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(LoginLog record);
	
	int insertSelective(LoginLog record);
	
	List<LoginLog> selectByExample(LoginLogExample example);
	
	LoginLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogExample example);
	
	int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogExample example);
	
	int updateByPrimaryKeySelective(LoginLog record);
	
	int updateByPrimaryKey(LoginLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<LoginLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}