package com.gamecenter.mapper;

import java.util.List;

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
	
	
	/**
	 * 获取的分页列表数据
	 * 
	 * @param example
	 * @return
	 */
	List<OpOssQlzRechargeTx> getPageList(OpOssQlzRechargeTxExample example);
	
	/**
	 * 累计充值
	 * 
	 * @param example
	 * @return
	 */
	double getPayCount(OpOssQlzRechargeTxExample example);
}