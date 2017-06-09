package com.gamecenter.service.task;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.service.RunLog;
import com.gamecenter.service.dataup.DataUpHandleService;

/**
 * 上报数据处理 -- 账号数据缓存
 */
public class DataUpHandle {
	@Resource
	DataUpHandleService dataUpHandleService;
	
	/**
	 * 账号缓存队列 key openid
	 */
	public static final ConcurrentHashMap<String, OpOssQlzPassport> passports = new ConcurrentHashMap<String, OpOssQlzPassport>();
	
	/**
	 * 任务入口，3秒
	 */
	public synchronized void work() {
		
	}
	
	/**
	 * 数据缓存初始化
	 */
	public void init() {
		List<OpOssQlzPassport> lists = dataUpHandleService.getActivePassportList();
		for (OpOssQlzPassport obj : lists) {
			passports.put(obj.getOpenid(), obj);
		}
		RunLog.tasklog.info("DataUpHandle>缓存账号数据(" + passports.size() + ")条");
	}
}
