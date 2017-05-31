package com.gamecenter.sysmanage.parBean;

import com.gamecenter.sysmanage.model.OaModule;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-8 Time: 下午3:50 To change this template use File | Settings | File Templates.
 */
public class ModuleSort implements Comparator {
	public int compare(Object o1, Object o2) {
		OaModule user0 = (OaModule) o1;
		OaModule user1 = (OaModule) o2;
		
		int flag = user0.getSort().compareTo(user1.getSort());
		if (flag == 0) {
			// return user0.getName().compareTo(user1.getName());
		} else {
			return flag;
		}
		return 0;
	}
}
