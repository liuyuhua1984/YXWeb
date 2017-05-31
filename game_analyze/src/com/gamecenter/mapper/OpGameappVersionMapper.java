package com.gamecenter.mapper;

import com.gamecenter.model.OpGameappVersion;
import com.gamecenter.model.OpGameappVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpGameappVersionMapper {
	int countByExample(OpGameappVersionExample example);
	
	int deleteByExample(OpGameappVersionExample example);
	
	int deleteByPrimaryKey(String id);
	
	int insert(OpGameappVersion record);
	
	int insertSelective(OpGameappVersion record);
	
	List<OpGameappVersion> selectByExample(OpGameappVersionExample example);
	
	OpGameappVersion selectByPrimaryKey(String id);
	
	int updateByExampleSelective(@Param("record") OpGameappVersion record, @Param("example") OpGameappVersionExample example);
	
	int updateByExample(@Param("record") OpGameappVersion record, @Param("example") OpGameappVersionExample example);
	
	int updateByPrimaryKeySelective(OpGameappVersion record);
	
	int updateByPrimaryKey(OpGameappVersion record);
}