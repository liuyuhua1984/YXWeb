package com.gamecenter.qqsdk.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OpTxTaskMapper;
import com.gamecenter.model.OpTxTask;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-23 Time: 下午1:36 To change this template use File | Settings | File Templates.
 */
@Repository
public class TaskServiceImpl implements TaskService {
	
	@Resource
	OpTxTaskMapper opTxTaskMapper;
	
	@Override
	public int addInfo(OpTxTask opTxTask) {
		int num = opTxTaskMapper.insertSelective(opTxTask);
		return num;
	}
}
