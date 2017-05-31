package com.gamecenter.mapper;

import com.gamecenter.model.TUser;
import com.gamecenter.parBean.Par_tuser;
import com.gamecenter.model.TUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
	int countByExample(TUserExample example);
	
	int deleteByExample(TUserExample example);
	
	int deleteByPrimaryKey(Integer uid);
	
	int insert(TUser record);
	
	int insertSelective(TUser record);
	
	List<TUser> selectByExample(TUserExample example);
	
	TUser selectByPrimaryKey(Integer uid);
	
	int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);
	
	int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);
	
	int updateByPrimaryKeySelective(TUser record);
	
	int updateByPrimaryKey(TUser record);
	
	List<Par_tuser> getUserList();
	
	Par_tuser getUserMsg(String passport);
}