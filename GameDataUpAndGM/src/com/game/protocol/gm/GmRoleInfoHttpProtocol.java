package com.game.protocol.gm;

import com.lyh.IMsgCode;
import com.lyh.dataup.log.DataUpBase;

/**
 * ClassName:GMRechargeData <br/>
 * Function: TODO (角色信息). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-4-24 上午10:22:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
public class GmRoleInfoHttpProtocol extends DataUpBase implements IMsgCode {
	
	/****/
	private static final long serialVersionUID = 3948300615553874955L;
	
	public GmRoleInfoHttpProtocol() {
		super(GM_ROLE_INFO_HTTP_PROTOCOL);
		// TODO Auto-generated constructor stub
	}
	
	/** -1:失败 1:成功 失败时,信息为空 **/
	private int result;
	
	/** openid String 账号id */
	private String openid;
	
	/** name String 角色名称 */
	private String name;
	
	/** grade String 等级 */
	private int grade;
	
	/** career String 职业 */
	private int career;
	
	/** money double 游戏币 */
	private double money;
	
	/** ip String 当前玩家IP地址，不在线为’’ */
	private String ip;
	
	/** isonline String 是否在线：1：在线 0：不在线 */
	private int isonline;
	
	/** status String 状态 1：正常 2：禁言中 3：封号中 **/
	private int status;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getCareer() {
		return career;
	}
	
	public void setCareer(int career) {
		this.career = career;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
		if (ip == null) {
			ip = "";
		}
	}
	
	public int getIsonline() {
		return isonline;
	}
	
	public void setIsonline(int isonline) {
		this.isonline = isonline;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
}
