package com.gamecenter.common.connect;

import com.gamecenter.common.encrypt.MD5;
import com.gamecenter.common.packets.*;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * sokect 发送短连接请求。
 * 
 * @author Administrator
 */
public class SendReqToGame {
	private String serverIp;
	private int port;
	private int outTime = 18000;
	private static SendReqToGame instance = null;
	
	public static SendReqToGame getInstance() {
		if (instance == null) {
			instance = new SendReqToGame();
		}
		return instance;
	}
	
	/**
	 * 初始化配置
	 */
	public SendReqToGame() {
		// ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		// this.serverIp = bundle.getString("serverIp");
		// this.port = Integer.parseInt(bundle.getString("port"));
		// this.outTime = Integer.parseInt(bundle.getString("outTime"));
		
	}
	
	public static void main(String args[]) {
		SendReqToGame con = SendReqToGame.getInstance();
		con.init("192.168.1.150", 8005);
		Txtask_request msg = new Txtask_request();
		// msg.setCmd("check");
		msg.setCmd("check_award");
		msg.setOpenid("test100");
		msg.setTaskid("10005");
		con.sendMessage(msg, "game003");
	}
	
	public void init(String sip, int port) {
		this.serverIp = sip;
		this.port = port;
	}
	
	/**
	 * 获取连接
	 * 
	 * @return
	 */
	private Socket getSocket() {
		Socket soc = null;
		try {
			soc = new Socket(serverIp, port);
			System.out.println("连接成功！");
		} catch (Exception e) {
			System.out.println("连接失败");
		}
		
		return soc;
	}
	
	/**
	 * 发送信息
	 * 
	 * @param obj
	 * @return
	 */
	public synchronized Object sendMessage(Object obj, String worldid) {
		
		Object res = null;
		Socket soc = getSocket();
		if (soc == null) {
			res = "-1000"; // 连接异常
			System.out.println("Socket 连接异常");
			return res;
		}
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			out = new DataOutputStream(new BufferedOutputStream(soc.getOutputStream()));
			in = new DataInputStream(new BufferedInputStream(soc.getInputStream()));
			
			int loginRes = login(soc, out, in, worldid);
			if (loginRes == 1) {
				if (obj instanceof ForbidWords_request) { // 禁言
					res = forbidWords((ForbidWords_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof ForbidWordsJie_request) { // 解禁
					res = forbidWordsJie((ForbidWordsJie_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof ForbidPassport_request) { // 封号
					res = forbidPassport((ForbidPassport_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof ForbidPassportJie_request) { // 解封号
					res = forbidPassportJie((ForbidPassportJie_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof ForbidKillPlayer_request) { // 踢人
					res = forbidKillPlayer((ForbidKillPlayer_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof PassportMsg_request) { // 获取账号信息
					res = GetPassportMsg((PassportMsg_request) obj, soc, out, in);
					
				} else if (obj instanceof OnlineNum_request) { // 获取实时在线
					res = GetOnlineNum((OnlineNum_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof SendNotice_request) { // 发送公告
					res = SendNotic((SendNotice_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof SendEmail_request) { // 发送邮件
					res = SendEmail((SendEmail_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof Recharge_request) { // 充值
					res = Recharge((Recharge_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof RechargeForTx_request) { // 充值 -- 腾讯
					res = RechargeForTx((RechargeForTx_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof ForbidWordsForIp_request) { // IP禁言
					res = ForbidWordsForIP((ForbidWordsForIp_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof ForbidWordsForIpJie_request) { // IP禁言 -- 解禁
					res = ForbidWordsForIPJie((ForbidWordsForIpJie_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof PassportAllow_request) { // 白名单
					res = passportAllow((PassportAllow_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof Invite_request) { // 邀请
					res = invite((Invite_request) obj, soc, out, in) + "";
					
				} else if (obj instanceof Txtask_request) { // 任务集市
					res = checkTask((Txtask_request) obj, soc, out, in) + "";
				}
				
			} else {
				res = loginRes + "";
			}
			
		} catch (Exception e) {
			System.out.println("报文处理异常");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
			try {
				out.close();
			} catch (Exception e) {
			}
			
			try {
				soc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	/**
	 * 登陆接入
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @param worldid 区服ID game001
	 * @return
	 */
	private int login(Socket soc, DataOutputStream out, DataInputStream in, String worldid) {
//		System.out.println("发送接入包。");
//		int res = -1001;
//		try {
//			// 发送接入请求
//			Login_request login_request = new Login_request();
//			login_request.setWorldid(worldid);
//			login_request.setSigstr(MD5.encodeMD5(worldid + "123456"));
//			
//			ByteBuffer buf = login_request.data();
//			System.out.println("buf：" + buf.remaining() + "," + buf.limit() + "," + buf.position());
//			
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送接入请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.out.println("接收数据：" + readnum);
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			Login_response login_response = (Login_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), Login_response.class);
//			if (login_response.getResult().equals("1")) {
//				System.out.println("登陆成功：" + login_response.getResult());
//			} else {
//				System.out.println("登陆失败：" + login_response.getResult());
//			}
//			
//			res = Integer.parseInt(login_response.getResult());
//			if (res == -1 || res == -2) {
//				res = -1002;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			res = -1001;
//		}
		
		return 0;
	}
	
	/**
	 * 账号禁言
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int forbidWords(ForbidWords_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送禁言包。");
		int res = 0;
		try {
//			// 发送请求
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidWords_response forbidWords_response = (ForbidWords_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidWords_response.class);
//			if (forbidWords_response.getStatus().equals("1")) {
//				System.out.println("禁言成功：" + forbidWords_response.getStatus());
//			} else {
//				System.out.println("禁言失败：" + forbidWords_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidWords_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 账号禁言解封
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int forbidWordsJie(ForbidWordsJie_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送账号禁言解封包。");
		int res = 0;
		try {
//			// 发送请求
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidWordsJie_response forbidWordsJie_response = (ForbidWordsJie_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidWordsJie_response.class);
//			if (forbidWordsJie_response.getStatus().equals("1")) {
//				System.out.println("禁言解封成功：" + forbidWordsJie_response.getStatus());
//			} else {
//				System.out.println("禁言解封失败：" + forbidWordsJie_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidWordsJie_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 封账号
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int forbidPassport(ForbidPassport_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送封账号包。");
		int res = 0;
		try {
			// 发送请求
			// ForbidPassport_request forbidPassport_request = new ForbidPassport_request();
			// forbidPassport_request.setType("1");
			// forbidPassport_request.setActstr("liuw");
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidPassport_response forbidPassport_response = (ForbidPassport_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidPassport_response.class);
//			if (forbidPassport_response.getStatus().equals("1")) {
//				System.out.println("封号成功：" + forbidPassport_response.getStatus());
//			} else {
//				System.out.println("封号失败：" + forbidPassport_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidPassport_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 账号解封
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int forbidPassportJie(ForbidPassportJie_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送账号解封包。");
		int res = 0;
		try {
//			// 发送请求
//			// ForbidPassportJie_request forbidPassportJie_request = new ForbidPassportJie_request();
//			// forbidPassportJie_request.setType("1");
//			// forbidPassportJie_request.setActstr("liuw");
//			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidPassportJie_response forbidPassportJie_response = (ForbidPassportJie_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidPassportJie_response.class);
//			if (forbidPassportJie_response.getStatus().equals("1")) {
//				System.out.println("账号解封成功：" + forbidPassportJie_response.getStatus());
//			} else {
//				System.out.println("账号解封失败：" + forbidPassportJie_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidPassportJie_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 踢人
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int forbidKillPlayer(ForbidKillPlayer_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送踢人包。");
		int res = 0;
		try {
			// 发送请求
			// ForbidKillPlayer_request forbidKillPlayer_request = new ForbidKillPlayer_request();
			// forbidKillPlayer_request.setType("1");
			// forbidKillPlayer_request.setActstr("liuw");
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidKillPlayer_response forbidKillPlayer_response = (ForbidKillPlayer_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidKillPlayer_response.class);
//			if (forbidKillPlayer_response.getStatus().equals("1")) {
//				System.out.println("踢人成功：" + forbidKillPlayer_response.getStatus());
//			} else {
//				System.out.println("踢人失败：" + forbidKillPlayer_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidKillPlayer_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 获取账号信息
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private Object GetPassportMsg(PassportMsg_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送账号信息包。");
		Object res = null;
		try {
			// 发送请求
			// PassportMsg_request passportMsg_request = new PassportMsg_request();
			// passportMsg_request.setType("1");
			// passportMsg_request.setActstr("liuw");
//			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			PassportMsg_response passportMsg_response = (PassportMsg_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8, "UTF-8")), PassportMsg_response.class);
//			if (passportMsg_response.getResult().equals("1")) {
//				System.out.println("获取账号信息成功--名称：" + passportMsg_response.getName());
//				System.out.println("获取账号信息成功--职业：" + passportMsg_response.getCareer());
//				System.out.println("获取账号信息成功--等级：" + passportMsg_response.getGrade());
//				System.out.println("获取账号信息成功--是否在线：" + passportMsg_response.getIsonline());
//				System.out.println("获取账号信息成功--IP：" + passportMsg_response.getIp());
//				System.out.println("获取账号信息成功--账号：" + passportMsg_response.getOpenid());
//				System.out.println("获取账号信息成功--状态：" + passportMsg_response.getStatus());
//				System.out.println("获取账号信息成功--金币：" + passportMsg_response.getMoney());
//			} else {
//				System.out.println("获取账号信息失败：" + passportMsg_response.getStatus());
//			}
//			
//			res = passportMsg_response;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 获取在线人数
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int GetOnlineNum(OnlineNum_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送获取在线人数包。");
		int res = 0;
		try {
			// 发送请求
			// OnlineNum_request passportMsg_request = new OnlineNum_request();
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			OnlineNum_response onlineNum_response = (OnlineNum_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), OnlineNum_response.class);
//			
//			System.out.println("获取账号信息成功--人数：" + onlineNum_response.getOnlinenum());
//			
//			res = Integer.parseInt(onlineNum_response.getOnlinenum());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 发送公告
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int SendNotic(SendNotice_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送公告包。");
		int res = 0;
		try {
			// 发送请求
			// SendNotice_request sendNotice_request = new SendNotice_request();
			// sendNotice_request.setContent("刘玉华，最漂亮...");
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			Txtask_response onlineNum_response = (Txtask_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), Txtask_response.class);
//			
//			if (onlineNum_response.getStatus().equals("1")) {
//				System.out.println("发送信息成功：" + onlineNum_response.getStatus());
//			} else {
//				System.out.println("发送信息失败：" + onlineNum_response.getStatus());
//			}
//			
//			res = Integer.parseInt(onlineNum_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 发送公告
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int SendEmail(SendEmail_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送公告包。");
		int res = 0;
		try {
			// 发送请求
			// SendEmail_request sendNotice_request = new SendEmail_request();
			// sendNotice_request.setType("1");
			// sendNotice_request.setActstr("liuw");
			// sendNotice_request.setContent("刘玉华，最漂亮...");
			// sendNotice_request.setExtendstr("刘玉华，最漂亮...");
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			SendEmail_response onlineNum_response = (SendEmail_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), SendEmail_response.class);
//			
//			if (onlineNum_response.getStatus().equals("1")) {
//				System.out.println("发送信息成功：" + onlineNum_response.getStatus());
//			} else {
//				System.out.println("发送信息失败：" + onlineNum_response.getStatus());
//			}
//			
//			res = Integer.parseInt(onlineNum_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 平台充值
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int Recharge(Recharge_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送充值包。");
		int res = 0;
		try {
			// 发送请求
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			Recharge_response onlineNum_response = (Recharge_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), Recharge_response.class);
//			
//			if (onlineNum_response.getResult().equals("1")) {
//				System.out.println("充值成功：" + onlineNum_response.getBillon());
//			} else {
//				System.out.println("充值失败--状态：" + onlineNum_response.getResult());
//				System.out.println("充值失败--单号：" + onlineNum_response.getBillon());
//			}
//			
//			res = Integer.parseInt(onlineNum_response.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	private int RechargeForTx(RechargeForTx_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送腾讯充值包。");
		int res = 0;
		try {
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			Recharge_response onlineNum_response = (Recharge_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), Recharge_response.class);
//			
//			if (onlineNum_response.getResult().equals("1")) {
//				System.out.println("充值成功：" + onlineNum_response.getBillon());
//			} else {
//				System.out.println("充值失败--状态：" + onlineNum_response.getResult());
//				System.out.println("充值失败--单号：" + onlineNum_response.getBillon());
//			}
//			
//			res = Integer.parseInt(onlineNum_response.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * IP禁言
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int ForbidWordsForIP(ForbidWordsForIp_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送IP禁言包。");
		int res = 0;
		try {
			// 发送请求
			// ForbidWordsForIp_request forbidWordsForIp_request = new ForbidWordsForIp_request();
			// forbidWordsForIp_request.setIp("192.167.7.110");
			// forbidWordsForIp_request.setTime("2");
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidWordsForIp_response forbidWordsForIp_response = (ForbidWordsForIp_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidWordsForIp_response.class);
//			
//			if (forbidWordsForIp_response.getStatus().equals("1")) {
//				System.out.println("IP禁言成功：" + forbidWordsForIp_response.getStatus());
//			} else {
//				System.out.println("IP禁言失败：" + forbidWordsForIp_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidWordsForIp_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * IP禁言 -- 解禁
	 * 
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int ForbidWordsForIPJie(ForbidWordsForIpJie_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送IP解禁包。");
		int res = 0;
		try {
			// 发送请求
			// ForbidWordsForIp_request forbidWordsForIp_request = new ForbidWordsForIp_request();
			// forbidWordsForIp_request.setIp("192.167.7.110");
			// forbidWordsForIp_request.setTime("2");
			
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			ForbidWordsForIpJie_response forbidWordsForIpJie_response = (ForbidWordsForIpJie_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), ForbidWordsForIpJie_response.class);
//			
//			if (forbidWordsForIpJie_response.getStatus().equals("1")) {
//				System.out.println("IP禁言成功：" + forbidWordsForIpJie_response.getStatus());
//			} else {
//				System.out.println("IP禁言失败：" + forbidWordsForIpJie_response.getStatus());
//			}
//			
//			res = Integer.parseInt(forbidWordsForIpJie_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 账号白名单操作
	 * 
	 * @param obj
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int passportAllow(PassportAllow_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送账号白名单操作包。");
		int res = 0;
		try {
//			// 发送请求
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			PassportAllow_response passportAllow_response = (PassportAllow_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), PassportAllow_response.class);
//			if (passportAllow_response.getStatus().equals("1")) {
//				System.out.println("账号白名单操作成功：" + passportAllow_response.getStatus());
//			} else {
//				System.out.println("账号白名单操作失败：" + passportAllow_response.getStatus());
//			}
//			
//			res = Integer.parseInt(passportAllow_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 邀请操作
	 * 
	 * @param obj
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int invite(Invite_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送邀请操作包。");
		int res = 0;
		try {
			// 发送请求
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			Invite_response invite_response = (Invite_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), Invite_response.class);
//			if (invite_response.getStatus().equals("1")) {
//				System.out.println("发送邀请成功：" + invite_response.getStatus());
//			} else {
//				System.out.println("发送邀请失败：" + invite_response.getStatus());
//			}
//			
//			res = Integer.parseInt(invite_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 腾讯任务集市验证
	 * 
	 * @param obj
	 * @param soc
	 * @param out
	 * @param in
	 * @return
	 */
	private int checkTask(Txtask_request obj, Socket soc, DataOutputStream out, DataInputStream in) {
		System.out.println("发送邀请操作包。");
		int res = 0;
		try {
			// 发送请求
//			ByteBuffer buf = obj.data();
//			byte[] bytes = new byte[buf.remaining()];
//			buf.get(bytes, 0, bytes.length);
//			
//			// 发送报文
//			out.write(bytes);
//			out.flush();
//			System.out.println("发送请求成功！");
//			soc.setSoTimeout(outTime);
//			
//			// 接收信息
//			byte data[] = new byte[1024 * 4];
//			int offset = 0;
//			byte buffer[] = new byte[1024];// 接收缓冲区
//			int readnum = 0;
//			while (true) {
//				readnum = in.read(buffer, 0, 1024);
//				if (readnum > 0) {
//					System.arraycopy(buffer, 0, data, offset, readnum);
//					offset += readnum;
//					break;
//				} else {
//					break;
//				}
//			}
//			System.out.println("成功获取报文：" + offset);
//			
//			Txtask_response txtask_response = (Txtask_response) JSONObject.toBean(JSONObject.fromObject(new String(data, 8, offset - 8)), Txtask_response.class);
//			System.out.println("任务校验结果：" + txtask_response.getStatus());
//			
//			res = Integer.parseInt(txtask_response.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
}
