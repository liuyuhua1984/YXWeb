package com.gamecenter.parBean;

import java.util.Comparator;

import com.gamecenter.parBean.vo.DataObj;

/**
 * 比较对象.. Created with IntelliJ IDEA. User: gsb Date: 14-5-27 Time: 下午4:45 To change this template use File | Settings | File Templates.
 */
public class ComparatorData implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		DataObj user0 = (DataObj) arg0;
		DataObj user1 = (DataObj) arg1;
		
		int flag = user0.getTime().compareTo(user1.getTime());
		if (flag == 0) {
			// return user0.getName().compareTo(user1.getName());
		} else {
			return flag;
		}
		return 0;
	}
}
