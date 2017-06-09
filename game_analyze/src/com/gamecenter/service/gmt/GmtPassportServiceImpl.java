package com.gamecenter.service.gmt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.game.protocol.gm.GmAddOrDelWhiteNameHttpProtocol;
import com.game.protocol.gm.GmAddOrDelWhiteNameProtocolRequest;
import com.game.protocol.gm.GmRoleInfoHttpProtocol;
import com.game.protocol.gm.GmRoleInfoProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.packets.PassportMsg_response;
import com.gamecenter.mapper.OpOssQlzCreateroleLogMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.vo.GmtSelectPassportBean;
import com.gamecenter.service.appServices.WorldService;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class GmtPassportServiceImpl implements GmtPassportService {
	@Resource
	WorldService worldService;
	
	@Resource
	OpOssQlzCreateroleLogMapper opOssQlzCreateroleLogMapper;
	
	public PassportMsg_response selectPassport(GmtSelectPassportBean obj) {
		PassportMsg_response passportMsg_response = null;
		if (obj != null) {
			// 获取区服信息
			OpGameworld opGameworld = worldService.getWorldByWid(obj.getWid());
			
			if (obj.getAct().equals("5030")) {
				GmRoleInfoProtocolRequest req = new GmRoleInfoProtocolRequest();
				req.setType(Integer.parseInt(obj.getType()));
				req.setActstr(obj.getPassport());
				req.setServerId(opGameworld.getWorldid());
//				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//				Object res = SendReqToGame.getInstance().sendMessage(passportMsg_request, opGameworld.getWorldid());
				GmRoleInfoHttpProtocol resp = (GmRoleInfoHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				passportMsg_response = new PassportMsg_response();
				passportMsg_response.setCareer(""+resp.getCareer());
				passportMsg_response.setGrade(""+resp.getGrade());
				passportMsg_response.setIp(resp.getIp());
				passportMsg_response.setMoney(""+resp.getMoney());
				passportMsg_response.setName(resp.getName());
				passportMsg_response.setOpenid(resp.getOpenid());
				passportMsg_response.setResult(""+resp.getResult());
//				if (res instanceof String) {
//					passportMsg_response = new PassportMsg_response();
//					if (res.equals("-1000")) {
//						passportMsg_response.setResult("链接失败！");
//					} else if (res.equals("-1001") || res.equals("-1002")) {
//						passportMsg_response.setResult("登入失败！");
//					} else {
//						passportMsg_response.setResult("res:" + res);
//					}
//				} else {
					//passportMsg_response = (PassportMsg_response) SendReqToGame.getInstance().sendMessage(passportMsg_request, opGameworld.getWorldid());
					if (passportMsg_response.getResult().equals("-1")) {
						passportMsg_response.setResult("不存在的账号!");
					}
					
					passportMsg_response.setIsonline(passportMsg_response.getIsonline().equals("1") ? "在线" : "不在线");
					passportMsg_response.setStatus(passportMsg_response.getStatus().equals("1") ? "正常" : (passportMsg_response.getStatus().equals("2") ? "禁言中" : "封号中"));
					passportMsg_response.setCareer("未解析");
					
			//	}
		}
		}
		return passportMsg_response;
	}
	
	

	/**
	 *
	 */
	public int allowPassport(int type, List<String> passports, String wid) {
		OpGameworld opGameworld = worldService.getWorldByWid(Integer.parseInt(wid));
		GmAddOrDelWhiteNameProtocolRequest req = new GmAddOrDelWhiteNameProtocolRequest();
		req.setServerId( opGameworld.getWorldid());
		req.setType(type);
		req.setLists(passports);
		
		GmAddOrDelWhiteNameHttpProtocol resp = (GmAddOrDelWhiteNameHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
//		SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
//		Object res = SendReqToGame.getInstance().sendMessage(req, opGameworld.getWorldid());
		
		return resp.getStatus();
	}
}
