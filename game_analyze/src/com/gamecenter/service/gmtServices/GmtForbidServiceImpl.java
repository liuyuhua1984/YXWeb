package com.gamecenter.service.gmtServices;

import com.gamecenter.common.Tools;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.*;
import com.gamecenter.mapper.OpGmtForbidmsgMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtForbidmsg;
import com.gamecenter.model.OpGmtForbidmsgExample;
import com.gamecenter.parBean.vo.GmtForbidBean;
import com.gamecenter.service.appServices.WorldService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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
				ForbidWords_request forbidWords_request = new ForbidWords_request();
				forbidWords_request.setTime(gmtForbidBean.getTime());
				forbidWords_request.setType(gmtForbidBean.getType());
				forbidWords_request.setActstr(gmtForbidBean.getPassport());
				
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidWords_request, opGameworld.getWorldid()).toString();
				
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
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5051")) { // 账号禁言 --解封
				ForbidWordsJie_request forbidWordsJie_request = new ForbidWordsJie_request();
				forbidWordsJie_request.setType(gmtForbidBean.getType());
				forbidWordsJie_request.setActstr(gmtForbidBean.getPassport());
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidWordsJie_request, opGameworld.getWorldid()).toString();
				
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5052")) { // IP禁言
				ForbidWordsForIp_request forbidWordsForIp_request = new ForbidWordsForIp_request();
				forbidWordsForIp_request.setIp(gmtForbidBean.getIp());
				forbidWordsForIp_request.setTime(gmtForbidBean.getTime());
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidWordsForIp_request, opGameworld.getWorldid()).toString();
				
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setIp(gmtForbidBean.getIp());
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5053")) { // IP禁言 --解封
				ForbidWordsForIpJie_request forbidWordsForIpJie_request = new ForbidWordsForIpJie_request();
				forbidWordsForIpJie_request.setIp(gmtForbidBean.getIp());
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidWordsForIpJie_request, opGameworld.getWorldid()).toString();
				
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setIp(gmtForbidBean.getIp());
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5060")) { // 账号封号
				ForbidPassport_request forbidPassport_request = new ForbidPassport_request();
				forbidPassport_request.setType(gmtForbidBean.getType());
				forbidPassport_request.setActstr(gmtForbidBean.getPassport());
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidPassport_request, opGameworld.getWorldid()).toString();
				
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5061")) { // 账号封号 -- 解封
				ForbidPassportJie_request forbidPassport_request = new ForbidPassportJie_request();
				forbidPassport_request.setType(gmtForbidBean.getType());
				forbidPassport_request.setActstr(gmtForbidBean.getPassport());
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidPassport_request, opGameworld.getWorldid()).toString();
				
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtForbidmsgMapper.insertSelective(opGmtForbidmsg);
				
			} else if (gmtForbidBean.getAct().equals("5070")) { // 踢人
				ForbidKillPlayer_request forbidPassport_request = new ForbidKillPlayer_request();
				forbidPassport_request.setType(gmtForbidBean.getType());
				forbidPassport_request.setActstr(gmtForbidBean.getPassport());
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(forbidPassport_request, opGameworld.getWorldid()).toString();
				
				OpGmtForbidmsg opGmtForbidmsg = new OpGmtForbidmsg();
				opGmtForbidmsg.setAppid(gmtForbidBean.getAppid());
				opGmtForbidmsg.setWorldid(gmtForbidBean.getWid());
				opGmtForbidmsg.setPtype(Integer.parseInt(gmtForbidBean.getType()));
				opGmtForbidmsg.setPassport(gmtForbidBean.getPassport());
				opGmtForbidmsg.setOpttime(Tools.getNowDate());
				opGmtForbidmsg.setMsg(gmtForbidBean.getMsg());
				opGmtForbidmsg.setOpttype(Integer.parseInt(gmtForbidBean.getAct()));
				opGmtForbidmsg.setUsername(gmtForbidBean.getUser());
				opGmtForbidmsg.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
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
