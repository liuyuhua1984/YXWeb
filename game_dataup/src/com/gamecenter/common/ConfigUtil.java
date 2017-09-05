package com.gamecenter.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigUtil {
	
	public static String getFileIO(String name, String fileURL) {
		Properties prop = new Properties();
		InputStream in = ConfigUtil.class.getResourceAsStream(fileURL);
		try {
			prop.load(in);
			return prop.getProperty(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void writeData(String key, String value, String fileURL) {
		Properties prop = new Properties();
		InputStream fis = null;
		OutputStream fos = null;
		try {
			// String path = (ConfigUtil.class.getClassLoader().getResource("").getPath().toString()).replace("WEB-INF/classes/", "");
			// System.out.print("path1:" + path);
			// path = ConfigUtil.class.getResource("").getPath();
			// System.out.print("path2:" + path);
			// path = ConfigUtil.class.getClassLoader().getResource("").getPath().toString();
			// System.out.print("path3:" + path);
			
			String path = ConfigUtil.class.getClassLoader().getResource("").getPath().toString();
			// java.net.URL url = ConfigUtil.class.getResource(fileURL);
			
			System.out.print("path:" + path);
			
			File file = new File(path + fileURL);
			if (!file.exists())
				file.createNewFile();
			
			fis = new FileInputStream(file);
			prop.load(fis);
			fis.close();// 一定要在修改值之前关闭fis
			fos = new FileOutputStream(file);
			prop.setProperty(key, value);
			prop.store(fos, "Update '" + key + "' value");
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// ConfigUtil.getFileIO("name", "gxyTest.properties");
		
		ConfigUtil.writeData("opentime", "2011-05-24 10:29:19", "/runConfig.properties");
		
		System.out.println(ConfigUtil.getFileIO("opentime", "/runConfig.properties"));
	}
	
	public void writeVaule() {
		Properties pro = new Properties();
		InputStream in = pro.getClass().getResourceAsStream("/dbConfig/dbsqlsever.properties");
		try {
			pro.load(in);
			pro.setProperty("driver", "mysql");
			pro.setProperty("url", "jdbce");
			pro.setProperty("name", "lijia");
			pro.setProperty("password", "125487");
			OutputStream os = null;
			os = new FileOutputStream(new File(pro.getClass().getResourceAsStream("/dbConfig/dbsqlsever.properties").toString()));
			pro.store(os, null);
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
