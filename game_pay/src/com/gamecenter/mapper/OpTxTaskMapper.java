package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpTxTask;
import com.gamecenter.model.OpTxTaskExample;

public interface OpTxTaskMapper {
	int countByExample(OpTxTaskExample example);
	
	int deleteByExample(OpTxTaskExample example);
	
	int deleteByPrimaryKey(Integer tid);
	
	int insert(OpTxTask record);
	
	int insertSelective(OpTxTask record);
	
	List<OpTxTask> selectByExample(OpTxTaskExample example);
	
	OpTxTask selectByPrimaryKey(Integer tid);
	
	int updateByExampleSelective(@Param("record") OpTxTask record, @Param("example") OpTxTaskExample example);
	
	int updateByExample(@Param("record") OpTxTask record, @Param("example") OpTxTaskExample example);
	
	int updateByPrimaryKeySelective(OpTxTask record);
	
	int updateByPrimaryKey(OpTxTask record);
}