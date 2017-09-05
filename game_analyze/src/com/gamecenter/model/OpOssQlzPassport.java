package com.gamecenter.model;

import java.io.Serializable;
import java.util.Date;

public class OpOssQlzPassport implements Serializable {
    /**
     * 
     */
    private String openid;

    /**
     * 
     */
    private Long playerId;

    /**
     * 
     */
    private String worldid;

    /**
     * 
     */
    private String rolename;

    /**
     * 
     */
    private Integer grade;

    /**
     * 
     */
    private Double curmoney;

    /**
     * 
     */
    private Double totalmoney;

    /**
     * 
     */
    private Integer career;

    /**
     * 
     */
    private Integer isonline;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private String lastloginip;

    /**
     * 
     */
    private Integer logincount;

    /**
     * 
     */
    private String fristlogintime;

    /**
     * 
     */
    private String lastlogintime;

    /**
     * 
     */
    private String regtime;

    /**
     * 
     */
    private String info;

    /**
     * 
     */
    private Integer totalonline;

    /**
     * 
     */
    private Double totalconsume;

    /**
     * 
     */
    private Integer vipgrade;

    /**
     * 
     */
    private String fristpaytime;

    /**
     * 
     */
    private String lastpaytime;

    /**
     * 
     */
    private String optid;

    /**
     * 
     */
    private String guidenum;

    /**
     * 
     */
    private String sfrom;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 身份证id
     */
    private String cardId;

    /**
     * 邀请时间
     */
    private Date inviteTime;

    /**
     * op_oss_qlz_passport
     */
    private static final long serialVersionUID = 1L;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getWorldid() {
        return worldid;
    }

    public void setWorldid(String worldid) {
        this.worldid = worldid == null ? null : worldid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getCurmoney() {
        return curmoney;
    }

    public void setCurmoney(Double curmoney) {
        this.curmoney = curmoney;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getCareer() {
        return career;
    }

    public void setCareer(Integer career) {
        this.career = career;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public String getFristlogintime() {
        return fristlogintime;
    }

    public void setFristlogintime(String fristlogintime) {
        this.fristlogintime = fristlogintime == null ? null : fristlogintime.trim();
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getTotalonline() {
        return totalonline;
    }

    public void setTotalonline(Integer totalonline) {
        this.totalonline = totalonline;
    }

    public Double getTotalconsume() {
        return totalconsume;
    }

    public void setTotalconsume(Double totalconsume) {
        this.totalconsume = totalconsume;
    }

    public Integer getVipgrade() {
        return vipgrade;
    }

    public void setVipgrade(Integer vipgrade) {
        this.vipgrade = vipgrade;
    }

    public String getFristpaytime() {
        return fristpaytime;
    }

    public void setFristpaytime(String fristpaytime) {
        this.fristpaytime = fristpaytime == null ? null : fristpaytime.trim();
    }

    public String getLastpaytime() {
        return lastpaytime;
    }

    public void setLastpaytime(String lastpaytime) {
        this.lastpaytime = lastpaytime == null ? null : lastpaytime.trim();
    }

    public String getOptid() {
        return optid;
    }

    public void setOptid(String optid) {
        this.optid = optid == null ? null : optid.trim();
    }

    public String getGuidenum() {
        return guidenum;
    }

    public void setGuidenum(String guidenum) {
        this.guidenum = guidenum == null ? null : guidenum.trim();
    }

    public String getSfrom() {
        return sfrom;
    }

    public void setSfrom(String sfrom) {
        this.sfrom = sfrom == null ? null : sfrom.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Date getInviteTime() {
        return inviteTime;
    }

    public void setInviteTime(Date inviteTime) {
        this.inviteTime = inviteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", openid=").append(openid);
        sb.append(", playerId=").append(playerId);
        sb.append(", worldid=").append(worldid);
        sb.append(", rolename=").append(rolename);
        sb.append(", grade=").append(grade);
        sb.append(", curmoney=").append(curmoney);
        sb.append(", totalmoney=").append(totalmoney);
        sb.append(", career=").append(career);
        sb.append(", isonline=").append(isonline);
        sb.append(", status=").append(status);
        sb.append(", lastloginip=").append(lastloginip);
        sb.append(", logincount=").append(logincount);
        sb.append(", fristlogintime=").append(fristlogintime);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", regtime=").append(regtime);
        sb.append(", info=").append(info);
        sb.append(", totalonline=").append(totalonline);
        sb.append(", totalconsume=").append(totalconsume);
        sb.append(", vipgrade=").append(vipgrade);
        sb.append(", fristpaytime=").append(fristpaytime);
        sb.append(", lastpaytime=").append(lastpaytime);
        sb.append(", optid=").append(optid);
        sb.append(", guidenum=").append(guidenum);
        sb.append(", sfrom=").append(sfrom);
        sb.append(", appId=").append(appId);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", realName=").append(realName);
        sb.append(", cardId=").append(cardId);
        sb.append(", inviteTime=").append(inviteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}