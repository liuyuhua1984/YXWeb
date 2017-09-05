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
    private Double money;

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
     * 是否已提现 ,申请提现为1,已提为2
     */
    private Integer isFetch;

    /**
     * 提成
     */
    private Double fetchMoney;

    /**
     * 充值标志
     */
    private Integer flag;

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
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

    public Integer getIsFetch() {
        return isFetch;
    }

    public void setIsFetch(Integer isFetch) {
        this.isFetch = isFetch;
    }

    public Double getFetchMoney() {
        return fetchMoney;
    }

    public void setFetchMoney(Double fetchMoney) {
        this.fetchMoney = fetchMoney;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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
        sb.append(", isFetch=").append(isFetch);
        sb.append(", fetchMoney=").append(fetchMoney);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}