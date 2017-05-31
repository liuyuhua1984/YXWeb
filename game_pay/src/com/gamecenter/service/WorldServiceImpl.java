package com.gamecenter.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OpGameworldMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGameworldExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class WorldServiceImpl implements WorldService {
	@Resource
	OpGameworldMapper opGameworldMapper;
	
	public List<OpGameworld> getWorldList() {
		List<OpGameworld> lists = opGameworldMapper.selectByExample(new OpGameworldExample());
		return lists;
	}
	
	public List<OpGameworld> getWorldListByAppId(String appId) {
		OpGameworldExample opGameworldExample = new OpGameworldExample();
		OpGameworldExample.Criteria criteria = opGameworldExample.createCriteria();
		criteria.andAppidEqualTo(appId);
		
		List<OpGameworld> lists = opGameworldMapper.selectByExample(opGameworldExample);
		return lists;
	}
	
	public int add(OpGameworld obj) {
		int res = 0;
		res = opGameworldMapper.insertSelective(obj);
		return res;
	}
	
	public int del(String worldid) {
		int res = 0;
		if (worldid.contains(",")) {
			String[] ids = worldid.split(",");
			for (String tempid : ids) {
				res += opGameworldMapper.deleteByPrimaryKey(Integer.parseInt(tempid));
			}
		} else {
			res += opGameworldMapper.deleteByPrimaryKey(Integer.parseInt(worldid));
		}
		
		return res;
	}
	
	public OpGameworld getWorldByWid(int wid) {
		OpGameworld opGameworld = opGameworldMapper.selectByPrimaryKey(wid);
		return opGameworld; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public OpGameworld getWorldByWorldId(String worldid) {
		OpGameworldExample opGameworldExample = new OpGameworldExample();
		OpGameworldExample.Criteria criteria = opGameworldExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		
		List<OpGameworld> lists = opGameworldMapper.selectByExample(opGameworldExample);
		if (lists.size() > 0) {
			return lists.get(0);
		}
		return null;
	}
	
}
