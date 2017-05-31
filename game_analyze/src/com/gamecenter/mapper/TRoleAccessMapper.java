package com.gamecenter.mapper;

import com.gamecenter.model.TRoleAccessExample;
import com.gamecenter.model.TRoleAccessKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TRoleAccessMapper {
	int countByExample(TRoleAccessExample example);
	
	int deleteByExample(TRoleAccessExample example);
	
	int deleteByPrimaryKey(TRoleAccessKey key);
	
	int insert(TRoleAccessKey record);
	
	int insertSelective(TRoleAccessKey record);
	
	List<TRoleAccessKey> selectByExample(TRoleAccessExample example);
	
	int updateByExampleSelective(@Param("record") TRoleAccessKey record, @Param("example") TRoleAccessExample example);
	
	int updateByExample(@Param("record") TRoleAccessKey record, @Param("example") TRoleAccessExample example);
	
	int deleteByRoleId(int rolrId);
	
	int deleteByNodeId(int nodeId);
	
	int deleteByModelNodeId(String model);
}