package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.model.OpOssQlzOnlinecurLogExample;
import com.gamecenter.parBean.vo.OnlineDataByDay;
import com.gamecenter.parBean.vo.OnlineDataByHour;

public interface OpOssQlzOnlinecurLogMapper {
    long countByExample(OpOssQlzOnlinecurLogExample example);
	
	int deleteByExample(OpOssQlzOnlinecurLogExample example);
	
	int deleteByPrimaryKey(Integer did);
	
	int insert(OpOssQlzOnlinecurLog record);
	
	int insertSelective(OpOssQlzOnlinecurLog record);
	
	List<OpOssQlzOnlinecurLog> selectByExample(OpOssQlzOnlinecurLogExample example);
	
	OpOssQlzOnlinecurLog selectByPrimaryKey(Integer did);
	
	int updateByExampleSelective(@Param("record") OpOssQlzOnlinecurLog record, @Param("example") OpOssQlzOnlinecurLogExample example);
	
	int updateByExample(@Param("record") OpOssQlzOnlinecurLog record, @Param("example") OpOssQlzOnlinecurLogExample example);
	
	int updateByPrimaryKeySelective(OpOssQlzOnlinecurLog record);
	
	int updateByPrimaryKey(OpOssQlzOnlinecurLog record);
	

	OnlineDataByDay selectOnlineDataByDay(Map map);
	
	/**
	 * 按小时汇总每日数据
	 * 
	 * @param map
	 * @return
	 */
	List<OnlineDataByHour> selectOnlineDataByHour(Map map);
}