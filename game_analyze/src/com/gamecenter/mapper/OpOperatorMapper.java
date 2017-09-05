package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOperator;
import com.gamecenter.model.OpOperatorExample;

public interface OpOperatorMapper {
	int countByExample(OpOperatorExample example);
	
	int deleteByExample(OpOperatorExample example);
	
	int deleteByPrimaryKey(Integer optid);
	
	int insert(OpOperator record);
	
	int insertSelective(OpOperator record);
	
	List<OpOperator> selectByExample(OpOperatorExample example);
	
	OpOperator selectByPrimaryKey(Integer optid);
	
	int updateByExampleSelective(@Param("record") OpOperator record, @Param("example") OpOperatorExample example);
	
	int updateByExample(@Param("record") OpOperator record, @Param("example") OpOperatorExample example);
	
	int updateByPrimaryKeySelective(OpOperator record);
	
	int updateByPrimaryKey(OpOperator record);
}