package com.gamecenter.model;

import java.io.Serializable;

public class OpOperatorRecharge implements Serializable {
	private Integer id;
	
	private String passport;
	
	private Integer sid;
	
	private Integer gold;
	
	private Double money;
	
	private String billno;
	
	private Integer time;
	
	private String flag;
	
	private String addtime;
	
	private String res;
	
	private String info;
	
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
	
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		OpOperatorRecharge other = (OpOperatorRecharge) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getPassport() == null ? other.getPassport() == null : this.getPassport().equals(other.getPassport())) && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid())) && (this.getGold() == null ? other.getGold() == null : this.getGold().equals(other.getGold())) && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney())) && (this.getBillno() == null ? other.getBillno() == null : this.getBillno().equals(other.getBillno())) && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime())) && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag())) && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime())) && (this.getRes() == null ? other.getRes() == null : this.getRes().equals(other.getRes())) && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getPassport() == null) ? 0 : getPassport().hashCode());
		result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
		result = prime * result + ((getGold() == null) ? 0 : getGold().hashCode());
		result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
		result = prime * result + ((getBillno() == null) ? 0 : getBillno().hashCode());
		result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
		result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
		result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
		result = prime * result + ((getRes() == null) ? 0 : getRes().hashCode());
		result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
		return result;
	}
}