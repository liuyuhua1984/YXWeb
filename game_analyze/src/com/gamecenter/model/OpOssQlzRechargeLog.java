package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzRechargeLog implements Serializable {
	private Integer did;
	
	private String worldid;
	
	private String openid;
	
	private Double moneybefore;
	
	private Double moneyafter;
	
	private Double moneyadd;
	
	private String time;
	
	private String sfrom;
	
	private Integer level;
	
	private String rolename;
	
	private String addtime;
	
	private String billon;
	
    /**
     * ”¶”√id
     */
    private String appId;
	private static final long serialVersionUID = 1L;
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public String getWorldid() {
		return worldid;
	}
	
	public void setWorldid(String worldid) {
		this.worldid = worldid == null ? null : worldid.trim();
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public void setOpenid(String openid) {
		this.openid = openid == null ? null : openid.trim();
	}
	
	public Double getMoneybefore() {
		return moneybefore;
	}
	
	public void setMoneybefore(Double moneybefore) {
		this.moneybefore = moneybefore;
	}
	
	public Double getMoneyafter() {
		return moneyafter;
	}
	
	public void setMoneyafter(Double moneyafter) {
		this.moneyafter = moneyafter;
	}
	
	public Double getMoneyadd() {
		return moneyadd;
	}
	
	public void setMoneyadd(Double moneyadd) {
		this.moneyadd = moneyadd;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
	
	public String getSfrom() {
		return sfrom;
	}
	
	public void setSfrom(String sfrom) {
		this.sfrom = sfrom == null ? null : sfrom.trim();
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}
	
	public String getAddtime() {
		return addtime;
	}
	
	public void setAddtime(String addtime) {
		this.addtime = addtime == null ? null : addtime.trim();
	}
	
	public String getBillon() {
		return billon;
	}
	
	public void setBillon(String billon) {
		this.billon = billon == null ? null : billon.trim();
	}
	
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", did=").append(did);
        sb.append(", worldid=").append(worldid);
        sb.append(", openid=").append(openid);
        sb.append(", moneybefore=").append(moneybefore);
        sb.append(", moneyafter=").append(moneyafter);
        sb.append(", moneyadd=").append(moneyadd);
        sb.append(", time=").append(time);
        sb.append(", sfrom=").append(sfrom);
        sb.append(", level=").append(level);
        sb.append(", rolename=").append(rolename);
        sb.append(", addtime=").append(addtime);
        sb.append(", billon=").append(billon);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}