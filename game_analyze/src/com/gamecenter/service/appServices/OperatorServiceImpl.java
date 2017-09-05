package com.gamecenter.service.appServices;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OpOperatorMapper;
import com.gamecenter.model.OpOperator;
import com.gamecenter.model.OpOperatorExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:15 To change this template use File | Settings | File Templates.
 */
@Repository
public class OperatorServiceImpl implements OperatorService {
	
	@Resource
	OpOperatorMapper opOperatorMapper;
	
	public List<OpOperator> getList() {
		List<OpOperator> opOperators = opOperatorMapper.selectByExample(new OpOperatorExample());
		return opOperators;
	}
	
	public int add(OpOperator obj) {
		int res = opOperatorMapper.insertSelective(obj);
		return res; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public int update(OpOperator obj) {
		int res = opOperatorMapper.updateByPrimaryKeySelective(obj);
		return res; // To change body of implemented methods use File | Settings | File Templates.
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
		OpOperatorExample opGameappExample = new OpOperatorExample();
		OpOperatorExample.Criteria criteria = opGameappExample.createCriteria();
		criteria.andOptidIn(idList);
		res = opOperatorMapper.deleteByExample(opGameappExample);
		
		return res;
	}
	
	public OpOperator getObj(int id) {
		OpOperator opOperator = opOperatorMapper.selectByPrimaryKey(id);
		return opOperator;
	}
}
