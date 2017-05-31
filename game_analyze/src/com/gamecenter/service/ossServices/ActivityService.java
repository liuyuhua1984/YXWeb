package com.gamecenter.service.ossServices;

import com.gamecenter.common.Page;
import com.gamecenter.controller.webservice.cdk.ParCdkCheck;
import com.gamecenter.controller.webservice.cdk.ParCdkReturn;
import com.gamecenter.model.OpActivity;
import com.gamecenter.model.OpActivityCdk;
import com.gamecenter.model.OpGameGoods;

import java.util.List;

/**
 * 活动服务 Created with IntelliJ IDEA. User: gsb Date: 14-6-5 Time: 下午5:42 To change this template use File | Settings | File Templates.
 */
public interface ActivityService {
	
	/**
	 * 获取活动列表
	 * 
	 * @return
	 */
	public List<OpActivity> getActivityList();
	
	/**
	 * 添加活动
	 * 
	 * @param opActivity
	 * @return
	 */
	public int addActivity(OpActivity opActivity);
	
	/**
	 * 根据活动ID 获取活动信息
	 * 
	 * @param aid
	 * @return
	 */
	public OpActivity getActivity(int aid);
	
	/**
	 * 获取道具列表
	 * 
	 * @return
	 */
	public List<OpGameGoods> getGoodsList();
	
	/**
	 * 卡密生成
	 * 
	 * @param aid
	 * @param num
	 * @param type
	 * @return
	 */
	public int createCdk(int aid, int num, String type);
	
	/**
	 * 卡密列表
	 * 
	 * @param obj
	 * @param number
	 * @param size
	 * @return
	 */
	public Page cdkList(OpActivityCdk obj, int size, int number);
	
	/**
	 * CDK校验
	 * 
	 * @param cdkPar
	 * @return
	 */
	public ParCdkReturn checkCdk(ParCdkCheck cdkPar);
}
