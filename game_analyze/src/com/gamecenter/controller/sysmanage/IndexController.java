package com.gamecenter.controller.sysmanage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * ClassName:IndexController <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月15日 下午3:49:53 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
public class IndexController {

	/** 
	 * indexAgent:(). <br/> 
	 * TODO().<br/> 
	 * 
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/agent")
	public String indexAgent(){
		return "/index_agent";
	}
}
  