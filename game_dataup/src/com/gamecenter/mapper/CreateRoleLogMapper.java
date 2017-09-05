package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.CreateRoleLog;
import com.gamecenter.model.CreateRoleLogExample;

public interface CreateRoleLogMapper {
	int countByExample(CreateRoleLogExample example);
	
	int deleteByExample(CreateRoleLogExample example);
	
	int deleteByPrimaryKey(Long id);
	
	int insert(CreateRoleLog record);
	
	int insertSelective(CreateRoleLog record);
	
	List<CreateRoleLog> selectByExample(CreateRoleLogExample example);
	
	CreateRoleLog selectByPrimaryKey(Long id);
	
	int updateByExampleSelective(@Param("record") CreateRoleLog record, @Param("example") CreateRoleLogExample example);
	
	int updateByExample(@Param("record") CreateRoleLog record, @Param("example") CreateRoleLogExample example);
	
	int updateByPrimaryKeySelective(CreateRoleLog record);
	
	int updateByPrimaryKey(CreateRoleLog record);
	
	/**
	 * 上报数据提取
	 * 
	 * @return
	 */
	List<CreateRoleLog> getLastDate(String timeslice);
	
	/**
	 * 标记上报
	 * 
	 * @param ids
	 * @return
	 */
	int act(Map ids);
}