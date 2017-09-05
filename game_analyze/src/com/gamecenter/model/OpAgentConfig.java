package com.gamecenter.model;

import java.io.Serializable;

public class OpAgentConfig implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 一级的充值比例
     */
    private String oneLevel;

    /**
     * 二级充值比例
     */
    private String twoLevel;

    /**
     * 三级充值比例
     */
    private String threeLevel;

    /**
     * 玩家充值比例
     */
    private String noneLevel;

    /**
     * op_agent_config
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOneLevel() {
        return oneLevel;
    }

    public void setOneLevel(String oneLevel) {
        this.oneLevel = oneLevel == null ? null : oneLevel.trim();
    }

    public String getTwoLevel() {
        return twoLevel;
    }

    public void setTwoLevel(String twoLevel) {
        this.twoLevel = twoLevel == null ? null : twoLevel.trim();
    }

    public String getThreeLevel() {
        return threeLevel;
    }

    public void setThreeLevel(String threeLevel) {
        this.threeLevel = threeLevel == null ? null : threeLevel.trim();
    }

    public String getNoneLevel() {
        return noneLevel;
    }

    public void setNoneLevel(String noneLevel) {
        this.noneLevel = noneLevel == null ? null : noneLevel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oneLevel=").append(oneLevel);
        sb.append(", twoLevel=").append(twoLevel);
        sb.append(", threeLevel=").append(threeLevel);
        sb.append(", noneLevel=").append(noneLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}