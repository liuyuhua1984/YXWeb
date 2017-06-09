package com.gamecenter.service.appServices;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.game.protocol.gm.GmCloseButtonHttpProtocol;
import com.game.protocol.gm.GmCloseButtonProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.mapper.OpGameworldMapper;
import com.gamecenter.mapper.OpOperatorWorldMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGameworldExample;
import com.gamecenter.model.OpOperatorWorld;
import com.gamecenter.model.OpOperatorWorldExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class WorldServiceImpl implements WorldService {
	@Resource
	OpGameworldMapper opGameworldMapper;
	@Resource
	OpOperatorWorldMapper opOperatorWorldMapper;
	
	public List<OpGameworld> getWorldList() {
		List<OpGameworld> lists = opGameworldMapper.getList(new OpGameworldExample());
		return lists;
	}
	
	public List<OpGameworld> getWorldList(String status) {
		OpGameworldExample opGameworldExample = new OpGameworldExample();
		OpGameworldExample.Criteria criteria = opGameworldExample.createCriteria();
		criteria.andStatusEqualTo(status);
		
		List<OpGameworld> lists = opGameworldMapper.getList(opGameworldExample);
		return lists;
	}
	
	public List<OpGameworld> getWorldListByAppId(String appId) {
		List<OpGameworld> lists = new ArrayList<OpGameworld>();
		OpGameworldExample opGameworldExample = new OpGameworldExample();
		OpGameworldExample.Criteria criteria = opGameworldExample.createCriteria();
		criteria.andAppidEqualTo(appId);
		lists = opGameworldMapper.getList(opGameworldExample);
		return lists;
	}
	
	public int save(OpGameworld obj) {
		int res = 0;
		if (obj.getWid() != null && obj.getWid().intValue() != 0) {
			res = opGameworldMapper.updateByPrimaryKeySelective(obj);
			
			OpOperatorWorld opOperatorWorld = new OpOperatorWorld();
			opOperatorWorld.setNumber(obj.getNumber());
			opOperatorWorld.setOptid(obj.getOptid());
			
			OpOperatorWorldExample opOperatorWorldExample = new OpOperatorWorldExample();
			OpOperatorWorldExample.Criteria criteria = opOperatorWorldExample.createCriteria();
			criteria.andWidEqualTo(obj.getWid());
			opOperatorWorldMapper.updateByExampleSelective(opOperatorWorld, opOperatorWorldExample);
			
		} else {
			res = opGameworldMapper.insertSelective(obj);
			// 绑定和运营商的关系
			OpOperatorWorld opOperatorWorld = new OpOperatorWorld();
			opOperatorWorld.setNumber(obj.getNumber());
			opOperatorWorld.setOptid(obj.getOptid());
			opOperatorWorld.setWid(obj.getWid());
			opOperatorWorldMapper.insertSelective(opOperatorWorld);
		}
		return res;
	}
	
	public int del(String ids) {
		int res = 0;
		String[] ss = ids.split(",");
		
		for (String tempid : ss) {
			res += opGameworldMapper.deleteByPrimaryKey(Integer.parseInt(tempid));
		}
		return res;
	}
	
	public OpGameworld getWorldByWid(int wid) {
		return opGameworldMapper.getOneByKey(wid);
	}
	
	public OpGameworld getWorldByWorldId(String worldid) {
		OpGameworld opGameworld = null;
		
		OpGameworldExample opGameworldExample = new OpGameworldExample();
		OpGameworldExample.Criteria criteria = opGameworldExample.createCriteria();
		criteria.andWorldidEqualTo(worldid);
		
		List<OpGameworld> lists = opGameworldMapper.getList(opGameworldExample);
		if (lists.size() > 0) {
			opGameworld = lists.get(0);
		}
		return opGameworld;
	}
	
	public int inviteStatus(String worldid, int type) {
		SendReqToGame con = SendReqToGame.getInstance();
		OpGameworld opGameworld = getWorldByWorldId(worldid);
		con.init(opGameworld.getIp(), 8005);
		
		GmCloseButtonProtocolRequest msg = new GmCloseButtonProtocolRequest();
		msg.setType(type );
		msg.setServerId(worldid);
		GmCloseButtonHttpProtocol resp = (GmCloseButtonHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), msg);
		
//		Object obj = con.sendMessage(msg, worldid);
//		
//		int res = 0;
//		try {
//			res = Integer.parseInt(obj.toString());
//		} catch (Exception e) {
//		}
		return resp.getStatus();
	}
}
