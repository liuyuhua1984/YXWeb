package com.gamecenter.controller.webservice.config;

import com.gamecenter.controller.webservice.cdk.ParCdkCheck;
import com.gamecenter.controller.webservice.cdk.ParCdkReturn;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.vo.Par_OperatorMsg;
import com.gamecenter.service.appServices.Operator_porduct_Service;
import com.gamecenter.service.appServices.WorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 联合运营 配置服务
 * <p/>
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-29 Time: 上午11:04 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ws/unite")
public class UniteOperate {
	
	@Resource
	Operator_porduct_Service operator_porduct_service;
	@Resource
	WorldService worldService;
	
	/**
	 * 获取区服的联运信息
	 * 
	 * @param appid
	 * @param worldid
	 * @return
	 */
	@RequestMapping(value = "/config"/* , method = RequestMethod.POST */)
	@ResponseBody
	public Object uniteConfig(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid) {
		Par_OperatorMsg par_operatorMsg = operator_porduct_service.getOpObj(appid, worldid);
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		par_operatorMsg.setIp(opGameworld.getIp());
		par_operatorMsg.setPort(opGameworld.getServerurl());
		return par_operatorMsg;
	}
	
}
