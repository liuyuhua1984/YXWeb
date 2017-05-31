package com.gamecenter.sysmanage.service;

import com.gamecenter.sysmanage.mapper.OaRoleMapper;
import com.gamecenter.sysmanage.model.OaPermitDetailExample;
import com.gamecenter.sysmanage.model.OaRole;
import com.gamecenter.sysmanage.model.OaRoleExample;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-6-19 Time: 下午8:26 To change this template use File | Settings | File Templates.
 */
@Repository
public class RoleServiceImpl implements RoleService {
	
	@Resource
	OaRoleMapper oaRoleMapper;
	@Resource
	PermitService permitService;
	@Resource
	UserService userService;
	
	public List<OaRole> getRoleList() {
		List<OaRole> oaRoles = oaRoleMapper.getRoleList(new OaRoleExample());
		return oaRoles;
	}
	
	public OaRole getRoleById(int rid) {
		OaRole oaRole = oaRoleMapper.selectByPrimaryKey(rid);
		return oaRole;
	}
	
	public int saveRole(OaRole oaRole) {
		int num = oaRoleMapper.insertSelective(oaRole);
		return num;
	}
	
	public int delRole(String roleIdsStr) {
		int num = 0;
		if (roleIdsStr != null && roleIdsStr.length() > 0) {
			String ids[] = roleIdsStr.split(",");
			
			// 获取的角色ids，批量删除角色
			List<Integer> roleIds = new ArrayList<Integer>();
			for (String rid : ids) {
				roleIds.add(Integer.parseInt(rid));
			}
			OaRoleExample oaRoleExample = new OaRoleExample();
			OaRoleExample.Criteria criteria = oaRoleExample.createCriteria();
			criteria.andRoleidIn(roleIds);
			num = oaRoleMapper.deleteByExample(oaRoleExample);
			
			// 删除的角色涉及的权限
			permitService.delPermitDetail(2, roleIds);
			
			// 清空用户角色设置
			userService.clearUserRoleSet(roleIds);
		}
		return num;
	}
}
