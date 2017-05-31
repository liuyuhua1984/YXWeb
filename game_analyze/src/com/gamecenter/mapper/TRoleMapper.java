package com.gamecenter.mapper;

import com.gamecenter.model.TRole;
import com.gamecenter.model.TRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
	int countByExample(TRoleExample example);
	
	int deleteByExample(TRoleExample example);
	
	int deleteByPrimaryKey(Integer roleid);
	
	int insert(TRole record);
	
	int insertSelective(TRole record);
	
	List<TRole> selectByExample(TRoleExample example);
	
	TRole selectByPrimaryKey(Integer roleid);
	
	int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);
	
	int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);
	
	int updateByPrimaryKeySelective(TRole record);
	
	int updateByPrimaryKey(TRole record);
}