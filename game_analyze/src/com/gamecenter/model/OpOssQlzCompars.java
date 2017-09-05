package com.gamecenter.model;

import java.io.Serializable;

public class OpOssQlzCompars implements Serializable {
    /**
     * 
     */
    private String openid;

    /**
     * json´®
     */
    private String pars;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    private String info;

    /**
     * op_oss_qlz_compars
     */
    private static final long serialVersionUID = 1L;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPars() {
        return pars;
    }

    public void setPars(String pars) {
        this.pars = pars == null ? null : pars.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", openid=").append(openid);
        sb.append(", pars=").append(pars);
        sb.append(", time=").append(time);
        sb.append(", info=").append(info);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}