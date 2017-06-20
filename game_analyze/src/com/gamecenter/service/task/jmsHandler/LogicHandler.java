package com.gamecenter.service.task.jmsHandler;

import java.util.Date;

import javax.annotation.Resource;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpOssQlzConsumeLog;
import com.gamecenter.model.OpOssQlzCreateroleLog;
import com.gamecenter.model.OpOssQlzLoginLog;
import com.gamecenter.model.OpOssQlzOnlinecurLog;
import com.gamecenter.model.OpOssQlzOutLog;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpOssQlzPassportReg;
import com.gamecenter.model.OpOssQlzRechargeLog;
import com.gamecenter.service.RunLog;
import com.gamecenter.service.dataup.DataUpHandleService;
import com.gamecenter.service.task.DataUpHandle;
import com.lyh.common.IMsgCode;
import com.lyh.dataup.log.CreateRoleLog;
import com.lyh.dataup.log.LoginLog;
import com.lyh.dataup.log.LoginOutLog;
import com.lyh.dataup.log.OnLineNumLog;
import com.lyh.dataup.log.RechargeLog;
import com.lyh.dataup.log.RegisterLog;
import com.lyh.dataup.log.UseGoldLog;

/**
 * 日志上报的处理。。。
 */
@Component("logicHandler")
public class LogicHandler implements MessageListener {
	
	@Resource
	DataUpHandleService dataUpHandleService;
	
	public void onMessage(Message message) {
		try {
			
			String msg = ((TextMessage) message).getText();
			String [] array =msg.split("\\|");
			if (array.length > 1){
				int head = Integer.parseInt(array[0]);
				String data = array[1].toString();
				if (head == IMsgCode.DATAUP_REGISTER_LOG_HTTP_PROTOCOL){//注册
					RegisterLog log = JSON.parseObject(data, RegisterLog.class);
					reg(log);
				}else if (head == IMsgCode.DATAUP_CREATE_ROLE_LOG_HTTP_PROTOCOL){//创建角色
					CreateRoleLog log = JSON.parseObject(data, CreateRoleLog.class);
					createRole(log);
				}else if (head == IMsgCode.DATAUP_LOGIN_LOG_HTTP_PROTOCOL){//角色登录
					LoginLog log = JSON.parseObject(data, LoginLog.class);
					login(log);
				}else if (head == IMsgCode.DATAUP_LOGIN_OUT_LOG_HTTP_PROTOCOL){//游戏退出
					
					LoginOutLog log = JSON.parseObject(data, LoginOutLog.class);
					out(log);
				}else if (head == IMsgCode.DATAUP_ONLINE_NUM_LOG_HTTP_PROTOCOL){//在线
					OnLineNumLog log = JSON.parseObject(data, OnLineNumLog.class);
					online(log);
				}else if (head == IMsgCode.DATAUP_RECHARGE_LOG_HTTP_PROTOCOL){//角色充值
					RechargeLog log = JSON.parseObject(data, RechargeLog.class);
					recharge(log);
				}else if(head == IMsgCode.DATAUP_USE_GOLD_LOG_HTTP_PROTOCOL){//使用道具,和金币
					UseGoldLog log = JSON.parseObject(data, UseGoldLog.class);
					consume(log);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 注册日志处理
	 * <p/>
	 * 注册日志 -- 每次登陆游戏，都写入了日志,非单次写入
	 * 
	 * @param obj
	 */
	private void reg(RegisterLog obj) {
		try {
			// 加注册账号 放弃日志
			OpOssQlzPassportReg opOssQlzPassportReg = new OpOssQlzPassportReg();
			opOssQlzPassportReg.setLastlogintime(Tools.getDateString(new Date(obj.getRegisterTime())));
			opOssQlzPassportReg.setLastloginip(obj.getUserIp());
			opOssQlzPassportReg.setOpenid(obj.getUserName() + obj.getServerId());
			opOssQlzPassportReg.setAppId(obj.getAppId());
			if (DataUpHandle.passports.get(opOssQlzPassportReg.getOpenid()) == null) {
				opOssQlzPassportReg.setWorldid(obj.getServerId());
				opOssQlzPassportReg.setInfo(Tools.getDateString(obj.getCreateTime())); // 存储注册时间
				dataUpHandleService.addRegister(opOssQlzPassportReg);
			} else {
				dataUpHandleService.updatePassportReg(opOssQlzPassportReg);
			}
		} catch (Exception e) {
			RunLog.logDao.error("reg 处理异常", e);
		}
	}
	
	/**
	 * 角色创建日志处理
	 * <p/>
	 * 创建角色时产生 -- 单次日志
	 * 
	 * @param obj
	 */
	private void createRole(CreateRoleLog obj) {
		try {
			// 加日志
			OpOssQlzCreateroleLog opOssQlzCreateroleLog = new OpOssQlzCreateroleLog();
			opOssQlzCreateroleLog.setAddtime(Tools.getNowDate());
			opOssQlzCreateroleLog.setRolename(obj.getRoleName());
			opOssQlzCreateroleLog.setOpenid(obj.getUserName());
			opOssQlzCreateroleLog.setWorldid(obj.getServerId());
			opOssQlzCreateroleLog.setUserip(obj.getUserIp());
			opOssQlzCreateroleLog.setTime(Tools.getDateString(new Date(obj.getCreateRoleTime())));
			opOssQlzCreateroleLog.setAppId(obj.getAppId());
			dataUpHandleService.addCreateRoleLog(opOssQlzCreateroleLog);
			
			// 加账号
			OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
			opOssQlzPassport.setOpenid(obj.getUserName() + obj.getServerId()); // openid+区服
			opOssQlzPassport.setRolename(obj.getRoleName());
			opOssQlzPassport.setWorldid(obj.getServerId());
			opOssQlzPassport.setAppId(obj.getAppId());
			opOssQlzPassport.setInviteCode(obj.getInviteCode());
			opOssQlzPassport.setRegtime(Tools.getDateString(new Date(obj.getCreateRoleTime())));
			int num = dataUpHandleService.addPassport(opOssQlzPassport);
			if (num == 1) {
				DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
			}
		} catch (Exception e) {
			RunLog.logDao.error("createRole 异常", e);
		}
	}
	
	/**
	 * 登陆日志处理
	 * <p/>
	 * 登陆时写入 -- 重复日志
	 * 
	 * @param obj
	 */
	private void login(LoginLog obj) {
		try {
			// 加日志
			OpOssQlzLoginLog opOssQlzLoginLog = new OpOssQlzLoginLog();
			opOssQlzLoginLog.setAddtime(Tools.getNowDate());
			opOssQlzLoginLog.setLevel(obj.getRoleLevel());
			opOssQlzLoginLog.setRolename(obj.getRoleName());
			opOssQlzLoginLog.setOpenid(obj.getUserName());
			opOssQlzLoginLog.setWorldid(obj.getServerId());
			opOssQlzLoginLog.setUserip(obj.getUserIp());
			opOssQlzLoginLog.setLogintime(Tools.getDateString(new Date(obj.getLoginTime())));
			opOssQlzLoginLog.setAppId(obj.getAppId());
			dataUpHandleService.addLoginLog(opOssQlzLoginLog);
			
			// 账号核实
			if (DataUpHandle.passports.get(obj.getUserName() + obj.getServerId()) == null) {
				OpOssQlzPassport opOssQlzPassport = dataUpHandleService.getPassportByOpenid(obj.getUserName() + obj.getServerId());
				if (opOssQlzPassport != null) {
					DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
				} else {
					opOssQlzPassport = new OpOssQlzPassport();
					opOssQlzPassport.setOpenid(obj.getUserName() + obj.getServerId()); // openid+区服
					opOssQlzPassport.setRolename(obj.getRoleName());
					opOssQlzPassport.setWorldid(obj.getServerId());
					opOssQlzPassport.setAppId(obj.getAppId());
					opOssQlzPassport.setRegtime(Tools.getDateString(new Date(obj.getLoginTime())));
					opOssQlzPassport.setInviteCode(obj.getInviteCode());
					int num = dataUpHandleService.addPassport(opOssQlzPassport);
					if (num == 1) {
						DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
					}
				}
			}
			
			// 更新记录
			OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
			opOssQlzPassport.setOpenid(obj.getUserName() + obj.getServerId());
			opOssQlzPassport.setGrade(obj.getRoleLevel());
			opOssQlzPassport.setIsonline(1);
			opOssQlzPassport.setLastloginip(obj.getUserIp());
			opOssQlzPassport.setLastlogintime(Tools.getDateString(new Date(obj.getLoginTime())));
			opOssQlzPassport.setAppId(obj.getAppId());
			if (DataUpHandle.passports.get(opOssQlzPassport.getOpenid()).getFristlogintime() == null) { // 确定首登时间
				opOssQlzPassport.setFristlogintime(Tools.getDateString(new Date(obj.getLoginTime())));
			}
			opOssQlzPassport = dataUpHandleService.updatePassport(opOssQlzPassport, "login");
			if (opOssQlzPassport != null) {
				// 更新缓存
				DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
			}
		} catch (Exception e) {
			RunLog.logDao.error("login 异常", e);
		}
	}
	
	private void out(LoginOutLog obj) {
		try {
			// 计算在线时长
			int timeOnline = 0;
			
			OpOssQlzPassport opOssQlzPassport = DataUpHandle.passports.get(obj.getUserName() + obj.getServerId());
			if (opOssQlzPassport == null) {
				opOssQlzPassport = dataUpHandleService.getPassportByOpenid(obj.getUserName() + obj.getServerId());
			}
			if (opOssQlzPassport != null) {
				try {
					//long ms = Tools.timecha(opOssQlzPassport.getLastlogintime(), Tools.getDateString(new Date(obj.getLoginOutTime())));
					timeOnline =obj.getOnlineTime();// (int) (ms / (1000 * 60));
					if (timeOnline == 0) {
						timeOnline = 1;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			// 加日志
			OpOssQlzOutLog opOssQlzOutLog = new OpOssQlzOutLog();
			opOssQlzOutLog.setAddtime(Tools.getNowDate());
			opOssQlzOutLog.setLevel(obj.getRoleLevel());
			opOssQlzOutLog.setRolename(obj.getRoleName());
			opOssQlzOutLog.setOpenid(obj.getUserName());
			opOssQlzOutLog.setWorldid(obj.getServerId());
			opOssQlzOutLog.setUserip(obj.getUserIp());
			opOssQlzOutLog.setOnlinetime(timeOnline); // 在线时长
			opOssQlzOutLog.setOuttime(Tools.getDateString(new Date(obj.getLoginOutTime())));
			opOssQlzOutLog.setVipgrade(obj.getVipLevel());
			opOssQlzOutLog.setGuidenum(obj.getNewPlayerGuild());
			opOssQlzOutLog.setAppId(obj.getAppId());
			dataUpHandleService.addLoginOutLog(opOssQlzOutLog);
			
			// 更新记录
			if (DataUpHandle.passports.get(obj.getUserName() + obj.getServerId()) != null) { // 存在
				// 更新账号
				opOssQlzPassport = new OpOssQlzPassport();
				opOssQlzPassport.setOpenid(obj.getUserName() + obj.getServerId());
				opOssQlzPassport.setGrade(obj.getRoleLevel());
				opOssQlzPassport.setIsonline(0);
				opOssQlzPassport.setVipgrade(obj.getVipLevel());
				opOssQlzPassport.setGuidenum(obj.getNewPlayerGuild());
				opOssQlzPassport.setInfo(timeOnline + ""); // 临时存储
				opOssQlzPassport.setAppId(obj.getAppId());
				opOssQlzPassport = dataUpHandleService.updatePassport(opOssQlzPassport, "out");
				if (opOssQlzPassport != null) {
					// 更新缓存
					DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
				}
			}
		} catch (Exception e) {
			RunLog.logDao.error("out 异常：", e);
		}
	}
	
	/**
	 * 充值日志
	 * 
	 * @param obj
	 */
	private void recharge(RechargeLog obj) {
		try {
			// 加日志
			OpOssQlzRechargeLog rechargeLog = new OpOssQlzRechargeLog();
			rechargeLog.setAddtime(Tools.getNowDate());
			rechargeLog.setLevel(obj.getRoleLevel());
			rechargeLog.setRolename(obj.getRoleName());
			rechargeLog.setOpenid(obj.getUserName());
			rechargeLog.setWorldid(obj.getServerId());
			rechargeLog.setMoneyadd((double) obj.getGoldAdd());
			rechargeLog.setMoneyafter((double) obj.getGoldAfter());
			rechargeLog.setMoneybefore((double) obj.getGoldBefore());
			rechargeLog.setTime(Tools.getDateString(new Date(obj.getPayTime())));
			rechargeLog.setSfrom(obj.getRechargeChannel());
			rechargeLog.setBillon(obj.getBillOrder());
			rechargeLog.setAppId(obj.getAppId());
			dataUpHandleService.addRechargeLog(rechargeLog);
			
			// 更新账户
			if (DataUpHandle.passports.get(obj.getUserName() + obj.getServerId()) != null) {
				OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
				opOssQlzPassport.setOpenid(obj.getUserName() + obj.getServerId());
				opOssQlzPassport.setGrade(obj.getRoleLevel());
				opOssQlzPassport.setIsonline(1);
				opOssQlzPassport.setCurmoney((double) obj.getGoldAfter());
				opOssQlzPassport.setInfo(obj.getGoldAdd() + "#" + obj.getBillOrder()); // 临时存储
				opOssQlzPassport.setAppId(obj.getAppId());
				if (obj.getBillOrder() != null && !obj.getBillOrder().contains("lyh")) { // 排除内部充值
					opOssQlzPassport.setLastpaytime(Tools.getDateString(new Date(obj.getPayTime())));
					if (DataUpHandle.passports.get(opOssQlzPassport.getOpenid()).getFristpaytime() == null) { // 确定首冲时间
						opOssQlzPassport.setFristpaytime(Tools.getDateString(new Date(obj.getPayTime())));
					}
				}
				opOssQlzPassport = dataUpHandleService.updatePassport(opOssQlzPassport, "recharge");
				if (opOssQlzPassport != null) {
					// 更新缓存
					DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
				}
			}
		} catch (Exception e) {
			RunLog.logDao.error("recharge 日志", e);
		}
	}
	
	/**
	 * 消费日志
	 * 
	 * @param obj
	 */
	private void consume(UseGoldLog obj) {
		try {
			
			// 加日志
			OpOssQlzConsumeLog opOssQlzConsumeLog = new OpOssQlzConsumeLog();
			opOssQlzConsumeLog.setAddtime(Tools.getNowDate());
			opOssQlzConsumeLog.setLevel(obj.getRoleLevel());
			opOssQlzConsumeLog.setRolename(obj.getRoleName());
			opOssQlzConsumeLog.setOpenid(obj.getUserName());
			opOssQlzConsumeLog.setWorldid(obj.getServerId());
			opOssQlzConsumeLog.setLostmoney((double) obj.getLostGold());
			opOssQlzConsumeLog.setMoneyafter((double) obj.getGoldAfter());
			opOssQlzConsumeLog.setMoneybefore((double) obj.getGoldBefore());
			opOssQlzConsumeLog.setTime(Tools.getDateString(new Date(obj.getUseGoldTime())));
			opOssQlzConsumeLog.setItemid(obj.getItemId() + "");
			opOssQlzConsumeLog.setItemname(obj.getItemName());
			opOssQlzConsumeLog.setItemnum(obj.getItemNum());
			opOssQlzConsumeLog.setItemtype(obj.getItemType() + "");
			opOssQlzConsumeLog.setAppId(obj.getAppId());
			int res = dataUpHandleService.addConsumeLog(opOssQlzConsumeLog);
			
			// 更新账户
			if (DataUpHandle.passports.get(obj.getUserName() + obj.getServerId()) != null) {
				OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
				opOssQlzPassport.setOpenid(obj.getUserName() + obj.getServerId());
				opOssQlzPassport.setGrade(obj.getRoleLevel());
				opOssQlzPassport.setIsonline(1);
				opOssQlzPassport.setAppId(obj.getAppId());
				opOssQlzPassport.setCurmoney((double) obj.getGoldAfter());
				opOssQlzPassport.setInfo(obj.getLostGold() + "");
				opOssQlzPassport = dataUpHandleService.updatePassport(opOssQlzPassport, "consume");
				if (opOssQlzPassport != null) {
					// 更新缓存
					DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
				}
			}
		} catch (Exception e) {
			RunLog.logDao.error("consume 异常", e);
		}
	}
	
	private void online(OnLineNumLog obj) {
		// 加日志
		OpOssQlzOnlinecurLog opOssQlzOnlinecurLog = new OpOssQlzOnlinecurLog();
		opOssQlzOnlinecurLog.setWorldid(obj.getServerId());
		opOssQlzOnlinecurLog.setAddtime(Tools.getDateString(new Date(obj.getRecordTime())));
		opOssQlzOnlinecurLog.setOnlinenum(obj.getOnlineNum());
		opOssQlzOnlinecurLog.setAppId(obj.getAppId());
		int res = dataUpHandleService.addOnlineLog(opOssQlzOnlinecurLog);
	}
}
