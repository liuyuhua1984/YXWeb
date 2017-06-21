package com.gamecenter.mapper;

import com.gamecenter.model.OpAgentRechargeFetch;
import com.gamecenter.model.OpAgentRechargeFetchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpAgentRechargeFetchMapper {
    long countByExample(OpAgentRechargeFetchExample example);

    int deleteByExample(OpAgentRechargeFetchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentRechargeFetch record);

    int insertSelective(OpAgentRechargeFetch record);

    List<OpAgentRechargeFetch> selectByExampleWithBLOBs(OpAgentRechargeFetchExample example);

    List<OpAgentRechargeFetch> selectByExample(OpAgentRechargeFetchExample example);

    OpAgentRechargeFetch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentRechargeFetch record, @Param("example") OpAgentRechargeFetchExample example);

    int updateByExampleWithBLOBs(@Param("record") OpAgentRechargeFetch record, @Param("example") OpAgentRechargeFetchExample example);

    int updateByExample(@Param("record") OpAgentRechargeFetch record, @Param("example") OpAgentRechargeFetchExample example);

    int updateByPrimaryKeySelective(OpAgentRechargeFetch record);

    int updateByPrimaryKeyWithBLOBs(OpAgentRechargeFetch record);

    int updateByPrimaryKey(OpAgentRechargeFetch record);
}