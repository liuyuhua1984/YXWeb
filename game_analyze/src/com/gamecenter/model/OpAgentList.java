package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpAgentList implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 代理级别,0,1,2,3,
     */
    private Integer agentLevel;

    /**
     * 剩余房卡数
     */
    private Integer remainMoney;

    /**
     * 上一级代理id
     */
    private Long parentId;

    /**
     * 微信号
     */
    private String wechatCode;

    /**
     * 电话
     */
    private Long phone;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 代理密码
     */
    private String password;

    /**
     * 禁用为0,
     */
    private Byte status;

    /**
     * op_agent_list
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }

    public Integer getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(Integer remainMoney) {
        this.remainMoney = remainMoney;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getWechatCode() {
        return wechatCode;
    }

    public void setWechatCode(String wechatCode) {
        this.wechatCode = wechatCode == null ? null : wechatCode.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", agentLevel=").append(agentLevel);
        sb.append(", remainMoney=").append(remainMoney);
        sb.append(", parentId=").append(parentId);
        sb.append(", wechatCode=").append(wechatCode);
        sb.append(", phone=").append(phone);
        sb.append(", createTime=").append(createTime);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}