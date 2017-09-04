package com.gamecenter.common;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gamecenter.common.txsdk.com.qq.open.https.MyX509TrustManager;

/**
 * http客户端
 * 
 * @author lyh1984
 */
public class HttpClient {
	private static Logger logger = LoggerFactory.getLogger(HttpClient.class);
	

	public static String doGet(String url) {
		return send("http://"+url, false, null);
	}
	
	public static String doPost(String url,byte data[]) {
		return send("http://"+url, true, data);
	}
	
	
	/**
	 * @param isPost
	 * @param data
	 */
	public static String send(String strUrl, boolean isPost, byte data[]) {
		URL url;
		HttpURLConnection con = null;
		try {
			// "http://117.135.138.206:8888/YeePayHttpServer"
			url = new URL(strUrl);
			con = (HttpURLConnection) url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setAllowUserInteraction(false);
			con.setUseCaches(false);
			// 设定请求的方法为"POST"，默认是GET
			if (isPost) {
				con.setRequestMethod("POST");
			} else {
				con.setRequestMethod("GET");
			}
			
			// con.setRequestProperty("Content-Type",
			// "application/x-www-form-urlencoded");
			con.setRequestProperty("Content-Length", String.valueOf(data.length));
			con.setConnectTimeout(30000);// jdk 1.5换成这个,连接超时
			con.setReadTimeout(30000);// jdk 1.5换成这个,读操作超时
			try{
				con.connect();
			}catch(Exception e){
				//logger.error("http连接问题", e);
				return null;
			}
			if (isPost) {
				OutputStream os = con.getOutputStream();
				os.write(data);
				os.flush();
				os.close();
			}
			
			// 获得响应状态
			int responsErrorCode = con.getResponseCode();
			if (HttpURLConnection.HTTP_OK == responsErrorCode) {
				InputStream is = con.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				byte[] buffer = new byte[1024];
				int len = -1;
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				while ((len = is.read(buffer)) != -1) {
					bos.write(buffer, 0, len);
				}
				dis.close();
				is.close();
				 bos.close();
				return bos.toString("utf-8");
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (con != null) {
			//	con.disconnect();
			}
		}
		return null;
	}
	
	
	
	/**
	 * @param isPost
	 * @param data
	 */
	public static JSONObject getJsonObject(String strUrl, boolean isPost, String data) {
		URL url = null;
		HttpURLConnection con = null;
		try {
			url = new URL(strUrl);
			con = (HttpURLConnection) url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setAllowUserInteraction(false);
			con.setUseCaches(false);
			// 设定请求的方法为"POST"，默认是GET
			if (isPost) {
				con.setRequestMethod("POST");
			} else {
				con.setRequestMethod("GET");
			}
			
			con.setConnectTimeout(30000);// jdk 1.5换成这个,连接超时
			con.setReadTimeout(30000);// jdk 1.5换成这个,读操作超时
			con.connect();
			
			if (isPost) {
				PrintWriter pw = new PrintWriter(con.getOutputStream());
				pw.write(data);
				pw.flush();
				pw.close();
			}
			
			// 获得响应状态
			int responsErrorCode = con.getResponseCode();
			if (HttpURLConnection.HTTP_OK == responsErrorCode) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String line = "";
				String json = "";
				while ((line = in.readLine()) != null) {
					if (!line.trim().equals(""))
						json += line;
				}
				in.close();
				if (!ToolUtils.isStringNull(json)) {
					return JSONObject.parseObject(json);
				} else {
					logger.error("CDK---平台返回参数错误！");
				}
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("与平台连接出现问题");
		}
		
		finally {
			if (con != null) {
				con.disconnect();
			}
		}
		return null;
	}
	
	
	
	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		//Map<String,String > map = new HashMap<String, String>();
		
//		   "amount": "100", 
//		    "receive_time": "20160512143030", 
//		    "complete_time": "20160512143030", 
//		    "merch_id": "m1601310003", 
//		    "charge_id": "charge_id", 
//		    "order_no": "test1470654170170", 
//		    "ret_code": "0000", 
//		"ret_info": "交易成功",
//		"optional": "aaa=111,bbb=222,ccc=333",
//		"version": "V2.1.1",
//		"sign_type": "md5",
//		"sign_info": "dd019450a53a15f01d1293c72a86e2ec"
		JSONObject map = new JSONObject();
			
		map.put("amount", "40000");
		map.put("receive_time", "20160512143030");
		map.put("complete_time", "20160512143030");
		map.put("merch_id", "m1601310003");
		map.put("charge_id", "charge_id");
		map.put("order_no", "test1470654170170");
		map.put("ret_code", "0000");
		map.put("ret_info", "交易成功");
		map.put("optional", "openId=321654");
		map.put("version", "V2.1.1");
		map.put("sign_type", "md5");
	
		
		String signKey = "8BB418FCA8A480BC3E00365AE14148A2";
		try {
		
			// 得到待签名数据
			Map<String, ?> filterMap = paraFilter(map);
			String linkStr = createLinkString(filterMap);
			// 拼装md5串 md5.linkStr
			String templinkStr = linkStr + signKey;
			String md5Hex = DigestUtils.md5Hex(templinkStr.getBytes("UTF-8"));
			map.put("sign_info",md5Hex);
			
			String json =map.toString();
			
			   String lineSeparator = java.security.AccessController.doPrivileged(
				            new sun.security.action.GetPropertyAction("line.separator"));
			   json+="/r/n";// /r/n;
			   logger.equals("json"+json);
			String str = doPost("192.168.0.189:8090/game/notify/1001/pay", json.getBytes("utf-8"));
			logger.error("返回状态::"+str);
		}catch(Exception e){
			
		}
	}
	
	
	/**
	 * 验证接收付钱拉通知签名入口
	 * 
	 * @param merch_id
	 * @param sign_type
	 * @param objMap
	 * @return
	 * @throws Exception
	 */
	public static boolean md5Verify(Map<String, ?> objMap) {
		boolean flag = false;
		String signKey = "8BB418FCA8A480BC3E00365AE14148A2";
		try {
			String hexSign = String.valueOf(objMap.get("sign_info"));
			// 得到待签名数据
			Map<String, ?> filterMap = paraFilter(objMap);
			String linkStr = createLinkString(filterMap);
			// 拼装md5串 md5.linkStr
			String templinkStr = linkStr + signKey;
			String md5Hex = DigestUtils.md5Hex(templinkStr.getBytes("UTF-8"));
			// 验证签名后数据是否相同
			flag = hexSign.equalsIgnoreCase(md5Hex);
		} catch (Exception e) {
			// 验证通知签名信息error
		}
		return flag;
		
	}
	
	
	/**
	 * 除去数组中的空值和签名参数
	 * 
	 * @param sArray 签名参数组
	 * @return 去掉空值与签名参数后的新签名参数组
	 */
	private static Map<String, ?> paraFilter(Map<String, ?> sArray) {
		Map<String, Object> result = new HashMap<String, Object>();
		if ((sArray == null) || (sArray.size() <= 0)) {
			return result;
		}
		for (String key : sArray.keySet()) {
			Object value = sArray.get(key);
			if ((value == null) || value.equals("") || key.equalsIgnoreCase("sign_info") || key.equalsIgnoreCase("sign_type")) {
				continue;
			}
			if (value instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, ?> m = (Map<String, ?>) value;
				result.put(key, paraFilter(m));
			} else if (value instanceof List) {
				continue;// 不应包含多集合数据
			} else {
				result.put(key, value);
			}
		}
		return result;
	}
	
	/**
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	 * 
	 * @param params 需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	private static String createLinkString(Map<String, ?> params) {
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		StringBuffer prestr = new StringBuffer("");
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			Object o = params.get(key);
			String value = String.valueOf(o);
			if (o instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, ?> m = (Map<String, ?>) o;
				value = "{" + createLinkString(m) + "}";
			}
			
			if (i == (keys.size() - 1)) {// 拼接时，不包括最后一个&字符
				prestr.append(key + "=" + value);
			} else {
				prestr.append(key + "=" + value + "&");
			}
		}
		return prestr.toString();
	}
	
	
	/**
	     * 发送https请求
	     * 微信accesstoken验证
	     * @param requestUrl 请求地址
	     * @param requestMethod 请求方式（GET、POST）
	     * @param outputStr 提交的数据
	     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
	     */
	    public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr) {
	        JSONObject jsonObject = null;
	        try {
	            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
	            TrustManager[] tm = { new MyX509TrustManager() };
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
	            jsonObject = JSON.parseObject(buffer.toString());
	        } catch (ConnectException ce) {
	            logger.error("连接超时：{}", ce);
	        } catch (Exception e) {
	            logger.error("https请求异常：{}", e);
	        }
	        return jsonObject;
	    }
}
