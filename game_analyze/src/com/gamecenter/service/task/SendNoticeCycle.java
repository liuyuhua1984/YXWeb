package com.gamecenter.service.task;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import com.gamecenter.common.Tools;
import com.gamecenter.mapper.OpGmtNoticeCycleMapper;
import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.service.gmt.GmtNoticeService;

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
	@Resource
	OpGmtNoticeCycleMapper opGmtNoticeCycleMapper;
	
	/**
	 * 发送循环公告 周期10
	 */
	public synchronized void work() {
		//System.out.println(">>>>>>>>>发送循环公告 >>>>>>>>>>>>>>>cycleNotices size:" + cycleNotices.size());
		
		if (cycleNotices.size() > 0) {
			for (Map.Entry<Integer, OpGmtNoticeCycle> entry : cycleNotices.entrySet()) {
				
				OpGmtNoticeCycle obj = entry.getValue();
				if (obj.getStatus().equals("1")) {
					if (obj.getLastsendtime() - System.currentTimeMillis() > 0) {
						System.out.println("发起循环公告:" + obj.getDid());
						// 设置发送时间
						//obj.setLastsendtime(System.currentTimeMillis());
						obj.setOpttime(Tools.getNowDate());
						// OpGmtNoticeCycleExample opGmtNoticeCycleExample = new OpGmtNoticeCycleExample();
						// OpGmtNoticeCycleExample.Criteria criteria = opGmtNoticeCycleExample.createCriteria();
						opGmtNoticeCycleMapper.updateByPrimaryKey(obj);
						// 立即发送
						try{
							gmtNoticeService.sendNotic(obj,false);
						}catch(Exception e){
							e.printStackTrace();
						}
					} else {
						gmtNoticeService.stopCycleNotic("" + obj.getDid());
					}
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
