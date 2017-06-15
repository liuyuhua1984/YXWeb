package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpAgentRequest implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 微信号
     */
    private String wechatCode;

    /**
     * 电话
     */
    private Long phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 
     */
    private Date createTime;

    /**
     * 上级代理
     */
    private String parentName;

    /**
     * op_agent_request
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
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
        sb.append(", wechatCode=").append(wechatCode);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", createTime=").append(createTime);
        sb.append(", parentName=").append(parentName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}