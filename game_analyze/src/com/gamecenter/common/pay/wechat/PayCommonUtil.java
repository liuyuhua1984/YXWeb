package com.gamecenter.common.pay.wechat;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/**
 * ClassName:PayCommonUtil <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年7月24日 上午11:23:31 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class PayCommonUtil {
	// 定义签名，微信根据参数字段的ASCII码值进行排序 加密签名,故使用SortMap进行参数排序
	public static String createSign(String characterEncoding, SortedMap<String, String> parameters) {
		StringBuffer sb = new StringBuffer();
		Set es = parameters.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			Object v = entry.getValue();
			if (null != v && !"".equals(v) && !"sign".equals(k) && !"key".equals(k)) {
				sb.append(k + "=" + v + "&");
			}
		}
		sb.append("key=" + WeChatAPPUtils.KEY);// 最后加密时添加商户密钥，由于key值放在最后，所以不用添加到SortMap里面去，单独处理，编码方式采用UTF-8
		String sign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
		return sign;
	}
	
	// 将封装好的参数转换成Xml格式类型的字符串
	public static String getRequestXml(SortedMap<String, String> parameters) {
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		for (Map.Entry<String, String> entry : parameters.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			if (val.matches("^[0-9]*$")) {
				sb.append("<" + key + ">" + val + "</" + key + ">");
				// $xml.="<".$key.">".$val."</".$key.">";
			} else {
				sb.append("<" + key + "><![CDATA[" + val + "]]></" + key + ">");
				// $xml.="<".$key."><![CDATA[".$val."]]></".$key.">";
			}
			
		}
		
		sb.append("</xml>");
		
		// $xml="<xml>";
		// foreach ( $this->values as $key => $val ){
		// if (is_numeric($val)){
		// $xml.="<".$key.">".$val."</".$key.">";
		// }else{
		// $xml.="<".$key."><![CDATA[".$val."]]></".$key.">";
		// }
		// }
		// $xml.="</xml>";
		
		return sb.toString();
	}
}
