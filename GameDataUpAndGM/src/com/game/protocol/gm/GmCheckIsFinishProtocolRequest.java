package com.game.protocol.gm;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmCheckIsFinishProtocol <br/>
 * Function: TODO ("GM检查任务集市中任务是否完成"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmCheckIsFinishProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmCheckIsFinishProtocolRequest() {
		super(GM_CHECK_IS_FINISH_HTTP_PROTOCOL);
	}
	
	/** 验证类型 **/
	private String cmd;
	
	/** 账号 **/
	private String openid;
	
	/** 任务配置表Id */
	private int taskid;
	
	public String getCmd() {
		return cmd;
	}
	
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public int getTaskid() {
		return taskid;
	}
	
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	
}
