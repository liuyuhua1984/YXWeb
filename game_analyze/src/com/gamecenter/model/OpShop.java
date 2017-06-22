package com.gamecenter.model;

import java.io.Serializable;

public class OpShop implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 价格(RMB)
     */
    private Double price;

    /**
     * 钻的数量
     */
    private Integer num;

    /**
     * 赠送
     */
    private Integer gift;

    /**
     * 充值类型0为全部,1为玩家2.为代理
     */
    private Integer type;

    /**
     * 商品名称
     */
    private String name;

    /**
     * op_shop
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getGift() {
        return gift;
    }

    public void setGift(Integer gift) {
        this.gift = gift;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", gift=").append(gift);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}