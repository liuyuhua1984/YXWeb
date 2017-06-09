package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzOnlinecurLog implements Serializable {
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
    private Integer onlinenum;

    /**
     * 
     */
    private String addtime;

    /**
     * ”¶”√id
     */
    private String appId;

    /**
     * op_oss_qlz_onlinecur_log
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

    public Integer getOnlinenum() {
        return onlinenum;
    }

    public void setOnlinenum(Integer onlinenum) {
        this.onlinenum = onlinenum;
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
        sb.append(", onlinenum=").append(onlinenum);
        sb.append(", addtime=").append(addtime);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}