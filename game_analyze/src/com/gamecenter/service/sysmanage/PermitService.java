package com.gamecenter.service.sysmanage;

import java.util.ArrayList;
import java.util.List;

import com.gamecenter.model.OaModule;
import com.gamecenter.sysmanage.parBean.PermitSet;

/**
 * 权限管理 Created with IntelliJ IDEA. User: gsb Date: 14-7-3 Time: 上午10:11 To change this template use File | Settings | File Templates.
 */
public interface PermitService {
	
	/**
	 * 用户权限缓存
	 */
	public static List<Integer> userPermitIds = new ArrayList<Integer>();
	
	public boolean initUserPermit(int uid);
	
	/**
	 * 获取权限源名称
	 * 
	 * @param type
	 * @param sourceId
	 * @return
	 */
	public String getPrivilegeSourceName(int type, int sourceId);
	
	/**
	 * 保存权限配置
	 * 
	 * @param permitSet
	 * @return
	 */
	public int savePermitSet(PermitSet permitSet);
	
	/**
	 * 获取对应源的权限列表
	 * 
	 * @param type
	 * @param sourceId
	 * @return
	 */
	public List<Integer> getPermits(int type, int sourceId);
	
	/**
	 * 删除权限设置
	 * 
	 * @param type
	 * @param sourceId
	 * @return
	 */
	public int delPermitDetail(int type, int sourceId);
	
	public int delPermitDetail(int type, List<Integer> sourceIds);
	
	/**
	 * 获取用户的综合权限
	 * 
	 * @param uid
	 * @return 权限ID列表
	 */
	public List<Integer> getAllPermits(int uid);
	
	/**
	 * 用户访问模块功能权限验证
	 * 
	 * @param url 模块url
	 * @param actionCode
	 * @param uid
	 * @return
	 */
	public boolean checkUserPermit(String url, String actionCode, int uid);
	
	/**
	 * 根据用户权限获取关联的模块列表 (topMenu)
	 * 
	 * @param uid
	 * @param level
	 * @return
	 */
	public List<OaModule> getModuleListByUser(int uid, int level);
	
	/**
	 * 根据用户权限、父模块 获取关联的子模块列表 (二级列表)
	 * 
	 * @param uid
	 * @param pid
	 * @return
	 */
	public List<OaModule> getModuleListByUserByPid(int uid, int pid);
}
