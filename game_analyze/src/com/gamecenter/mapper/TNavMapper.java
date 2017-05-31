package com.gamecenter.mapper;

import com.gamecenter.model.TNav;
import com.gamecenter.model.TNavExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TNavMapper {
	int countByExample(TNavExample example);
	
	int deleteByExample(TNavExample example);
	
	int deleteByPrimaryKey(Integer navid);
	
	int insert(TNav record);
	
	int insertSelective(TNav record);
	
	List<TNav> selectByExample(TNavExample example);
	
	TNav selectByPrimaryKey(Integer navid);
	
	int updateByExampleSelective(@Param("record") TNav record, @Param("example") TNavExample example);
	
	int updateByExample(@Param("record") TNav record, @Param("example") TNavExample example);
	
	int updateByPrimaryKeySelective(TNav record);
	
	int updateByPrimaryKey(TNav record);
	
	List<TNav> getTopNavByUser(String userName);
}