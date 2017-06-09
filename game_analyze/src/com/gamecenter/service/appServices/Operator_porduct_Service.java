package com.gamecenter.service.appServices;

import java.util.List;

import com.gamecenter.model.OpOperator;
import com.gamecenter.model.OpOperatorProduct;
import com.gamecenter.parBean.vo.Par_OperatorMsg;

/**
 * 应用APP管理服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface Operator_porduct_Service {
	
	public List<OpOperatorProduct> getList();
	
	public int add(OpOperatorProduct obj);
	
	public int update(OpOperatorProduct obj);
	
	public int del(String ids);
	
	public OpOperatorProduct getObj(int id);
	
	/**
	 * 根据appid获取运营商列表
	 * 
	 * @param appid
	 * @return
	 */
	public List<OpOperator> getOperatorListByAppId(String appid);
	
	/**
	 * 获取的对应运营商改产品的配置信息
	 * 
	 * @param appid
	 * @param worldid
	 * @return
	 */
	public Par_OperatorMsg getOpObj(String appid, String worldid);
}
