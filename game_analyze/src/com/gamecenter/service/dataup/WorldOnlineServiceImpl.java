package com.gamecenter.service.dataup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OpOssQlzOnlinecurLogMapper;
import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.parBean.vo.OnlineDataByDay;
import com.gamecenter.parBean.vo.OnlineDataByHour;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-30 Time: 下午2:51 To change this template use File | Settings | File Templates.
 */
@Repository
public class WorldOnlineServiceImpl implements WorldOnlineService {
	@Resource
	OpOssQlzOnlinecurLogMapper opOssQlzOnlinecurLogMapper;
	
	public int insert(OpOssQlzOnlinecurLog obj) {
		int res = opOssQlzOnlinecurLogMapper.insertSelective(obj);
		return res;
	}
	
	public OnlineDataByDay selectOnlineDataByDay(String time, String worldid) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("time", "'" + time + "%'");
		map.put("worldid", "'" + worldid + "'");
		OnlineDataByDay obj = opOssQlzOnlinecurLogMapper.selectOnlineDataByDay(map);
		return obj;
	}
	
	public List<OnlineDataByHour> onlineDayByHour(String time, String worldid) {
		Map map = new HashMap();
		map.put("time", "'" + time + "%'");
		map.put("worldid", "'" + worldid + "'");
		List<OnlineDataByHour> lists = opOssQlzOnlinecurLogMapper.selectOnlineDataByHour(map);
		return lists;
	}
}
