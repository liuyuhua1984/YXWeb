package com.gamecenter.controller.gmt;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.game.protocol.gm.GmJHPlayerHttpProtocol;
import com.game.protocol.gm.GmJHPlayerProtocolRequest;
import com.gamecenter.common.PlatformToServerConnection;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.controller.BaseController;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;

/**
 * ClassName:JHController <br/>
 * Function: TODO (金花控制牌型). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年7月3日 下午6:47:40 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/gmt")
public class JHController extends BaseController {
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	private static final String JH_PLYAYER_NAME = "jh_player_name";
	
	@RequestMapping("/jh/control")
	public ModelAndView jhCatList(HttpSession session) {
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
		ModelAndView view = new ModelAndView("/page/gmTools/JHPlayer");
		view.addObject("appList", appList);
		view.addObject("worldList", worldList);
		return view;
	}
	
	@RequestMapping("/jh/check")
	@ResponseBody
	public ModelMap jhcat(HttpSession session, @RequestParam(value = "name") String name, @RequestParam(value = "appId") String appId, @RequestParam(value = "worldId") String worldId,
	
	HttpServletResponse response) {
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		
		String res = "1";
		// 发给后端
		if (!ToolUtils.isStringNull(name)) {
			GmJHPlayerProtocolRequest request = new GmJHPlayerProtocolRequest();
			request.setPlayerName(name);
			OpGameworld opGameworld = worldService.getWorldByWorldId(worldId);
			if (opGameworld != null) {
				//logger.error("来了没有没有朋");
				GmJHPlayerHttpProtocol resp = (GmJHPlayerHttpProtocol) PlatformToServerConnection.sendPlatformToServer(opGameworld.getIp(), opGameworld.getServerurl(), request);
				if (resp != null) {
					res = resp.result;
				}
				//logger.error("来了没有" + resp.result);
			}
			//logger.error("查看玩家QQQQ");

		}
		
		ModelMap map = new ModelMap();
		map.put("res", res);
		return map;
	}
}
