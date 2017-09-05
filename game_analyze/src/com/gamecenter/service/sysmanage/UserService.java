package com.gamecenter.service.sysmanage;

import java.util.List;

import com.gamecenter.model.OaUser;
import com.gamecenter.model.OaUserPermit;

/**
 * 账号服务
 * <p/>
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-3 Time: 下午2:16 To change this template use File | Settings | File Templates.
 */
public interface UserService {
	
	public List<OaUser> getUserList();
	
	public OaUser getUser(int uid);
	
	public int savaUser(OaUser oaUser);
	
	public int delUser(String uids);
	
	/**
	 * 用户授权
	 * 
	 * @param oaUserPermit
	 * @return
	 */
	public int shouquan(OaUserPermit oaUserPermit);
	
	/**
	 * 获取用户授权信息
	 * 
	 * @param uid
	 * @return
	 */
	public OaUserPermit getUserPermit(int uid);
	
	/**
	 * 账号验证 -- 通过返回Uid
	 * 
	 * @param passport
	 * @param pwd
	 * @param ip
	 * @return 0:失败的 uid：成功的
	 */
	public int validateUser(String passport, String pwd, String ip);
	
	/**
	 * 清空用户角色设置
	 * 
	 * @param roleId
	 * @return
	 */
	public int clearUserRoleSet(int roleId);
	
	public int clearUserRoleSet(List<Integer> roleIds);
	
}
