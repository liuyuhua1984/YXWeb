package com.lyh.dataup.log;

import java.io.Serializable;

import com.lyh.common.IMsgCode;


/** 
 * ClassName:DataUpBase <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * 数据上报基础类
 * 数据上报暂时不用id
 * Date:     2017年6月5日 下午2:33:00 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public abstract class DataUpBase implements Serializable,IMsgCode{

	/****/  
	private static final long serialVersionUID = -8320926662030180605L;

	private int  msgCode;
	
	/**服务器id**/  
	private String serverId;
	
	/**记录创建时间**/  
	//private Timestamp createTime;
	
	public DataUpBase( int _msgCode){
		msgCode = _msgCode;
	//	createIdAndTime();
	}
	

//	public Timestamp getCreateTime() {
//        	return createTime;
//        }
//
//	public void setCreateTime(Timestamp createTime) {
//        	this.createTime = createTime;
//        }
	
//	/**
//	 * 創建id和記錄時間
//	 */
//	private void createIdAndTime(){
//		setCreateTime(new Timestamp(System.currentTimeMillis()));
//		//
//	//	this.setId(IdGenerateUtils.makeId());
//	}



	public int getMsgCode() {
		return msgCode;
	}



	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}


	public String getServerId() {
		return serverId;
	}


	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	
	
}
  