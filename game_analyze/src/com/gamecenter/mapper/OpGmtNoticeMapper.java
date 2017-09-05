package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGmtNotice;
import com.gamecenter.model.OpGmtNoticeExample;

public interface OpGmtNoticeMapper {
	int countByExample(OpGmtNoticeExample example);
	
	int deleteByExample(OpGmtNoticeExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpGmtNotice record);
	
	int insertSelective(OpGmtNotice record);
	
	List<OpGmtNotice> selectByExample(OpGmtNoticeExample example);
	
	OpGmtNotice selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpGmtNotice record, @Param("example") OpGmtNoticeExample example);
	
	int updateByExample(@Param("record") OpGmtNotice record, @Param("example") OpGmtNoticeExample example);
	
	int updateByPrimaryKeySelective(OpGmtNotice record);
	
	int updateByPrimaryKey(OpGmtNotice record);
	
	List<OpGmtNotice> selectList(OpGmtNoticeExample example);
}