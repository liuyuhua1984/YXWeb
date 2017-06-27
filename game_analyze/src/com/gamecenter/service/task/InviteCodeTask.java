package com.gamecenter.service.task;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.annotation.Resource;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;

import com.game.protocol.gm.GmInviteCodeHttpProtocol;
import com.game.protocol.gm.GmInviteCodeProtocolRequest;
import com.game.protocol.gm.GmNoticeHttpProtocol;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.Tools;
import com.gamecenter.mapper.OpGmtNoticeCycleMapper;
import com.gamecenter.mapper.OpOssQlzPassportMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.model.OpGmtNoticeCycleExample;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtNoticeService;

public class InviteCodeTask {
	private Logger logger = org.slf4j.LoggerFactory.getLogger(InviteCodeTask.class);
	public static final ConcurrentLinkedQueue<GmInviteCodeProtocolRequest> inviteCodeList = new ConcurrentLinkedQueue<GmInviteCodeProtocolRequest>();
	
	@Resource
	WorldService worldService;
	@Resource
	OpOssQlzPassportMapper opOssQlzPassportMapper;
	
	/**
	 * 发送循环公告 周期10
	 */
	public synchronized void work() {
		
		while (!inviteCodeList.isEmpty()) {
			
			GmInviteCodeProtocolRequest req = inviteCodeList.poll();
			try {
				OpGameworld opGameworld = worldService.getWorldByWorldId(req.getServerId());
				
				if (opGameworld == null){
					continue;
				}
				
				OpOssQlzPassport passport = opOssQlzPassportMapper.selectByPrimaryKey(req.getOpenId());
				if (passport != null ){
					passport.setInviteCode(req.getInviteCode());
					opOssQlzPassportMapper.updateByPrimaryKey(passport);
				}
				GmInviteCodeHttpProtocol resp = (GmInviteCodeHttpProtocol) PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("邀请码出异常了::",e);
			}
		}
		
	}
	
}
