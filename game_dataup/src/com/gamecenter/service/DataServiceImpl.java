package com.gamecenter.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.CreateRoleLogMapper;
import com.gamecenter.mapper.LoginLogMapper;
import com.gamecenter.mapper.LoginOutLogMapper;
import com.gamecenter.mapper.OnlineNumLogMapper;
import com.gamecenter.mapper.RechargeLogMapper;
import com.gamecenter.mapper.RegisterLogMapper;
import com.gamecenter.mapper.UseGoldLogMapper;
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
@Repository
public class DataServiceImpl implements DataService {
	
	@Resource
	LoginOutLogMapper loginOutLogMapper;
	@Resource
	LoginLogMapper loginLogMapper;
	@Resource
	RechargeLogMapper rechargeLogMapper;
	@Resource
	UseGoldLogMapper useGoldLogMapper;
	@Resource
	OnlineNumLogMapper onlineNumLogMapper;
	@Resource
	RegisterLogMapper registerLogMapper;
	@Resource
	CreateRoleLogMapper createRoleLogMapper;
	
	@Override
	public List<LoginLog> loginList(String timeslice) {
		List<LoginLog> lists = loginLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actLoginLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = loginLogMapper.act(map);
		return res;
	}
	
	@Override
	public List<LoginOutLog> loginOutList(String timeslice) {
		List<LoginOutLog> lists = loginOutLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actLoginOutLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = loginOutLogMapper.act(map);
		return res;
	}
	
	@Override
	public List<CreateRoleLog> createList(String timeslice) {
		List<CreateRoleLog> lists = createRoleLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actCreateLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = createRoleLogMapper.act(map);
		return res;
	}
	
	@Override
	public List<OnlineNumLog> onlineNumList(String timeslice) {
		List<OnlineNumLog> lists = onlineNumLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actOnlineLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = onlineNumLogMapper.act(map);
		return res;
	}
	
	@Override
	public List<RegisterLog> registerList(String timeslice) {
		List<RegisterLog> lists = registerLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actRegisterLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = registerLogMapper.act(map);
		return res;
	}
	
	@Override
	public List<RechargeLog> rechargeList(String timeslice) {
		List<RechargeLog> lists = rechargeLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actRechargeLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = rechargeLogMapper.act(map);
		return res;
	}
	
	@Override
	public List<UseGoldLog> useGoldList(String timeslice) {
		List<UseGoldLog> lists = useGoldLogMapper.getLastDate(timeslice);
		return lists;
	}
	
	@Override
	public int actUseGoldLog(String ids) {
		Map map = new HashMap();
		map.put("ids", ids);
		int res = useGoldLogMapper.act(map);
		return res;
	}
}
