package com.gamecenter.service.appServices;

import com.gamecenter.common.Tools;
import com.gamecenter.common.cacheData.GlobleData;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.SendNotice_request;
import com.gamecenter.mapper.OpGameappMapper;
import com.gamecenter.mapper.OpGmtNoticeMapper;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameappExample;
import com.gamecenter.model.OpGmtNotice;
import com.gamecenter.model.OpGmtNoticeExample;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class AppServiceImpl implements AppService {
	
	@Resource
	OpGameappMapper opGameappMapper;
	
	public List<OpGameapp> getAppList() {
		List<OpGameapp> lists = new ArrayList<OpGameapp>();
		if (GlobleData.apps.size() > 0) {
			for (Map.Entry<String, OpGameapp> entry : GlobleData.apps.entrySet()) {
				lists.add(entry.getValue());
			}
		} else {
			lists = opGameappMapper.selectByExample(new OpGameappExample());
			for (OpGameapp app : lists) {
				GlobleData.apps.put(app.getAppid(), app);
			}
		}
		return lists;
	}
	
	public int add(OpGameapp obj) {
		int res = 0;
		OpGameappExample opGameappExample = new OpGameappExample();
		OpGameappExample.Criteria criteria = opGameappExample.createCriteria();
		criteria.andAppidEqualTo(obj.getAppid());
		
		int count = opGameappMapper.countByExample(opGameappExample);
		if (count > 0) {
			res = -100;
		} else {
			res = opGameappMapper.insertSelective(obj);
			if (res == 1)
				GlobleData.apps.put(obj.getAppid(), obj);
		}
		return res;
	}
	
	public int update(OpGameapp obj) {
		int res = 0;
		res = opGameappMapper.updateByPrimaryKeySelective(obj);
		
		for (Map.Entry<String, OpGameapp> entry : GlobleData.apps.entrySet()) {
			if (entry.getValue().getId().intValue() == obj.getId().intValue()) {
				GlobleData.apps.remove(entry.getKey());
			}
		}
		GlobleData.apps.put(obj.getAppid(), obj);
		return res;
	}
	
	public int del(String ids) {
		int res = 0, temp = 0;
		
		// 分解IDs
		List<Integer> idList = new ArrayList<Integer>();
		String[] ss = ids.split(",");
		for (String tempid : ss) {
			idList.add(Integer.parseInt(tempid));
		}
		// 移除数据
		OpGameappExample opGameappExample = new OpGameappExample();
		OpGameappExample.Criteria criteria = opGameappExample.createCriteria();
		criteria.andIdIn(idList);
		res = opGameappMapper.deleteByExample(opGameappExample);
		
		// 清理缓存
		for (Integer id : idList) {
			for (Map.Entry<String, OpGameapp> entry : GlobleData.apps.entrySet()) {
				if (entry.getValue().getId().intValue() == id.intValue()) {
					GlobleData.apps.remove(entry.getKey());
				}
			}
		}
		
		return res;
	}
	
	public OpGameapp getByAppId(String appid) {
		
		if (appid == null)
			return null;
		OpGameapp opGameapp = GlobleData.apps.get(appid);
		
		if (opGameapp == null) {
			opGameapp = opGameappMapper.getOneByAppId(appid);
			if (opGameapp != null) {
				GlobleData.apps.put(appid, opGameapp);
			}
		}
		return opGameapp;
	}
}
