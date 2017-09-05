package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzConsumeLog implements Serializable {
    /**
     * 
     */
    private Integer did;

    /**
     * 
     */
    private String worldid;

    /**
     * 
     */
    private String openid;

    /**
     * ”Œœ∑±“
     */
    private Double moneybefore;

    /**
     * 
     */
    private Double moneyafter;

    /**
     * 
     */
    private Double lostmoney;

    /**
     * 
     */
    private String itemid;

    /**
     * 
     */
    private String itemtype;

    /**
     * 
     */
    private Integer itemnum;

    /**
     * 
     */
    private String itemname;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    private Integer level;

    /**
     * 
     */
    private String rolename;

    /**
     * 
     */
    private String addtime;

    /**
     * ”¶”√id
     */
    private String appId;

    /**
     * op_oss_qlz_consume_log
     */
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

    public Double getLostmoney() {
        return lostmoney;
    }

    public void setLostmoney(Double lostmoney) {
        this.lostmoney = lostmoney;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype == null ? null : itemtype.trim();
    }

    public Integer getItemnum() {
        return itemnum;
    }

    public void setItemnum(Integer itemnum) {
        this.itemnum = itemnum;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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
        sb.append(", lostmoney=").append(lostmoney);
        sb.append(", itemid=").append(itemid);
        sb.append(", itemtype=").append(itemtype);
        sb.append(", itemnum=").append(itemnum);
        sb.append(", itemname=").append(itemname);
        sb.append(", time=").append(time);
        sb.append(", level=").append(level);
        sb.append(", rolename=").append(rolename);
        sb.append(", addtime=").append(addtime);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}