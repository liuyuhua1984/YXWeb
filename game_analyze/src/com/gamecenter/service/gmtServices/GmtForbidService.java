package com.gamecenter.service.gmtServices;

import com.gamecenter.model.OpGmtForbidmsg;
import com.gamecenter.parBean.vo.GmtForbidBean;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-4-26 Time: 上午11:12 To change this template use File | Settings | File Templates.
 */
public interface GmtForbidService {
	
	/**
	 * 封禁
	 * 
	 * @param gmtForbidBean
	 * @return
	 */
	public String executeForbid(GmtForbidBean gmtForbidBean);
	
	/**
	 * 获取封禁记录
	 * 
	 * @return
	 */
	public List<OpGmtForbidmsg> getGmtForbidmsgList();
	
}
