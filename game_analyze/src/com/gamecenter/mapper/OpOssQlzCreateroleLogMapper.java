package com.gamecenter.mapper;

import com.gamecenter.model.OpOssQlzCreateroleLog;
import com.gamecenter.model.OpOssQlzCreateroleLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpOssQlzCreateroleLogMapper {
    long countByExample(OpOssQlzCreateroleLogExample example);

    int deleteByExample(OpOssQlzCreateroleLogExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(OpOssQlzCreateroleLog record);

    int insertSelective(OpOssQlzCreateroleLog record);

    List<OpOssQlzCreateroleLog> selectByExample(OpOssQlzCreateroleLogExample example);

    OpOssQlzCreateroleLog selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") OpOssQlzCreateroleLog record, @Param("example") OpOssQlzCreateroleLogExample example);

    int updateByExample(@Param("record") OpOssQlzCreateroleLog record, @Param("example") OpOssQlzCreateroleLogExample example);

    int updateByPrimaryKeySelective(OpOssQlzCreateroleLog record);

    int updateByPrimaryKey(OpOssQlzCreateroleLog record);
}