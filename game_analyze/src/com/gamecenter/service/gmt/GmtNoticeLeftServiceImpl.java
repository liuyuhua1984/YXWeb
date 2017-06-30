package com.gamecenter.service.gmt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.game.protocol.gm.GmNoticeLeftHttpProtocol;
import com.game.protocol.gm.GmNoticeLeftProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.mapper.OpGmtNoticeLeftMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtNoticeLeft;
import com.gamecenter.model.OpGmtNoticeLeftExample;
import com.gamecenter.service.appServices.WorldService;

/**
 * 发送公告服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
@Service
public class GmtNoticeLeftServiceImpl implements GmtNoticeLeftService{

	@Resource
	private OpGmtNoticeLeftMapper mapper;
	@Resource
	WorldService worldService;
	@Override
	public void insert(OpGmtNoticeLeft t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpGmtNoticeLeft t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpGmtNoticeLeft findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public String sendNoticLeft(OpGmtNoticeLeft noticeLeft) {
		// TODO Auto-generated method stub
		String status = "0";
		OpGameworld opGameworld = worldService.getWorldByWorldId(noticeLeft.getWorldId());
		if (opGameworld != null){
			//先入库
			mapper.insert(noticeLeft);
			GmNoticeLeftProtocolRequest req = new GmNoticeLeftProtocolRequest();
			req.setServerId(noticeLeft.getWorldId());
			req.setNoticeTitle(noticeLeft.getTitle());
			req.setContent(noticeLeft.getContent());
			GmNoticeLeftHttpProtocol resp =  (GmNoticeLeftHttpProtocol)PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
			status = ""+resp.getStatus();
		}
		return status;
	}

	@Override
	public List<OpGmtNoticeLeft> getNoticList() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(new OpGmtNoticeLeftExample());
	}
	
	
	
}
