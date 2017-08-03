package com.gamecenter.service.agent;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gamecenter.model.OpShop;

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
public interface AgentShopService extends BaseService<OpShop> {
	
	/** 
	 * findShopGoodsByType:(). <br/> 
	 * TODO().<br/> 
	 * 用类型获取商品
	 * @author lyh 
	 * @param type
	 * @return 
	 */  
	List<OpShop> findShopGoodsByType(int type);
	
	/** 
	 * findShopGoodsByPrice:(). <br/> 
	 * TODO().<br/> 
	 * 用价格找到商品
	 * @author lyh 
	 * @param price
	 * @param type
	 * @return 
	 */  
	OpShop findShopGoodsByPrice(double price,int type);
	
}
  