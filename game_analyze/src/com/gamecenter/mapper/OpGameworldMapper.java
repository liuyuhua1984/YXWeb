package com.gamecenter.mapper;

import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGameworldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpGameworldMapper {
	int countByExample(OpGameworldExample example);
	
	int deleteByExample(OpGameworldExample example);
	
	int deleteByPrimaryKey(Integer wid);
	
	int insert(OpGameworld record);
	
	int insertSelective(OpGameworld record);
	
	List<OpGameworld> selectByExample(OpGameworldExample example);
	
	OpGameworld selectByPrimaryKey(Integer wid);
	
	int updateByExampleSelective(@Param("record") OpGameworld record, @Param("example") OpGameworldExample example);
	
	int updateByExample(@Param("record") OpGameworld record, @Param("example") OpGameworldExample example);
	
	int updateByPrimaryKeySelective(OpGameworld record);
	
	int updateByPrimaryKey(OpGameworld record);
	
	// 扩展运营商信息
	List<OpGameworld> getList(OpGameworldExample example);
	
	OpGameworld getOneByKey(Integer wid);
}