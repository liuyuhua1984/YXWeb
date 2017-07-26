package com.gamecenter.common.pay.apple;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

/**
 * ClassName:ApplePayHttpUtils <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年7月26日 上午10:27:49 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class ApplePayHttpUtils {
	
	private static Logger logger = LoggerFactory.getLogger(ApplePayHttpUtils.class);
	
	/**
	 * 重写X509TrustManager
	 */
	private static TrustManager myX509TrustManager = new X509TrustManager() {
		
		@Override
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}
		
		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		
		}
		
		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		
		}
	};
	
	/**
	 * 发送请求
	 * 
	 * @param url
	 * @param strings
	 * @return
	 */
	public static String sendHttpsAppleVerify(String url, String code) {
		if (url.isEmpty()) {
			return null;
		}
		try {
			// 设置SSLContext
			SSLContext ssl = SSLContext.getInstance("SSL");
			ssl.init(null, new TrustManager[] { myX509TrustManager }, null);
			
			// 打开连接
			HttpsURLConnection conn = (HttpsURLConnection) new URL(url).openConnection();
			// 设置套接工厂
			conn.setSSLSocketFactory(ssl.getSocketFactory());
			// 加入数据
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-type", "application/json");
			
			JSONObject obj = new JSONObject();
			obj.put("receipt-data", code);
			
			BufferedOutputStream buffOutStr = new BufferedOutputStream(conn.getOutputStream());
			buffOutStr.write(obj.toString().getBytes());
			buffOutStr.flush();
			buffOutStr.close();
			
			// 获取输入流
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("apple iap 验证::",e);
			return null;
		}
	}
	
}
