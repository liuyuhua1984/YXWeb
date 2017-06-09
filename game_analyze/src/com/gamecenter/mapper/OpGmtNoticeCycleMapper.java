package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.model.OpGmtNoticeCycleExample;

public interface OpGmtNoticeCycleMapper {
	int countByExample(OpGmtNoticeCycleExample example);
	
	int deleteByExample(OpGmtNoticeCycleExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpGmtNoticeCycle record);
	
	int insertSelective(OpGmtNoticeCycle record);
	
	List<OpGmtNoticeCycle> selectByExample(OpGmtNoticeCycleExample example);
	
	OpGmtNoticeCycle selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpGmtNoticeCycle record, @Param("example") OpGmtNoticeCycleExample example);
	
	int updateByExample(@Param("record") OpGmtNoticeCycle record, @Param("example") OpGmtNoticeCycleExample example);
	
	int updateByPrimaryKeySelective(OpGmtNoticeCycle record);
	
	int updateByPrimaryKey(OpGmtNoticeCycle record);
	
}