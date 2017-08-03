package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpAgentRechargeExample;

public interface OpAgentRechargeMapper {
    long countByExample(OpAgentRechargeExample example);

    int deleteByExample(OpAgentRechargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentRecharge record);

    int insertSelective(OpAgentRecharge record);

    List<OpAgentRecharge> selectByExample(OpAgentRechargeExample example);

    OpAgentRecharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentRecharge record, @Param("example") OpAgentRechargeExample example);

    int updateByExample(@Param("record") OpAgentRecharge record, @Param("example") OpAgentRechargeExample example);

    int updateByPrimaryKeySelective(OpAgentRecharge record);

    int updateByPrimaryKey(OpAgentRecharge record);
}