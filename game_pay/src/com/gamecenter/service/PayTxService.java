package com.gamecenter.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.parBean.vo.ComPars;

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
	
	/**
	 * 核对通知发货
	 * 
	 * @param billno
	 * @return
	 */
	public int payConfirm(String billno, int ret);
	
	public final static Map<String, ComPars> pars = new ConcurrentHashMap<String, ComPars>();
	
	public int intogame(ComPars comPars);
	
	public ComPars getComPars(String openid);
	
}
