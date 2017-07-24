package com.gamecenter.common.pay.wechat;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/** 
 * ClassName:WXSignUtils <br/> 
 * Function: TODO (). <br/> 
 * 微信支付签名
 * Date:     2017年7月24日 上午11:00:55 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class WXSignUtils {
	//http://mch.weixin.qq.com/wiki/doc/api/index.php?chapter=4_3
	    //商户Key：改成公司申请的即可
	    //32位密码设置地址：http://www.sexauth.com/  jdex1hvufnm1sdcb0e81t36k0d0f15nc

	    private static String Key = "***cb**e**ef**c*e*d***e*fd***cb*";

	    /**
	     * 微信支付签名算法sign
	     * @param characterEncoding
	     * @param parameters
	     * @return
	     */
	    @SuppressWarnings("rawtypes")
	    public static String createSign(String characterEncoding,SortedMap<Object,Object> parameters){


	        StringBuffer sb = new StringBuffer();
	        Set es = parameters.entrySet();//所有参与传参的参数按照accsii排序（升序）
	        Iterator it = es.iterator();
	        while(it.hasNext()) {
	            Map.Entry entry = (Map.Entry)it.next();
	            String k = (String)entry.getKey();
	            Object v = entry.getValue();
	            if(null != v && !"".equals(v) 
	                    && !"sign".equals(k) && !"key".equals(k)) {
	                sb.append(k + "=" + v + "&");
	            }
	        }
	        sb.append("key=" + Key);
	        System.out.println("字符串拼接后是："+sb.toString());
	        String sign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
	        return sign;
	    }
}
  