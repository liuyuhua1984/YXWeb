package com.gamecenter.controller.webservice;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gamecenter.parBean.vo.ComPars;
import com.gamecenter.service.PayTxService;
import com.gamecenter.service.RunLog;

/**
 * 账号登入服务 --- 记录登入状态 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 上午11:50 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/tx")
public class IntoGameController {
	
	@Resource
	PayTxService payTxService;
	
	@RequestMapping("/intogame")
	public void intogame(ComPars comPars, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		RunLog.logDao.info(">进入游戏:" + comPars.getOpenid());
		if (comPars.getOpenid() != null && comPars.getOpenkey() != null)
			payTxService.intogame(comPars);
	}
	
}
