package com.gamecenter.mapper;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameappExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OpGameappMapper {
	int countByExample(OpGameappExample example);
	
	int deleteByExample(OpGameappExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpGameapp record);
	
	int insertSelective(OpGameapp record);
	
	List<OpGameapp> selectByExample(OpGameappExample example);
	
	OpGameapp selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpGameapp record, @Param("example") OpGameappExample example);
	
	int updateByExample(@Param("record") OpGameapp record, @Param("example") OpGameappExample example);
	
	int updateByPrimaryKeySelective(OpGameapp record);
	
	int updateByPrimaryKey(OpGameapp record);
	
	OpGameapp getOneByAppId(String appId);
}