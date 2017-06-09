package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzOutLog implements Serializable {
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
    private String userip;

    /**
     * 
     */
    private String outtime;

    /**
     * 
     */
    private String openid;

    /**
     * ∑÷÷”
     */
    private Integer onlinetime;

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
     * 
     */
    private Integer vipgrade;

    /**
     * 
     */
    private String guidenum;

    /**
     * ”¶”√id
     */
    private String appId;

    /**
     * op_oss_qlz_out_log
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

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime == null ? null : outtime.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Integer onlinetime) {
        this.onlinetime = onlinetime;
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

    public Integer getVipgrade() {
        return vipgrade;
    }

    public void setVipgrade(Integer vipgrade) {
        this.vipgrade = vipgrade;
    }

    public String getGuidenum() {
        return guidenum;
    }

    public void setGuidenum(String guidenum) {
        this.guidenum = guidenum == null ? null : guidenum.trim();
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
        sb.append(", userip=").append(userip);
        sb.append(", outtime=").append(outtime);
        sb.append(", openid=").append(openid);
        sb.append(", onlinetime=").append(onlinetime);
        sb.append(", level=").append(level);
        sb.append(", rolename=").append(rolename);
        sb.append(", addtime=").append(addtime);
        sb.append(", vipgrade=").append(vipgrade);
        sb.append(", guidenum=").append(guidenum);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}