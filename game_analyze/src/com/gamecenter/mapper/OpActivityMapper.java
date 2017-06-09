package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpActivity;
import com.gamecenter.model.OpActivityExample;

public interface OpActivityMapper {
	int countByExample(OpActivityExample example);
	
	int deleteByExample(OpActivityExample example);
	
	int deleteByPrimaryKey(Integer aid);
	
	int insert(OpActivity record);
	
	int insertSelective(OpActivity record);
	
	List<OpActivity> selectByExample(OpActivityExample example);
	
	OpActivity selectByPrimaryKey(Integer aid);
	
	int updateByExampleSelective(@Param("record") OpActivity record, @Param("example") OpActivityExample example);
	
	int updateByExample(@Param("record") OpActivity record, @Param("example") OpActivityExample example);
	
	int updateByPrimaryKeySelective(OpActivity record);
	
	int updateByPrimaryKey(OpActivity record);
}