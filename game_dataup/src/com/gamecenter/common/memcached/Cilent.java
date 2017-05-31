package com.gamecenter.common.memcached;

import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-31 Time: 下午8:57 To change this template use File | Settings | File Templates.
 */
public class Cilent {
	
	public static void main(String[] args) throws Exception {
		/**
		 * 初始化SockIOPool，管理memcached的连接池
		 * */
//		String[] servers = { "192.168.3.246:11211" };
//		SockIOPool pool = SockIOPool.getInstance();
//		pool.setServers(servers);
//		pool.setFailover(true);
//		pool.setInitConn(6);
//		pool.setMinConn(5);
//		pool.setMaxConn(250);
//		pool.setMaintSleep(30);
//		pool.setNagle(false);
//		pool.setSocketTO(3000);
//		pool.setAliveCheck(true);
//		pool.initialize();
//		
//		System.out.println("222");
//		/**
//		 * 建立MemcachedClient实例
//		 * */
//		
//		MemCachedClient memCachedClient = new MemCachedClient();
//		// for (int i = 0; i < 1000; i++) {
//		// /**
//		// * 将对象加入到memcached缓存
//		// * */
//		// boolean success = memCachedClient.set("" + i, "Hello!");
//		// /**
//		// * 从memcached缓存中按key值取对象
//		// * */
//		// String result = (String) memCachedClient.get("" + i);
//		// System.out.println(String.format("set( %d ): %s", i, success));
//		// System.out.println(String.format("get( %d ): %s", i, result));
//		// }
//		
//		Map map = memCachedClient.stats();
//		
//		System.out.print(map.size());
	}
	
}
