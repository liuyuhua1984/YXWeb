package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssConsumeDayreport;
import com.gamecenter.model.OpOssConsumeDayreportExample;

public interface OpOssConsumeDayreportMapper {
	int countByExample(OpOssConsumeDayreportExample example);
	
	int deleteByExample(OpOssConsumeDayreportExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOssConsumeDayreport record);
	
	int insertSelective(OpOssConsumeDayreport record);
	
	List<OpOssConsumeDayreport> selectByExample(OpOssConsumeDayreportExample example);
	
	OpOssConsumeDayreport selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOssConsumeDayreport record, @Param("example") OpOssConsumeDayreportExample example);
	
	int updateByExample(@Param("record") OpOssConsumeDayreport record, @Param("example") OpOssConsumeDayreportExample example);
	
	int updateByPrimaryKeySelective(OpOssConsumeDayreport record);
	
	int updateByPrimaryKey(OpOssConsumeDayreport record);
}