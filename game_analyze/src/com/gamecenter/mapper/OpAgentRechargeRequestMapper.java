package com.gamecenter.mapper;

import com.gamecenter.model.OpAgentRechargeRequest;
import com.gamecenter.model.OpAgentRechargeRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpAgentRechargeRequestMapper {
    long countByExample(OpAgentRechargeRequestExample example);

    int deleteByExample(OpAgentRechargeRequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentRechargeRequest record);

    int insertSelective(OpAgentRechargeRequest record);

    List<OpAgentRechargeRequest> selectByExample(OpAgentRechargeRequestExample example);

    OpAgentRechargeRequest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentRechargeRequest record, @Param("example") OpAgentRechargeRequestExample example);

    int updateByExample(@Param("record") OpAgentRechargeRequest record, @Param("example") OpAgentRechargeRequestExample example);

    int updateByPrimaryKeySelective(OpAgentRechargeRequest record);

    int updateByPrimaryKey(OpAgentRechargeRequest record);
}