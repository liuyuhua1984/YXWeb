package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzRechargeLog;
import com.gamecenter.model.OpOssQlzRechargeLogExample;

public interface OpOssQlzRechargeLogMapper {
    long countByExample(OpOssQlzRechargeLogExample example);

    int deleteByExample(OpOssQlzRechargeLogExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(OpOssQlzRechargeLog record);

    int insertSelective(OpOssQlzRechargeLog record);

    List<OpOssQlzRechargeLog> selectByExample(OpOssQlzRechargeLogExample example);

    OpOssQlzRechargeLog selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") OpOssQlzRechargeLog record, @Param("example") OpOssQlzRechargeLogExample example);

    int updateByExample(@Param("record") OpOssQlzRechargeLog record, @Param("example") OpOssQlzRechargeLogExample example);

    int updateByPrimaryKeySelective(OpOssQlzRechargeLog record);

    int updateByPrimaryKey(OpOssQlzRechargeLog record);
}