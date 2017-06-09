package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssPayDayreport;
import com.gamecenter.model.OpOssPayDayreportExample;

public interface OpOssPayDayreportMapper {
	int countByExample(OpOssPayDayreportExample example);
	
	int deleteByExample(OpOssPayDayreportExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOssPayDayreport record);
	
	int insertSelective(OpOssPayDayreport record);
	
	List<OpOssPayDayreport> selectByExample(OpOssPayDayreportExample example);
	
	OpOssPayDayreport selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOssPayDayreport record, @Param("example") OpOssPayDayreportExample example);
	
	int updateByExample(@Param("record") OpOssPayDayreport record, @Param("example") OpOssPayDayreportExample example);
	
	int updateByPrimaryKeySelective(OpOssPayDayreport record);
	
	int updateByPrimaryKey(OpOssPayDayreport record);
}