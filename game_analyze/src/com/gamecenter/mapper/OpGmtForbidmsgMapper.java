package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGmtForbidmsg;
import com.gamecenter.model.OpGmtForbidmsgExample;

public interface OpGmtForbidmsgMapper {
	int countByExample(OpGmtForbidmsgExample example);
	
	int deleteByExample(OpGmtForbidmsgExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpGmtForbidmsg record);
	
	int insertSelective(OpGmtForbidmsg record);
	
	List<OpGmtForbidmsg> selectByExample(OpGmtForbidmsgExample example);
	
	OpGmtForbidmsg selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpGmtForbidmsg record, @Param("example") OpGmtForbidmsgExample example);
	
	int updateByExample(@Param("record") OpGmtForbidmsg record, @Param("example") OpGmtForbidmsgExample example);
	
	int updateByPrimaryKeySelective(OpGmtForbidmsg record);
	
	int updateByPrimaryKey(OpGmtForbidmsg record);
	
	List<OpGmtForbidmsg> selectList(OpGmtForbidmsgExample example);
}