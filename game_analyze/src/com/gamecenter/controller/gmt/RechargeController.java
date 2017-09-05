package com.gamecenter.controller.gmt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOperatorRecharge;
import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.service.agent.PlayerRechargeService;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.RechargeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 充值日志
 * <p/>
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/recharge")
public class RechargeController {
	
	@Resource
	PlayerRechargeService rechargeService;
	
	@Resource
	RechargeService txRechargeService;
	
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
	public ModelAndView dataList(@RequestParam(value = "page", defaultValue = "1") int curPage, @RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime", defaultValue = "2000-00-00") String begintime, @RequestParam(value = "endtime", defaultValue = "3000-00-00") String endtime) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		if (opGameworld == null)
			return null;
		
//		OpOssQlzRechargeTx obj = new OpOssQlzRechargeTx();
//		obj.setZoneid(opGameworld.getWorldid());
//		obj.setAddtime(begintime + " 00:00:00" + "#" + endtime + " 23:59:59");
//		
//		Page p = rechargeService.getRechargeTxList(obj, 15, page);
//		PageTool3 pt = new PageTool3();
//		String pageStr = pt.getPageStringForjs("", p);
//		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("page/gmTools/recharge/RechargeTxPage_List");
//		modelAndView.addObject("lists", (List<OpOssQlzRechargeTx>) p.getResult());
//		modelAndView.addObject("pageTools", pageStr);
//		modelAndView.addObject("count", p.getTotalSize());
		
		
		PageHelper.startPage(curPage,Tools.PAGE_SIZE);
//		begintime + " 00:00:00" + "#" + endtime + " 23:59:59"
		List<OpOperatorRecharge> list = rechargeService.findOpOperatorRechargeByWorldIdAndTime(worldid, begintime + " 00:00:00", endtime + " 23:59:59");
		PageInfo<OpOperatorRecharge> pageInfo = new PageInfo<OpOperatorRecharge>(list);
		Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
		
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", page);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/recharge/RechargeTxPage_List");
		modelAndView.addObject("lists", list);
		modelAndView.addObject("pageTools", pageStr);
		modelAndView.addObject("count", page.getTotalSize());
		
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
		

//		
//		OpOssQlzRechargeTx obj = new OpOssQlzRechargeTx();
//		obj.setZoneid(opGameworld.getWorldid());
//		obj.setAddtime(begintime + " 00:00:00" + "#" + endtime + " 23:59:59");
		
		double paycount = rechargeService.payCount(worldid, begintime + " 00:00:00", endtime + " 23:59:59");
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
		OpOssQlzRechargeTx obj = txRechargeService.getRechargeTxById(id);
		
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
			String res = txRechargeService.fahuo(billno);
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
