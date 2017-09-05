package com.gamecenter.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by IntelliJ IDEA. User: juugoo08 Date: 11-8-24 Time: 下午10:11 To change this template use File | Settings | File Templates.
 */

public class GameAct {
	/**
	 * 激活游戏
	 * 
	 * @param userId
	 * @param productId
	 * @return -1:异常 1:成功 2:已经存在
	 */
	public String hyAct(String userId, String productId) {
		// 不对起，未知错误,充值失败！
		String flag = "-1";
		try {
			String productUri = null;
			productUri = Config.getInstance("").getValue("act" + productId); // 获得回调地址
			
			// String Sign = MD5.encodeMD5(OrderId + "jugo" + UserAccount + Point + Key); //新加密方式
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(productUri).openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setDoInput(true);
			PrintWriter out1 = new PrintWriter(httpConnection.getOutputStream());
			out1.print("userId=" + userId);
			out1.flush();
			out1.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
			String line;
			flag = "";
			while ((line = in.readLine()) != null) {
				if (!line.trim().equals(""))
					flag = flag + line;
			}
			
			in.close();
			httpConnection.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
			flag = "-1";
		}
		
		return flag;
	}
}
