package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzOutLog;
import com.gamecenter.model.OpOssQlzOutLogExample;

public interface OpOssQlzOutLogMapper {
    long countByExample(OpOssQlzOutLogExample example);

    int deleteByExample(OpOssQlzOutLogExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(OpOssQlzOutLog record);

    int insertSelective(OpOssQlzOutLog record);

    List<OpOssQlzOutLog> selectByExample(OpOssQlzOutLogExample example);

    OpOssQlzOutLog selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") OpOssQlzOutLog record, @Param("example") OpOssQlzOutLogExample example);

    int updateByExample(@Param("record") OpOssQlzOutLog record, @Param("example") OpOssQlzOutLogExample example);

    int updateByPrimaryKeySelective(OpOssQlzOutLog record);

    int updateByPrimaryKey(OpOssQlzOutLog record);
}