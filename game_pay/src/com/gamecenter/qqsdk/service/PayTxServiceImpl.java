package com.gamecenter.qqsdk.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gamecenter.common.Tools;
import com.gamecenter.mapper.OpOssQlzComparsMapper;
import com.gamecenter.mapper.OpOssQlzRechargeTxMapper;
import com.gamecenter.model.OpOssQlzCompars;
import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.model.OpOssQlzRechargeTxExample;
import com.gamecenter.qqsdk.parBean.vo.ComPars;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-7 Time: 上午9:54 To change this template use File | Settings | File Templates.
 */
@Repository
public class PayTxServiceImpl implements PayTxService {
	@Resource
	OpOssQlzRechargeTxMapper opOssQlzRechargeTxMapper;
	@Resource
	OpOssQlzComparsMapper opOssQlzComparsMapper;
	
	public int insert(OpOssQlzRechargeTx obj) {
		if (obj != null) {
			obj.setAddtime(Tools.getNowDate());
		}
		int res = opOssQlzRechargeTxMapper.insertSelective(obj);
		return res;
	}
	

	@Override
	public boolean isExist(String billno) {
		OpOssQlzRechargeTxExample opOssQlzRechargeTxExample = new OpOssQlzRechargeTxExample();
		OpOssQlzRechargeTxExample.Criteria criteria = opOssQlzRechargeTxExample.createCriteria();
		criteria.andBillnoEqualTo(billno);
		
		int res = opOssQlzRechargeTxMapper.countByExample(opOssQlzRechargeTxExample);
		if (res == 1) {
			return true;
		}
		return false;
	}
	
	@Override
	public int payOk(String billno) {
		OpOssQlzRechargeTx opOssQlzRechargeTx = new OpOssQlzRechargeTx();
		opOssQlzRechargeTx.setStatus("1");
		
		OpOssQlzRechargeTxExample opOssQlzRechargeTxExample = new OpOssQlzRechargeTxExample();
		OpOssQlzRechargeTxExample.Criteria criteria = opOssQlzRechargeTxExample.createCriteria();
		criteria.andBillnoEqualTo(billno);
		
		int res = opOssQlzRechargeTxMapper.updateByExampleSelective(opOssQlzRechargeTx, opOssQlzRechargeTxExample);
		return res;
	}
	




	@Override
	public int payConfirm(String billno, int ret) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("billno", "'" + billno + "'");
		map.put("ret", ret);
		int res = opOssQlzRechargeTxMapper.payConfirm(map);
		return res;
	}
	
	@Override
	public int intogame(ComPars comPars) {
		pars.put(comPars.getOpenid(), comPars);
		int num = 0;
		OpOssQlzCompars opOssQlzCompars = opOssQlzComparsMapper.selectByPrimaryKey(comPars.getOpenid());
		if (opOssQlzCompars == null) {
			opOssQlzCompars = new OpOssQlzCompars();
			opOssQlzCompars.setOpenid(comPars.getOpenid());
			opOssQlzCompars.setPars(JSON.toJSONString(comPars));
			opOssQlzCompars.setTime(Tools.getNowDate());
			num = opOssQlzComparsMapper.insertSelective(opOssQlzCompars);
		} else {
			opOssQlzCompars.setOpenid(comPars.getOpenid());
			opOssQlzCompars.setPars(JSON.toJSONString(comPars));
			opOssQlzCompars.setTime(Tools.getNowDate());
			num = opOssQlzComparsMapper.updateByPrimaryKeySelective(opOssQlzCompars);
		}
		return num;
	}
	
	@Override
	public ComPars getComPars(String openid) {
		ComPars comPars = pars.get(openid);
		if (comPars == null) {
			OpOssQlzCompars opOssQlzCompars = opOssQlzComparsMapper.selectByPrimaryKey(openid);
			if (opOssQlzCompars != null)
				comPars = JSON.parseObject(opOssQlzCompars.getPars(), ComPars.class);
		}
		return comPars;
	}

	
}
