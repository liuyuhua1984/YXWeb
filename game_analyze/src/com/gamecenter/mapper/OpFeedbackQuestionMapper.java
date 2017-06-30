package com.gamecenter.mapper;

import com.gamecenter.model.OpFeedbackQuestion;
import com.gamecenter.model.OpFeedbackQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpFeedbackQuestionMapper {
    long countByExample(OpFeedbackQuestionExample example);

    int deleteByExample(OpFeedbackQuestionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpFeedbackQuestion record);

    int insertSelective(OpFeedbackQuestion record);

    List<OpFeedbackQuestion> selectByExample(OpFeedbackQuestionExample example);

    OpFeedbackQuestion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpFeedbackQuestion record, @Param("example") OpFeedbackQuestionExample example);

    int updateByExample(@Param("record") OpFeedbackQuestion record, @Param("example") OpFeedbackQuestionExample example);

    int updateByPrimaryKeySelective(OpFeedbackQuestion record);

    int updateByPrimaryKey(OpFeedbackQuestion record);
}