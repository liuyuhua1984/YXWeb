package com.gamecenter.common.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.gamecenter.service.RunLog;

/**
 * http 请求 Created with IntelliJ IDEA. User: gsb Date: 14-8-29 Time: 上午11:56 To change this template use File | Settings | File Templates.
 */
public class HttpReq {
	
	/**
	 * 发送HTTP请求
	 * 
	 * @param url
	 * @param params
	 * @return -1:请求异常
	 */
	public static String http(String url, HashMap<String, String> params) {
		String flag = "";
		
		// 参数构建
		String param = "";
		if (params != null && params.size() > 0) {
			Iterator iter = params.entrySet().iterator();
			int i = 0;
			while (iter.hasNext()) {
				Map.Entry entry = (Map.Entry) iter.next();
				if (i == 0) {
					param += "" + (String) entry.getKey() + "=" + (String) entry.getValue();
				} else {
					param += "&" + (String) entry.getKey() + "=" + (String) entry.getValue();
				}
				i++;
			}
		}
		
		// 发送请求
		try {
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setDoInput(true);
			// 设定请求的方法为"POST"，默认是GET
			// httpConnection.setRequestMethod("POST");
			
			PrintWriter out = new PrintWriter(httpConnection.getOutputStream());
			out.print(param);
			out.flush();
			out.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(httpConnection.getInputStream(), "utf-8")); // 注意返回的乱码
			String line;
			flag = "";
			while ((line = in.readLine()) != null) {
				if (!line.trim().equals(""))
					flag = flag + line;
			}
			in.close();
			httpConnection.disconnect();
		} catch (Exception e) {
			flag = "-1";
			RunLog.logDao.error("初始化异常：", e);
		}
		return flag;
	}
	
}
