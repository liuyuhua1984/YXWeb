package com.game.protocol.gm;

import java.util.List;

import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GmAddWhiteNameProtocol <br/>
 * Function: TODO ("添加或删除白名单"). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-6-9 下午3:45:23 <br/>
 * 
 * @author lxx
 * @version
 * @see
 */
public class GmAddOrDelWhiteNameProtocolRequest extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 1L;
	
	public GmAddOrDelWhiteNameProtocolRequest() {
		super(GM_ADD_OR_DEL_WHITE_NAME_HTTP_PROTOCOL);
	}
	
	/** 1：添加 2：删除 */
	private int type;
	
	/** 名单列表 */
	private List<String> lists;
	
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public List<String> getLists() {
		return lists;
	}
	
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	
}
