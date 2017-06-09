package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OaUser;
import com.gamecenter.model.OaUserExample;

public interface OaUserMapper {
	int countByExample(OaUserExample example);
	
	int deleteByExample(OaUserExample example);
	
	int deleteByPrimaryKey(Integer uid);
	
	int insert(OaUser record);
	
	int insertSelective(OaUser record);
	
	List<OaUser> selectByExample(OaUserExample example);
	
	OaUser selectByPrimaryKey(Integer uid);
	
	int updateByExampleSelective(@Param("record") OaUser record, @Param("example") OaUserExample example);
	
	int updateByExample(@Param("record") OaUser record, @Param("example") OaUserExample example);
	
	int updateByPrimaryKeySelective(OaUser record);
	
	int updateByPrimaryKey(OaUser record);
}