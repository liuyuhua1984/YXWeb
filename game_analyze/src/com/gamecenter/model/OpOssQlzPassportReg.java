package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzPassportReg implements Serializable {
    /**
     * 
     */
    private String openid;

    /**
     * 
     */
    private String worldid;

    /**
     * 
     */
    private String lastloginip;

    /**
     * 
     */
    private Integer logincount;

    /**
     * 
     */
    private String lastlogintime;

    /**
     * 
     */
    private String info;

    /**
     * ”¶”√id
     */
    private String appId;

    /**
     * op_oss_qlz_passport_reg
     */
    private static final long serialVersionUID = 1L;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getWorldid() {
        return worldid;
    }

    public void setWorldid(String worldid) {
        this.worldid = worldid == null ? null : worldid.trim();
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
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
        sb.append(", openid=").append(openid);
        sb.append(", worldid=").append(worldid);
        sb.append(", lastloginip=").append(lastloginip);
        sb.append(", logincount=").append(logincount);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", info=").append(info);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}