package com.gamecenter.service.task.jmsHandler;

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
import com.gamecenter.parBean.updataObj.CreateRoleLog;
import com.gamecenter.parBean.updataObj.LoginLog;
import com.gamecenter.parBean.updataObj.LoginOutLog;
import com.gamecenter.parBean.updataObj.OnlineNumLog;
import com.gamecenter.parBean.updataObj.RechargeLog;
import com.gamecenter.parBean.updataObj.RegisterLog;
import com.gamecenter.parBean.updataObj.UpDataObj;
import com.gamecenter.parBean.updataObj.UseGoldLog;
import com.gamecenter.service.RunLog;
import com.gamecenter.service.dataUploadServices.DataUpHandleService;
import com.gamecenter.service.task.DataUpHandle;

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
		
			UpDataObj obj = JSON.parseObject(msg, UpDataObj.class);
			
			if (obj.getType() == 1) {
				
				RegisterLog log = JSON.parseObject(obj.getData(), RegisterLog.class);
				reg(log);
				
			} else if (obj.getType() == 2) {
				 
				CreateRoleLog log = JSON.parseObject(obj.getData(), CreateRoleLog.class);
				createRole(log);
				
			} else if (obj.getType() == 3) {
				
				LoginLog log = JSON.parseObject(obj.getData(), LoginLog.class);
				login(log);
				
			} else if (obj.getType() == 4) {
				
				LoginOutLog log = JSON.parseObject(obj.getData(), LoginOutLog.class);
				out(log);
				
			} else if (obj.getType() == 5) {
				
				RechargeLog log = JSON.parseObject(obj.getData(), RechargeLog.class);
				recharge(log);
				
			} else if (obj.getType() == 6) {
				
				UseGoldLog log = JSON.parseObject(obj.getData(), UseGoldLog.class);
				consume(log);
			} else if (obj.getType() == 7) {
				OnlineNumLog log = JSON.parseObject(obj.getData(), OnlineNumLog.class);
				online(log);
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
			opOssQlzPassportReg.setLastlogintime(Tools.getDateString(obj.getCreatetime()));
			opOssQlzPassportReg.setLastloginip(obj.getUserip());
			opOssQlzPassportReg.setOpenid(obj.getUsername() + obj.getServerid());
			
			if (DataUpHandle.passports.get(opOssQlzPassportReg.getOpenid()) == null) {
				opOssQlzPassportReg.setWorldid(obj.getServerid());
				opOssQlzPassportReg.setInfo(Tools.getDateString(obj.getCreatetime())); // 存储注册时间
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
			opOssQlzCreateroleLog.setRolename(obj.getRolename());
			opOssQlzCreateroleLog.setOpenid(obj.getUsername());
			opOssQlzCreateroleLog.setWorldid(obj.getServerid());
			opOssQlzCreateroleLog.setUserip(obj.getUserip());
			opOssQlzCreateroleLog.setTime(Tools.getDateString(obj.getCreatetime()));
			dataUpHandleService.addCreateRoleLog(opOssQlzCreateroleLog);
			
			// 加账号
			OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
			opOssQlzPassport.setOpenid(obj.getUsername() + obj.getServerid()); // openid+区服
			opOssQlzPassport.setRolename(obj.getRolename());
			opOssQlzPassport.setWorldid(obj.getServerid());
			opOssQlzPassport.setRegtime(Tools.getDateString(obj.getCreatetime()));
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
			opOssQlzLoginLog.setLevel(obj.getRolelevel());
			opOssQlzLoginLog.setRolename(obj.getRolename());
			opOssQlzLoginLog.setOpenid(obj.getUsername());
			opOssQlzLoginLog.setWorldid(obj.getServerid());
			opOssQlzLoginLog.setUserip(obj.getUserip());
			opOssQlzLoginLog.setLogintime(Tools.getDateString(obj.getCreatetime()));
			dataUpHandleService.addLoginLog(opOssQlzLoginLog);
			
			// 账号核实
			if (DataUpHandle.passports.get(obj.getUsername() + obj.getServerid()) == null) {
				OpOssQlzPassport opOssQlzPassport = dataUpHandleService.getPassportByOpenid(obj.getUsername() + obj.getServerid());
				if (opOssQlzPassport != null) {
					DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
				} else {
					opOssQlzPassport = new OpOssQlzPassport();
					opOssQlzPassport.setOpenid(obj.getUsername() + obj.getServerid()); // openid+区服
					opOssQlzPassport.setRolename(obj.getRolename());
					opOssQlzPassport.setWorldid(obj.getServerid());
					opOssQlzPassport.setRegtime(Tools.getDateString(obj.getCreatetime()));
					int num = dataUpHandleService.addPassport(opOssQlzPassport);
					if (num == 1) {
						DataUpHandle.passports.put(opOssQlzPassport.getOpenid(), opOssQlzPassport);
					}
				}
			}
			
			// 更新记录
			OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
			opOssQlzPassport.setOpenid(obj.getUsername() + obj.getServerid());
			opOssQlzPassport.setGrade(obj.getRolelevel());
			opOssQlzPassport.setIsonline(1);
			opOssQlzPassport.setLastloginip(obj.getUserip());
			opOssQlzPassport.setLastlogintime(Tools.getDateString(obj.getCreatetime()));
			
			if (DataUpHandle.passports.get(opOssQlzPassport.getOpenid()).getFristlogintime() == null) { // 确定首登时间
				opOssQlzPassport.setFristlogintime(Tools.getDateString(obj.getCreatetime()));
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
			
			OpOssQlzPassport opOssQlzPassport = DataUpHandle.passports.get(obj.getUsername() + obj.getServerid());
			if (opOssQlzPassport == null) {
				opOssQlzPassport = dataUpHandleService.getPassportByOpenid(obj.getUsername() + obj.getServerid());
			}
			if (opOssQlzPassport != null) {
				try {
					long ms = Tools.timecha(opOssQlzPassport.getLastlogintime(), Tools.getDateString(obj.getCreatetime()));
					timeOnline = (int) (ms / (1000 * 60));
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
			opOssQlzOutLog.setLevel(obj.getRolelevel());
			opOssQlzOutLog.setRolename(obj.getRolename());
			opOssQlzOutLog.setOpenid(obj.getUsername());
			opOssQlzOutLog.setWorldid(obj.getServerid());
			opOssQlzOutLog.setUserip(obj.getUserip());
			opOssQlzOutLog.setOnlinetime(timeOnline); // 在线时长
			opOssQlzOutLog.setOuttime(Tools.getDateString(obj.getCreatetime()));
			opOssQlzOutLog.setVipgrade(obj.getViplevel());
			opOssQlzOutLog.setGuidenum(obj.getNewplayerguild());
			dataUpHandleService.addLoginOutLog(opOssQlzOutLog);
			
			// 更新记录
			if (DataUpHandle.passports.get(obj.getUsername() + obj.getServerid()) != null) { // 存在
				// 更新账号
				opOssQlzPassport = new OpOssQlzPassport();
				opOssQlzPassport.setOpenid(obj.getUsername() + obj.getServerid());
				opOssQlzPassport.setGrade(obj.getRolelevel());
				opOssQlzPassport.setIsonline(0);
				opOssQlzPassport.setVipgrade(obj.getViplevel());
				opOssQlzPassport.setGuidenum(obj.getNewplayerguild());
				opOssQlzPassport.setInfo(timeOnline + ""); // 临时存储
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
			rechargeLog.setLevel(obj.getRolelevel());
			rechargeLog.setRolename(obj.getRolename());
			rechargeLog.setOpenid(obj.getUsername());
			rechargeLog.setWorldid(obj.getServerid());
			rechargeLog.setMoneyadd((double) obj.getGoldadd());
			rechargeLog.setMoneyafter((double) obj.getGoldafter());
			rechargeLog.setMoneybefore((double) obj.getGoldbefore());
			rechargeLog.setTime(Tools.getDateString(obj.getCreatetime()));
			rechargeLog.setSfrom(obj.getRechargechannel() + "");
			rechargeLog.setBillon(obj.getBillno());
			dataUpHandleService.addRechargeLog(rechargeLog);
			
			// 更新账户
			if (DataUpHandle.passports.get(obj.getUsername() + obj.getServerid()) != null) {
				OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
				opOssQlzPassport.setOpenid(obj.getUsername() + obj.getServerid());
				opOssQlzPassport.setGrade(obj.getRolelevel());
				opOssQlzPassport.setIsonline(1);
				opOssQlzPassport.setCurmoney((double) obj.getGoldafter());
				opOssQlzPassport.setInfo(obj.getGoldadd() + "#" + obj.getBillno()); // 临时存储
				
				if (obj.getBillno() != null && !obj.getBillno().contains("reku")) { // 排除内部充值
					opOssQlzPassport.setLastpaytime(Tools.getDateString(obj.getCreatetime()));
					if (DataUpHandle.passports.get(opOssQlzPassport.getOpenid()).getFristpaytime() == null) { // 确定首冲时间
						opOssQlzPassport.setFristpaytime(Tools.getDateString(obj.getCreatetime()));
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
			opOssQlzConsumeLog.setLevel(obj.getRolelevel());
			opOssQlzConsumeLog.setRolename(obj.getRolename());
			opOssQlzConsumeLog.setOpenid(obj.getUsername());
			opOssQlzConsumeLog.setWorldid(obj.getServerid());
			opOssQlzConsumeLog.setLostmoney((double) obj.getLostgold());
			opOssQlzConsumeLog.setMoneyafter((double) obj.getGoldafter());
			opOssQlzConsumeLog.setMoneybefore((double) obj.getGoldbefore());
			opOssQlzConsumeLog.setTime(Tools.getDateString(obj.getCreatetime()));
			opOssQlzConsumeLog.setItemid(obj.getItemid() + "");
			opOssQlzConsumeLog.setItemname(obj.getItemname());
			opOssQlzConsumeLog.setItemnum(obj.getItemnum());
			opOssQlzConsumeLog.setItemtype(obj.getItemtype() + "");
			int res = dataUpHandleService.addConsumeLog(opOssQlzConsumeLog);
			
			// 更新账户
			if (DataUpHandle.passports.get(obj.getUsername() + obj.getServerid()) != null) {
				OpOssQlzPassport opOssQlzPassport = new OpOssQlzPassport();
				opOssQlzPassport.setOpenid(obj.getUsername() + obj.getServerid());
				opOssQlzPassport.setGrade(obj.getRolelevel());
				opOssQlzPassport.setIsonline(1);
				opOssQlzPassport.setCurmoney((double) obj.getGoldafter());
				opOssQlzPassport.setInfo(obj.getLostgold() + "");
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
	
	private void online(OnlineNumLog obj) {
		// 加日志
		OpOssQlzOnlinecurLog opOssQlzOnlinecurLog = new OpOssQlzOnlinecurLog();
		opOssQlzOnlinecurLog.setWorldid(obj.getServerid());
		opOssQlzOnlinecurLog.setAddtime(Tools.getDateString(obj.getCreatetime()));
		opOssQlzOnlinecurLog.setOnlinenum(obj.getOnlinenum());
		
		int res = dataUpHandleService.addOnlineLog(opOssQlzOnlinecurLog);
	}
}
