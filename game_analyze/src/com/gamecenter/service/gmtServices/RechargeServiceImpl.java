package com.gamecenter.service.gmtServices;

import com.gamecenter.common.encrypt.MD5;
import com.gamecenter.common.Page;
import com.gamecenter.common.connect.SendReqToGame;
import com.gamecenter.common.packets.RechargeForTx_request;
import com.gamecenter.mapper.OpOssQlzRechargeTxMapper;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.model.OpOssQlzRechargeTxExample;
import com.gamecenter.service.appServices.WorldService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * 充值记录处理 Created with IntelliJ IDEA. User: gsb Date: 14-5-15 Time: 下午1:40 To change this template use File | Settings | File Templates.
 */
@Repository
public class RechargeServiceImpl implements RechargeService {
	@Resource
	OpOssQlzRechargeTxMapper opOssQlzRechargeTxMapper;
	@Resource
	WorldService worldService;
	
	public Page getRechargeTxList(OpOssQlzRechargeTx obj, int pageSize, int pageNumber) {
		OpOssQlzRechargeTxExample example = new OpOssQlzRechargeTxExample();
		OpOssQlzRechargeTxExample.Criteria criteria = example.createCriteria();
		if (obj != null) {
			if (obj.getZoneid() != null) {
				criteria.andZoneidEqualTo(obj.getZoneid());
			}
			if (obj.getStatus() != null) {
				criteria.andStatusEqualTo(obj.getStatus());
			}
			if (obj.getAddtime() != null) {
				String time[] = obj.getAddtime().split("#");
				criteria.andAddtimeBetween(time[0], time[1]);
			}
		}
		example.setOrderByClause("addtime desc");
		// 获取总的记录数量
		int count = this.opOssQlzRechargeTxMapper.countByExample(example);
		
		// 获取指定的页码数据
		example.setBeginNum((pageNumber - 1) * pageSize);
		example.setEndNum(pageSize);
		List<OpOssQlzRechargeTx> list = this.opOssQlzRechargeTxMapper.getPageList(example);
		
		// 组合返回page
		Page page = new Page(pageNumber, count, pageSize, list);
		return page;
	}
	
	public double paycount(OpOssQlzRechargeTx obj) {
		OpOssQlzRechargeTxExample example = new OpOssQlzRechargeTxExample();
		OpOssQlzRechargeTxExample.Criteria criteria = example.createCriteria();
		if (obj != null) {
			if (obj.getZoneid() != null) {
				criteria.andZoneidEqualTo(obj.getZoneid());
			}
			if (obj.getStatus() != null) {
				criteria.andStatusEqualTo(obj.getStatus());
			}
			if (obj.getAddtime() != null) {
				String time[] = obj.getAddtime().split("#");
				criteria.andAddtimeBetween(time[0], time[1]);
			}
		}
		double count = opOssQlzRechargeTxMapper.getPayCount(example);
		return count;
	}
	
	public OpOssQlzRechargeTx getRechargeTxById(int id) {
		
		OpOssQlzRechargeTx opOssQlzRechargeTx = opOssQlzRechargeTxMapper.selectByPrimaryKey(id);
		return opOssQlzRechargeTx;
	}
	
	public OpOssQlzRechargeTx getMsgByBillOn(String billno) {
		OpOssQlzRechargeTxExample opOssQlzRechargeTxExample = new OpOssQlzRechargeTxExample();
		OpOssQlzRechargeTxExample.Criteria criteria = opOssQlzRechargeTxExample.createCriteria();
		criteria.andBillnoEqualTo(billno);
		List<OpOssQlzRechargeTx> opOssQlzRechargeTxes = opOssQlzRechargeTxMapper.selectByExample(opOssQlzRechargeTxExample);
		if (opOssQlzRechargeTxes.size() > 0) {
			return opOssQlzRechargeTxes.get(0);
		}
		return null;
	}
	
	public synchronized String fahuo(String billno) {
		// 获取订单信息
		OpOssQlzRechargeTx reqObj = getMsgByBillOn(billno);
		if (reqObj == null || reqObj.getStatus().equals("1"))
			return "0";
		
		// 获取通信秘钥
		ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		String msgkey = bundle.getString("msgkey");
		
		// 发货逻辑
		String result = "-1";
		try {
			// 根据分区ID，获取服务器的IP，端口
			OpGameworld opGameworld = worldService.getWorldByWorldId(reqObj.getZoneid());
			// 发货
			RechargeForTx_request rechargeForTx_request = new RechargeForTx_request();
			rechargeForTx_request.setBillno(reqObj.getBillno());
			rechargeForTx_request.setOpenid(reqObj.getOpenid());
			rechargeForTx_request.setPayitem(reqObj.getPayitem());
			rechargeForTx_request.setToken(reqObj.getToken());
			rechargeForTx_request.setTs(reqObj.getTs());
			rechargeForTx_request.setSigstr(MD5.encodeMD5(reqObj.getOpenid() + reqObj.getPayitem() + reqObj.getBillno() + msgkey));
			
			SendReqToGame.getInstance().init(opGameworld.getIp(), Integer.parseInt(opGameworld.getServerurl()));
			result = SendReqToGame.getInstance().sendMessage(rechargeForTx_request, reqObj.getZoneid()).toString();
			System.out.print("充值结果：result>" + result);
		} catch (Exception e) {
			e.printStackTrace();
			return "-1";
		}
		
		if (result.equals("1")) {
			OpOssQlzRechargeTx obj = new OpOssQlzRechargeTx();
			obj.setDid(reqObj.getDid());
			obj.setStatus("1");
			opOssQlzRechargeTxMapper.updateByPrimaryKeySelective(obj);
		} else {
			return "-1";
		}
		return result;
	}
}
