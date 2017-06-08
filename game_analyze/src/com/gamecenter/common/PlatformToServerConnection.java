
package com.gamecenter.common;

import java.io.UnsupportedEncodingException;

import com.lyh.common.ConvertMapUtils;
import com.lyh.dataup.log.DataUpBase;

/** 
 * ClassName:MsgConvertUtils <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * 平台连接到游戏服务连接
 * Date:     2017年6月7日 下午5:44:07 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class PlatformToServerConnection {

	/** 
	 * sendPlatformToServer:(). <br/> 
	 * TODO().<br/> 
	 * 平台连接到游戏服务连接
	 * @author lyh 
	 * @param ip
	 * @param port
	 * @param req
	 * @return 
	 */  
	public static DataUpBase sendPlatformToServer(String ip,String port,DataUpBase req){
		byte data[] = null;
		try {
			String jsonString = ConvertMapUtils.objToString(req);
			data = jsonString.getBytes("UTF-8");
			String strResutl = HttpClient.doPost(ip+":"+port+"/platform",data);
			DataUpBase resp = ConvertMapUtils.jsonStringToObj(false, strResutl);
		
			return   resp;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		return null;
		
	}
}
  