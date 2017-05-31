package com.gamecenter.service.gmtServices;

import com.gamecenter.model.OpGmtNotice;
import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;

import java.util.List;

/**
 * 发送公告服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface GmtNoticeService {
	
	/**
	 * 发送公告
	 * 
	 * @param gmtSendNoticeBean
	 * @return
	 */
	public String sendNotic(GmtSendNoticeBean gmtSendNoticeBean);
	
	public String sendNotic(OpGmtNoticeCycle opGmtNoticeCycle);
	
	/**
	 * 获取发送记录
	 * 
	 * @return
	 */
	public List<OpGmtNotice> getNoticList();
	
	/**
	 * 记录发送循环公告
	 * 
	 * @param gmtSendNoticeBean
	 * @return
	 */
	public int sendCycleNotic(GmtSendNoticeBean gmtSendNoticeBean);
	
	/**
	 * 获取循环公告信息
	 * 
	 * @param status -1:全状态获取
	 * @return
	 */
	public List<OpGmtNoticeCycle> getCycleNoticeList(String status);
	
	/**
	 * 停止循环公告
	 * 
	 * @param ids
	 * @return
	 */
	public int stopCycleNotic(String ids);
	
	/**
	 * 启用循环公告
	 * 
	 * @param ids
	 * @return
	 */
	public int startCycleNotic(String ids);
	
	/**
	 * 删除
	 * 
	 * @param ids
	 * @return
	 */
	public int del(String ids);
}
