package com.gamecenter.controller.gmt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.game.protocol.gm.GmHowToPlayHttpProtocol;
import com.game.protocol.gm.GmHowToPlayProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.properties.WeChatConfig;
import com.gamecenter.controller.BaseController;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;

/** 
 * ClassName:HowToPlayController <br/> 
 * 玩法介绍
 * Reason:   TODO (). <br/> 
 * Date:     2017年8月8日 下午5:45:39 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/gmt/")
public class HowToPlayController extends BaseController {

	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@RequestMapping("/how/to/play")
	public ModelAndView howToPlay(HttpSession session){
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView view = new ModelAndView("/page/gmTools/HowToPlay");
		view.addObject("appList", appList);
		view.addObject("worldList", worldList);
		view.addObject("channel",WeChatConfig.CHANNEL);
		return view;
	}
	
	/** 
	 * play:(). <br/> 
	 * TODO().<br/> 
	 * 游戏 介绍
	 * @author lyh 
	 * @param session
	 * @param request
	 * @return 
	 */  
	@RequestMapping("/how/play/info")
	@ResponseBody
	public Map<String,String> play(HttpSession session,HttpServletRequest request){
		Map<String,String> map = new HashMap<String,String>();
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		
		String type =request.getParameter("qb");
		String appId =request.getParameter("appId");
		String worldId =request.getParameter("worldId");
		String info =request.getParameter("info");
		
		String res = "-1";
		// 发给后端
		if (!ToolUtils.isStringNull(info)) {
			GmHowToPlayProtocolRequest req = new GmHowToPlayProtocolRequest();
			req.setPlayType(Integer.parseInt(type));
			req.setTxt(info);
			req.setServerId(worldId);
			OpGameworld opGameworld = worldService.getWorldByWorldId(worldId);
			if (opGameworld != null) {
				//logger.error("来了没有没有朋");
				GmHowToPlayHttpProtocol resp = (GmHowToPlayHttpProtocol) PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), req);
				if (resp != null) {
					res = ""+ resp.getStatus();
				}else{
					map.put("res", "-9");
				}
				//logger.error("来了没有" + resp.result);
			}else{
				res = "-8";
			}
			//logger.error("查看玩家QQQQ");

		}
		map.put("res", res);
		return map;
		
	}
}
  