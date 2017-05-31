package com.gamecenter.common;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Random;

public class MD5 {
	public static String encodeMD5(String text) {
		StringBuffer md5 = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(text.getBytes("utf-8"));
			byte[] digest = md.digest();
			
			for (int i = 0; i < digest.length; i++) {
				md5.append(Character.forDigit((digest[i] & 0xF0) >> 4, 16));
				md5.append(Character.forDigit((digest[i] & 0xF), 16));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return md5.toString();
	}
	
	public static String MD5RandomMask(int ww) {
		char hexDigits[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		StringBuffer STR = new StringBuffer();
		Random rand = new Random();
		while (STR.length() <= ww)
			try {
				STR.append(hexDigits[rand.nextInt(57)]);
			} catch (Exception e) {
			}
		return STR.substring(0, ww);
	}
	
	public static void main(String args[]) throws Exception {
		
		String msg = URLEncoder.encode("fff=222&gg=你好哦啊", "utf-8");
		System.out.println(msg);
		
		System.out.println(URLDecoder.decode(msg, "utf-8"));
		
	}
}
