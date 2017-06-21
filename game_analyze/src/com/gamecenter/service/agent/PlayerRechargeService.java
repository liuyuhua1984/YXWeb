package com.gamecenter.service.agent;

import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOperatorRecharge;

/** 
 * ClassName:PlayerRechargeService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月21日 上午9:28:20 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public interface PlayerRechargeService extends BaseService<OpOperatorRecharge> {

	
	/** 
	 * recharge:(). <br/> 
	 * TODO().<br/> 
	 * 玩家充值
	 * @author lyh 
	 * @param pssport
	 * @param billno
	 * @param money
	 * @param time
	 * @param sid
	 * @param flag
	 * @return 
	 */  
	int recharge(String pssport, String billno, double money, int time, String sid, String flag,OpGameworld opGameworld);
}
  