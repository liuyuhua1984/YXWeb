package com.gamecenter.service;

import java.util.List;

import com.gamecenter.model.OpGameworld;

/**
 * 游戏区服管理服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface WorldService {
	
	/**
	 * 获取区服列表信息
	 * 
	 * @return
	 */
	public List<OpGameworld> getWorldList();
	
	/**
	 * 获取某应用的区服信息
	 * 
	 * @param appId
	 * @return
	 */
	public List<OpGameworld> getWorldListByAppId(String appId);
	
	public int add(OpGameworld obj);
	
	public int del(String world);
	
	/**
	 * 获取指定wid的区服信息
	 * 
	 * @param wid 内部逻辑ID
	 * @return
	 */
	public OpGameworld getWorldByWid(int wid);
	
	/**
	 * 获取指定worldid的区服信息
	 * 
	 * @param worldid
	 * @return
	 */
	public OpGameworld getWorldByWorldId(String worldid);
	
}
