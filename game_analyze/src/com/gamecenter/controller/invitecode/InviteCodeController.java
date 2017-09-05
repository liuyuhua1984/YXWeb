package com.gamecenter.controller.invitecode;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.protocol.gm.GmInviteCodeProtocolRequest;
import com.gamecenter.common.encrypt.MD5;

import com.gamecenter.controller.BaseController;

import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.service.agent.AgentInviteCodeService;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.dataup.DataUpHandleService;
import com.gamecenter.service.task.InviteCodeTask;

/**
 * ClassName:InviteCodeController <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月27日 上午11:35:54 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
public class InviteCodeController extends BaseController {

	
	@Autowired
	private AgentInviteCodeService agentInviteCodeService;
	@Autowired
	private AgentListService agentListService;
	@Autowired
	private DataUpHandleService dataUpHandleService;
	private String KEY = "PINGANBANK_NET_B2C";
	
	/**
	 * checkInviteCode:(). <br/>
	 * TODO().<br/>
	 * 与客户端验证邀请码
	 * 
	 * @author lyh
	 * @param session
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/invite/code/check", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap checkInviteCode(HttpSession session, HttpServletRequest req) {
		ModelMap map = new ModelMap();
		String openId = req.getParameter("openId");
		String inviteCode = req.getParameter("inviteCode");// 这邀请码是代理的
		String serverId = req.getParameter("serverId");
		String sign = req.getParameter("sign");// openId=openId&inviteCode=inviteCode&key=KEY
		

		logger.error("收到inviteCode::"+inviteCode);
		OpAgentInviteCode objInviteCode = agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode);
		
		if (objInviteCode != null) {
			OpAgentList agentList = agentListService.findByInviteCode(inviteCode);
			
			if (agentList == null || !agentList.getInviteCode().equals(inviteCode) ) {
				map.put("result", -2);
				logger.error("收到inviteCode:错误2:");

				return map;
			}
			
			objInviteCode.setIsUse((byte) 1);
			agentInviteCodeService.update(objInviteCode);
			String md5 = MD5.encodeMD5("openId=" + openId + "&inviteCode=" + inviteCode + "&key=" + KEY);
			if (sign != null && sign.equals(md5)) {
				
				OpOssQlzPassport player = dataUpHandleService.getPassportByOpenid(openId);
				long tDays= (60*24*3600*1000);
				long time = System.currentTimeMillis() + tDays;
				if (player.getInviteTime() == null){
					player.setInviteTime(new Date(time));
				}else{
					 player.getInviteTime().setTime(time);
				}
				player.setInviteCode(inviteCode);
				dataUpHandleService.updatePassport(player, "refresh");
				
				// 与代理绑定
				
				map.put("openId", openId);
				map.put("inviteCode", inviteCode);
				map.put("result", 1);
				
				GmInviteCodeProtocolRequest request = new GmInviteCodeProtocolRequest();
				request.setInviteCode(inviteCode);
				request.setOpenId(openId);
				request.setServerId(serverId);
				InviteCodeTask.inviteCodeList.add(request);

				logger.error("收到inviteCode:成功:");
			} else {
				logger.error(md5+":收到inviteCode:MD5有问题:"+sign);
				map.put("result", 0);
			}
		} else {
			logger.error("收到inviteCode:没有找到Invite:");
			map.put("result", -1);
		}
		
		return map;
	}
}
