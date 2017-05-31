package com.gamecenter.service.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import javax.annotation.Resource;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gamecenter.common.Tools;
import com.gamecenter.common.jms.DataMessageCreator;
import com.gamecenter.model.CreateRoleLog;
import com.gamecenter.model.LoginLog;
import com.gamecenter.model.LoginOutLog;
import com.gamecenter.model.OnlineNumLog;
import com.gamecenter.model.RechargeLog;
import com.gamecenter.model.RegisterLog;
import com.gamecenter.model.UseGoldLog;
import com.gamecenter.parBean.ComparatorData;
import com.gamecenter.parBean.updataObj.UpDataObj;
import com.gamecenter.parBean.updataObj.UpStatus;
import com.gamecenter.parBean.vo.DataObj;
import com.gamecenter.service.DataService;
import com.gamecenter.service.RunLog;

/**
 * 数据上报任务 执行 Created with IntelliJ IDEA. User: gsb Date: 14-5-9 Time: 下午1:44 To change this template use File | Settings | File Templates.
 */
public class UploadDataServer {
	@Resource
	DataService dataService;
	@Resource
	private JmsTemplate jmsTempalte;
	@Resource
	private ActiveMQQueue statusMsg;
	@Resource
	private ActiveMQQueue gamedata;
	
	// 上报状态
	public static boolean isUp = true;
	public static String worldid = "";
	// 开发时间
	public static String opentime = "";
	// 执行时间
	public static String excutetime = "";
	// 信息
	public static String msg = "";
	
	/**
	 * 任务入口
	 */
	public synchronized void work() {
		if (!isUp)
			return;
		long beginTime = System.currentTimeMillis();
		heartbeat(); // 上报心跳
		
		// 计算时间片 取最近10分钟
		String timeslice = Tools.getDate(excutetime, 4, 10);
		String nowtime = Tools.getNowDate();
		if (Tools.timecha(timeslice, nowtime) < 0) {
			timeslice = nowtime;
		}
		excutetime = timeslice;
		
		List<DataObj> dataObjs = new ArrayList<DataObj>();
		
		int count = 0;
		count += register(timeslice, dataObjs);
		count += createRole(timeslice, dataObjs);
		count += login(timeslice, dataObjs);
		count += loginOut(timeslice, dataObjs);
		count += recharge(timeslice, dataObjs);
		count += useGold(timeslice, dataObjs);
		count += online(timeslice, dataObjs);
		
		Collections.sort(dataObjs, new ComparatorData());
		count = uploadData(dataObjs);
		msg = "执行时间：" + (System.currentTimeMillis() - beginTime) + "(ms) ,上报条数：" + count;
		System.out.println(msg);
		dataObjs.clear();
		
		// 回写记录执行时间
		writeTime();
	}
	
	/**
	 * 执行上报
	 * 
	 * @param dataObjs
	 * @return
	 */
	private int uploadData(List<DataObj> dataObjs) {
		int num = 0;
		
		StringBuffer regIds = new StringBuffer();
		StringBuffer croleIds = new StringBuffer();
		StringBuffer loginIds = new StringBuffer();
		StringBuffer outIds = new StringBuffer();
		StringBuffer rechargeIds = new StringBuffer();
		StringBuffer useIds = new StringBuffer();
		StringBuffer onlineIds = new StringBuffer();
		
		DataMessageCreator dataMessageCreator = new DataMessageCreator();
		
		DataObj dataObj = null;
		UpDataObj upDataObj = null;
		for (int i = 0; i < dataObjs.size(); i++) {
			dataObj = dataObjs.get(i);
			
			upDataObj = new UpDataObj();
			upDataObj.setData(JSON.toJSONString(dataObj.getData()));
			upDataObj.setTime(dataObj.getTime());
			upDataObj.setType(dataObj.getType());
			
			try {
				dataMessageCreator.obj = upDataObj;
				jmsTempalte.send(gamedata, dataMessageCreator);
				
				if (dataObj.getType() == 1) {
					regIds.append(((RegisterLog) (dataObj.getData())).getId() + ",");
				} else if (dataObj.getType() == 2) {
					croleIds.append(((CreateRoleLog) (dataObj.getData())).getId() + ",");
				} else if (dataObj.getType() == 3) {
					loginIds.append(((LoginLog) (dataObj.getData())).getId() + ",");
				} else if (dataObj.getType() == 4) {
					outIds.append(((LoginOutLog) (dataObj.getData())).getId() + ",");
				} else if (dataObj.getType() == 5) {
					rechargeIds.append(((RechargeLog) (dataObj.getData())).getId() + ",");
				} else if (dataObj.getType() == 6) {
					useIds.append(((UseGoldLog) (dataObj.getData())).getId() + ",");
				} else if (dataObj.getType() == 7) {
					onlineIds.append(((OnlineNumLog) (dataObj.getData())).getId() + ",");
				}
				
			} catch (Exception e) {
				RunLog.logDao.error("uploadData 异常", e);
			}
		}
		
		// 标记上报
		String ids = regIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actRegisterLog(ids.substring(0, ids.length() - 1));
		}
		ids = croleIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actCreateLog(ids.substring(0, ids.length() - 1));
		}
		ids = loginIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actLoginLog(ids.substring(0, ids.length() - 1));
		}
		ids = outIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actLoginOutLog(ids.substring(0, ids.length() - 1));
		}
		ids = rechargeIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actRechargeLog(ids.substring(0, ids.length() - 1));
		}
		
		ids = useIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actUseGoldLog(ids.substring(0, ids.length() - 1));
		}
		
		ids = onlineIds.toString();
		if (ids != null && ids.length() > 0) {
			num += dataService.actOnlineLog(ids.substring(0, ids.length() - 1));
		}
		
		return num;
	}
	
	/**
	 * 上报心跳
	 */
	private int heartbeat() {
		int res = 0;
		DataMessageCreator dataMessageCreator = new DataMessageCreator();
		UpStatus upStatus = new UpStatus();
		upStatus.setWorldid(worldid);
		try {
			dataMessageCreator.obj = upStatus;
			jmsTempalte.send(statusMsg, dataMessageCreator);
		} catch (Exception e) {
			RunLog.logDao.error("heartbeat 异常", e);
		}
		return res;
	}
	
	public void init() {
		ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		worldid = bundle.getString("worldid");
		opentime = bundle.getString("opentime");
		excutetime = bundle.getString("excutetime");
	}
	
	/**
	 * online 类型7
	 */
	private int online(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		// 抓取数据
		List<OnlineNumLog> onlineNumLogs = dataService.onlineNumList(timeslice);
		
		for (OnlineNumLog onlineNumLog : onlineNumLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(7);
			dataObj.setTime(Tools.getDateString(onlineNumLog.getCreatetime()));
			dataObj.setData(onlineNumLog);
			dataObjs.add(dataObj);
		}
		return res;
	}
	
	/**
	 * 登陆日志 类型3
	 */
	private int login(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		// 抓取数据
		List<LoginLog> loginLogs = dataService.loginList(timeslice);
		
		for (LoginLog loginLog : loginLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(3);
			dataObj.setTime(Tools.getDateString(loginLog.getCreatetime()));
			dataObj.setData(loginLog);
			dataObjs.add(dataObj);
		}
		return res;
	}
	
	/**
	 * 登出日志 类型4
	 */
	private int loginOut(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		
		List<LoginOutLog> loginOutLogs = dataService.loginOutList(timeslice);
		
		for (LoginOutLog registerLog : loginOutLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(4);
			dataObj.setTime(Tools.getDateString(registerLog.getCreatetime()));
			dataObj.setData(registerLog);
			dataObjs.add(dataObj);
		}
		return res;
		
	}
	
	/**
	 * 注册日志 类型1
	 */
	private int register(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		// 抓取数据
		List<RegisterLog> registerLogs = dataService.registerList(timeslice);
		
		for (RegisterLog registerLog : registerLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(1);
			dataObj.setTime(Tools.getDateString(registerLog.getCreatetime()));
			dataObj.setData(registerLog);
			dataObjs.add(dataObj);
		}
		return res;
		
	}
	
	/**
	 * 创建角色日志 类型2
	 */
	private int createRole(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		// 抓取数据
		List<CreateRoleLog> createRoleLogs = dataService.createList(timeslice);
		
		for (CreateRoleLog registerLog : createRoleLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(2);
			dataObj.setTime(Tools.getDateString(registerLog.getCreatetime()));
			dataObj.setData(registerLog);
			dataObjs.add(dataObj);
		}
		
		return res;
	}
	
	/**
	 * 充值日志 类型5
	 */
	private int recharge(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		// 抓取数据
		List<RechargeLog> rechargeLogs = dataService.rechargeList(timeslice);
		
		for (RechargeLog rechargeLog : rechargeLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(5);
			dataObj.setTime(Tools.getDateString(rechargeLog.getCreatetime()));
			dataObj.setData(rechargeLog);
			dataObjs.add(dataObj);
		}
		return res;
		
	}
	
	/**
	 * 金币使用日志 类型6
	 */
	private int useGold(String timeslice, List<DataObj> dataObjs) {
		int res = 0;
		// 抓取数据
		List<UseGoldLog> useGoldLogs = dataService.useGoldList(timeslice);
		for (UseGoldLog registerLog : useGoldLogs) {
			DataObj dataObj = new DataObj();
			dataObj.setType(6);
			dataObj.setTime(Tools.getDateString(registerLog.getCreatetime()));
			dataObj.setData(registerLog);
			dataObjs.add(dataObj);
		}
		return res;
		
	}
	
	/**
	 * 回写记录执行时间
	 */
	private void writeTime() {
		Properties prop = new Properties();
		InputStream fis = null;
		OutputStream fos = null;
		try {
			String path = this.getClass().getClassLoader().getResource("").getPath().toString();
			
			File file = new File(path + "runConfig.properties");
			if (!file.exists())
				file.createNewFile();
			
			fis = new FileInputStream(file);
			prop.load(fis);
			fis.close();// 一定要在修改值之前关闭fis
			fos = new FileOutputStream(file);
			prop.setProperty("excutetime", excutetime);
			prop.store(fos, "Update excutetime value");
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
