package com.gamecenter.service.gmt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpFeedbackQuestionMapper;
import com.gamecenter.model.OpFeedbackQuestion;
import com.gamecenter.model.OpFeedbackQuestionExample;

/**
 * 发送公告服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
@Service
public class FeedbackQuestingServiceImpl implements FeedbackQuestingService {

	@Resource
	private OpFeedbackQuestionMapper mapper;
	
	@Override
	public void insert(OpFeedbackQuestion t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpFeedbackQuestion t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpFeedbackQuestion findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<OpFeedbackQuestion> getOpFeedbackQuestionList() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(new OpFeedbackQuestionExample());
	}
	
	
	
	
	
}
