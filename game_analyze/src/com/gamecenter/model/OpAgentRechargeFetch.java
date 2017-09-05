package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpAgentRechargeFetch implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 充值的金额(rmb)
     */
    private Double money;

    /**
     * 申请充值时间
     */
    private Date createTime;

    /**
     * 申请结算的代理名
     */
    private String name;

    /**
     * 申请结算的充值id
     */
    private String ids;

    /**
     * op_agent_recharge_fetch
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", money=").append(money);
        sb.append(", createTime=").append(createTime);
        sb.append(", name=").append(name);
        sb.append(", ids=").append(ids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}