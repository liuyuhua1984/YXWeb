package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentListExample;

public interface OpAgentListMapper {
    long countByExample(OpAgentListExample example);

    int deleteByExample(OpAgentListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentList record);

    int insertSelective(OpAgentList record);

    List<OpAgentList> selectByExample(OpAgentListExample example);

    OpAgentList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentList record, @Param("example") OpAgentListExample example);

    int updateByExample(@Param("record") OpAgentList record, @Param("example") OpAgentListExample example);

    int updateByPrimaryKeySelective(OpAgentList record);

    int updateByPrimaryKey(OpAgentList record);
}