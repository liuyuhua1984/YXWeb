package com.lyh.dataup.convert;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import javax.annotation.security.DeclareRoles;

import com.alibaba.fastjson.JSON;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:ConvertData <br/>
 * Function: TODO (). <br/>
 * 转换数据类 Reason: TODO (). <br/>
 * Date: 2017年6月5日 下午6:31:19 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Deprecated
public class GameConvertData implements Serializable {
	
	/****/
	private static final long serialVersionUID = -5787349047172892429L;
	
	/** id=消息号 **/
	private long id;
	/** 对象转成data **/
	private byte data[];
	
	public GameConvertData( DataUpBase dataUpBase) {
		id = dataUpBase.getMsgCode();
		
		try {
			data = JSON.toJSON(dataUpBase).toString().getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
}
