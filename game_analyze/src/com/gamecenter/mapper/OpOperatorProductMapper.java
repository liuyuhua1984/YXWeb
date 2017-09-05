package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOperator;
import com.gamecenter.model.OpOperatorProduct;
import com.gamecenter.model.OpOperatorProductExample;
import com.gamecenter.parBean.vo.Par_OperatorMsg;

public interface OpOperatorProductMapper {
	int countByExample(OpOperatorProductExample example);
	
	int deleteByExample(OpOperatorProductExample example);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(OpOperatorProduct record);
	
	int insertSelective(OpOperatorProduct record);
	
	List<OpOperatorProduct> selectByExample(OpOperatorProductExample example);
	
	OpOperatorProduct selectByPrimaryKey(Integer id);
	
	int updateByExampleSelective(@Param("record") OpOperatorProduct record, @Param("example") OpOperatorProductExample example);
	
	int updateByExample(@Param("record") OpOperatorProduct record, @Param("example") OpOperatorProductExample example);
	
	int updateByPrimaryKeySelective(OpOperatorProduct record);
	
	int updateByPrimaryKey(OpOperatorProduct record);
	
	// 获取运营商产品列表信息，及扩展信息
	List<OpOperatorProduct> selectList(OpOperatorProductExample example);
	
	// 获取产品对于的运营商列表
	List<OpOperator> selectOperatorListByAppId(String appid);
	
	// 获取运营商对于产品的配置信息
	Par_OperatorMsg getOpObj(Map map);
	
}