package com.gamecenter.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

import com.gamecenter.common.encrypt.MD5;

/**
 * Created by IntelliJ IDEA. User: juugoo08 Date: 11-8-24 Time: 上午10:19 To change this template use File | Settings | File Templates.
 */
public class GamePay {
	
	/**
	 * 功能：对九维游戏进行充值
	 * 
	 * @param UserAccount 混服用户账号
	 * @param Point 充值的等值人民币数
	 * @param server_id 要充值的服务器域名
	 * @param OrderId 订单号
	 * @param Key MD5验证key密钥
	 * @return 返回结果： -1 -混服合作商标识为空或者不存在 1 -转换成功 2 -不存在该服 3 -验证串错误 4 -点数不对（比如小于0） 5 -用户没有激活该服务器 6 -数据执行失败 7 -重复提交（订单已生效）
	 */
	public String jweePay(String UserAccount, String productId, BigDecimal Point, String app_id, String server_id, String OrderId, String Key) {
		// 不对起，未知错误,充值失败！
		String flag = "{\"errno\":-3,\"error\":\"\u4e0d\u5bf9\u8d77\uff0c\u672a\u77e5\u9519\u8bef,\u5145\u503c\u5931\u8d25\uff01\"}";
		try {
			String productUri = null;
			productUri = Config.getInstance("").getValue("pay" + productId); // 获得回调地址
			
			String Sign = MD5.encodeMD5(OrderId + UserAccount + app_id + server_id + Point + Key); // 新加密方式
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(productUri).openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setDoInput(true);
			PrintWriter out1 = new PrintWriter(httpConnection.getOutputStream());
			out1.print("partner_order=" + OrderId + "&partner_id=488&username=" + UserAccount + "&app_id=" + app_id + "&server_id=" + server_id + "&amount=" + Point + "&sign=" + Sign);
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
			flag = "{\"errno\":-3,\"error\":\"\u4e0d\u5bf9\u8d77\uff0c\u672a\u77e5\u9519\u8bef,\u5145\u503c\u5931\u8d25\uff01\"}";
		}
		
		return flag;
	}
	
	/**
	 * 功能：对kk游戏进行充值
	 * 
	 * @param UserAccount 混服用户账号
	 * @param type 游戏类型
	 * @param Point 充值的等值人民币数
	 * @param OrderId 订单号
	 * @param Key MD5验证key密钥
	 * @return 返回结果： -2 -充值错误 -1 -混服合作商标识为空或者不存在 1 -转换成功 2 -不存在该服 3 -验证串错误 4 -点数不对（比如小于0） 5 -用户没有激活该服务器 6 -数据执行失败 7 -重复提交（订单已生效） 8 -兑换类型不符合
	 */
	public String kkPay(String UserAccount, String type, BigDecimal Point, String OrderId, String Key) {
		// 不对起，未知错误,充值失败！
		String flag = "-2";
		try {
			String productUri = null;
			productUri = Config.getInstance("").getValue("pay" + type); // 获得回调地址
			
			String Sign = MD5.encodeMD5(OrderId + "jugo" + UserAccount + Point + Key); // 新加密方式
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(productUri).openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setDoInput(true);
			PrintWriter out1 = new PrintWriter(httpConnection.getOutputStream());
			out1.print("partner_order=" + OrderId + "&partner_id=jugo&uname=" + UserAccount + "&type=" + type + "&amount=" + Point + "&sign=" + Sign);
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
			flag = "-2";
		}
		
		return flag;
	}
	
	/**
	 * 功能：对四川麻将游戏进行充值
	 * 
	 * @param UserAccount 混服用户账号
	 * @param Point 充值的等值人民币数
	 * @param OrderId 订单号
	 * @param Key MD5验证key密钥
	 * @return 返回结果： -2 -充值错误 -1 -混服合作商标识为空或者不存在 1 -转换成功 2 -不存在该服 3 -验证串错误 4 -点数不对（比如小于0） 5 -用户没有激活该服务器 6 -数据执行失败 7 -重复提交（订单已生效） 8 -兑换类型不符合
	 */
	public String scmjPay(String UserAccount, String type, long Point, String OrderId, String Key) {
		// 不对起，未知错误,充值失败！
		String flag = "-2";
		try {
			String productUri = null;
			productUri = Config.getInstance("").getValue("pay" + type); // 获得回调地址
			String Sign = MD5.encodeMD5(UserAccount + Point + OrderId + "scmjbs" + Key); // 新加密方式
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(productUri + "?ServerId=scmjbs&OrderId=" + OrderId + "&JGUserID=" + UserAccount + "&Gold=" + Point + "&Sign=" + Sign).openConnection();
			httpConnection.setRequestProperty("Connection", "Keep-Alive");
			httpConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			httpConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 6.0; Windows NT)");
			httpConnection.setDoOutput(true);
			httpConnection.setDoInput(true);
			// PrintWriter out1 = new PrintWriter(httpConnection.getOutputStream());
			// out1.print("ServerId=scmjbs&OrderId="+OrderId+"&JGUserID="+UserAccount+"&Gold="+Point+"&Sign="+Sign);
			// out1.flush();
			// out1.close();
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
			flag = "-2";
		}
		
		return flag;
	}
}
