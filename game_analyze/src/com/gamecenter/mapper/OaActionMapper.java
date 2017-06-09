package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OaAction;
import com.gamecenter.model.OaActionExample;

public interface OaActionMapper {
	int countByExample(OaActionExample example);
	
	int deleteByExample(OaActionExample example);
	
	int deleteByPrimaryKey(Integer aid);
	
	int insert(OaAction record);
	
	int insertSelective(OaAction record);
	
	List<OaAction> selectByExample(OaActionExample example);
	
	OaAction selectByPrimaryKey(Integer aid);
	
	int updateByExampleSelective(@Param("record") OaAction record, @Param("example") OaActionExample example);
	
	int updateByExample(@Param("record") OaAction record, @Param("example") OaActionExample example);
	
	int updateByPrimaryKeySelective(OaAction record);
	
	int updateByPrimaryKey(OaAction record);
}