package com.gamecenter.common.properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * ClassName:ServerProperties <br/>
 * Function: TODO (属性加载基类). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-22 上午10:08:27 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public abstract class ServerProperties implements IPropertiesResPath {
	
	/**
	 * loadProperties:(). <br/>
	 * TODO().<br/>
	 * 加载配置属性
	 * 
	 * @author lyh
	 * @param propertiesPath
	 */
	public static Properties loadProperties(String propertiesPath) {
		InputStream is = null;
		Properties GAME_BUNDLE = null;
		try {
			
			GAME_BUNDLE = new Properties();
			
			is = new FileInputStream(propertiesPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			if (is != null) {
				GAME_BUNDLE.load(br);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return GAME_BUNDLE;
	}
	
}
