package com.gamecenter.service.ossServices;

import java.util.List;

import com.gamecenter.model.OpOssUserRemain;

/**
 * 用户留存 服务 Created with IntelliJ IDEA. User: gsb Date: 14-5-21 Time: 上午9:48 To change this template use File | Settings | File Templates.
 */
public interface UserRemainService {
	
	public OpOssUserRemain getUserRemain(String worldid, String time);
	
	public OpOssUserRemain getUserRemain(int id);
	
	public List<OpOssUserRemain> getUserRemainList(String worldid);
	
	/**
	 * 获取的目标留存列表
	 * 
	 * @param worldid
	 * @param mintime 最小目标时间
	 * @return
	 */
	public List<OpOssUserRemain> getUserRemainList(String worldid, String mintime);
	
	/**
	 * 留存列表
	 * 
	 * @param worldids ","号间隔
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	public List<OpOssUserRemain> getUserRemainList(String worldids, String begintime, String endtime);
	
	public int insert(OpOssUserRemain opOssUserRemain);
	
	public int update(OpOssUserRemain opOssUserRemain);
	
	/**
	 * 核对数量
	 * 
	 * @param worldid
	 * @return
	 */
	public int checknum(String worldid);
	
}
