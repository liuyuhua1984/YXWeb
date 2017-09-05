package com.gamecenter.service.gmt;

import java.util.List;

import com.gamecenter.model.OpFeedbackQuestion;
import com.gamecenter.service.agent.BaseService;

/**
 * 发送公告服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface FeedbackQuestingService extends BaseService<OpFeedbackQuestion> {
	
	
	/**
	 * 获取反馈记录
	 * 
	 * @return
	 */
	public List<OpFeedbackQuestion> getOpFeedbackQuestionList();
	
	
}
