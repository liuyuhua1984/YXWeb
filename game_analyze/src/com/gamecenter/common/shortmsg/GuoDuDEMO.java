package com.gamecenter.common.shortmsg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/* ========================================================
 * 北京国都互联科技有限公司
 * 日 期：2012-12-18  上午10:04:19
 * 作 者：wangjialong
 * 版 本：0.1
 * =========================================================
 * 账号 ceshiep   654321
 */

public class GuoDuDEMO {
	
	/**
	 * 国都DEMO中方法包含了所有参数字段，有一些字段为固定值，用户可以修改或者自行封装新的方法，将传入参数简化 DEMO中包含了get和post两种方式，客户使用时可选择最为适合的方式发送
	 */
	
	public static void main(String args[]) {
		/* 具体参数解释请参见get和post方法头部 */
		/* 请填写您的用户名密码 username=用户名，password=密码 */
		String username = "ceshiwp";
		String password = "654321";
		String SendTime = "";
		String AppendID = "";
		String Content_Type = "8";
		String Content = "国都DEMO测试消息";
		String ValidTime = "";
		String DesMobile[] = { "15123013920" };
		
		GuoDuDEMO gd = new GuoDuDEMO();
		/* post方式发送消息 */
		// String postResponse=gd.postSendMsg(username, password, Content, DesMobile, AppendID, SendTime,ValidTime, Content_Type);
		/* get方式发送消息 */
		// String getResponse =gd.getSendMsg (username, password, Content, DesMobile, AppendID, SendTime,ValidTime, Content_Type);
		
		/* 打印返回响应，响应为XML格式，用户得到响应串后可自定义拆分解析方法，获得响应中的参数，以便逻辑处理 */
		/* post响应报文 */
		// System.out.println("post方式返回的响应为："+postResponse);
		/* get响应报文 */
		// System.out.println("get方式返回的响应为："+getResponse);
		
		String msg = gd.getURL("OperID=ceshiwp&OperPass=654321", "http://221.179.180.158:9000/QxtSms/surplus");
		System.out.println("msg:" + msg);
	}
	
	/** post方式 发送消息 */
	/**
	 * @param OperID 用户名
	 * @param OperPass 密码
	 * @param Content 发送内容文字 长度最好不要超过500个字符。
	 * @param DesMobiles[] 需要发送的手机号字符串数组 手机号个数请不要超过200个。
	 * @param AppendID 用户自扩展的号码 。 若扩展请填写号码，若不扩展请填写"",注意！通道号+国都用户身份号+AppendID总长不能超过20位。否则将发送失败。具体号码定义，请参见国都资信通平台接口文档
	 * @param SendTime 发送时间 如果为定时消息。请填写，格式为yyyyMMddhhmmss 若为实时消息，请填"";
	 * @param ValidTime 消息有效期 应该大于SendTime，最好不要填写，国都默认消息有效期为SendTime+3。如果填写错误容易导致消息过有效期无法发送。
	 * @param Content_type 内容类型 15为短短信，8为长短信 国都服务端将会自动识别短信长短，所以发送时填写8即可。若填写15 长短信将无法发送。
	 * @return rec_string 国都返回的XML格式的串
	 * @catch Exception
	 */
	public String postSendMsg(String OperID, String OperPass, String Content, String DesMobiles[], String AppendID, String SendTime, String ValidTime, String Content_type) {
		/* 将内容用URLEncoder编一次GBK */
		String EncoderContent = "";
		try {
			EncoderContent = URLEncoder.encode(Content, "GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* 将手机号从数组转变成一个用逗号分开的字符串，字符串末尾有逗号不影响消息下发。 */
		String DesMobile = "";
		for (int i = 0; i < DesMobiles.length; i++) {
			DesMobile = DesMobiles[i] + "," + DesMobile;
		}
		/* url地址 */
		String URL = "http://221.179.180.158:9000/QxtSms/QxtFirewall";
		
		/* 消息参数 */
		String str = "OperID=" + OperID + "&OperPass=" + OperPass + "&SendTime=" + SendTime + "&ValidTime=" + ValidTime + "&AppendID=" + AppendID + "&DesMobile=" + DesMobile.trim() + "&Content=" + EncoderContent + "&ContentType=" + Content_type;
		
		System.out.println("发送的内容为：" + str);
		/* 使用post方式发送消息 */
		String response = this.postURL(str, URL);
		
		/* 返回响应 */
		return response;
	}
	
	/** get方式 发送消息，与post格式完全相同，仅调用发送方法不同this.getURL(str, URL); */
	/**
	 * @param OperID 用户名
	 * @param OperPass 密码
	 * @param Content 发送内容文字 长度最好不要超过500个字符。
	 * @param DesMobiles[] 需要发送的手机号字符串数组 手机号个数请不要超过200个。
	 * @param AppendID 用户自扩展的号码 。 若扩展请填写号码，若不扩展请填写"",注意！通道号+国都用户身份号+AppendID总长不能超过20位。否则将发送失败。具体号码定义，请参见国都资信通平台接口文档
	 * @param SendTime 发送时间 如果为定时消息。请填写，格式为yyyyMMddhhmmss 若为实时消息，请填"";
	 * @param ValidTime 消息有效期 应该大于SendTime，最好不要填写，国都默认消息有效期为SendTime+3。如果填写错误容易导致消息过有效期无法发送。
	 * @param Content_type 内容类型 15为短短信，8为长短信 国都服务端将会自动识别短信长短，所以发送时填写8即可。若填写15 长短信将无法发送。
	 * @return rec_string 国都返回的XML格式的串
	 * @catch Exception
	 */
	public String getSendMsg(String OperID, String OperPass, String Content, String DesMobiles[], String AppendID, String SendTime, String ValidTime, String Content_type) {
		/* 将内容用URLEncoder编一次GBK */
		String EncoderContent = "";
		try {
			EncoderContent = URLEncoder.encode(Content, "GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* 将手机号从数组转变成一个用逗号分开的字符串，字符串末尾有逗号不影响消息下发。 */
		String DesMobile = "";
		for (int i = 0; i < DesMobiles.length; i++) {
			DesMobile = DesMobiles[i] + "," + DesMobile;
		}
		/* url地址 */
		String URL = "http://221.179.180.158:9000/QxtSms/QxtFirewall";
		
		/* 消息参数 */
		String str = "OperID=" + OperID + "&OperPass=" + OperPass + "&SendTime=" + SendTime + "&ValidTime=" + ValidTime + "&AppendID=" + AppendID + "&DesMobile=" + DesMobile.trim() + "&Content=" + EncoderContent + "&ContentType=" + Content_type;
		
		System.out.println("发送的内容为：" + str);
		/* 使用get方式发送消息 */
		String response = this.getURL(str, URL);
		
		/* 返回响应 */
		return response;
	}
	
	/** post方式 发送url串 */
	/**
	 * @param commString 需要发送的url参数串
	 * @param address 需要发送的url地址
	 * @return rec_string 国都返回的XML格式的串
	 * @catch Exception
	 */
	public String postURL(String commString, String address) {
		String rec_string = "";
		URL url = null;
		HttpURLConnection urlConn = null;
		try {
			/* 得到url地址的URL类 */
			url = new URL(address);
			/* 获得打开需要发送的url连接 */
			urlConn = (HttpURLConnection) url.openConnection();
			/* 设置连接超时时间 */
			urlConn.setConnectTimeout(30000);
			/* 设置读取响应超时时间 */
			urlConn.setReadTimeout(30000);
			/* 设置post发送方式 */
			urlConn.setRequestMethod("POST");
			/* 发送commString */
			urlConn.setDoOutput(true);
			urlConn.setDoInput(true);
			OutputStream out = urlConn.getOutputStream();
			out.write(commString.getBytes());
			out.flush();
			out.close();
			/* 发送完毕 获取返回流，解析流数据 */
			BufferedReader rd = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "GBK"));
			StringBuffer sb = new StringBuffer();
			int ch;
			while ((ch = rd.read()) > -1) {
				sb.append((char) ch);
			}
			rec_string = sb.toString().trim();
			/* 解析完毕关闭输入流 */
			rd.close();
		} catch (Exception e) {
			/* 异常处理 */
			rec_string = "-107";
			System.out.println(e);
		} finally {
			if (urlConn != null) {
				/* 关闭URL连接 */
				urlConn.disconnect();
			}
		}
		/* 返回响应内容 */
		return rec_string;
	}
	
	/** get方式 发送url串,与post方式代码基本相同，仅发送方式不同 */
	/**
	 * @param commString 需要发送的url参数串
	 * @param address 需要发送的url地址
	 * @return rec_string 国都返回的XML格式的串
	 * @catch Exception
	 */
	public String getURL(String commString, String address) {
		String rec_string = "";
		URL url = null;
		HttpURLConnection urlConn = null;
		try {
			/* 得到url地址的URL类 */
			url = new URL(address + "?" + commString);
			/* 获得打开需要发送的url连接 */
			urlConn = (HttpURLConnection) url.openConnection();
			/* 设置连接超时时间 */
			urlConn.setConnectTimeout(30000);
			/* 设置读取响应超时时间 */
			urlConn.setReadTimeout(30000);
			/* 设置post发送方式 */
			urlConn.setRequestMethod("GET");
			/* 发送commString */
			urlConn.setDoInput(true);
			urlConn.setDoOutput(true);
			urlConn.connect();
			
			/* 发送完毕 获取返回流，解析流数据 */
			BufferedReader rd = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "GBK"));
			StringBuffer sb = new StringBuffer();
			int ch;
			while ((ch = rd.read()) > -1) {
				sb.append((char) ch);
			}
			rec_string = sb.toString().trim();
			/* 解析完毕关闭输入流 */
			rd.close();
			
		} catch (Exception e) {
			/* 异常处理 */
			rec_string = "-107";
			System.out.println(e);
		} finally {
			if (urlConn != null) {
				/* 关闭URL连接 */
				urlConn.disconnect();
			}
		}
		/* 返回响应内容 */
		return rec_string;
	}
	
}
