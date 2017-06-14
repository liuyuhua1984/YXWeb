package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpAgentRechargeRequest implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 代理名称
     */
    private String agentName;

    /**
     * 充值的金额(rmb)
     */
    private Integer money;

    /**
     * 是否是代理1为代理
     */
    private Byte isAgent;

    /**
     * 申请充值时间
     */
    private Date createTime;

    /**
     * 充值的用户名,或者代理名
     */
    private String name;

    /**
     * 1表示申请,2表示批准,3表示拒绝
     */
    private Integer operate;

    /**
     * 交易号
     */
    private String order;

    /**
     * op_agent_recharge_request
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Byte getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(Byte isAgent) {
        this.isAgent = isAgent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order == null ? null : order.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agentName=").append(agentName);
        sb.append(", money=").append(money);
        sb.append(", isAgent=").append(isAgent);
        sb.append(", createTime=").append(createTime);
        sb.append(", name=").append(name);
        sb.append(", operate=").append(operate);
        sb.append(", order=").append(order);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}