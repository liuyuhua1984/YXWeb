package com.gamecenter.service.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssUserRemain;
import com.gamecenter.service.RunLog;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.AnalyzeDataService;
import com.gamecenter.service.ossServices.UserRemainService;

/**
 * 数据分析 -- 任务 Created by IntelliJ IDEA. User: Administrator Date: 13-8-15 Time: 下午3:38 To change this template use File | Settings | File Templates.
 */
public class DataAnalyze {
	
	@Resource
	AnalyzeDataService analyzeDataService;
	@Resource
	UserRemainService userRemainService;
	@Resource
	WorldService worldService;
	
	public synchronized void work() {
		
		RunLog.tasklog.info(">>>>>>>>>DataAnalyze数据分析开始>>>>>>>>>>>>>");
		long beginTime = System.currentTimeMillis();
		
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		
		onlineNum(targetTime, 0);
		user(targetTime, 0);
		pay(targetTime, 0);
		consume(targetTime, 0);
		userRemain(targetTime, 0);
		
		RunLog.tasklog.info(">>>>分析完毕总耗时：" + (System.currentTimeMillis() - beginTime) + "ms");
	}
	
	/**
	 * 在线人数分析
	 * 
	 * @param date
	 */
	public String onlineNum(String date, int type) {
		String res = "在线人数分析:[" + date + "][" + (type == 1 ? "重新" : "首次") + "];";
		long beginTime = System.currentTimeMillis();
		try {
			int num = 0;
			if (type == 1) {
				num = analyzeDataService.clearOnlineNum(date);
				res += "清除数据(" + num + ")条;";
			}
			num = analyzeDataService.onlineNum(date);
			res += "产生数据(" + num + ")条;耗时：" + (System.currentTimeMillis() - beginTime) + "ms";
		} catch (Exception e) {
			e.printStackTrace();
			res += "异常了[" + e.toString() + "];";
			RunLog.tasklog.info("", e);
		}
		RunLog.tasklog.info(res);
		return res;
	}
	
	/**
	 * 用户在线分析
	 * 
	 * @param date
	 * @param type
	 */
	public String user(String date, int type) {
		String res = "玩家日报分析:[" + date + "][" + (type == 1 ? "重新" : "首次") + "];";
		try {
			long beginTime = System.currentTimeMillis();
			int num = 0;
			if (type == 1) {
				num = analyzeDataService.clearUserDayReport(date);
				res += "清除数据(" + num + ")条;";
			}
			num = analyzeDataService.userDayReport(date);
			res += "产生数据(" + num + ")条;耗时：" + (System.currentTimeMillis() - beginTime) + "ms";
		} catch (Exception e) {
			e.printStackTrace();
			res += "异常了[" + e.toString() + "];";
			RunLog.tasklog.info("", e);
		}
		RunLog.tasklog.info(res);
		
		return res;
	}
	
	/**
	 * 充值营收分析
	 * 
	 * @param date
	 * @param type
	 */
	public String pay(String date, int type) {
		String res = "充值日报分析:[" + date + "][" + (type == 1 ? "重新" : "首次") + "];";
		
		try {
			long beginTime = System.currentTimeMillis();
			int num = 0;
			if (type == 1) {
				num = analyzeDataService.clearPayDayReport(date);
				res += "清除数据(" + num + ")条;";
			}
			num = analyzeDataService.payDayReport(date);
			res += "产生数据(" + num + ")条;耗时：" + (System.currentTimeMillis() - beginTime) + "ms";
			
		} catch (Exception e) {
			e.printStackTrace();
			res += "异常了[" + e.toString() + "];";
			RunLog.tasklog.info("", e);
		}
		RunLog.tasklog.info(res);
		
		return res;
	}
	
	/**
	 * 消费分析
	 * 
	 * @param date
	 * @param type
	 */
	public String consume(String date, int type) {
		String res = "消费日报分析:[" + date + "][" + (type == 1 ? "重新" : "首次") + "];";
		
		try {
			long beginTime = System.currentTimeMillis();
			int num = 0;
			if (type == 1) {
				num = analyzeDataService.clearconsumeDayReport(date);
				res += "清除数据(" + num + ")条;";
				
			}
			num = analyzeDataService.consumeDayReport(date);
			res += "产生数据(" + num + ")条;耗时：" + (System.currentTimeMillis() - beginTime) + "ms";
			
		} catch (Exception e) {
			e.printStackTrace();
			res += "异常了[" + e.toString() + "];";
			RunLog.tasklog.info("", e);
		}
		RunLog.tasklog.info(res);
		
		return res;
	}
	
	/**
	 * 用户留存分析
	 * 
	 * @param targetTime 分析时间
	 * @param type
	 * @return
	 */
	public String userRemain(String targetTime, int type) {
		
		if (Tools.timechaDay(Tools.getNowDate("yyyy-MM-dd"), targetTime) >= 0) {
			return "targetTime非法时间";
		}
		
		String res = "用户留存分析分析:[" + targetTime + "][" + (type == 1 ? "重新" : "首次") + "];";
		
		long beginTime = System.currentTimeMillis();
		
		// 获取正常的区服
		List<OpGameworld> opGameworlds = worldService.getWorldList("1");
		
		for (OpGameworld gameworld : opGameworlds) {
			// 核对
			int chaday = Tools.timechaDay(Tools.getAsstring(gameworld.getOpentime(), 10), targetTime);
			if (chaday <= 0)
				continue;
			
			// 加目标日期
			OpOssUserRemain opOssUserRemain = new OpOssUserRemain();
			opOssUserRemain.setAppid(gameworld.getAppid());
			opOssUserRemain.setWorldid(gameworld.getWorldid());
			opOssUserRemain.setGoaltime(Tools.getDate(targetTime, 1, -1, "yyyy-MM-dd"));
			userRemainService.insert(opOssUserRemain);
			
			int num = userRemainService.checknum(gameworld.getWorldid());
			int act = 0;
			if (chaday > num) { // 存在遗漏
				// 核对目标日期
				for (int i = 0; i < chaday; i++) {
					String goaltime = Tools.getDate(gameworld.getOpentime(), 1, i, "yyyy-MM-dd");
					opOssUserRemain = new OpOssUserRemain();
					opOssUserRemain.setAppid(gameworld.getAppid());
					opOssUserRemain.setWorldid(gameworld.getWorldid());
					opOssUserRemain.setGoaltime(goaltime);
					userRemainService.insert(opOssUserRemain);
				}
				act = 1;
			}
			
			// 计算目标日期的留存
			try {
				String mintime = Tools.getDate(targetTime, 1, -29, "yyyy-MM-dd");
				List<OpOssUserRemain> opOssUserRemains = userRemainService.getUserRemainList(gameworld.getWorldid(), mintime, targetTime);
				int chaDay = 0;
				double lc = 0;
				for (OpOssUserRemain remain : opOssUserRemains) {
					try {
						chaDay = Tools.timechaDay(remain.getGoaltime(), targetTime);
						
						if (act == 1) { // 全部校验分析
							if (chaDay >= 29) {
								lc(remain, 1);
								lc(remain, 2);
								lc(remain, 3);
								lc(remain, 4);
							} else if (chaDay >= 6) {
								lc(remain, 1);
								lc(remain, 2);
								lc(remain, 3);
							} else if (chaDay >= 2) {
								lc(remain, 1);
								lc(remain, 2);
							} else if (chaDay == 1) {
								lc(remain, 1);
							}
						} else {
							if (chaDay == 1) { // 次日
								lc(remain, targetTime, 1);
							} else if (chaDay == 2) {
								lc(remain, targetTime, 2);
							} else if (chaDay == 6) {
								lc(remain, targetTime, 3);
							} else if (chaDay == 29) {
								lc(remain, targetTime, 4);
							}
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		RunLog.tasklog.info("用户留存分析耗时：" + (System.currentTimeMillis() - beginTime) + "ms");
		return res;
	}
	
	private void lc(OpOssUserRemain remain, int type) {
		String time = "";
		if (type == 1) {
			time = Tools.getDate(remain.getGoaltime(), 1, 1, "yyyy-MM-dd");
		} else if (type == 2) {
			time = Tools.getDate(remain.getGoaltime(), 1, 2, "yyyy-MM-dd");
		} else if (type == 3) {
			time = Tools.getDate(remain.getGoaltime(), 1, 6, "yyyy-MM-dd");
		} else if (type == 4) {
			time = Tools.getDate(remain.getGoaltime(), 1, 29, "yyyy-MM-dd");
		}
		lc(remain, time, type);
	}
	
	/**
	 * 计算留存
	 * 
	 * @param remain
	 * @param type
	 */
	private void lc(OpOssUserRemain remain, String time, int type) {
		Map map = new HashMap();
		map.put("goalTime", "'" + remain.getGoaltime() + "%'");
		map.put("targetTime", "'" + time + "%'");
		map.put("worldid", "'" + remain.getWorldid() + "'");
		double lc = analyzeDataService.remainUser(map);
		
		OpOssUserRemain obj = new OpOssUserRemain();
		obj.setId(remain.getId());
		if (type == 1) {
			if (lc == 0 && obj.getLc2() != null && obj.getLc2().doubleValue() != 0) {
				return;
			}
			obj.setLc2(lc);
		} else if (type == 2) {
			if (lc == 0 && obj.getLc3() != null && obj.getLc3().doubleValue() != 0) {
				return;
			}
			obj.setLc3(lc);
		} else if (type == 3) {
			if (lc == 0 && obj.getLc7() != null && obj.getLc7().doubleValue() != 0) {
				return;
			}
			obj.setLc7(lc);
		} else if (type == 4) {
			if (lc == 0 && obj.getLc30() != null && obj.getLc30().doubleValue() != 0) {
				return;
			}
			obj.setLc30(lc);
		}
		userRemainService.update(obj);
	}
	
}
