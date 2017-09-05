package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGmtSendmoney;
import com.gamecenter.model.OpGmtSendmoneyExample;

public interface OpGmtSendmoneyMapper {
	int countByExample(OpGmtSendmoneyExample example);
	
	int deleteByExample(OpGmtSendmoneyExample example);
	
	int deleteByPrimaryKey(Integer applyid);
	
	int insert(OpGmtSendmoney record);
	
	int insertSelective(OpGmtSendmoney record);
	
	List<OpGmtSendmoney> selectByExample(OpGmtSendmoneyExample example);
	
	OpGmtSendmoney selectByPrimaryKey(Integer applyid);
	
	int updateByExampleSelective(@Param("record") OpGmtSendmoney record, @Param("example") OpGmtSendmoneyExample example);
	
	int updateByExample(@Param("record") OpGmtSendmoney record, @Param("example") OpGmtSendmoneyExample example);
	
	int updateByPrimaryKeySelective(OpGmtSendmoney record);
	
	int updateByPrimaryKey(OpGmtSendmoney record);
}