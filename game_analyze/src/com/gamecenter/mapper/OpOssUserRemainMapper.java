package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssUserRemain;
import com.gamecenter.model.OpOssUserRemainExample;

public interface OpOssUserRemainMapper {
	int countByExample(OpOssUserRemainExample example);
	
	int deleteByExample(OpOssUserRemainExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOssUserRemain record);
	
	int insertSelective(OpOssUserRemain record);
	
	List<OpOssUserRemain> selectByExample(OpOssUserRemainExample example);
	
	OpOssUserRemain selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOssUserRemain record, @Param("example") OpOssUserRemainExample example);
	
	int updateByExample(@Param("record") OpOssUserRemain record, @Param("example") OpOssUserRemainExample example);
	
	int updateByPrimaryKeySelective(OpOssUserRemain record);
	
	int updateByPrimaryKey(OpOssUserRemain record);
	
	/**
	 * 获取留存列表
	 * 
	 * @param msp
	 * @return
	 */
	List<OpOssUserRemain> getList(Map msp);
}