package com.gamecenter.controller.invitecode;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.protocol.gm.GmInviteCodeProtocolRequest;
import com.gamecenter.common.encrypt.MD5;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.service.agent.AgentInviteCodeService;
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
public class InviteCodeController {
	
	@Autowired
	private AgentInviteCodeService agentInviteCodeService;
	
	private String KEY = "PINGANBANK_NET_B2C";
	
	@RequestMapping(value="/invite/code/check",method=RequestMethod.POST)
	@ResponseBody
	public ModelMap checkInviteCode(HttpSession session, HttpServletRequest req) {
		ModelMap map = new ModelMap();
		String openId = req.getParameter("openId");
		String inviteCode = req.getParameter("inviteCode");
		String serverId = req.getParameter("serverId");
		String sign = req.getParameter("sign");// openId=openId&inviteCode=inviteCode&key=KEY
		
		OpAgentInviteCode objInviteCode = agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode);
		if (objInviteCode != null && objInviteCode.getIsUse() == 0) {
			objInviteCode.setIsUse((byte) 1);
			agentInviteCodeService.update(objInviteCode);
			String md5 = MD5.encodeMD5("openId=" + openId + "&inviteCode=" + inviteCode + "&key=" + KEY);
			if (sign != null && sign.equals(md5)) {
				map.put("openId", openId);
				map.put("inviteCode", inviteCode);
				map.put("result", 1);
				GmInviteCodeProtocolRequest request = new GmInviteCodeProtocolRequest();
				request.setInviteCode(inviteCode);
				request.setOpenId(openId);
				request.setServerId(serverId);
				InviteCodeTask.inviteCodeList.add(request);
			} else {
				map.put("result", 0);
			}
		} else {
			map.put("result", -1);
		}
		
		return map;
	}
}
