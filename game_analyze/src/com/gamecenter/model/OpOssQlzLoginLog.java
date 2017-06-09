package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzLoginLog implements Serializable {
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
    private String logintime;

    /**
     * 
     */
    private String openid;

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
     * Ӧ��id
     */
    private String appId;

    /**
     * op_oss_qlz_login_log
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

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
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
        sb.append(", userip=").append(userip);
        sb.append(", logintime=").append(logintime);
        sb.append(", openid=").append(openid);
        sb.append(", level=").append(level);
        sb.append(", rolename=").append(rolename);
        sb.append(", addtime=").append(addtime);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}