package com.gamecenter.controller.webservice;

import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.Txtask_request;
import com.gamecenter.common.txsdk.com.qq.open.SnsSigCheck;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpTxTask;
import com.gamecenter.parBean.vo.TaskReq;
import com.gamecenter.service.RunLog;
import com.gamecenter.service.TaskService;
import com.gamecenter.service.WorldService;
import com.gamecenter.service.tasks.PayHandle;

/**
 * 腾讯任务集市 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 上午11:50 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/task")
public class TxTasksController {
	@Resource
	WorldService worldService;
	@Resource
	TaskService taskService;
	
	public static Map<String, String> taskmap = new HashMap<String, String>();
	
	/**
	 * 任务初始化配置。。。
	 */
	@PostConstruct
	public void initTask() {
		System.out.println("任务初始化....");
		ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		String tasks = bundle.getString("tasks");
		String[] ts = tasks.split("#");
		for (String ids : ts) {
			taskmap.put(ids.split(",")[0] + "-1", ids.split(",")[1]);
			taskmap.put(ids.split(",")[0] + "-2", ids.split(",")[2]);
			taskmap.put(ids.split(",")[0] + "-3", ids.split(",")[3]);
		}
	}
	
	/**
	 * 任务验证网关
	 * 
	 * @param taskReq
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/check")
	@ResponseBody
	public Object check(TaskReq taskReq, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		String newWid = bundle.getString("newWid");
		
		boolean checkSig = false;
		// sig验证
		try {
			checkSig = SnsSigCheck.verifySig("GET", "/task/check", taskReq.putHash(), PayHandle.appkey + "&", taskReq.getSig());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RunLog.logDao.info("********任务校验:发奖流水好(" + taskReq.getBillno() + ")************");
		System.out.println("参数验证结果:" + checkSig);
		
		String res = "";
		if (checkSig) {
			res = checkHandle(taskReq, newWid);
		} else {
			RunLog.payLog.error("[注意]任务集市网关>sig验证异常");
		}
		
		// 返回结果
		String msg = "";
		int ret = 0;
		if (checkSig) {
			ret = Integer.parseInt(res);
			msg = "OK";
		} else {
			ret = 103;
			msg = "error system";
		}
		Map map = new HashMap();
		map.put("ret", ret);
		map.put("msg", msg);
		map.put("zoneid", newWid);
		
		return map;
	}
	
	/**
	 * 发起验证
	 * 
	 * @param taskReq
	 * @return
	 */
	private String checkHandle(TaskReq taskReq, String worldid) {
		RunLog.logDao.info("请求信息：步骤>" + taskReq.getStep() + ";cmd>" + taskReq.getCmd() + ";openid>" + taskReq.getOpenid());
		// 获取区服信息
		String result = "";
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		
		// 请求发送
		try {
			Txtask_request txtask_request = new Txtask_request();
			txtask_request.setCmd(taskReq.getCmd());
			txtask_request.setOpenid(taskReq.getOpenid());
			txtask_request.setTaskid(taskmap.get(taskReq.getContractid() + "-" + taskReq.getStep()));
			
			RunLog.logDao.info("任务号：" + taskmap.get(taskReq.getContractid() + "-" + taskReq.getStep()));
			
			SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
			result = SendReqToGame.getInstance().sendMessage(txtask_request, worldid).toString();
			RunLog.logDao.info("结果：" + result);
			
		} catch (Exception e) {
			result = "-1";
			RunLog.logDao.error("校验异常：", e);
		}
		
		// 数据库记录
		OpTxTask opTxTask = new OpTxTask();
		BeanUtils.copyProperties(taskReq, opTxTask);
		opTxTask.setRes(result);
		taskService.addInfo(opTxTask);
		
		return result;
	}
	
}
