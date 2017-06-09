package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpActivityUselog;
import com.gamecenter.model.OpActivityUselogExample;

public interface OpActivityUselogMapper {
	int countByExample(OpActivityUselogExample example);
	
	int deleteByExample(OpActivityUselogExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpActivityUselog record);
	
	int insertSelective(OpActivityUselog record);
	
	List<OpActivityUselog> selectByExample(OpActivityUselogExample example);
	
	OpActivityUselog selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpActivityUselog record, @Param("example") OpActivityUselogExample example);
	
	int updateByExample(@Param("record") OpActivityUselog record, @Param("example") OpActivityUselogExample example);
	
	int updateByPrimaryKeySelective(OpActivityUselog record);
	
	int updateByPrimaryKey(OpActivityUselog record);
}