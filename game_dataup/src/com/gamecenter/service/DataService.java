package com.gamecenter.service;

import java.util.List;

import com.gamecenter.model.CreateRoleLog;
import com.gamecenter.model.LoginLog;
import com.gamecenter.model.LoginOutLog;
import com.gamecenter.model.OnlineNumLog;
import com.gamecenter.model.RechargeLog;
import com.gamecenter.model.RegisterLog;
import com.gamecenter.model.UseGoldLog;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-9 Time: 下午1:22 To change this template use File | Settings | File Templates.
 */
public interface DataService {
	
	public List<LoginLog> loginList(String timeslice);
	
	public int actLoginLog(String ids);
	
	public List<LoginOutLog> loginOutList(String timeslice);
	
	public int actLoginOutLog(String ids);
	
	public List<CreateRoleLog> createList(String timeslice);
	
	public int actCreateLog(String ids);
	
	public List<OnlineNumLog> onlineNumList(String timeslice);
	
	public int actOnlineLog(String ids);
	
	/**
	 * 获取时间片内的数据
	 * 
	 * @param timeslice
	 * @return
	 */
	public List<RegisterLog> registerList(String timeslice);
	
	public int actRegisterLog(String ids);
	
	public List<RechargeLog> rechargeList(String timeslice);
	
	public int actRechargeLog(String ids);
	
	public List<UseGoldLog> useGoldList(String timeslice);
	
	public int actUseGoldLog(String ids);
}
