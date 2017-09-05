package com.gamecenter.common.pay.alipay;  
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gamecenter.alipay.AlipayClient;
import com.gamecenter.alipay.AlipayConstants;
import com.gamecenter.alipay.DefaultAlipayClient;


/** 
 * ClassName:AlipayUtil <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年8月3日 下午5:13:50 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class AlipayUtil {
	public static final String ALIPAY_APPID = "dadddd"; // appid

	    public static String APP_PRIVATE_KEY = null; // app支付私钥

	    public static String ALIPAY_PUBLIC_KEY = null; // 支付宝公钥
	    /**通知地址**/  
		public static  String NOTIFY_URL="http://192.168.0.189:8090/game/alipay/pay/notify";
//	    static {
//	        try {
//	            Resource resource = new ClassPathResource("alipay_private_key_pkcs8.pem");
//	            APP_PRIVATE_KEY = FileUtil.readInputStream2String(resource.getInputStream());
//	            resource = new ClassPathResource("alipay_public_key.pem");
//	            ALIPAY_PUBLIC_KEY = FileUtil.readInputStream2String(resource.getInputStream());
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }

	    
	    
	    /**
	     * 返回签名编码拼接url
	     * 
	     * @param params
	     * @param isEncode
	     * @return
	     */
	    public static String getSignEncodeUrl(Map<String, String> map, boolean isEncode) {
	        String sign = map.get("sign");
	        String encodedSign = "";
	        if (!map.isEmpty()) {
	            map.remove("sign");
	            List<String> keys = new ArrayList<String>(map.keySet());
	            // key排序
	            Collections.sort(keys);

	            StringBuilder authInfo = new StringBuilder();

	            boolean first = true;// 是否第一个
	            for (String key: keys) {
	                if (first) {
	                    first = false;
	                } else {
	                    authInfo.append("&");
	                }
	                authInfo.append(key).append("=");
	                if (isEncode) {
	                    try {
	                        authInfo.append(URLEncoder.encode(map.get(key), AlipayConstants.CHARSET_UTF8));
	                    } catch (UnsupportedEncodingException e) {
	                        e.printStackTrace();
	                    }
	                } else {
	                    authInfo.append(map.get(key));
	                }
	            }

	            try {
	                encodedSign = authInfo.toString() + "&sign=" + URLEncoder.encode(sign, AlipayConstants.CHARSET_UTF8);
	            } catch (UnsupportedEncodingException e) {
	                e.printStackTrace();
	            }
	        }

	        return encodedSign.replaceAll("\\+", "%20");
	    }

	
}
  