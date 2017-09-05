package com.gamecenter.common.memcached;

import java.util.Date;

/**
 * 使用memcached的缓存实用类.
 * 
 * @author 铁木箱子
 * 
 */
public class MemCached {
	// 创建全局的唯一实例
	//protected static MemCachedClient mcc = new MemCachedClient();
	
//	protected static MemCached memCached = new MemCached();
	
	// 设置与缓存服务器的连接池
	static {
		// 服务器列表和其权重
//		String[] servers = { "127.0.0.1:11211" };
//		Integer[] weights = { 3 };
//		
//		// 获取socke连接池的实例对象
//		SockIOPool pool = SockIOPool.getInstance();
//		
//		// 设置服务器信息
//		pool.setServers(servers);
//		pool.setWeights(weights);
//		
//		// 设置初始连接数、最小和最大连接数以及最大处理时间
//		pool.setInitConn(5);
//		pool.setMinConn(5);
//		pool.setMaxConn(250);
//		pool.setMaxIdle(1000 * 60 * 60 * 6);
//		
//		// 设置主线程的睡眠时间
//		pool.setMaintSleep(30);
//		
//		// 设置TCP的参数，连接超时等
//		pool.setNagle(false);
//		pool.setSocketTO(3000);
//		pool.setSocketConnectTO(0);
//		
//		// 初始化连接池
//		pool.initialize();
//		
//		// 压缩设置，超过指定大小（单位为K）的数据都会被压缩
//		mcc.setCompressEnable(true);
//		mcc.setCompressThreshold(64 * 1024);
	}
	
	/**
	 * 保护型构造方法，不允许实例化！
	 * 
	 */
	protected MemCached() {
		
	}
	
	/**
	 * 获取唯一实例.
	 * 
	 * @return
	 */
//	public static MemCached getInstance() {
//		return memCached;
//	}
	
	/**
	 * 添加一个指定的值到缓存中.
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
//	public boolean add(String key, Object value) {
//		return mcc.add(key, value);
//	}
//	
//	public boolean add(String key, Object value, Date expiry) {
//		return mcc.add(key, value, expiry);
//	}
//	
//	public boolean replace(String key, Object value) {
//		return mcc.replace(key, value);
//	}
//	
//	public boolean replace(String key, Object value, Date expiry) {
//		return mcc.replace(key, value, expiry);
//	}
	
	/**
	 * 根据指定的关键字获取对象.
	 * 
	 * @param key
	 * @return
	 */
//	public Object get(String key) {
//		return mcc.get(key);
//	}
//	
//	public static void main(String[] args) {
//		MemCached cache = MemCached.getInstance();
//		cache.add("hello", 234);
//		System.out.print("get value : " + cache.get("hello"));
//	}
}