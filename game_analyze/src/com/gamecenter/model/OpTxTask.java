package com.gamecenter.model;

import java.io.Serializable;

public class OpTxTask implements Serializable {
    /**
     * 
     */
    private Integer tid;

    /**
     * 
     */
    private String cmd;

    /**
     * 
     */
    private String openid;

    /**
     * 
     */
    private String pf;

    /**
     * 
     */
    private String ts;

    /**
     * 
     */
    private String appid;

    /**
     * 
     */
    private String version;

    /**
     * 
     */
    private String contractid;

    /**
     * 
     */
    private String step;

    /**
     * 
     */
    private String payitem;

    /**
     * 
     */
    private String billno;

    /**
     * 
     */
    private String providetype;

    /**
     * 
     */
    private String sig;

    /**
     * 
     */
    private String res;

    /**
     * 
     */
    private String addtime;

    /**
     * op_tx_task
     */
    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd == null ? null : cmd.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf == null ? null : pf.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid == null ? null : contractid.trim();
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public String getPayitem() {
        return payitem;
    }

    public void setPayitem(String payitem) {
        this.payitem = payitem == null ? null : payitem.trim();
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getProvidetype() {
        return providetype;
    }

    public void setProvidetype(String providetype) {
        this.providetype = providetype == null ? null : providetype.trim();
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig == null ? null : sig.trim();
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res == null ? null : res.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}