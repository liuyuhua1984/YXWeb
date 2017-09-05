package com.gamecenter.common.pay.wechat;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gamecenter.common.txsdk.com.qq.open.https.MyX509TrustManager;

/** 
 * ClassName:CommonUtil <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年7月24日 上午11:25:59 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class CommonUtil {
	 private static Logger log = LoggerFactory.getLogger(CommonUtil.class);
	    /**
	     * 发送https请求
	     * @param requestUrl 请求地址
	     * @param requestMethod 请求方式（GET、POST）
	     * @param outputStr 提交的数据
	     * @return 返回微信服务器响应的信息
	     */
	    public static String httpsRequest(String requestUrl, String requestMethod, String outputStr) {
	        try {
	            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
	            MyX509TrustManager[] tm = { new MyX509TrustManager() };
	            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	            sslContext.init(null, tm, new java.security.SecureRandom());
	            // 从上述SSLContext对象中得到SSLSocketFactory对象
	            SSLSocketFactory ssf = sslContext.getSocketFactory();
	            URL url = new URL(requestUrl);
	            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	            conn.setSSLSocketFactory(ssf);
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            conn.setUseCaches(false);
	            // 设置请求方式（GET/POST）
	            conn.setRequestMethod(requestMethod);
	            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
	            // 当outputStr不为null时向输出流写数据
	            if (null != outputStr) {
	                OutputStream outputStream = conn.getOutputStream();
	                // 注意编码格式
	                outputStream.write(outputStr.getBytes("UTF-8"));
	                outputStream.close();
	            }
	            // 从输入流读取返回内容
	            InputStream inputStream = conn.getInputStream();
	            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
	            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	            String str = null;
	            StringBuffer buffer = new StringBuffer();
	            while ((str = bufferedReader.readLine()) != null) {
	                buffer.append(str);
	            }
	            // 释放资源
	            bufferedReader.close();
	            inputStreamReader.close();
	            inputStream.close();
	            inputStream = null;
	            conn.disconnect();
	            return buffer.toString();
	        } catch (ConnectException ce) {
	            log.error("连接超时：{}", ce);
	        } catch (Exception e) {
	            log.error("https请求异常：{}", e);
	        }
	        return null;
	    }

	    /**
	     * 获取接口访问凭证
	     *
	     * @param appid 凭证
	     * @param appsecret 密钥
	     * @return
	     *//*
	    public static Token getToken(String appid, String appsecret) {
	        Token token = null;
	        String requestUrl = ConfigUtil.TOKEN_URL.replace("APPID", appid).replace("APPSECRET", appsecret);
	        // 发起GET请求获取凭证
	        JSONObject jsonObject = JSONObject.fromObject(httpsRequest(requestUrl, "GET", null));

	        if (null != jsonObject) {
	            try {
	                token = new Token();
	                token.setAccessToken(jsonObject.getString("access_token"));
	                token.setExpiresIn(jsonObject.getInt("expires_in"));
	            } catch (JSONException e) {
	                token = null;
	                // 获取token失败
	                log.error("获取token失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));
	            }
	        }
	        return token;
	    }
	    public static String urlEncodeUTF8(String source){
	        String result = source;
	        try {
	            result = java.net.URLEncoder.encode(source,"utf-8");
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        return result;
	    }*/
	    
	    
	    /** 
	 * getNonceStr:(). <br/> 
	 * TODO().<br/> 
	 * 随机字符串，长度要求在32位以内。
	 * @author lyh 
	 * @return 
	 */  
	public static String getNonceStr(){
		    String chars="abcdefghijklmnopqrstuvwxyz0123456789";
			String str="";
			for (int i=0; i< 32; i++){
				int rand = Math.abs(ThreadLocalRandom.current().nextInt()%chars.length());
				str += chars.substring(rand,rand+1) ;
					//substr($chars,mt_rand(0,strlen($chars)-1),1);
			}
			return str;
	    }
}
  