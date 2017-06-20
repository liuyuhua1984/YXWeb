package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpAgentRecharge implements Serializable {
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
     * 交易号
     */
    private String traderOrder;

    /**
     * 是否在线充值 1为在线充
     */
    private Integer onlinePay;

    /**
     * op_agent_recharge
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

    public String getTraderOrder() {
        return traderOrder;
    }

    public void setTraderOrder(String traderOrder) {
        this.traderOrder = traderOrder == null ? null : traderOrder.trim();
    }

    public Integer getOnlinePay() {
        return onlinePay;
    }

    public void setOnlinePay(Integer onlinePay) {
        this.onlinePay = onlinePay;
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
        sb.append(", traderOrder=").append(traderOrder);
        sb.append(", onlinePay=").append(onlinePay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}