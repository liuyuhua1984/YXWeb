package com.gamecenter.service.gmt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.game.protocol.gm.GmBlockIPHttpProtocol;
import com.game.protocol.gm.GmBlockIPProtocolRequest;
import com.game.protocol.gm.GmBlockRoleHttpProtocol;
import com.game.protocol.gm.GmBlockRoleProtocolRequest;
import com.game.protocol.gm.GmBlockSayHttpProtocol;
import com.game.protocol.gm.GmBlockSayProtocolRequest;
import com.game.protocol.gm.GmDisblockIPHttpProtocol;
import com.game.protocol.gm.GmDisblockIPProtocolRequest;
import com.game.protocol.gm.GmDisblockRoleHttpProtocol;
import com.game.protocol.gm.GmDisblockRoleProtocolRequest;
import com.game.protocol.gm.GmDisblockSayHttpProtocol;
import com.game.protocol.gm.GmDisblockSayProtocolRequest;
import com.game.protocol.gm.GmKickRoleHttpProtocol;
import com.game.protocol.gm.GmKickRoleProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.Tools;
import com.gamecenter.mapper.OpGmtForbidmsgMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtForbidmsg;
import com.gamecenter.model.OpGmtForbidmsgExample;
import com.gamecenter.parBean.vo.GmtForbidBean;
import com.gamecenter.service.appServices.WorldService;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class GmtForbidServiceImpl implements GmtForbidService {
	@Resource
	OpGmtForbidmsgMapper opGmtForbidmsgMapper;
	@Resource
	WorldService worldService;
	
	public String executeForbid(GmtForbidBean gmtForbidBean) {
		
		String res = "";
		if (gmtForbidBean != null) {
			// 获取区服信息
			OpGameworld opGameworld = worldService.getWorldByWid(gmtForbidBean.getWid());
			
			if (gmtForbidBean.getAct().equals("5050")) { // 账号禁言
				GmBlockSayProtocolRequest req = new GmBlockSayProtocolRequest();
				
				req.setTime(Integer.parseInt(gmtForbidBean.getTime()));
				req.setType(Integer.parseInt(gmtForbidBean.getType()));
				req.setActstr(gmtForbidBean.getPassport());
				req.setServerId(opGameworld.getWorldid());
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidWords_request, opGameworld.getWorldid()).toString();
				
				GmBlockSayHttpProtocol resp = (GmBlockSayHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setForbidtime(Integer.parseInt(gmtForbidBean.getTime()));
				opGmtForbidmsg.setOptres(resp.getStatus() == 1 ? "成功" : (resp.getStatus()== -1000? "链接失败" : (resp.getStatus()==-1002? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5051")) { // 账号禁言 --解封
				GmDisblockSayProtocolRequest req = new GmDisblockSayProtocolRequest();
				req.setType(Integer.parseInt(gmtForbidBean.getType()));
				req.setActstr(gmtForbidBean.getPassport());
				req.setServerId(opGameworld.getWorldid());
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidWordsJie_request, opGameworld.getWorldid()).toString();
				GmDisblockSayHttpProtocol resp = (GmDisblockSayHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(resp.getStatus() == 1? "成功" : (resp.getStatus() ==-1000 ? "链接失败" : (resp.getStatus() ==-1002 ? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5052")) { // IP禁止
				GmBlockIPProtocolRequest req = new GmBlockIPProtocolRequest();
				req.setIp(gmtForbidBean.getIp());
				req.setTime(Integer.parseInt(gmtForbidBean.getTime()));
				req.setServerId(opGameworld.getWorldid());
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidWordsForIp_request, opGameworld.getWorldid()).toString();
				GmBlockIPHttpProtocol resp = (GmBlockIPHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setIp(gmtForbidBean.getIp());
				opGmtForbidmsg.setOptres(resp.getStatus() == 1? "成功" : (resp.getStatus() ==-1000 ? "链接失败" : (resp.getStatus() ==-1002 ? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5053")) { // IP禁言 --解封
				GmDisblockIPProtocolRequest req = new GmDisblockIPProtocolRequest();
				req.setIp(gmtForbidBean.getIp());
				req.setServerId(opGameworld.getWorldid());
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidWordsForIpJie_request, opGameworld.getWorldid()).toString();
				GmDisblockIPHttpProtocol resp = (GmDisblockIPHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setIp(gmtForbidBean.getIp());
				opGmtForbidmsg.setOptres(resp.getStatus() == 1? "成功" : (resp.getStatus() ==-1000 ? "链接失败" : (resp.getStatus() ==-1002 ? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5060")) { // 账号封号
				GmBlockRoleProtocolRequest req = new GmBlockRoleProtocolRequest();
				req.setType(Integer.parseInt(gmtForbidBean.getType()));
				req.setActstr(gmtForbidBean.getPassport());
				req.setServerId(opGameworld.getWorldid());
				GmBlockRoleHttpProtocol resp = (GmBlockRoleHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidPassport_request, opGameworld.getWorldid()).toString();
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(resp.getStatus() == 1? "成功" : (resp.getStatus() ==-1000 ? "链接失败" : (resp.getStatus() ==-1002 ? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5061")) { // 账号封号 -- 解封
				GmDisblockRoleProtocolRequest req = new GmDisblockRoleProtocolRequest();
				req.setType(Integer.parseInt(gmtForbidBean.getType()));
				req.setActstr(gmtForbidBean.getPassport());
				req.setServerId(opGameworld.getWorldid());
				
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidPassport_request, opGameworld.getWorldid()).toString();
				GmDisblockRoleHttpProtocol resp = (GmDisblockRoleHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(resp.getStatus() == 1? "成功" : (resp.getStatus() ==-1000 ? "链接失败" : (resp.getStatus() ==-1002 ? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5070")) { // 踢人
				GmKickRoleProtocolRequest req = new GmKickRoleProtocolRequest();
				req.setType(Integer.parseInt(gmtForbidBean.getType()));
				req.setActstr(gmtForbidBean.getPassport());
				req.setServerId(opGameworld.getWorldid());
				GmKickRoleHttpProtocol resp = (GmKickRoleHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				res = SendReqToGame.getInstance().sendMessage(forbidPassport_request, opGameworld.getWorldid()).toString();
				res =""+ resp.getStatus();
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(resp.getStatus() == 1? "成功" : (resp.getStatus() ==-1000 ? "链接失败" : (resp.getStatus() ==-1002 ? "接入失败" : "失败" + resp.getStatus())));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
			}
			
		}
		
		return res;
	}
	
	public List<OpGmtForbidmsg> getGmtForbidmsgList() {
		OpGmtForbidmsgExample opGmtForbidmsgExample = new OpGmtForbidmsgExample();
		OpGmtForbidmsgExample.Criteria criteria = opGmtForbidmsgExample.createCriteria();
		opGmtForbidmsgExample.setOrderByClause("opttime desc");
		
		List<OpGmtForbidmsg> msg = opGmtForbidmsgMapper.selectList(opGmtForbidmsgExample);
		
		return msg;
	}
	
}
