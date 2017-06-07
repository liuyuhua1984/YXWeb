package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (GM发送邮件消息). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmMailRoleProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmMailRoleProtocolRequest() {
		super(GM_EMAIL_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** type String 1 或者 2 标示类型： 1：openid 2：角色名称 **/
	private int type;
	
	/** actstr String 账号标示； 标示的类型由type决定。 **/
	private String actstr;
	
	/** content String 发送内容 **/
	private String content;
	
	/*** extendstr String 扩展信息，预留为”” **/
	private String extendstr;
	
	private String serverId;
	

	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	

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
	

	public String getServerId() {
		// TODO Auto-generated method stub
		return serverId;
	}
	
}
