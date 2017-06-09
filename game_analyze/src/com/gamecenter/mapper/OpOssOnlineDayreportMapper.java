package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssOnlineDayreport;
import com.gamecenter.model.OpOssOnlineDayreportExample;

public interface OpOssOnlineDayreportMapper {
	int countByExample(OpOssOnlineDayreportExample example);
	
	int deleteByExample(OpOssOnlineDayreportExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOssOnlineDayreport record);
	
	int insertSelective(OpOssOnlineDayreport record);
	
	List<OpOssOnlineDayreport> selectByExample(OpOssOnlineDayreportExample example);
	
	OpOssOnlineDayreport selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOssOnlineDayreport record, @Param("example") OpOssOnlineDayreportExample example);
	
	int updateByExample(@Param("record") OpOssOnlineDayreport record, @Param("example") OpOssOnlineDayreportExample example);
	
	int updateByPrimaryKeySelective(OpOssOnlineDayreport record);
	
	int updateByPrimaryKey(OpOssOnlineDayreport record);
}