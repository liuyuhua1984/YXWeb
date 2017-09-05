package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.model.OpAgentConfigExample;

public interface OpAgentConfigMapper {
    long countByExample(OpAgentConfigExample example);

    int deleteByExample(OpAgentConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentConfig record);

    int insertSelective(OpAgentConfig record);

    List<OpAgentConfig> selectByExample(OpAgentConfigExample example);

    OpAgentConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentConfig record, @Param("example") OpAgentConfigExample example);

    int updateByExample(@Param("record") OpAgentConfig record, @Param("example") OpAgentConfigExample example);

    int updateByPrimaryKeySelective(OpAgentConfig record);

    int updateByPrimaryKey(OpAgentConfig record);
}