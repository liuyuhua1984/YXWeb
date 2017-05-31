package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGameworldExample;

public interface OpGameworldMapper {
	int countByExample(OpGameworldExample example);
	
	int deleteByExample(OpGameworldExample example);
	
	int deleteByPrimaryKey(Integer wid);
	
	int insert(OpGameworld record);
	
	int insertSelective(OpGameworld record);
	
	List<OpGameworld> selectByExample(OpGameworldExample example);
	
	OpGameworld selectByPrimaryKey(Integer wid);
	
	int updateByExampleSelective(@Param("record") OpGameworld record, @Param("example") OpGameworldExample example);
	
	int updateByExample(@Param("record") OpGameworld record, @Param("example") OpGameworldExample example);
	
	int updateByPrimaryKeySelective(OpGameworld record);
	
	int updateByPrimaryKey(OpGameworld record);
}