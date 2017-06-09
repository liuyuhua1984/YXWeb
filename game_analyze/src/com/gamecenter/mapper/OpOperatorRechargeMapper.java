package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOperatorRecharge;
import com.gamecenter.model.OpOperatorRechargeExample;

public interface OpOperatorRechargeMapper {
    long countByExample(OpOperatorRechargeExample example);

    int deleteByExample(OpOperatorRechargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpOperatorRecharge record);

    int insertSelective(OpOperatorRecharge record);

    List<OpOperatorRecharge> selectByExample(OpOperatorRechargeExample example);

    OpOperatorRecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpOperatorRecharge record, @Param("example") OpOperatorRechargeExample example);

    int updateByExample(@Param("record") OpOperatorRecharge record, @Param("example") OpOperatorRechargeExample example);

    int updateByPrimaryKeySelective(OpOperatorRecharge record);

    int updateByPrimaryKey(OpOperatorRecharge record);
}