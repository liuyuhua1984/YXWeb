package com.gamecenter.model;

import java.io.Serializable;

public class OpOperatorRecharge implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String passport;

    /**
     * 
     */
    private Integer sid;

    /**
     * 
     */
    private Integer gold;

    /**
     * 
     */
    private Double money;

    /**
     * 
     */
    private String billno;

    /**
     * 
     */
    private Integer time;

    /**
     * 
     */
    private String flag;

    /**
     * 
     */
    private String addtime;

    /**
     * 
     */
    private String res;

    /**
     * 
     */
    private String info;

    /**
     * op_operator_recharge
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport == null ? null : passport.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res == null ? null : res.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}