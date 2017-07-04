package com.lyh.common;  
/** 
 * ClassName:MsgCode <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月6日 下午2:34:39 <br/> 
 * 定义与后台通信的消息号
 * @author   lyh 
 * @version   
 * @see       
 */
public interface IMsgCode {

	/***************** GM消息从0x5000-0x6000开始 *****************/
//	/** GM平台接入验证. */
//	public static final int GM_CONNECT_PROTOCOL = 0x5001;
//	
//	/** GM平台充值游戏。 */
//	public static final int GM_RECHARGE_PROTOCOL = 0x5010;
//	
//	/** QQ充值 */
//	public static final int GM_QQ_RECHARGE_PROTOCOL = 0x5011;
//	
//	/** GM平台获取角色信息数据。 */
//	public static final int GM_ROLE_INFO_PROTOCOL = 0x5030;
//	
//	/** GM平台获取实时在线人数。 */
//	public static final int GM_ONLINE_NUM_PROTOCOL = 0x5040;
//	
//	/** GM发起账号禁言。 */
//	public static final int GM_ROLE_NO_BLOCK_SAY_PROTOCOL = 0x5050;
//	
//	/** GM角色禁言解封 */
//	public static final int GM_ROLE_DISBLOCK_SAY_PROTOCOL = 0x5051;
//	
//	/** GMIp禁言 */
//	public static final int GM_ROLE_IP_BLOCK_SAY_PROTOCOL = 0x5052;
//	
//	/** IP禁言解封 */
//	public static final int GM_ROLE_IP_DISBLOCK_SAY_PROTOCOL = 0x5053;
//	
//	/** 发起账号封号。 */
//	public static final int GM_ROLE_BLOCK_PROTOCOL = 0x5060;
//	
//	/** 发起账号解封。 */
//	public static final int GM_ROLE_DISBLOCK_PROTOCOL = 0x5061;
//	
//	/** 发起踢人。 */
//	public static final int GM_KICK_ROLE_PROTOCOL = 0x5070;
//	
//	/** 发起公告。 */
//	public static final int GM_NOTICE_PROTOCOL = 0x5100;
//	
//	/** 发送邮件至账户。。 */
//	public static final int GM_EMAIL_PROTOCOL = 0x5110;
//	
//	/** 平台指定开放奖励活动 */
//	public static final int GM_OPEN_REWARD_ACTIVITIES_PROTOCOL = 0x5200;
//	
//	/** 添加或删除白名单 */
//	public static final int GM_ADD_OR_DEL_WHITE_NAME_PROTOCOL = 0x5210;
//	
//	/** GM发起关闭界面按钮 */
//	public static final int GM_CLOSE_BUTTON_PROTOCOL = 0x5220;
//	
//	/** GM检查任务集市中任务是否完成 */
//	public static final int GM_CHECK_IS_FINISH_PROTOCOL = 0x5230;
	
	/******************* HTTP ***********************/
	/** GM平台接入验证. */
	public static final int GM_JH_PLAYER_HTTP_PROTOCOL = 0x6002;
	
	/** GM平台充值游戏。 */
	public static final int GM_RECHARGE_HTTP_PROTOCOL = 0x6011;
	
	/** QQ充值 */
	public static final int GM_QQ_RECHARGE_HTTP_PROTOCOL = 0x6012;
	
	/** GM平台获取角色信息数据。 */
	public static final int GM_ROLE_INFO_HTTP_PROTOCOL = 0x6031;
	
	/** GM平台获取实时在线人数。 */
	public static final int GM_ONLINE_NUM_HTTP_PROTOCOL = 0x6041;
	
	/** GM发起账号禁言。 */
	public static final int GM_ROLE_NO_BLOCK_SAY_HTTP_PROTOCOL = 0x6051;
	
	/** GM角色禁言解封 */
	public static final int GM_ROLE_DISBLOCK_SAY_HTTP_PROTOCOL = 0x6052;
	
	/** GMIp禁言 */
	public static final int GM_ROLE_IP_BLOCK_SAY_HTTP_PROTOCOL = 0x6053;
	
	/** IP禁言解封 */
	public static final int GM_ROLE_IP_DISBLOCK_SAY_HTTP_PROTOCOL = 0x6054;
	
	/** 发起账号封号。 */
	public static final int GM_ROLE_BLOCK_HTTP_PROTOCOL = 0x6061;
	
	/** 发起账号解封。 */
	public static final int GM_ROLE_DISBLOCK_HTTP_PROTOCOL = 0x6062;
	
	/** 发起踢人。 */
	public static final int GM_KICK_ROLE_HTTP_PROTOCOL = 0x6071;
	
	/** 发起公告。 */
	public static final int GM_NOTICE_HTTP_PROTOCOL = 0x6101;
	
	/** 发起邀请码。 */
	public static final int GM_INVITE_CODE_HTTP_PROTOCOL = 0x6102;
	
	/** 发送邮件至账户。。 */
	public static final int GM_EMAIL_HTTP_PROTOCOL = 0x6111;
	
	/** 平台指定开放奖励活动 */
	public static final int GM_OPEN_REWARD_ACTIVITIES_HTTP_PROTOCOL = 0x6201;
	
	/** 添加公告栏*/
	public static final int GM_NOTICE_LEFT_HTTP_PROTOCOL = 0x6211;
	
	/** GM发起关闭界面按钮 */
	public static final int GM_CLOSE_BUTTON_HTTP_PROTOCOL = 0x6221;
	
	/** GM检查任务集市中任务是否完成 */
	public static final int GM_CHECK_IS_FINISH_HTTP_PROTOCOL = 0x6231;
	/*****************上报记录*************************/
	/**上报创建角色**/  
	public static final int DATAUP_CREATE_ROLE_LOG_HTTP_PROTOCOL=0x6232;
	
	/**上报玩家进入游戏**/  
	public static final int DATAUP_LOGIN_LOG_HTTP_PROTOCOL=0x6233;
	
	/**上报玩家退出游戏**/  
	public static final int DATAUP_LOGIN_OUT_LOG_HTTP_PROTOCOL=0x6234;
	
	/**上报在线玩家的数量**/  
	public static final int DATAUP_ONLINE_NUM_LOG_HTTP_PROTOCOL=0x6235;
	
	/**上报在线玩家充值**/  
	public static final int DATAUP_RECHARGE_LOG_HTTP_PROTOCOL=0x6236;
	
	/**上报玩家使用金币和充值记录**/  
	public static final int DATAUP_USE_GOLD_LOG_HTTP_PROTOCOL=0x6237;
	/**上报注册的玩家**/  
	public static final int DATAUP_REGISTER_LOG_HTTP_PROTOCOL=0x6238;
}
  