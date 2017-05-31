package com.gamecenter.service.appServices;

import com.gamecenter.mapper.OpOperatorMapper;
import com.gamecenter.mapper.OpOperatorProductMapper;
import com.gamecenter.model.OpOperator;
import com.gamecenter.model.OpOperatorExample;
import com.gamecenter.model.OpOperatorProduct;
import com.gamecenter.model.OpOperatorProductExample;
import com.gamecenter.parBean.vo.Par_OperatorMsg;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class Operator_product_ServiceImpl implements Operator_porduct_Service {
	
	@Resource
	OpOperatorProductMapper opOperatorProductMapper;
	
	public List<OpOperatorProduct> getList() {
		List<OpOperatorProduct> opOperators = opOperatorProductMapper.selectList(new OpOperatorProductExample());
		return opOperators;
	}
	
	public int add(OpOperatorProduct obj) {
		// 验证重复
		int res = 0;
		OpOperatorProductExample opGameappExample = new OpOperatorProductExample();
		OpOperatorProductExample.Criteria criteria = opGameappExample.createCriteria();
		criteria.andAppidEqualTo(obj.getAppid());
		criteria.andOptidEqualTo(obj.getOptid());
		int count = opOperatorProductMapper.countByExample(opGameappExample);
		if (count == 0) {
			res = opOperatorProductMapper.insertSelective(obj);
		} else {
			res = -1;
		}
		return res;
	}
	
	public int update(OpOperatorProduct obj) {
		int res = opOperatorProductMapper.updateByPrimaryKeySelective(obj);
		return res;
	}
	
	public int del(String ids) {
		int res = 0, temp = 0;
		
		// 分解IDs
		List<Integer> idList = new ArrayList<Integer>();
		String[] ss = ids.split(",");
		for (String tempid : ss) {
			idList.add(Integer.parseInt(tempid));
		}
		// 移除数据
		OpOperatorProductExample opGameappExample = new OpOperatorProductExample();
		OpOperatorProductExample.Criteria criteria = opGameappExample.createCriteria();
		criteria.andIdIn(idList);
		res = opOperatorProductMapper.deleteByExample(opGameappExample);
		
		return res;
	}
	
	public OpOperatorProduct getObj(int id) {
		OpOperatorProduct opOperatorProduct = opOperatorProductMapper.selectByPrimaryKey(id);
		return opOperatorProduct;
	}
	
	public List<OpOperator> getOperatorListByAppId(String appid) {
		List<OpOperator> opOperators = opOperatorProductMapper.selectOperatorListByAppId(appid);
		return opOperators;
	}
	
	public Par_OperatorMsg getOpObj(String appid, String worldid) {
		Map map = new HashMap();
		map.put("appid", "'" + appid + "'");
		map.put("worldid", "'" + worldid + "'");
		Par_OperatorMsg obj = opOperatorProductMapper.getOpObj(map);
		return obj;
	}
	
}
