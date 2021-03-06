package com.gamecenter.alipay.response;

import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.open.public.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-25 11:40:07
 */
public class AlipayOpenPublicMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6541833757415145475L;

	/** 
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
