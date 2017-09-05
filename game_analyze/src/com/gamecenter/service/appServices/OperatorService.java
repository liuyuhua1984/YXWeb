package com.gamecenter.service.appServices;

import java.util.List;

import com.gamecenter.model.OpOperator;

/**
 * 应用APP管理服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface OperatorService {
	
	public List<OpOperator> getList();
	
	public int add(OpOperator obj);
	
	public int update(OpOperator obj);
	
	public int del(String ids);
	
	public OpOperator getObj(int id);
	
}
