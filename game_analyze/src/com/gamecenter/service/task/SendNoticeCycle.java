package com.gamecenter.service.task;

import com.gamecenter.common.Tools;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.OnlineNum_request;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.parBean.vo.OnlineDataByDay;
import com.gamecenter.parBean.vo.WorldOnlineData;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataUploadServices.WorldOnlineService;
import com.gamecenter.service.gmtServices.GmtNoticeService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 发送循环的公告 Created by IntelliJ IDEA. User: Administrator Date: 13-8-15 Time: 下午3:38 To change this template use File | Settings | File Templates.
 */
public class SendNoticeCycle {
	
	/**
	 * 循环公告列表
	 */
	public static final ConcurrentHashMap<Integer, OpGmtNoticeCycle> cycleNotices = new ConcurrentHashMap<Integer, OpGmtNoticeCycle>();
	
	@Resource
	GmtNoticeService gmtNoticeService;
	
	/**
	 * 发送循环公告 周期10
	 */
	public synchronized void work() {
		System.out.println(">>>>>>>>>发送循环公告 >>>>>>>>>>>>>>>cycleNotices size:" + cycleNotices.size());
		
		if (cycleNotices.size() > 0) {
			for (Map.Entry<Integer, OpGmtNoticeCycle> entry : cycleNotices.entrySet()) {
				
				OpGmtNoticeCycle obj = entry.getValue();
				
				if (System.currentTimeMillis() - obj.getLastsendtime() > obj.getCycletime() * 60 * 1000) {
					System.out.println("发起循环公告:" + obj.getDid());
					// 立即发送
					gmtNoticeService.sendNotic(obj);
					// 设置发送时间
					obj.setLastsendtime(System.currentTimeMillis());
					obj.setOpttime(Tools.getNowDate());
					
				}
			}
		}
	}
	
	/**
	 * 数据初始化 装载公告
	 */
	public void initData() {
		List<OpGmtNoticeCycle> opGmtNoticeCycles = gmtNoticeService.getCycleNoticeList("1");
		
		for (OpGmtNoticeCycle obj : opGmtNoticeCycles) {
			System.out.println("装载循环公告:" + obj.getDid());
			cycleNotices.put(obj.getDid(), obj);
		}
	}
	
}
