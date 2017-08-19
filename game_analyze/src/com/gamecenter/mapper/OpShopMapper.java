package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpShop;
import com.gamecenter.model.OpShopExample;

public interface OpShopMapper {
    long countByExample(OpShopExample example);

    int deleteByExample(OpShopExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpShop record);

    int insertSelective(OpShop record);

    List<OpShop> selectByExample(OpShopExample example);

    OpShop selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpShop record, @Param("example") OpShopExample example);

    int updateByExample(@Param("record") OpShop record, @Param("example") OpShopExample example);

    int updateByPrimaryKeySelective(OpShop record);

    int updateByPrimaryKey(OpShop record);
}