package com.gamecenter.controller.webservice.cdk;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ActivityService;

/**
 * 活动 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/cdk/check")
public class ActivityCheckController {
	@Resource
	ActivityService activityService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	@RequestMapping(value = "/code", method = RequestMethod.POST)
	@ResponseBody
	public Object saveActivity(ParCdkCheck cdkPar) {
		ParCdkReturn obj = activityService.checkCdk(cdkPar);
		return obj;
	}
}
