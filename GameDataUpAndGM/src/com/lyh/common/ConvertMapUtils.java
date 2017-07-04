package com.lyh.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.fastjson.JSON;
import com.game.protocol.gm.GmNoticeLeftHttpProtocol;
import com.game.protocol.gm.GmNoticeLeftProtocolRequest;
import com.game.protocol.gm.GmBlockIPHttpProtocol;
import com.game.protocol.gm.GmBlockIPProtocolRequest;
import com.game.protocol.gm.GmBlockRoleHttpProtocol;
import com.game.protocol.gm.GmBlockRoleProtocolRequest;
import com.game.protocol.gm.GmBlockSayHttpProtocol;
import com.game.protocol.gm.GmBlockSayProtocolRequest;
import com.game.protocol.gm.GmCheckIsFinishHttpProtocol;
import com.game.protocol.gm.GmCheckIsFinishProtocolRequest;
import com.game.protocol.gm.GmCloseButtonHttpProtocol;
import com.game.protocol.gm.GmCloseButtonProtocolRequest;
import com.game.protocol.gm.GmDisblockIPHttpProtocol;
import com.game.protocol.gm.GmDisblockIPProtocolRequest;
import com.game.protocol.gm.GmDisblockRoleHttpProtocol;
import com.game.protocol.gm.GmDisblockRoleProtocolRequest;
import com.game.protocol.gm.GmDisblockSayHttpProtocol;
import com.game.protocol.gm.GmDisblockSayProtocolRequest;
import com.game.protocol.gm.GmKickRoleHttpProtocol;
import com.game.protocol.gm.GmKickRoleProtocolRequest;
import com.game.protocol.gm.GmInviteCodeHttpProtocol;
import com.game.protocol.gm.GmInviteCodeProtocolRequest;
import com.game.protocol.gm.GmMailRoleHttpProtocol;
import com.game.protocol.gm.GmMailRoleProtocolRequest;
import com.game.protocol.gm.GmNoticeHttpProtocol;
import com.game.protocol.gm.GmNoticeProtocolRequest;
import com.game.protocol.gm.GmOnLineNumHttpProtocol;
import com.game.protocol.gm.GmOnLineNumProtocolRequest;
import com.game.protocol.gm.GmOpenRewardActivitiesHttpProtocol;
import com.game.protocol.gm.GmOpenRewardActivitiesProtocolRequest;
import com.game.protocol.gm.GmQqRechargeHttpProtocol;
import com.game.protocol.gm.GmQqRechargeProtocolRequest;
import com.game.protocol.gm.GmRechargeHttpProtocol;
import com.game.protocol.gm.GmRechargeProtocolRequest;
import com.game.protocol.gm.GmRoleInfoHttpProtocol;
import com.game.protocol.gm.GmRoleInfoProtocolRequest;
import com.game.protocol.gm.GmJHPlayerHttpProtocol;
import com.game.protocol.gm.GmJHPlayerProtocolRequest;
import com.lyh.dataup.log.DataUpBase;

/** 
 * ClassName:ConvertMapUitls <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月7日 下午6:01:59 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class ConvertMapUtils {

	private static Map<Long, Class<? extends DataUpBase>> httpMessageMap = new ConcurrentHashMap<Long, Class<? extends DataUpBase>>();
	
	private static Map<Long, Class<? extends DataUpBase>> httpRqeustMessageMap = new ConcurrentHashMap<Long, Class<? extends DataUpBase>>();
	
	/**
	 * getHttpResponseClass:(). <br/>
	 * TODO().<br/>
	 * 用消息头查找一个返回对象
	 * 
	 * @author lyh
	 * @param head
	 * @return
	 */
	public static  Class<? extends DataUpBase> getHttpResponseClass(long head) {
		Class<? extends DataUpBase> p = httpMessageMap.get(head);
		if (p == null) {
			
			if (head == IMsgCode.GM_JH_PLAYER_HTTP_PROTOCOL) {
				/** GM平台接入验证. */
				httpMessageMap.put(head, GmJHPlayerHttpProtocol.class);
			} else if (head == IMsgCode.GM_RECHARGE_HTTP_PROTOCOL) {
				/** GM平台充值游戏。 */
				httpMessageMap.put(head, GmRechargeHttpProtocol.class);
			} else
			
			if (head == IMsgCode.GM_QQ_RECHARGE_HTTP_PROTOCOL) {
				/** QQ充值 */
				httpMessageMap.put(head, GmQqRechargeHttpProtocol.class);
			} else if (head == IMsgCode.GM_ROLE_INFO_HTTP_PROTOCOL) {
				/** GM平台获取角色信息数据。 */
				httpMessageMap.put(head, GmRoleInfoHttpProtocol.class);
			} else if (head == IMsgCode.GM_ONLINE_NUM_HTTP_PROTOCOL) {
				/** GM平台获取实时在线人数。 */
				httpMessageMap.put(head, GmOnLineNumHttpProtocol.class);
			} else if (head == IMsgCode.GM_ROLE_NO_BLOCK_SAY_HTTP_PROTOCOL) {
				/** GM发起账号禁言。 */
				httpMessageMap.put(head, GmBlockSayHttpProtocol.class);
			} else
			
			if (head == IMsgCode.GM_ROLE_DISBLOCK_SAY_HTTP_PROTOCOL) {
				/** GM角色禁言解封 */
				httpMessageMap.put(head, GmDisblockSayHttpProtocol.class);
			} else if (head == IMsgCode.GM_ROLE_IP_BLOCK_SAY_HTTP_PROTOCOL) {
				/** GMIp禁言 */
				httpMessageMap.put(head, GmBlockIPHttpProtocol.class);
			} else if (head == IMsgCode.GM_ROLE_IP_DISBLOCK_SAY_HTTP_PROTOCOL) {
				/** IP禁言解封 */
				httpMessageMap.put(head, GmDisblockIPHttpProtocol.class);
			} else if (head == IMsgCode.GM_ROLE_BLOCK_HTTP_PROTOCOL) {
				/** 发起账号封号 */
				httpMessageMap.put(head, GmBlockRoleHttpProtocol.class);
			} else if (head == IMsgCode.GM_ROLE_DISBLOCK_HTTP_PROTOCOL) {
				/** 发起账号解封 */
				httpMessageMap.put(head, GmDisblockRoleHttpProtocol.class);
			} else if (head == IMsgCode.GM_KICK_ROLE_HTTP_PROTOCOL) {
				/** 发起踢人 */
				httpMessageMap.put(head, GmKickRoleHttpProtocol.class);
			} else if (head == IMsgCode.GM_NOTICE_HTTP_PROTOCOL) {
				/** 发起公告 */
				httpMessageMap.put(head, GmNoticeHttpProtocol.class);
			} else if (head == IMsgCode.GM_INVITE_CODE_HTTP_PROTOCOL) {
				/** 发起循环公告 */
				httpMessageMap.put(head, GmInviteCodeHttpProtocol.class);
			} else if (head == IMsgCode.GM_EMAIL_HTTP_PROTOCOL) {
				/** 发送邮件至账户 */
				httpMessageMap.put(head, GmMailRoleHttpProtocol.class);
			} else if (head == IMsgCode.GM_OPEN_REWARD_ACTIVITIES_HTTP_PROTOCOL) {
				/** 平台指定开放奖励活动 */
				httpMessageMap.put(head, GmOpenRewardActivitiesHttpProtocol.class);
			} else if (head == IMsgCode.GM_NOTICE_LEFT_HTTP_PROTOCOL) {
				/** 添加或删除白名单 */
				httpMessageMap.put(head, GmNoticeLeftHttpProtocol.class);
			} else if (head == IMsgCode.GM_CLOSE_BUTTON_HTTP_PROTOCOL) {
				/** GM发起关闭界面按钮 */
				httpMessageMap.put(head, GmCloseButtonHttpProtocol.class);
			} else if (head == IMsgCode.GM_CHECK_IS_FINISH_HTTP_PROTOCOL) {
				/** GM检查任务集市中任务是否完成 */
				httpMessageMap.put(head, GmCheckIsFinishHttpProtocol.class);
			}
			
			p = httpMessageMap.get(head);
			
		}
		
		return p;
	}
	
	
	/**
	 * getHttpResponseClass:(). <br/>
	 * TODO().<br/>
	 * 用消息头查找一个返回对象
	 * 
	 * @author lyh
	 * @param head
	 * @return
	 */
	public static Class<? extends DataUpBase> getHttpRequestClass(long head) {
		Class<? extends DataUpBase> p = httpRqeustMessageMap.get(head);
		if (p == null) {
			
			if (head == IMsgCode.GM_JH_PLAYER_HTTP_PROTOCOL) {
				/** GM平台接入验证. */
				httpRqeustMessageMap.put(head, GmJHPlayerProtocolRequest.class);
			} else if (head == IMsgCode.GM_RECHARGE_HTTP_PROTOCOL) {
				/** GM平台充值游戏。 */
				httpRqeustMessageMap.put(head, GmRechargeProtocolRequest.class);
			} else
			
			if (head == IMsgCode.GM_QQ_RECHARGE_HTTP_PROTOCOL) {
				/** QQ充值 */
				httpRqeustMessageMap.put(head, GmQqRechargeProtocolRequest.class);
			} else if (head == IMsgCode.GM_ROLE_INFO_HTTP_PROTOCOL) {
				/** GM平台获取角色信息数据。 */
				httpRqeustMessageMap.put(head, GmRoleInfoProtocolRequest.class);
			} else if (head == IMsgCode.GM_ONLINE_NUM_HTTP_PROTOCOL) {
				/** GM平台获取实时在线人数。 */
				httpRqeustMessageMap.put(head, GmOnLineNumProtocolRequest.class);
			} else if (head == IMsgCode.GM_ROLE_NO_BLOCK_SAY_HTTP_PROTOCOL) {
				/** GM发起账号禁言。 */
				httpRqeustMessageMap.put(head, GmBlockSayProtocolRequest.class);
			} else
			
			if (head == IMsgCode.GM_ROLE_DISBLOCK_SAY_HTTP_PROTOCOL) {
				/** GM角色禁言解封 */
				httpRqeustMessageMap.put(head, GmDisblockSayProtocolRequest.class);
			} else if (head == IMsgCode.GM_ROLE_IP_BLOCK_SAY_HTTP_PROTOCOL) {
				/** GMIp禁言 */
				httpRqeustMessageMap.put(head, GmBlockIPProtocolRequest.class);
			} else if (head == IMsgCode.GM_ROLE_IP_DISBLOCK_SAY_HTTP_PROTOCOL) {
				/** IP禁言解封 */
				httpRqeustMessageMap.put(head, GmDisblockIPProtocolRequest.class);
			} else if (head == IMsgCode.GM_ROLE_BLOCK_HTTP_PROTOCOL) {
				/** 发起账号封号 */
				httpRqeustMessageMap.put(head, GmBlockRoleProtocolRequest.class);
			} else if (head == IMsgCode.GM_ROLE_DISBLOCK_HTTP_PROTOCOL) {
				/** 发起账号解封 */
				httpRqeustMessageMap.put(head, GmDisblockRoleProtocolRequest.class);
			} else if (head == IMsgCode.GM_KICK_ROLE_HTTP_PROTOCOL) {
				/** 发起踢人 */
				httpRqeustMessageMap.put(head, GmKickRoleProtocolRequest.class);
			} else if (head == IMsgCode.GM_NOTICE_HTTP_PROTOCOL) {
				/** 发起公告 */
				httpRqeustMessageMap.put(head, GmNoticeProtocolRequest.class);
			} else if (head == IMsgCode.GM_INVITE_CODE_HTTP_PROTOCOL) {
				/** 发起循环公告 */
				httpRqeustMessageMap.put(head, GmInviteCodeProtocolRequest.class);
			} else if (head == IMsgCode.GM_EMAIL_HTTP_PROTOCOL) {
				/** 发送邮件至账户 */
				httpRqeustMessageMap.put(head, GmMailRoleProtocolRequest.class);
			} else if (head == IMsgCode.GM_OPEN_REWARD_ACTIVITIES_HTTP_PROTOCOL) {
				/** 平台指定开放奖励活动 */
				httpRqeustMessageMap.put(head, GmOpenRewardActivitiesProtocolRequest.class);
			} else if (head == IMsgCode.GM_NOTICE_LEFT_HTTP_PROTOCOL) {
				/** 添加或删除白名单 */
				httpRqeustMessageMap.put(head, GmNoticeLeftProtocolRequest.class);
			} else if (head == IMsgCode.GM_CLOSE_BUTTON_HTTP_PROTOCOL) {
				/** GM发起关闭界面按钮 */
				httpRqeustMessageMap.put(head, GmCloseButtonProtocolRequest.class);
			} else if (head == IMsgCode.GM_CHECK_IS_FINISH_HTTP_PROTOCOL) {
				/** GM检查任务集市中任务是否完成 */
				httpRqeustMessageMap.put(head, GmCheckIsFinishProtocolRequest.class);
			}
			
			p = httpRqeustMessageMap.get(head);
		}
		
		return p;
	}
	
	/** 
	 * ObjectToString:(). <br/> 
	 * TODO().<br/> 
	 * 对象转换成json格式,并组成发送对象
	 * @author lyh 
	 * @param data
	 * @return 
	 */  
	public static String  objToString(DataUpBase data){
		return data.getMsgCode() +"|"+JSON.toJSONString(data).toString();
	}
	
	/** 
	 * JsonStringToObj:(). <br/> 
	 * TODO().<br/> 
	 * json 字符串转成obj
	 * @author lyh 
	 * @param request
	 * @param jsonString
	 * @return 
	 */  
	public static DataUpBase jsonStringToObj(boolean request,String jsonString){
		DataUpBase dub = null;
		if (jsonString == null){
			return null;
		}
		String [] array =jsonString.split("\\|");
		if (array.length > 1){
			int head = Integer.parseInt(array[0]);
			Class<? extends DataUpBase> c = null;
			if (request){
				 c = getHttpRequestClass(head);
			}else{
				 c = getHttpResponseClass(head);
			}
			
			if (c != null){
				 dub = JSON.parseObject(array[1], c);
			}
		}
		return dub;
	}
	
}
  