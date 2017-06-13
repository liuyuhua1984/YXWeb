package com.gamecenter.mapper;

import com.gamecenter.model.OpAgentPlayerRecharge;
import com.gamecenter.model.OpAgentPlayerRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpAgentPlayerRechargeMapper {
    long countByExample(OpAgentPlayerRechargeExample example);

    int deleteByExample(OpAgentPlayerRechargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpAgentPlayerRecharge record);

    int insertSelective(OpAgentPlayerRecharge record);

    List<OpAgentPlayerRecharge> selectByExample(OpAgentPlayerRechargeExample example);

    OpAgentPlayerRecharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpAgentPlayerRecharge record, @Param("example") OpAgentPlayerRechargeExample example);

    int updateByExample(@Param("record") OpAgentPlayerRecharge record, @Param("example") OpAgentPlayerRechargeExample example);

    int updateByPrimaryKeySelective(OpAgentPlayerRecharge record);

    int updateByPrimaryKey(OpAgentPlayerRecharge record);
}