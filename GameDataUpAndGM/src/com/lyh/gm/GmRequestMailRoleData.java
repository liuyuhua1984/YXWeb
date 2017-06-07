package com.lyh.gm;

/**
 * ClassName:GMRerquestRechargeData <br/>
 * Function: TODO (邮件的请求的数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:24:51 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRequestMailRoleData implements IGmData {
	/** type String 1 或者 2 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** actstr String 账号标示； 标示的类型由type决定。 **/
	private String actstr;
	
	/** content String 发送内容 **/
	private String content;
	
	/*** extendstr String 扩展信息，预留为”” **/
	private String extendstr;
	
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
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getExtendstr() {
		return extendstr;
	}
	
	public void setExtendstr(String extendstr) {
		this.extendstr = extendstr;
	}
	
	@Override
	public String getServerId() {
		// TODO Auto-generated method stub
		return serverId;
	}
	
}
