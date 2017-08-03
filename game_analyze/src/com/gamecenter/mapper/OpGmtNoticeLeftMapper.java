package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGmtNoticeLeft;
import com.gamecenter.model.OpGmtNoticeLeftExample;

public interface OpGmtNoticeLeftMapper {
    long countByExample(OpGmtNoticeLeftExample example);

    int deleteByExample(OpGmtNoticeLeftExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpGmtNoticeLeft record);

    int insertSelective(OpGmtNoticeLeft record);

    List<OpGmtNoticeLeft> selectByExample(OpGmtNoticeLeftExample example);

    OpGmtNoticeLeft selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpGmtNoticeLeft record, @Param("example") OpGmtNoticeLeftExample example);

    int updateByExample(@Param("record") OpGmtNoticeLeft record, @Param("example") OpGmtNoticeLeftExample example);

    int updateByPrimaryKeySelective(OpGmtNoticeLeft record);

    int updateByPrimaryKey(OpGmtNoticeLeft record);
}