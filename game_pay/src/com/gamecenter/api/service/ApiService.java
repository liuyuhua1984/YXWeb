package com.gamecenter.api.service;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-26 Time: 下午5:35 To change this template use File | Settings | File Templates.
 */
public interface ApiService {
	
	/**
	 * 充值订单处理
	 * 
	 * @param pssport
	 * @param billno
	 * @param money
	 * @param time
	 * @param sid
	 * @param flag
	 * @return
	 */
	public int recharge(String appId,String pssport, String billno, double money, int time, int sid, String flag);
	
	/**
	 * 验证账号是否激活
	 * 
	 * @param pssport
	 * @param sid
	 * @return
	 */
	public Object checkUser(String pssport, int sid);
}
