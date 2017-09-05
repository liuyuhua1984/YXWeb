package com.gamecenter.service.impl;

import com.gamecenter.model.OpOssQlzRechargeTx;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-7 Time: 上午9:52 To change this template use File | Settings | File Templates.
 */
public interface PayTxService {
	
	/**
	 * 数据插入
	 * 
	 * @param obj
	 * @return
	 */
	public int insert(OpOssQlzRechargeTx obj);
	
	/**
	 * 判定订单是否存在
	 * 
	 * @param billno
	 * @return
	 */
	public boolean isExist(String billno);
	
	/**
	 * 更新充值成功
	 * 
	 * @param billno
	 * @return
	 */
	public int payOk(String billno);
	
}
