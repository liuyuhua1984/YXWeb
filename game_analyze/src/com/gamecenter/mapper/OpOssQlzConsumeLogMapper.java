package com.gamecenter.mapper;

import com.gamecenter.model.OpOssQlzConsumeLog;
import com.gamecenter.model.OpOssQlzConsumeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpOssQlzConsumeLogMapper {
	int countByExample(OpOssQlzConsumeLogExample example);
	
	int deleteByExample(OpOssQlzConsumeLogExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpOssQlzConsumeLog record);
	
	int insertSelective(OpOssQlzConsumeLog record);
	
	List<OpOssQlzConsumeLog> selectByExample(OpOssQlzConsumeLogExample example);
	
	OpOssQlzConsumeLog selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpOssQlzConsumeLog record, @Param("example") OpOssQlzConsumeLogExample example);
	
	int updateByExample(@Param("record") OpOssQlzConsumeLog record, @Param("example") OpOssQlzConsumeLogExample example);
	
	int updateByPrimaryKeySelective(OpOssQlzConsumeLog record);
	
	int updateByPrimaryKey(OpOssQlzConsumeLog record);
}