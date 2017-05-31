package com.gamecenter.mapper;

import com.gamecenter.model.OpGmtSendmoneyLog;
import com.gamecenter.model.OpGmtSendmoneyLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpGmtSendmoneyLogMapper {
	int countByExample(OpGmtSendmoneyLogExample example);
	
	int deleteByExample(OpGmtSendmoneyLogExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpGmtSendmoneyLog record);
	
	int insertSelective(OpGmtSendmoneyLog record);
	
	List<OpGmtSendmoneyLog> selectByExample(OpGmtSendmoneyLogExample example);
	
	OpGmtSendmoneyLog selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpGmtSendmoneyLog record, @Param("example") OpGmtSendmoneyLogExample example);
	
	int updateByExample(@Param("record") OpGmtSendmoneyLog record, @Param("example") OpGmtSendmoneyLogExample example);
	
	int updateByPrimaryKeySelective(OpGmtSendmoneyLog record);
	
	int updateByPrimaryKey(OpGmtSendmoneyLog record);
}