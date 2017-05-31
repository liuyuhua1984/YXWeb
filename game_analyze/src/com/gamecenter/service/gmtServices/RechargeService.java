package com.gamecenter.service.gmtServices;

import com.gamecenter.common.Page;
import com.gamecenter.model.OpOssQlzRechargeTx;

/**
 * 充值记录处理 Created with IntelliJ IDEA. User: gsb Date: 14-5-15 Time: 下午1:40 To change this template use File | Settings | File Templates.
 */
public interface RechargeService {
	
	/**
	 * 分页获取腾讯充值记录
	 * 
	 * @param obj
	 * @param pageSize
	 * @param pageNum
	 * @return
	 */
	public Page getRechargeTxList(OpOssQlzRechargeTx obj, int pageSize, int pageNum);
	
	/**
	 * 累计充值
	 * 
	 * @param obj
	 * @return
	 */
	public double paycount(OpOssQlzRechargeTx obj);
	
	/**
	 * 获取订单明细
	 * 
	 * @param id
	 * @return
	 */
	public OpOssQlzRechargeTx getRechargeTxById(int id);
	
	/**
	 * 获取订单明细
	 * 
	 * @param billno
	 * @return
	 */
	public OpOssQlzRechargeTx getMsgByBillOn(String billno);
	
	/**
	 * 发货操作
	 * 
	 * @param billno
	 * @return
	 */
	public String fahuo(String billno);
}
