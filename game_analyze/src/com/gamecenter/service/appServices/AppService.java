package com.gamecenter.service.appServices;

import java.util.List;

import com.gamecenter.model.OpGameapp;

/**
 * 应用APP管理服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface AppService {
	
	/**
	 * 获取游戏列表
	 * 
	 * @return
	 */
	public List<OpGameapp> getAppList();
	
	public int add(OpGameapp obj);
	
	public int update(OpGameapp obj);
	
	/**
	 * 删除根据id
	 * 
	 * @param appid
	 * @return
	 */
	public int del(String appid);
	
	/**
	 * 根据ID获取应用对象
	 * 
	 * @param appid
	 * @return
	 */
	public OpGameapp getByAppId(String appid);
	
}
