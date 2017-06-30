package com.gamecenter.service.agent;

import java.util.List;

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
	int recharge(String pssport, String billno,double dPrice, double money, int time, String sid, String flag,OpGameworld opGameworld);
	
	
	/** 
	 * findOpOperatorRechargeByWorldIdAndTime:(). <br/> 
	 * TODO().<br/> 
	 * 查找充值记录
	 * @author lyh 
	 * @param worldId
	 * @param beginTime
	 * @param endTime
	 * @return 
	 */  
	List<OpOperatorRecharge> findOpOperatorRechargeByWorldIdAndTime(String worldId,String beginTime,String endTime);
		
	
	/** 
	 * payCount:(). <br/> 
	 * TODO().<br/> 
	 * 统计累计充值
	 * @author lyh 
	 * @param worldId
	 * @param beginTime
	 * @param endTime
	 * @return 
	 */  
	double payCount(String worldId,String beginTime,String endTime);
	
}
  