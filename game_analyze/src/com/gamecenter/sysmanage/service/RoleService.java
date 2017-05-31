package com.gamecenter.sysmanage.service;

import com.gamecenter.sysmanage.model.OaAction;
import com.gamecenter.sysmanage.model.OaModule;
import com.gamecenter.sysmanage.model.OaRole;

import java.util.List;

/**
 * 系统角色服务 Created with IntelliJ IDEA. User: gsb Date: 14-6-19 Time: 下午8:26 To change this template use File | Settings | File Templates.
 */
public interface RoleService {
	
	/**
	 * 获取角色列表
	 * 
	 * @return
	 */
	public List<OaRole> getRoleList();
	
	/**
	 * 获取角色对象
	 * 
	 * @param rid
	 * @return
	 */
	public OaRole getRoleById(int rid);
	
	/**
	 * 角色信息保存
	 * 
	 * @return
	 */
	public int saveRole(OaRole oaRole);
	
	/**
	 * 删除角色
	 * 
	 * @param roleIds
	 * @return
	 */
	public int delRole(String roleIds);
	
}
