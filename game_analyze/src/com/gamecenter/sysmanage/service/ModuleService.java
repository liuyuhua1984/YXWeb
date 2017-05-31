package com.gamecenter.sysmanage.service;

import com.gamecenter.model.OpGameworld;
import com.gamecenter.sysmanage.model.OaAction;
import com.gamecenter.sysmanage.model.OaModule;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-6-19 Time: 下午8:26 To change this template use File | Settings | File Templates.
 */
public interface ModuleService {
	/**
	 * 系统模块缓存 key : url val: 模块对象
	 */
	public static Map<String, OaModule> modules = new ConcurrentHashMap<String, OaModule>();
	
	/**
	 * 缓存模块
	 * 
	 * @return
	 */
	public boolean cacheData();
	
	public List<OaModule> getModuleList();
	
	/**
	 * 添加模块
	 * 
	 * @param oaModule
	 * @return
	 */
	public int addModule(OaModule oaModule);
	
	public OaModule getModule(int mid);
	
	public int updateModule(OaModule oaModule);
	
	/**
	 * 删除节点及子节点
	 * 
	 * @param mid
	 * @return
	 */
	public int delModuleAndChild(int mid);
	
	/**
	 * 获取子节点列表
	 * 
	 * @param pid
	 * @param lists
	 * @return
	 */
	public List<OaModule> getModuleListAndChild(int pid, List<OaModule> lists);
	
	public List<OaAction> getActionList(int mid);
	
	public OaAction getAction(int aid);
	
	public int addAction(OaAction oaAction, int mid);
	
	public int updateAction(OaAction oaAction);
	
	public int delAction(int aid);
	
	public int delAction(String aids);
	
	/**
	 * 获取模块功能明细列表
	 * 
	 * @return
	 */
	public List<OaModule> getModuleDetailList();
	
	/**
	 * 获取指定深度模块列表
	 * 
	 * @param level 深度
	 * @return
	 */
	public List<OaModule> getModelListByLevel(int level);
	
}
