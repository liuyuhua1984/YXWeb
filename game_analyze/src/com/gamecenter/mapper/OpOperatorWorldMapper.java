package com.gamecenter.mapper;

import com.gamecenter.model.OpOperatorWorld;
import com.gamecenter.model.OpOperatorWorldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpOperatorWorldMapper {
	int countByExample(OpOperatorWorldExample example);
	
	int deleteByExample(OpOperatorWorldExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOperatorWorld record);
	
	int insertSelective(OpOperatorWorld record);
	
	List<OpOperatorWorld> selectByExample(OpOperatorWorldExample example);
	
	OpOperatorWorld selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOperatorWorld record, @Param("example") OpOperatorWorldExample example);
	
	int updateByExample(@Param("record") OpOperatorWorld record, @Param("example") OpOperatorWorldExample example);
	
	int updateByPrimaryKeySelective(OpOperatorWorld record);
	
	int updateByPrimaryKey(OpOperatorWorld record);
}