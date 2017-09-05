package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (平台的奖励). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmOpenRewardActivitiesHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmOpenRewardActivitiesHttpProtocol() {
		super(GM_OPEN_REWARD_ACTIVITIES_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** -1:失败 1:成功 失败时,信息为空 **/
	private int result;
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
}
