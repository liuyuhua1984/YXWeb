package com.gamecenter.mapper;

import com.gamecenter.model.OpAgentRequest;
import com.gamecenter.model.OpAgentRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpAgentRequestMapper {
    long countByExample(OpAgentRequestExample example);

    int deleteByExample(OpAgentRequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentRequest record);

    int insertSelective(OpAgentRequest record);

    List<OpAgentRequest> selectByExample(OpAgentRequestExample example);

    OpAgentRequest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentRequest record, @Param("example") OpAgentRequestExample example);

    int updateByExample(@Param("record") OpAgentRequest record, @Param("example") OpAgentRequestExample example);

    int updateByPrimaryKeySelective(OpAgentRequest record);

    int updateByPrimaryKey(OpAgentRequest record);
}