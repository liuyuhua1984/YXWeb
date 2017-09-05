package com.gamecenter.qqsdk.parBean.vo;

/**
 * 腾讯平台进入游戏应用 携带参数。 Created with IntelliJ IDEA. User: gsb Date: 14-6-24 Time: 下午1:08 To change this template use File | Settings | File Templates.
 */
public class ComPars {
	// $paramsx = 'openid='.$openid.'&openkey='.$openkey.'&appid='.$appid.'&sig='.$sig.
	// '&pf='.$pf.'&format='.$format.'&userip='.$userip.'&pfkey='.$pfkey.'&invkey='.
	// $invkey.'&iopenid='.$iopenid.'&itime='.$itime.'&source='.$source.'&app_custom'.$app_custom.'';
	
	private String openid;
	private String openkey;
	private String appid;
	private String sig;
	private String pf;
	private String format;
	private String userip;
	private String pfkey;
	private String invkey;
	private String iopenid;
	private String itime;
	private String source;
	private String app_custom;
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getOpenkey() {
		return openkey;
	}
	
	public void setOpenkey(String openkey) {
		this.openkey = openkey;
	}
	
	public String getAppid() {
		return appid;
	}
	
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getSig() {
		return sig;
	}
	
	public void setSig(String sig) {
		this.sig = sig;
	}
	
	public String getPf() {
		return pf;
	}
	
	public void setPf(String pf) {
		this.pf = pf;
	}
	
	public String getFormat() {
		return format;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getUserip() {
		return userip;
	}
	
	public void setUserip(String userip) {
		this.userip = userip;
	}
	
	public String getPfkey() {
		return pfkey;
	}
	
	public void setPfkey(String pfkey) {
		this.pfkey = pfkey;
	}
	
	public String getInvkey() {
		return invkey;
	}
	
	public void setInvkey(String invkey) {
		this.invkey = invkey;
	}
	
	public String getIopenid() {
		return iopenid;
	}
	
	public void setIopenid(String iopenid) {
		this.iopenid = iopenid;
	}
	
	public String getItime() {
		return itime;
	}
	
	public void setItime(String itime) {
		this.itime = itime;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getApp_custom() {
		return app_custom;
	}
	
	public void setApp_custom(String app_custom) {
		this.app_custom = app_custom;
	}
}
