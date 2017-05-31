package com.gamecenter.service.gmtServices;

import com.gamecenter.common.packets.PassportMsg_response;
import com.gamecenter.parBean.vo.GmtSelectPassportBean;

import java.util.List;

/**
 * 账号信息服务 Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface GmtPassportService {
	
	/**
	 * 获取指定账号的信息
	 * 
	 * @param obj
	 * @return
	 */
	public PassportMsg_response selectPassport(GmtSelectPassportBean obj);
	
	/**
	 * 账号白名单操作
	 * 
	 * @param type
	 * @param passports
	 * @return
	 */
	public int allowPassport(int type, List<String> passports, String wid);
	
}
