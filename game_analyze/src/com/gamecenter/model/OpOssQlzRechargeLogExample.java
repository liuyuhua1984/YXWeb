package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssQlzRechargeLogExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssQlzRechargeLogExample() {
		oredCriteria = new ArrayList<Criteria>();
	}
	
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
	public String getOrderByClause() {
		return orderByClause;
	}
	
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}
	
	public boolean isDistinct() {
		return distinct;
	}
	
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}
	
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}
	
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}
	
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}
	
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}
	
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}
	
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;
		
		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}
		
		public boolean isValid() {
			return criteria.size() > 0;
		}
		
		public List<Criterion> getAllCriteria() {
			return criteria;
		}
		
		public List<Criterion> getCriteria() {
			return criteria;
		}
		
		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}
		
		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}
		
		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}
		
		public Criteria andDidIsNull() {
			addCriterion("did is null");
			return (Criteria) this;
		}
		
		public Criteria andDidIsNotNull() {
			addCriterion("did is not null");
			return (Criteria) this;
		}
		
		public Criteria andDidEqualTo(Integer value) {
			addCriterion("did =", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidNotEqualTo(Integer value) {
			addCriterion("did <>", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidGreaterThan(Integer value) {
			addCriterion("did >", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidGreaterThanOrEqualTo(Integer value) {
			addCriterion("did >=", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidLessThan(Integer value) {
			addCriterion("did <", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidLessThanOrEqualTo(Integer value) {
			addCriterion("did <=", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidIn(List<Integer> values) {
			addCriterion("did in", values, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidNotIn(List<Integer> values) {
			addCriterion("did not in", values, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidBetween(Integer value1, Integer value2) {
			addCriterion("did between", value1, value2, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidNotBetween(Integer value1, Integer value2) {
			addCriterion("did not between", value1, value2, "did");
			return (Criteria) this;
		}
		
		public Criteria andWorldidIsNull() {
			addCriterion("worldid is null");
			return (Criteria) this;
		}
		
		public Criteria andWorldidIsNotNull() {
			addCriterion("worldid is not null");
			return (Criteria) this;
		}
		
		public Criteria andWorldidEqualTo(String value) {
			addCriterion("worldid =", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotEqualTo(String value) {
			addCriterion("worldid <>", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidGreaterThan(String value) {
			addCriterion("worldid >", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidGreaterThanOrEqualTo(String value) {
			addCriterion("worldid >=", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidLessThan(String value) {
			addCriterion("worldid <", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidLessThanOrEqualTo(String value) {
			addCriterion("worldid <=", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidLike(String value) {
			addCriterion("worldid like", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotLike(String value) {
			addCriterion("worldid not like", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidIn(List<String> values) {
			addCriterion("worldid in", values, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotIn(List<String> values) {
			addCriterion("worldid not in", values, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidBetween(String value1, String value2) {
			addCriterion("worldid between", value1, value2, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotBetween(String value1, String value2) {
			addCriterion("worldid not between", value1, value2, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidIsNull() {
			addCriterion("openid is null");
			return (Criteria) this;
		}
		
		public Criteria andOpenidIsNotNull() {
			addCriterion("openid is not null");
			return (Criteria) this;
		}
		
		public Criteria andOpenidEqualTo(String value) {
			addCriterion("openid =", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotEqualTo(String value) {
			addCriterion("openid <>", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidGreaterThan(String value) {
			addCriterion("openid >", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidGreaterThanOrEqualTo(String value) {
			addCriterion("openid >=", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidLessThan(String value) {
			addCriterion("openid <", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidLessThanOrEqualTo(String value) {
			addCriterion("openid <=", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidLike(String value) {
			addCriterion("openid like", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotLike(String value) {
			addCriterion("openid not like", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidIn(List<String> values) {
			addCriterion("openid in", values, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotIn(List<String> values) {
			addCriterion("openid not in", values, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidBetween(String value1, String value2) {
			addCriterion("openid between", value1, value2, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotBetween(String value1, String value2) {
			addCriterion("openid not between", value1, value2, "openid");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeIsNull() {
			addCriterion("moneybefore is null");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeIsNotNull() {
			addCriterion("moneybefore is not null");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeEqualTo(Double value) {
			addCriterion("moneybefore =", value, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeNotEqualTo(Double value) {
			addCriterion("moneybefore <>", value, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeGreaterThan(Double value) {
			addCriterion("moneybefore >", value, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeGreaterThanOrEqualTo(Double value) {
			addCriterion("moneybefore >=", value, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeLessThan(Double value) {
			addCriterion("moneybefore <", value, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeLessThanOrEqualTo(Double value) {
			addCriterion("moneybefore <=", value, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeIn(List<Double> values) {
			addCriterion("moneybefore in", values, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeNotIn(List<Double> values) {
			addCriterion("moneybefore not in", values, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeBetween(Double value1, Double value2) {
			addCriterion("moneybefore between", value1, value2, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneybeforeNotBetween(Double value1, Double value2) {
			addCriterion("moneybefore not between", value1, value2, "moneybefore");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterIsNull() {
			addCriterion("moneyafter is null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterIsNotNull() {
			addCriterion("moneyafter is not null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterEqualTo(Double value) {
			addCriterion("moneyafter =", value, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterNotEqualTo(Double value) {
			addCriterion("moneyafter <>", value, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterGreaterThan(Double value) {
			addCriterion("moneyafter >", value, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterGreaterThanOrEqualTo(Double value) {
			addCriterion("moneyafter >=", value, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterLessThan(Double value) {
			addCriterion("moneyafter <", value, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterLessThanOrEqualTo(Double value) {
			addCriterion("moneyafter <=", value, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterIn(List<Double> values) {
			addCriterion("moneyafter in", values, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterNotIn(List<Double> values) {
			addCriterion("moneyafter not in", values, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterBetween(Double value1, Double value2) {
			addCriterion("moneyafter between", value1, value2, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyafterNotBetween(Double value1, Double value2) {
			addCriterion("moneyafter not between", value1, value2, "moneyafter");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddIsNull() {
			addCriterion("moneyadd is null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddIsNotNull() {
			addCriterion("moneyadd is not null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddEqualTo(Double value) {
			addCriterion("moneyadd =", value, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddNotEqualTo(Double value) {
			addCriterion("moneyadd <>", value, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddGreaterThan(Double value) {
			addCriterion("moneyadd >", value, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddGreaterThanOrEqualTo(Double value) {
			addCriterion("moneyadd >=", value, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddLessThan(Double value) {
			addCriterion("moneyadd <", value, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddLessThanOrEqualTo(Double value) {
			addCriterion("moneyadd <=", value, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddIn(List<Double> values) {
			addCriterion("moneyadd in", values, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddNotIn(List<Double> values) {
			addCriterion("moneyadd not in", values, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddBetween(Double value1, Double value2) {
			addCriterion("moneyadd between", value1, value2, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andMoneyaddNotBetween(Double value1, Double value2) {
			addCriterion("moneyadd not between", value1, value2, "moneyadd");
			return (Criteria) this;
		}
		
		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}
		
		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}
		
		public Criteria andTimeEqualTo(String value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotEqualTo(String value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeGreaterThan(String value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeGreaterThanOrEqualTo(String value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLessThan(String value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLessThanOrEqualTo(String value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLike(String value) {
			addCriterion("time like", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotLike(String value) {
			addCriterion("time not like", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeIn(List<String> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotIn(List<String> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeBetween(String value1, String value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotBetween(String value1, String value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}
		
		public Criteria andSfromIsNull() {
			addCriterion("sfrom is null");
			return (Criteria) this;
		}
		
		public Criteria andSfromIsNotNull() {
			addCriterion("sfrom is not null");
			return (Criteria) this;
		}
		
		public Criteria andSfromEqualTo(String value) {
			addCriterion("sfrom =", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotEqualTo(String value) {
			addCriterion("sfrom <>", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromGreaterThan(String value) {
			addCriterion("sfrom >", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromGreaterThanOrEqualTo(String value) {
			addCriterion("sfrom >=", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromLessThan(String value) {
			addCriterion("sfrom <", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromLessThanOrEqualTo(String value) {
			addCriterion("sfrom <=", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromLike(String value) {
			addCriterion("sfrom like", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotLike(String value) {
			addCriterion("sfrom not like", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromIn(List<String> values) {
			addCriterion("sfrom in", values, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotIn(List<String> values) {
			addCriterion("sfrom not in", values, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromBetween(String value1, String value2) {
			addCriterion("sfrom between", value1, value2, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotBetween(String value1, String value2) {
			addCriterion("sfrom not between", value1, value2, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andLevelIsNull() {
			addCriterion("level is null");
			return (Criteria) this;
		}
		
		public Criteria andLevelIsNotNull() {
			addCriterion("level is not null");
			return (Criteria) this;
		}
		
		public Criteria andLevelEqualTo(Integer value) {
			addCriterion("level =", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelNotEqualTo(Integer value) {
			addCriterion("level <>", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelGreaterThan(Integer value) {
			addCriterion("level >", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("level >=", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelLessThan(Integer value) {
			addCriterion("level <", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelLessThanOrEqualTo(Integer value) {
			addCriterion("level <=", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelIn(List<Integer> values) {
			addCriterion("level in", values, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelNotIn(List<Integer> values) {
			addCriterion("level not in", values, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelBetween(Integer value1, Integer value2) {
			addCriterion("level between", value1, value2, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("level not between", value1, value2, "level");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIsNull() {
			addCriterion("rolename is null");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIsNotNull() {
			addCriterion("rolename is not null");
			return (Criteria) this;
		}
		
		public Criteria andRolenameEqualTo(String value) {
			addCriterion("rolename =", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotEqualTo(String value) {
			addCriterion("rolename <>", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameGreaterThan(String value) {
			addCriterion("rolename >", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameGreaterThanOrEqualTo(String value) {
			addCriterion("rolename >=", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLessThan(String value) {
			addCriterion("rolename <", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLessThanOrEqualTo(String value) {
			addCriterion("rolename <=", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLike(String value) {
			addCriterion("rolename like", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotLike(String value) {
			addCriterion("rolename not like", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIn(List<String> values) {
			addCriterion("rolename in", values, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotIn(List<String> values) {
			addCriterion("rolename not in", values, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameBetween(String value1, String value2) {
			addCriterion("rolename between", value1, value2, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotBetween(String value1, String value2) {
			addCriterion("rolename not between", value1, value2, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeIsNull() {
			addCriterion("addtime is null");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeIsNotNull() {
			addCriterion("addtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeEqualTo(String value) {
			addCriterion("addtime =", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotEqualTo(String value) {
			addCriterion("addtime <>", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeGreaterThan(String value) {
			addCriterion("addtime >", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
			addCriterion("addtime >=", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeLessThan(String value) {
			addCriterion("addtime <", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeLessThanOrEqualTo(String value) {
			addCriterion("addtime <=", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeLike(String value) {
			addCriterion("addtime like", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotLike(String value) {
			addCriterion("addtime not like", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeIn(List<String> values) {
			addCriterion("addtime in", values, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotIn(List<String> values) {
			addCriterion("addtime not in", values, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeBetween(String value1, String value2) {
			addCriterion("addtime between", value1, value2, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotBetween(String value1, String value2) {
			addCriterion("addtime not between", value1, value2, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andBillonIsNull() {
			addCriterion("billon is null");
			return (Criteria) this;
		}
		
		public Criteria andBillonIsNotNull() {
			addCriterion("billon is not null");
			return (Criteria) this;
		}
		
		public Criteria andBillonEqualTo(String value) {
			addCriterion("billon =", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonNotEqualTo(String value) {
			addCriterion("billon <>", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonGreaterThan(String value) {
			addCriterion("billon >", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonGreaterThanOrEqualTo(String value) {
			addCriterion("billon >=", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonLessThan(String value) {
			addCriterion("billon <", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonLessThanOrEqualTo(String value) {
			addCriterion("billon <=", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonLike(String value) {
			addCriterion("billon like", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonNotLike(String value) {
			addCriterion("billon not like", value, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonIn(List<String> values) {
			addCriterion("billon in", values, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonNotIn(List<String> values) {
			addCriterion("billon not in", values, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonBetween(String value1, String value2) {
			addCriterion("billon between", value1, value2, "billon");
			return (Criteria) this;
		}
		
		public Criteria andBillonNotBetween(String value1, String value2) {
			addCriterion("billon not between", value1, value2, "billon");
			return (Criteria) this;
		}
        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }
    }
    /**
     * op_oss_qlz_recharge_log
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
	public static class Criterion {
		private String condition;
		
		private Object value;
		
		private Object secondValue;
		
		private boolean noValue;
		
		private boolean singleValue;
		
		private boolean betweenValue;
		
		private boolean listValue;
		
		private String typeHandler;
		
		public String getCondition() {
			return condition;
		}
		
		public Object getValue() {
			return value;
		}
		
		public Object getSecondValue() {
			return secondValue;
		}
		
		public boolean isNoValue() {
			return noValue;
		}
		
		public boolean isSingleValue() {
			return singleValue;
		}
		
		public boolean isBetweenValue() {
			return betweenValue;
		}
		
		public boolean isListValue() {
			return listValue;
		}
		
		public String getTypeHandler() {
			return typeHandler;
		}
		
		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}
		
		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}
		
		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}
		
		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}
		
		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}