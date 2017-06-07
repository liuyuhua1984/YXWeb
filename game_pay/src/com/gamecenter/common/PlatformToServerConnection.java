
package com.gamecenter.common;

import java.io.UnsupportedEncodingException;

import com.alibaba.fastjson.JSON;
import com.lyh.common.ConvertMapUitls;
import com.lyh.dataup.convert.GameConvertData;
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
		GameConvertData cData = new GameConvertData(req);
		byte data[];
		try {
			data = JSON.toJSONString(cData).getBytes("UTF-8");
			String strResutl = HttpClient.doPost(ip+":"+port+"/platform",data);
			cData = JSON.parseObject(strResutl,GameConvertData.class);
			Class<? extends DataUpBase> resp = ConvertMapUitls.getHttpResponseClass(cData.getId());
			return   JSON.parseObject(cData.getData(), resp);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		return null;
		
	}
}
  