package com.gamecenter.service.dataup;

import java.util.List;

import com.gamecenter.common.Page;
import com.gamecenter.model.OpOssQlzConsumeLog;
import com.gamecenter.model.OpOssQlzCreateroleLog;
import com.gamecenter.model.OpOssQlzLoginLog;
import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.model.OpOssQlzOutLog;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpOssQlzPassportReg;
import com.gamecenter.model.OpOssQlzRechargeLog;

/**
 * 数据上报的处理 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 下午10:49 To change this template use File | Settings | File Templates.
 */
public interface DataUpHandleService {
	
	/************* 数据上报控制 *********************/
	/**
	 * 上报控制
	 * 
	 * @param worldId all:所有服务器
	 * @param act 1：开始 0 停止
	 * @return 控制结果 1：成功 0：失败
	 */
	public int upDataStatusCon(String worldId, int act);
	
	/**
	 * **********日志记录********************
	 */
	public int addLoginLog(OpOssQlzLoginLog opOssQlzLoginLog);
	
	public int addLoginOutLog(OpOssQlzOutLog opOssQlzOutLog);
	
	public int addCreateRoleLog(OpOssQlzCreateroleLog opOssQlzCreateroleLog);
	
	public int addRechargeLog(OpOssQlzRechargeLog opOssQlzRechargeLog);
	
	public int addConsumeLog(OpOssQlzConsumeLog opOssQlzConsumeLog);
	
	public int addOnlineLog(OpOssQlzOnlinecurLog ossQlzOnlinecurLog);
	
	// 注册账号
	public int addRegister(OpOssQlzPassportReg opOssQlzPassportReg);
	
	public int updatePassportReg(OpOssQlzPassportReg opOssQlzPassportReg);
	
	/**
	 * **************************角色账户 *******************************************
	 */
	
	public int addPassport(OpOssQlzPassport opOssQlzPassport);
	
	public OpOssQlzPassport updatePassport(OpOssQlzPassport opOssQlzPassport, String type);
	
	public OpOssQlzPassport getPassportByOpenid(String openid);
	
	/** 
	 * getPassportByName:(). <br/> 
	 * TODO().<br/> 
	 * 用名字找到对象
	 * @author lyh 
	 * @param name
	 * @return 
	 */  
	public OpOssQlzPassport getPassportByName(String name,String worldId);
	
	public Page getPassportList(OpOssQlzPassport obj, int pageSize, int pageNumber);
	
	public List<OpOssQlzPassport> getPassportList(String worldid);
	
	/**
	 * 加载所有的活跃账号(近7天内登录过的)进缓存
	 * 
	 * @return
	 */
	public List<OpOssQlzPassport> getActivePassportList();
	
	/**
	 * 获取指定区的账号列表
	 * 
	 * @param wid
	 * @return
	 */
	public List<String> getPassportIdsStr(String wid);
	
	/**
	 * 获取最近的 注册列表
	 * 
	 * @return
	 */
	public List<OpOssQlzPassportReg> regLastList();
	
}
