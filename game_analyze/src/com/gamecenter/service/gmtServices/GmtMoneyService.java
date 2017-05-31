package com.gamecenter.service.gmtServices;

import com.gamecenter.common.Page;
import com.gamecenter.model.*;
import com.gamecenter.parBean.vo.GmtSendMoneyBean;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;

import java.util.List;

/**
 * GMT金币发放服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface GmtMoneyService {
	
	/**
	 * 添加申请记录
	 * 
	 * @param opGmtSendmoney
	 * @return
	 */
	public int insertApply(OpGmtSendmoney opGmtSendmoney);
	
	/**
	 * 获取申请列表
	 * 
	 * @return
	 */
	public List<OpGmtSendmoney> getApplyList();
	
	/**
	 * 获取审核 -- 根据申请ID
	 * 
	 * @return
	 */
	public OpGmtSendmoney getApplyListById(int applyId);
	
	/**
	 * 审核操作
	 * 
	 * @param opGmtSendmoney
	 * @return
	 */
	public int checkApply(OpGmtSendmoney opGmtSendmoney);
	
	/**
	 * 金币发放 操作
	 * 
	 * @param gmtSendMoneyBean
	 * @return
	 */
	public String sendMoney(GmtSendMoneyBean gmtSendMoneyBean);
	
	/**
	 * 获取发放日志
	 * 
	 * @return
	 */
	public List<OpGmtSendmoneyLog> getSendLogList();
	
	/**
	 * 内充玩家 获取金币记录
	 * 
	 * @param obj
	 * @param pageSize
	 * @param pageNumber
	 * @return
	 */
	public Page getMoneyList(OpGmtSendmoneyPay obj, int pageSize, int pageNumber);
	
	/**
	 * 汇总内充总额
	 * 
	 * @param obj
	 * @return
	 */
	public double getPayCount(OpGmtSendmoneyPay obj);
	
}
