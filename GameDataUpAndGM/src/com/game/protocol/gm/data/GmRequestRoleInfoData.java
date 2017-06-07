package com.game.protocol.gm.data;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (查看角色请求的数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRequestRoleInfoData implements IGmData {
	
	/** 消息体 type String 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** 账号标示； 标示的类型由type决定。 如果标示的类型是角色名称，查询时请使用模糊匹配。 **/
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
	
}
