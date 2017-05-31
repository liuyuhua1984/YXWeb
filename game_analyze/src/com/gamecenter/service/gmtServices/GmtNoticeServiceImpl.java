package com.gamecenter.service.gmtServices;

import com.gamecenter.common.Tools;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.*;
import com.gamecenter.mapper.OpGmtNoticeCycleMapper;
import com.gamecenter.mapper.OpGmtNoticeMapper;
import com.gamecenter.model.*;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.task.SendNoticeCycle;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class GmtNoticeServiceImpl implements GmtNoticeService {
	@Resource
	OpGmtNoticeMapper opGmtNoticeMapper;
	@Resource
	WorldService worldService;
	@Resource
	OpGmtNoticeCycleMapper opGmtNoticeCycleMapper;
	
	public String sendNotic(GmtSendNoticeBean gmtSendNoticeBean) {
		String res = "";
		if (gmtSendNoticeBean != null) {
			// 获取区服信息
			OpGameworld opGameworld = worldService.getWorldByWid(gmtSendNoticeBean.getWid());
			
			if (gmtSendNoticeBean.getAct().equals("5100")) {
				SendNotice_request sendNotice_request = new SendNotice_request();
				sendNotice_request.setContent(gmtSendNoticeBean.getContent());
				
				SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
				res = SendReqToGame.getInstance().sendMessage(sendNotice_request, opGameworld.getWorldid()).toString();
				
				OpGmtNotice opGmtNotice = new OpGmtNotice();
				opGmtNotice.setAppid(gmtSendNoticeBean.getAppid());
				opGmtNotice.setWorldid(gmtSendNoticeBean.getWid());
				opGmtNotice.setType(Integer.parseInt(gmtSendNoticeBean.getType()));
				opGmtNotice.setContent(gmtSendNoticeBean.getContent());
				opGmtNotice.setOpttime(Tools.getNowDate());
				opGmtNotice.setMsg(gmtSendNoticeBean.getMsg());
				opGmtNotice.setUsername(gmtSendNoticeBean.getUser());
				opGmtNotice.setOptres(res.equals("1") ? "成功" : (res.equals("-1000") ? "链接失败" : (res.equals("-1002") ? "接入失败" : "失败" + res)));
				opGmtNoticeMapper.insertSelective(opGmtNotice);
				
			}
			
		}
		return res;
	}
	
	public String sendNotic(OpGmtNoticeCycle opGmtNoticeCycle) {
		GmtSendNoticeBean gmtSendNoticeBean = new GmtSendNoticeBean();
		gmtSendNoticeBean.setAppid(opGmtNoticeCycle.getAppid());
		gmtSendNoticeBean.setWid(Integer.parseInt(opGmtNoticeCycle.getWorldid()));
		gmtSendNoticeBean.setType(opGmtNoticeCycle.getType() + "");
		gmtSendNoticeBean.setTime(opGmtNoticeCycle.getCycletime() + "");
		gmtSendNoticeBean.setContent(opGmtNoticeCycle.getContent());
		gmtSendNoticeBean.setMsg(opGmtNoticeCycle.getMsg());
		gmtSendNoticeBean.setUser(opGmtNoticeCycle.getUsername());
		gmtSendNoticeBean.setAct("5100");
		
		String res = sendNotic(gmtSendNoticeBean);
		
		return res;
	}
	
	public List<OpGmtNotice> getNoticList() {
		OpGmtNoticeExample opGmtNoticeExample = new OpGmtNoticeExample();
		OpGmtNoticeExample.Criteria criteria = opGmtNoticeExample.createCriteria();
		opGmtNoticeExample.setOrderByClause("opttime desc");
		
		List<OpGmtNotice> msg = opGmtNoticeMapper.selectList(opGmtNoticeExample);
		return msg;
	}
	
	public int sendCycleNotic(GmtSendNoticeBean gmtSendNoticeBean) {
		OpGmtNoticeCycle opGmtNoticeCycle = new OpGmtNoticeCycle();
		opGmtNoticeCycle.setContent(gmtSendNoticeBean.getContent());
		opGmtNoticeCycle.setMsg(gmtSendNoticeBean.getMsg());
		opGmtNoticeCycle.setType(Integer.parseInt(gmtSendNoticeBean.getType()));
		opGmtNoticeCycle.setCycletime(Integer.parseInt(gmtSendNoticeBean.getTime()));
		opGmtNoticeCycle.setUsername(gmtSendNoticeBean.getUser());
		opGmtNoticeCycle.setWorldid(gmtSendNoticeBean.getWid() + "");
		opGmtNoticeCycle.setAppid(gmtSendNoticeBean.getAppid());
		opGmtNoticeCycle.setSettime(Tools.getNowDate());
		opGmtNoticeCycle.setStatus("1"); // 活跃
		
		int res = opGmtNoticeCycleMapper.insertSelective(opGmtNoticeCycle);
		
		// 放入循环公告...
		SendNoticeCycle.cycleNotices.put(opGmtNoticeCycle.getDid(), opGmtNoticeCycle);
		
		return res; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public List<OpGmtNoticeCycle> getCycleNoticeList(String status) {
		OpGmtNoticeCycleExample opGmtNoticeCycleExample = new OpGmtNoticeCycleExample();
		OpGmtNoticeCycleExample.Criteria criteria = opGmtNoticeCycleExample.createCriteria();
		if (!status.equals("-1")) {
			criteria.andStatusEqualTo(status); // 1: 活跃
		}
		
		List<OpGmtNoticeCycle> lists = opGmtNoticeCycleMapper.selectByExample(opGmtNoticeCycleExample);
		return lists;
	}
	
	public int stopCycleNotic(String ids) {
		
		String dids[] = ids.split(",");
		List<Integer> values = new ArrayList<Integer>();
		for (String id : dids) {
			values.add(Integer.parseInt(id));
		}
		
		OpGmtNoticeCycleExample opGmtNoticeCycleExample = new OpGmtNoticeCycleExample();
		OpGmtNoticeCycleExample.Criteria criteria = opGmtNoticeCycleExample.createCriteria();
		criteria.andDidIn(values);
		
		OpGmtNoticeCycle opGmtNoticeCycle = new OpGmtNoticeCycle();
		opGmtNoticeCycle.setStatus("0");
		
		int res = opGmtNoticeCycleMapper.updateByExampleSelective(opGmtNoticeCycle, opGmtNoticeCycleExample);
		
		List<OpGmtNoticeCycle> opGmtNoticeCycles = opGmtNoticeCycleMapper.selectByExample(opGmtNoticeCycleExample);
		if (opGmtNoticeCycles.size() > 0) {
			for (OpGmtNoticeCycle obj : opGmtNoticeCycles) {
				if (obj.getStatus().equals("0")) {
					// 去除循环公告...
					if (SendNoticeCycle.cycleNotices.get(obj.getDid()) != null) {
						SendNoticeCycle.cycleNotices.remove(obj.getDid());
					}
				}
			}
		}
		return res;
	}
	
	public int startCycleNotic(String ids) {
		String dids[] = ids.split(",");
		List<Integer> values = new ArrayList<Integer>();
		for (String id : dids) {
			values.add(Integer.parseInt(id));
		}
		
		// 更新状态
		OpGmtNoticeCycleExample opGmtNoticeCycleExample = new OpGmtNoticeCycleExample();
		OpGmtNoticeCycleExample.Criteria criteria = opGmtNoticeCycleExample.createCriteria();
		criteria.andDidIn(values);
		
		OpGmtNoticeCycle opGmtNoticeCycle = new OpGmtNoticeCycle();
		opGmtNoticeCycle.setStatus("1");
		
		int res = opGmtNoticeCycleMapper.updateByExampleSelective(opGmtNoticeCycle, opGmtNoticeCycleExample);
		
		// 查询获取
		List<OpGmtNoticeCycle> opGmtNoticeCycles = opGmtNoticeCycleMapper.selectByExample(opGmtNoticeCycleExample);
		if (opGmtNoticeCycles.size() > 0) {
			for (OpGmtNoticeCycle obj : opGmtNoticeCycles) {
				if (obj.getStatus().equals("1")) {
					// 放入循环公告...
					if (SendNoticeCycle.cycleNotices.get(obj.getDid()) == null) {
						SendNoticeCycle.cycleNotices.put(obj.getDid(), obj);
					}
				}
			}
		}
		
		return res;
	}
	
	public int del(String ids) {
		String dids[] = ids.split(",");
		List<Integer> values = new ArrayList<Integer>();
		for (String id : dids) {
			values.add(Integer.parseInt(id));
			
			SendNoticeCycle.cycleNotices.remove(new Integer(id));
		}
		
		OpGmtNoticeCycleExample opGmtNoticeCycleExample = new OpGmtNoticeCycleExample();
		OpGmtNoticeCycleExample.Criteria criteria = opGmtNoticeCycleExample.createCriteria();
		criteria.andDidIn(values);
		
		int res = opGmtNoticeCycleMapper.deleteByExample(opGmtNoticeCycleExample);
		
		return res;
	}
}
