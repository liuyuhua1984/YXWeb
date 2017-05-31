package com.gamecenter.sysmanage.mapper;

import com.gamecenter.sysmanage.model.OaUserPermit;
import com.gamecenter.sysmanage.model.OaUserPermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaUserPermitMapper {
	int countByExample(OaUserPermitExample example);
	
	int deleteByExample(OaUserPermitExample example);
	
	int deleteByPrimaryKey(Integer uid);
	
	int insert(OaUserPermit record);
	
	int insertSelective(OaUserPermit record);
	
	List<OaUserPermit> selectByExample(OaUserPermitExample example);
	
	OaUserPermit selectByPrimaryKey(Integer uid);
	
	int updateByExampleSelective(@Param("record") OaUserPermit record, @Param("example") OaUserPermitExample example);
	
	int updateByExample(@Param("record") OaUserPermit record, @Param("example") OaUserPermitExample example);
	
	int updateByPrimaryKeySelective(OaUserPermit record);
	
	int updateByPrimaryKey(OaUserPermit record);
}