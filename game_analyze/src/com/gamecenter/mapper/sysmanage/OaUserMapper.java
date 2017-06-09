package com.gamecenter.sysmanage.mapper;

import com.gamecenter.sysmanage.model.OaUser;
import com.gamecenter.sysmanage.model.OaUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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