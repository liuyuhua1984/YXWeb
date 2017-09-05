package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpAgentInviteCode implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 
     */
    private Long agentId;

    /**
     * 是否已使用,已使用为1
     */
    private Byte isUse;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否已发放 发放为1
     */
    private Byte isPutOut;

    /**
     * op_agent_invite_code
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Byte getIsUse() {
        return isUse;
    }

    public void setIsUse(Byte isUse) {
        this.isUse = isUse;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsPutOut() {
        return isPutOut;
    }

    public void setIsPutOut(Byte isPutOut) {
        this.isPutOut = isPutOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", agentId=").append(agentId);
        sb.append(", isUse=").append(isUse);
        sb.append(", createTime=").append(createTime);
        sb.append(", isPutOut=").append(isPutOut);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}