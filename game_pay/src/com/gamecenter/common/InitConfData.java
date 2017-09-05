package com.gamecenter.common;

/**
 * 全局配置文件加载
 * <p/>
 * Created by IntelliJ IDEA. User: Administrator Date: 12-2-16 Time: 下午6:50 To change this template use File | Settings | File Templates.
 */
public class InitConfData {
	
	// @Resource
	// MeterManageService meterManageService;
	
	public void init() {
		// checkMeterStatus();
	}
	
	//
	// public void checkMeterStatus() {
	// Timer timer = new Timer();
	// timer.schedule(new TimerTask() {
	// @Override
	// public void run() {
	// System.out.print(">>>定期检查：");
	// byte sign = 0;
	// List<JlMeter> jlMeters = meterManageService.getCheckMeterMsgs();
	// if (jlMeters.size() > 0) {
	// for (JlMeter jlMeter : jlMeters) {
	// //判断是否 临近检查期了
	// try {
	// if (jlMeter.getCheckperiod().equals("-1")) { //一次性计量器具
	// sign = 0;
	// } else if (jlMeter.getValidity() == null || jlMeter.getValidity().trim().equals("")) { //有效期没有
	// sign = 1;
	// } else {
	// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	// Date d = sdf.parse(jlMeter.getValidity());
	//
	// Calendar c = Calendar.getInstance();
	// c.setTime(d);
	//
	// c.add(Calendar.DATE, -15); //15天就提示报警哦
	//
	// if (System.currentTimeMillis() >= c.getTimeInMillis()) {
	// sign = 1;
	// }
	// }
	// if (sign == 1) {
	// JlMeter jlMeterxx = new JlMeter();
	// jlMeterxx.setMid(jlMeter.getMid());
	// jlMeterxx.setStatus("1");
	// //报警标识
	// meterManageService.update(jlMeterxx, "");
	//
	// //记录检定日志 -- 用于计算检定率哦
	// JlMeterChecklog jlMeterChecklog = new JlMeterChecklog();
	// jlMeterChecklog.setInfo("系统自动验证发送");
	// jlMeterChecklog.setPerson("系统");
	// jlMeterChecklog.setMid(jlMeter.getMid());
	// jlMeterChecklog.setTime(new Date());
	// jlMeterChecklog.setType("1");
	// meterManageService.insertCheckLog(jlMeterChecklog);
	//
	// }
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// sign = 0; //重置
	// }
	// }
	//
	//
	// }
	// }, 10000, 20000);
	// }
	//
	
}
