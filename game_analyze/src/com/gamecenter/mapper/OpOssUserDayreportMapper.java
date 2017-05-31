package com.gamecenter.mapper;

import com.gamecenter.model.OpOssUserDayreport;
import com.gamecenter.model.OpOssUserDayreportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpOssUserDayreportMapper {
	int countByExample(OpOssUserDayreportExample example);
	
	int deleteByExample(OpOssUserDayreportExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOssUserDayreport record);
	
	int insertSelective(OpOssUserDayreport record);
	
	List<OpOssUserDayreport> selectByExample(OpOssUserDayreportExample example);
	
	OpOssUserDayreport selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOssUserDayreport record, @Param("example") OpOssUserDayreportExample example);
	
	int updateByExample(@Param("record") OpOssUserDayreport record, @Param("example") OpOssUserDayreportExample example);
	
	int updateByPrimaryKeySelective(OpOssUserDayreport record);
	
	int updateByPrimaryKey(OpOssUserDayreport record);
}