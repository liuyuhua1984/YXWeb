package com.gamecenter.service;

import java.util.List;

import com.gamecenter.model.TUser;
import com.gamecenter.parBean.Par_tuser;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-4-11 Time: 下午2:16 To change this template use File | Settings | File Templates.
 */
public interface UserManageService {
	public List<Par_tuser> getUserList();
	
	/**
	 * 根据帐号获取 用户的信息
	 * 
	 * @param passport
	 * @return
	 */
	public Par_tuser getUserMsg(String passport);
	
	public int addUser(TUser tUser);
	
	public int delUser(String ids);
	
	public int update(TUser tUser);
	
	/**
	 * 根据uid获得用户
	 * 
	 * @param uid
	 * @return
	 */
	public TUser getUser(int uid);
	
	/**
	 * 修改密码
	 * 
	 * @param nowPwd
	 * @param newPwd
	 * @param userName
	 * @return
	 */
	public int changePwd(String nowPwd, String newPwd, String userName);
	
	/**
	 * 根据ID 获取名称
	 * 
	 * @param uid
	 * @return
	 */
	public String getRealNameById(int uid);
	
}
