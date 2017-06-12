package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzLoginLog;
import com.gamecenter.model.OpOssQlzLoginLogExample;

public interface OpOssQlzLoginLogMapper {
    long countByExample(OpOssQlzLoginLogExample example);

    int deleteByExample(OpOssQlzLoginLogExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(OpOssQlzLoginLog record);

    int insertSelective(OpOssQlzLoginLog record);

    List<OpOssQlzLoginLog> selectByExample(OpOssQlzLoginLogExample example);

    OpOssQlzLoginLog selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") OpOssQlzLoginLog record, @Param("example") OpOssQlzLoginLogExample example);

    int updateByExample(@Param("record") OpOssQlzLoginLog record, @Param("example") OpOssQlzLoginLogExample example);

    int updateByPrimaryKeySelective(OpOssQlzLoginLog record);

    int updateByPrimaryKey(OpOssQlzLoginLog record);
}