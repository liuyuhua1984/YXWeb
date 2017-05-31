package com.gamecenter.service.task;

import com.gamecenter.common.Tools;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.OnlineNum_request;
import com.gamecenter.common.packets.PassportMsg_request;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.parBean.vo.OnlineDataByDay;
import com.gamecenter.parBean.vo.WorldOnlineData;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataUploadServices.WorldOnlineService;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 区服实时在线人数 Created by IntelliJ IDEA. User: Administrator Date: 13-8-15 Time: 下午3:38 To change this template use File | Settings | File Templates.
 */
public class WorldOnlineNum {
	
	/**
	 * 缓存实时数据 5分钟。 key:worldid
	 */
	public static final ConcurrentHashMap<String, WorldOnlineData> onlineMap = new ConcurrentHashMap<String, WorldOnlineData>();
	
	@Resource
	WorldService worldService;
	@Resource
	private WorldOnlineService worldOnlineService;
	
	/**
	 * 人数获取周期任务
	 */
	public synchronized void work() {
		System.out.println(">>>>>>>>>区服实时在线人数 >>>>>>>>>>>>>>>");
		
		List<OpGameworld> lists = worldService.getWorldList();
		for (OpGameworld wobj : lists) {
			if (wobj.getStatus().equals("1")) { // 正常启用中
			
				// 初始数据缓存
				if (onlineMap.get(wobj.getWorldid()) == null) {
					WorldOnlineData worldOnline = new WorldOnlineData();
					// 数据队列初始化
					worldOnline.onlineData = new ConcurrentLinkedQueue<Integer>(); // 数据队列 size==>60
					while (worldOnline.onlineData.size() < 60) {
						worldOnline.onlineData.add(0);
					}
					
					// 数据提取 -- 初次从数据库提取
					OnlineDataByDay onlineDataByDay = worldOnlineService.selectOnlineDataByDay(Tools.getNowDate("yyyy-MM-dd"), wobj.getWorldid());
					worldOnline.minNum = onlineDataByDay.getMinnum();
					worldOnline.avgNum = onlineDataByDay.getAvgnum();
					worldOnline.maxNum = onlineDataByDay.getMaxnum();
					
					onlineMap.put(wobj.getWorldid(), worldOnline);
				}
				
				// 获取数据
				int num = getPersonNum(wobj);
				if (num >= 0) {
					WorldOnlineData curObj = onlineMap.get(wobj.getWorldid());
					// 数据入缓存
					curObj.onlineData.poll();
					curObj.onlineData.add(num);
					
					// 缓存更新
					if (num > curObj.maxNum) {
						curObj.maxNum = num;
					} else if (num < curObj.minNum) {
						curObj.minNum = num;
					}
					
					// curObj.avgNum = (int) Tools.round((curObj.avgNum * curObj.getNum + num) / (curObj.getNum + 1), 0);
					curObj.getNum++;
					curObj.curNum = num;
					
					// 数据入库
					OpOssQlzOnlinecurLog opOssQlzOnlinecurLog = new OpOssQlzOnlinecurLog();
					opOssQlzOnlinecurLog.setOnlinenum(num);
					opOssQlzOnlinecurLog.setWorldid(wobj.getWorldid());
					opOssQlzOnlinecurLog.setAddtime(Tools.getNowDate());
					worldOnlineService.insert(opOssQlzOnlinecurLog);
					
				} else {
					System.out.println("数据获取异常：" + num + "[游戏区:" + wobj.getWname() + "]");
				}
				
			}
		}
	}
	
	/**
	 * 获取人数
	 * 
	 * @param wobj
	 * @return
	 */
	private int getPersonNum(OpGameworld wobj) {
		int num = -1;
		try {
			OnlineNum_request onlineNum_request = new OnlineNum_request();
			SendReqToGame.getInstance().init(wobj.getIp(), Integer.parseInt(wobj.getServerurl()));
			String res = SendReqToGame.getInstance().sendMessage(onlineNum_request, wobj.getWorldid()).toString();
			num = Integer.parseInt(res);
			if (num < 0) {
				num = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
	
}
