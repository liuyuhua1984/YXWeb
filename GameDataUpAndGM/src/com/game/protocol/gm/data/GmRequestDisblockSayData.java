package com.game.protocol.gm.data;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (解除禁言请求的数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRequestDisblockSayData implements IGmData {
	/** type String 1 或者 2 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** actstr String 账号标示； 标示的类型由type决定。 **/
	private String actstr;
	
	private String serverId;
	
	@Override
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String getActstr() {
		return actstr;
	}
	
	public void setActstr(String actstr) {
		this.actstr = actstr;
	}
	
	@Override
	public String getServerId() {
		// TODO Auto-generated method stub
		return serverId;
	}
	
	// public int getTime() {
	// return time;
	// }
	//
	// public void setTime(int time) {
	// this.time = time;
	// }
	
}
