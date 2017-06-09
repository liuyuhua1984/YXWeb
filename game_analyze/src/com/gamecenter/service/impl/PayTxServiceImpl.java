package com.gamecenter.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.common.Tools;
import com.gamecenter.mapper.OpOssQlzRechargeTxMapper;
import com.gamecenter.model.OpOssQlzRechargeTx;
import com.gamecenter.model.OpOssQlzRechargeTxExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-7 Time: 上午9:54 To change this template use File | Settings | File Templates.
 */
@Repository
public class PayTxServiceImpl implements PayTxService {
	@Resource
	OpOssQlzRechargeTxMapper opOssQlzRechargeTxMapper;
	
	public int insert(OpOssQlzRechargeTx obj) {
		if (obj != null) {
			obj.setAddtime(Tools.getNowDate());
		}
		int res = opOssQlzRechargeTxMapper.insertSelective(obj);
		return res;
	}
	
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
	
	public int payOk(String billno) {
		OpOssQlzRechargeTx opOssQlzRechargeTx = new OpOssQlzRechargeTx();
		opOssQlzRechargeTx.setStatus("1");
		
		OpOssQlzRechargeTxExample opOssQlzRechargeTxExample = new OpOssQlzRechargeTxExample();
		OpOssQlzRechargeTxExample.Criteria criteria = opOssQlzRechargeTxExample.createCriteria();
		criteria.andBillnoEqualTo(billno);
		
		int res = opOssQlzRechargeTxMapper.updateByExampleSelective(opOssQlzRechargeTx, opOssQlzRechargeTxExample);
		return res;
	}
}
