package com.gamecenter.controller.gmt;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool;
import com.gamecenter.common.PageTool3;
import com.gamecenter.model.*;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmtServices.RechargeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 充值日志
 * <p/>
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/recharge")
public class RechargeController {
	
	@Resource
	RechargeService rechargeService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 腾讯充值对账列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView txpage() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/recharge/RechargeTxPage");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 腾讯充值 列表数据
	 * 
	 * @param page
	 * @param appid
	 * @param worldid
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	@RequestMapping("/dataList")
	public ModelAndView dataList(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime", defaultValue = "2000-00-00") String begintime, @RequestParam(value = "endtime", defaultValue = "3000-00-00") String endtime) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		if (opGameworld == null)
			return null;
		
		OpOssQlzRechargeTx obj = new OpOssQlzRechargeTx();
		obj.setZoneid(opGameworld.getWorldid());
		obj.setAddtime(begintime + " 00:00:00" + "#" + endtime + " 23:59:59");
		
		Page p = rechargeService.getRechargeTxList(obj, 15, page);
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", p);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/recharge/RechargeTxPage_List");
		modelAndView.addObject("lists", (List<OpOssQlzRechargeTx>) p.getResult());
		modelAndView.addObject("pageTools", pageStr);
		modelAndView.addObject("count", p.getTotalSize());
		
		return modelAndView;
	}
	
	/**
	 * 累计充值
	 * 
	 * @param appid
	 * @param worldid
	 * @param begintime
	 * @param endtime
	 * @return
	 */
	@RequestMapping("/paycount")
	@ResponseBody
	public Object paycount(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime", defaultValue = "2000-00-00") String begintime, @RequestParam(value = "endtime", defaultValue = "3000-00-00") String endtime) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		if (opGameworld == null)
			return null;
		
		OpOssQlzRechargeTx obj = new OpOssQlzRechargeTx();
		obj.setZoneid(opGameworld.getWorldid());
		obj.setAddtime(begintime + " 00:00:00" + "#" + endtime + " 23:59:59");
		
		double paycount = rechargeService.paycount(obj);
		return paycount;
	}
	
	/**
	 * 腾讯充值 订单数据
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/datamsg")
	public ModelAndView datamsg(@RequestParam(value = "id", defaultValue = "1") int id) {
		OpOssQlzRechargeTx obj = rechargeService.getRechargeTxById(id);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/recharge/RechargeTxPage_data");
		modelAndView.addObject("obj", obj);
		return modelAndView;
	}
	
	/**
	 * 腾讯充值 补单发货
	 * 
	 * @param billno
	 * @return
	 */
	@RequestMapping("/fahuo")
	@ResponseBody
	public Object fahuo(@RequestParam(value = "billno") String billno) {
		String msg = "";
		if (billno == null || billno.length() <= 0) {
			msg = "非法单号！";
		} else {
			String res = rechargeService.fahuo(billno);
			if (res.equals("0")) {
				msg = "注意货物已经发送！";
			} else if (res.equals("1")) {
				msg = "发货成功！";
			} else {
				msg = "系统繁忙！";
			}
		}
		Map map = new HashMap();
		map.put("msg", msg);
		return map;
	}
	
}
