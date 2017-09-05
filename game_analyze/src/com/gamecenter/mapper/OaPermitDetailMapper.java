package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OaPermitDetail;
import com.gamecenter.model.OaPermitDetailExample;

public interface OaPermitDetailMapper {
	int countByExample(OaPermitDetailExample example);
	
	int deleteByExample(OaPermitDetailExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OaPermitDetail record);
	
	int insertSelective(OaPermitDetail record);
	
	List<OaPermitDetail> selectByExample(OaPermitDetailExample example);
	
	OaPermitDetail selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OaPermitDetail record, @Param("example") OaPermitDetailExample example);
	
	int updateByExample(@Param("record") OaPermitDetail record, @Param("example") OaPermitDetailExample example);
	
	int updateByPrimaryKeySelective(OaPermitDetail record);
	
	int updateByPrimaryKey(OaPermitDetail record);
}