package com.gamecenter.common.encrypt;

/**
 * java byte型数组和16进制字符串互相转化方法
 * <p/>
 * Created with IntelliJ IDEA. User: gsb Date: 14-6-15 Time: 下午5:05 To change this template use File | Settings | File Templates.
 */
public class Hex {
	
	public static String printHexString(byte[] b) {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			result = result + hex.toUpperCase();
		}
		return result;
	}
	
	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		return d;
	}
	
	private static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}
	
	public static void main(String args[]) {
		String msg = printHexString(new byte[] { 11, 1 });
		System.out.println(msg);
		System.out.println(DESCoder.showByteArray(msg.getBytes()));
		System.out.println(DESCoder.showByteArray(hexStringToBytes(msg)));
		
	}
	
}
