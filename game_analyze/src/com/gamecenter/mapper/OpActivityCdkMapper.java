package com.gamecenter.mapper;

import com.gamecenter.model.OpActivityCdk;
import com.gamecenter.model.OpActivityCdkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpActivityCdkMapper {
	int countByExample(OpActivityCdkExample example);
	
	int deleteByExample(OpActivityCdkExample example);
	
	int deleteByPrimaryKey(String cdkcode);
	
	int insert(OpActivityCdk record);
	
	int insertSelective(OpActivityCdk record);
	
	List<OpActivityCdk> selectByExample(OpActivityCdkExample example);
	
	OpActivityCdk selectByPrimaryKey(String cdkcode);
	
	int updateByExampleSelective(@Param("record") OpActivityCdk record, @Param("example") OpActivityCdkExample example);
	
	int updateByExample(@Param("record") OpActivityCdk record, @Param("example") OpActivityCdkExample example);
	
	int updateByPrimaryKeySelective(OpActivityCdk record);
	
	int updateByPrimaryKey(OpActivityCdk record);
	
	/**
	 * 分页请求
	 * 
	 * @param example
	 * @return
	 */
	List<OpActivityCdk> getPageList(OpActivityCdkExample example);
}