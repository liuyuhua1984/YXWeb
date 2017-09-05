package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGameGoods;
import com.gamecenter.model.OpGameGoodsExample;

public interface OpGameGoodsMapper {
	int countByExample(OpGameGoodsExample example);
	
	int deleteByExample(OpGameGoodsExample example);
	
	int deleteByPrimaryKey(Integer gid);
	
	int insert(OpGameGoods record);
	
	int insertSelective(OpGameGoods record);
	
	List<OpGameGoods> selectByExample(OpGameGoodsExample example);
	
	OpGameGoods selectByPrimaryKey(Integer gid);
	
	int updateByExampleSelective(@Param("record") OpGameGoods record, @Param("example") OpGameGoodsExample example);
	
	int updateByExample(@Param("record") OpGameGoods record, @Param("example") OpGameGoodsExample example);
	
	int updateByPrimaryKeySelective(OpGameGoods record);
	
	int updateByPrimaryKey(OpGameGoods record);
}