package com.gamecenter.common;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

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
			con.connect();
			
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
}
