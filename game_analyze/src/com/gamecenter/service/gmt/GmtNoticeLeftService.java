package com.gamecenter.service.gmt;

import java.util.List;

import com.gamecenter.model.OpGmtNotice;
import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.model.OpGmtNoticeLeft;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;
import com.gamecenter.service.agent.BaseService;

/**
 * 发送公告服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface GmtNoticeLeftService extends BaseService<OpGmtNoticeLeft>{
	
	/**
	 * 发送公告
	 * 
	 * @param gmtSendNoticeBean
	 * @return
	 */
	public String sendNoticLeft(OpGmtNoticeLeft noticeLeft);
	

	
	/**
	 * 获取发送记录
	 * 
	 * @return
	 */
	public List<OpGmtNoticeLeft> getNoticList();
	
	
}
