package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.LoginOutLog;
import com.gamecenter.model.LoginOutLogExample;

public interface LoginOutLogMapper {
	int countByExample(LoginOutLogExample example);
	
	int deleteByExample(LoginOutLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(LoginOutLog record);
	
	int insertSelective(LoginOutLog record);
	
	List<LoginOutLog> selectByExample(LoginOutLogExample example);
	
	LoginOutLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") LoginOutLog record, @Param("example") LoginOutLogExample example);
	
	int updateByExample(@Param("record") LoginOutLog record, @Param("example") LoginOutLogExample example);
	
	int updateByPrimaryKeySelective(LoginOutLog record);
	
	int updateByPrimaryKey(LoginOutLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<LoginOutLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}