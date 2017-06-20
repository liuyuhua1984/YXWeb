package com.gamecenter.service.agent;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gamecenter.mapper.OpShopMapper;
import com.gamecenter.model.OpShop;
import com.gamecenter.model.OpShopExample;

/** 
 * ClassName:AgentConfigService <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:36:17 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Service
public class AgentShopServiceImpl implements AgentShopService {
	@Resource
	private OpShopMapper mapper;
	@Override
	public void insert(OpShop t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(OpShop t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpShop findById(long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<OpShop> findShopGoodsByType(int type) {
		OpShopExample opShopExample = new OpShopExample();
		OpShopExample.Criteria criteria = opShopExample.createCriteria();
		criteria.andTypeEqualTo(type);
		// TODO Auto-generated method stub
		return mapper.selectByExample(opShopExample);
	}

	@Override
	public OpShop findShopGoodsByPrice(int price, int type) {
		// TODO Auto-generated method stub
		OpShopExample opShopExample = new OpShopExample();
		OpShopExample.Criteria criteria = opShopExample.createCriteria();
		criteria.andTypeEqualTo(type);
		criteria.andPriceEqualTo(price);
		List<OpShop> list = mapper.selectByExample(opShopExample);
		return list.size() > 0 ? list.get(0) : null;
	}


}
  