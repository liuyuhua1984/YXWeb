package com.gamecenter.service.ossServices;

import com.gamecenter.common.encrypt.MD5;
import com.gamecenter.common.Page;
import com.gamecenter.common.Tools;
import com.gamecenter.controller.webservice.cdk.ParCdkCheck;
import com.gamecenter.controller.webservice.cdk.ParCdkReturn;
import com.gamecenter.mapper.OpActivityCdkMapper;
import com.gamecenter.mapper.OpActivityMapper;
import com.gamecenter.mapper.OpActivityUselogMapper;
import com.gamecenter.mapper.OpGameGoodsMapper;
import com.gamecenter.model.*;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 活动服务 Created with IntelliJ IDEA. User: gsb Date: 14-6-5 Time: 下午5:42 To change this template use File | Settings | File Templates.
 */
@Repository
public class ActivityServiceImpl implements ActivityService {
	@Resource
	OpActivityMapper opActivityMapper;
	@Resource
	OpGameGoodsMapper opGameGoodsMapper;
	@Resource
	OpActivityCdkMapper opActivityCdkMapper;
	@Resource
	OpActivityUselogMapper opActivityUselogMapper;
	
	public List<OpActivity> getActivityList() {
		List<OpActivity> opActivities = opActivityMapper.selectByExample(new OpActivityExample());
		return opActivities;
	}
	
	public int addActivity(OpActivity opActivity) {
		int num = opActivityMapper.insertSelective(opActivity);
		return num;
	}
	
	public OpActivity getActivity(int aid) {
		OpActivity opActivity = opActivityMapper.selectByPrimaryKey(aid);
		return opActivity;
	}
	
	public List<OpGameGoods> getGoodsList() {
		List<OpGameGoods> opGameGoodses = opGameGoodsMapper.selectByExample(new OpGameGoodsExample());
		return opGameGoodses;
	}
	
	public synchronized int createCdk(int aid, int num, String type) {
		int count = 0;
		OpActivityCdk opActivityCdk = new OpActivityCdk();
		for (int i = 0; i < num; i++) {
			try {
				opActivityCdk.setAid(aid);
				opActivityCdk.setCdkcode(type + MD5.encodeMD5(System.currentTimeMillis() + Math.random() + ""));
				opActivityCdk.setTime(Tools.getNowDate());
				count += opActivityCdkMapper.insertSelective(opActivityCdk);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (count > 0) {
			// 更新增加的发卡数量
			OpActivity opActivity = opActivityMapper.selectByPrimaryKey(aid);
			OpActivity opActivity2 = new OpActivity();
			opActivity2.setAid(opActivity.getAid());
			opActivity2.setCardnum(opActivity.getCardnum() + count);
			opActivityMapper.updateByPrimaryKeySelective(opActivity2);
		}
		return count;
	}
	
	public Page cdkList(OpActivityCdk obj, int pageSize, int pageNumber) {
		OpActivityCdkExample example = new OpActivityCdkExample();
		OpActivityCdkExample.Criteria criteria = example.createCriteria();
		
		example.setOrderByClause("time desc");
		if (obj.getAid() != null) {
			criteria.andAidEqualTo(obj.getAid());
		}
		if (obj.getCdkcode() != null && !"".equals(obj.getCdkcode())) {
			criteria.andCdkcodeLike("%" + obj.getCdkcode() + "%");
		}
		// 获取总的记录数量
		int count = this.opActivityCdkMapper.countByExample(example);
		
		// 获取指定的页码数据
		example.setBeginNum((pageNumber - 1) * pageSize);
		example.setEndNum(pageSize);
		List<OpActivityCdk> list = this.opActivityCdkMapper.getPageList(example);
		
		// 组合返回page
		Page page = new Page(pageNumber, count, pageSize, list);
		return page;
	}
	
	public synchronized ParCdkReturn checkCdk(ParCdkCheck cdkPar) {
		
		ParCdkReturn returnObj = new ParCdkReturn();
		returnObj.setIsopen("0");
		int status = 0;
		
		while (true) {
			if (cdkPar == null || cdkPar.getWorldid() == null || "".equals(cdkPar.getWorldid()) || cdkPar.getKeycode() == null || "".equals(cdkPar.getKeycode())) {
				status = -6; // 参数不合法
				break;
			}
			
			OpActivityCdk opActivityCdk = opActivityCdkMapper.selectByPrimaryKey(cdkPar.getKeycode());
			if (opActivityCdk == null) {
				status = -3; // 错误的key
				break;
			}
			if (!opActivityCdk.getStatus().equals("0")) {
				status = -1; // 已经使用
				break;
			}
			
			OpActivity opActivity = opActivityMapper.selectByPrimaryKey(opActivityCdk.getAid());
			if (opActivity == null) {
				status = -2; // 活动过期了 非法
				break;
			}
			
			if (!opActivity.getWorldids().equals("0") && !opActivity.getWorldids().contains(cdkPar.getWorldid())) { // 限制了服务器
				status = -5; // 限制了区服，无效的cdk ，本区不能使用
				break;
			} else if (opActivity.getStatus().equals("1")) {
				status = -2; // 活动过期了
				break;
			}
			
			int joinnum = 0;
			if (opActivity.getJoincount().intValue() != 0) {
				// 核实玩家的参与次数
				OpActivityUselogExample opActivityUselogExample = new OpActivityUselogExample();
				OpActivityUselogExample.Criteria criteria = opActivityUselogExample.createCriteria();
				criteria.andUseridEqualTo(cdkPar.getOpenid());
				criteria.andAidEqualTo(opActivityCdk.getAid());
				joinnum = opActivityUselogMapper.countByExample(opActivityUselogExample);
				
				if (joinnum >= opActivity.getJoincount()) {
					status = -4; // 已经参与
					break;
				} else {
					status = 1; // 成功
					
					// 获取物品
					String awards[] = opActivity.getAward().split(",");
					String gifts = "";
					for (String temp : awards) {
						int gid = Integer.parseInt(temp.split("#")[0]);
						int num = Integer.parseInt(temp.split("#")[1]);
						OpGameGoods opGameGoods = opGameGoodsMapper.selectByPrimaryKey(gid);
						gifts += opGameGoods.getGtype() + "*" + opGameGoods.getGcode() + "*" + num + "#";
					}
					gifts = gifts.substring(0, gifts.length() - 1);
					
					returnObj.setGift(gifts);
					returnObj.setTitle("");
					returnObj.setContent("");
					
					// 状态更新
					opActivityCdk.setStatus("1");
					opActivityCdkMapper.updateByPrimaryKeySelective(opActivityCdk);
					// 记录使用
					OpActivityUselog opActivityUselog = new OpActivityUselog();
					opActivityUselog.setUserid(cdkPar.getOpenid());
					opActivityUselog.setAid(opActivity.getAid());
					opActivityUselog.setCdkcode(cdkPar.getKeycode());
					opActivityUselog.setUserip(cdkPar.getUserip());
					opActivityUselog.setWorldid(cdkPar.getWorldid());
					opActivityUselog.setTime(Tools.getNowDate());
					opActivityUselogMapper.insertSelective(opActivityUselog);
					
					// 更新活动使用数量
					OpActivity obj = new OpActivity();
					obj.setAid(opActivity.getAid());
					obj.setUsenum(opActivity.getUsenum() + 1);
					opActivityMapper.updateByPrimaryKeySelective(obj);
				}
			}
			break;
		}
		String msg = "";
		if (status == 1) {
			msg = "恭喜您,兑换成功!";
		} else if (status == 0) {
			msg = "对不起,服务器繁忙，稍后再试!";
		} else if (status == -1) {
			msg = "对不起,此CDK已经使用!";
		} else if (status == -2) {
			msg = "对不起,此CDK已经过期失效!";
		} else if (status == -3) {
			msg = "对不起,此CDK错误!";
		} else if (status == -4) {
			msg = "对不起,您已经参加过了本次活动!";
		} else if (status == -5) {
			msg = "对不起,本区不能使用此CDK!";
		} else if (status == -6) {
			msg = "对不起,请求参数非法!";
		}
		returnObj.setMsg(msg);
		returnObj.setStatus(status + "");
		
		return returnObj;
	}
}
