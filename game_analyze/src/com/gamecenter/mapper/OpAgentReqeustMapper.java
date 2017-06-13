package com.gamecenter.mapper;

import com.gamecenter.model.OpAgentReqeust;
import com.gamecenter.model.OpAgentReqeustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpAgentReqeustMapper {
    long countByExample(OpAgentReqeustExample example);

    int deleteByExample(OpAgentReqeustExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentReqeust record);

    int insertSelective(OpAgentReqeust record);

    List<OpAgentReqeust> selectByExample(OpAgentReqeustExample example);

    OpAgentReqeust selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentReqeust record, @Param("example") OpAgentReqeustExample example);

    int updateByExample(@Param("record") OpAgentReqeust record, @Param("example") OpAgentReqeustExample example);

    int updateByPrimaryKeySelective(OpAgentReqeust record);

    int updateByPrimaryKey(OpAgentReqeust record);
}