package com.gamecenter.sysmanage.mapper;

import com.gamecenter.sysmanage.model.OaAction;
import com.gamecenter.sysmanage.model.OaPermit;
import com.gamecenter.sysmanage.model.OaPermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaPermitMapper {
	int countByExample(OaPermitExample example);
	
	int deleteByExample(OaPermitExample example);
	
	int deleteByPrimaryKey(Integer permitid);
	
	int insert(OaPermit record);
	
	int insertSelective(OaPermit record);
	
	List<OaPermit> selectByExample(OaPermitExample example);
	
	OaPermit selectByPrimaryKey(Integer permitid);
	
	int updateByExampleSelective(@Param("record") OaPermit record, @Param("example") OaPermitExample example);
	
	int updateByExample(@Param("record") OaPermit record, @Param("example") OaPermitExample example);
	
	int updateByPrimaryKeySelective(OaPermit record);
	
	int updateByPrimaryKey(OaPermit record);
	
	// 获取模块对应的功能列表
	List<OaAction> getActionListByMid(int mid);
}