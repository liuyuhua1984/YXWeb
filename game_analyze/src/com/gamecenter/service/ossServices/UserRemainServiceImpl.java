package com.gamecenter.service.ossServices;

import com.gamecenter.mapper.OpOssQlzPassportMapper;
import com.gamecenter.mapper.OpOssUserRemainMapper;
import com.gamecenter.model.OpOssQlzPassportExample;
import com.gamecenter.model.OpOssUserRemain;
import com.gamecenter.model.OpOssUserRemainExample;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 上午9:50 To change this template use File | Settings | File Templates.
 */
@Repository
public class UserRemainServiceImpl implements UserRemainService {
	@Resource
	OpOssUserRemainMapper opOssUserRemainMapper;
	
	public OpOssUserRemain getUserRemain(String worldid, String time) {
		OpOssUserRemainExample opOssUserRemainExample = new OpOssUserRemainExample();
		OpOssUserRemainExample.Criteria criteria = opOssUserRemainExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		criteria.andGoaltimeEqualTo(time);
		
		List<OpOssUserRemain> opOssUserRemains = opOssUserRemainMapper.selectByExample(opOssUserRemainExample);
		if (opOssUserRemains.size() > 0) {
			return opOssUserRemains.get(0);
		}
		return null;
	}
	
	public OpOssUserRemain getUserRemain(int id) {
		OpOssUserRemain opOssUserRemain = opOssUserRemainMapper.selectByPrimaryKey(id);
		return opOssUserRemain;
	}
	
	public List<OpOssUserRemain> getUserRemainList(String worldid) {
		OpOssUserRemainExample opOssUserRemainExample = new OpOssUserRemainExample();
		OpOssUserRemainExample.Criteria criteria = opOssUserRemainExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		
		List<OpOssUserRemain> opOssUserRemains = opOssUserRemainMapper.selectByExample(opOssUserRemainExample);
		return opOssUserRemains;
	}
	
	public List<OpOssUserRemain> getUserRemainList(String worldid, String mintime) {
		OpOssUserRemainExample opOssUserRemainExample = new OpOssUserRemainExample();
		OpOssUserRemainExample.Criteria criteria = opOssUserRemainExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		criteria.andGoaltimeGreaterThanOrEqualTo(mintime);
		List<OpOssUserRemain> opOssUserRemains = opOssUserRemainMapper.selectByExample(opOssUserRemainExample);
		return opOssUserRemains;
	}
	
	public List<OpOssUserRemain> getUserRemainList(String worldids, String begintime, String endtime) {
		Map map = new HashMap();
		worldids = worldids.replace(",", "','");
		map.put("worldids", "'" + worldids + "'");
		map.put("begintime", "'" + begintime + "'");
		map.put("endtime", "'" + endtime + "'");
		List<OpOssUserRemain> opOssUserRemains = opOssUserRemainMapper.getList(map);
		return opOssUserRemains;
	}
	
	public int insert(OpOssUserRemain opOssUserRemain) {
		int num = 0;
		if (getUserRemain(opOssUserRemain.getWorldid(), opOssUserRemain.getGoaltime()) == null) {
			num = opOssUserRemainMapper.insertSelective(opOssUserRemain);
		}
		return num;
	}
	
	public int update(OpOssUserRemain opOssUserRemain) {
		int num = opOssUserRemainMapper.updateByPrimaryKeySelective(opOssUserRemain);
		return num;
	}
	
	public int checknum(String worldid) {
		OpOssUserRemainExample opOssUserRemainExample = new OpOssUserRemainExample();
		OpOssUserRemainExample.Criteria criteria = opOssUserRemainExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		int count = opOssUserRemainMapper.countByExample(opOssUserRemainExample);
		return count;
	}
	
}
