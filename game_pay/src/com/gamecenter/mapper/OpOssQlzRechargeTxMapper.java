package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.model.OpOssQlzRechargeTxExample;

public interface OpOssQlzRechargeTxMapper {
	int countByExample(OpOssQlzRechargeTxExample example);
	
	int deleteByExample(OpOssQlzRechargeTxExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpOssQlzRechargeTx record);
	
	int insertSelective(OpOssQlzRechargeTx record);
	
	List<OpOssQlzRechargeTx> selectByExample(OpOssQlzRechargeTxExample example);
	
	OpOssQlzRechargeTx selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpOssQlzRechargeTx record, @Param("example") OpOssQlzRechargeTxExample example);
	
	int updateByExample(@Param("record") OpOssQlzRechargeTx record, @Param("example") OpOssQlzRechargeTxExample example);
	
	int updateByPrimaryKeySelective(OpOssQlzRechargeTx record);
	
	int updateByPrimaryKey(OpOssQlzRechargeTx record);
	
	// 核对账单
	int payConfirm(Map map);
}