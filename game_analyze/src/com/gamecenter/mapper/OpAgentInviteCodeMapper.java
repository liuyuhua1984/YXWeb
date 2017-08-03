package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.model.OpAgentInviteCodeExample;

public interface OpAgentInviteCodeMapper {
    long countByExample(OpAgentInviteCodeExample example);

    int deleteByExample(OpAgentInviteCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentInviteCode record);

    int insertSelective(OpAgentInviteCode record);

    List<OpAgentInviteCode> selectByExample(OpAgentInviteCodeExample example);

    OpAgentInviteCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentInviteCode record, @Param("example") OpAgentInviteCodeExample example);

    int updateByExample(@Param("record") OpAgentInviteCode record, @Param("example") OpAgentInviteCodeExample example);

    int updateByPrimaryKeySelective(OpAgentInviteCode record);

    int updateByPrimaryKey(OpAgentInviteCode record);
}