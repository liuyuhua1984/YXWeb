package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzCompars;
import com.gamecenter.model.OpOssQlzComparsExample;

public interface OpOssQlzComparsMapper {
    long countByExample(OpOssQlzComparsExample example);

    int deleteByExample(OpOssQlzComparsExample example);

    int deleteByPrimaryKey(String openid);

    int insert(OpOssQlzCompars record);

    int insertSelective(OpOssQlzCompars record);

    List<OpOssQlzCompars> selectByExample(OpOssQlzComparsExample example);

    OpOssQlzCompars selectByPrimaryKey(String openid);

    int updateByExampleSelective(@Param("record") OpOssQlzCompars record, @Param("example") OpOssQlzComparsExample example);

    int updateByExample(@Param("record") OpOssQlzCompars record, @Param("example") OpOssQlzComparsExample example);

    int updateByPrimaryKeySelective(OpOssQlzCompars record);

    int updateByPrimaryKey(OpOssQlzCompars record);
}