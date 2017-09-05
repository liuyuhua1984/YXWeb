package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOperatorRechargeExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOperatorRechargeExample() {
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
		
		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}
		
		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}
		
		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}
		
		public Criteria andPassportIsNull() {
			addCriterion("passport is null");
			return (Criteria) this;
		}
		
		public Criteria andPassportIsNotNull() {
			addCriterion("passport is not null");
			return (Criteria) this;
		}
		
		public Criteria andPassportEqualTo(String value) {
			addCriterion("passport =", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotEqualTo(String value) {
			addCriterion("passport <>", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportGreaterThan(String value) {
			addCriterion("passport >", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportGreaterThanOrEqualTo(String value) {
			addCriterion("passport >=", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLessThan(String value) {
			addCriterion("passport <", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLessThanOrEqualTo(String value) {
			addCriterion("passport <=", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLike(String value) {
			addCriterion("passport like", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotLike(String value) {
			addCriterion("passport not like", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportIn(List<String> values) {
			addCriterion("passport in", values, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotIn(List<String> values) {
			addCriterion("passport not in", values, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportBetween(String value1, String value2) {
			addCriterion("passport between", value1, value2, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotBetween(String value1, String value2) {
			addCriterion("passport not between", value1, value2, "passport");
			return (Criteria) this;
		}
		
		public Criteria andSidIsNull() {
			addCriterion("sid is null");
			return (Criteria) this;
		}
		
		public Criteria andSidIsNotNull() {
			addCriterion("sid is not null");
			return (Criteria) this;
		}
		
		public Criteria andSidEqualTo(Integer value) {
			addCriterion("sid =", value, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidNotEqualTo(Integer value) {
			addCriterion("sid <>", value, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidGreaterThan(Integer value) {
			addCriterion("sid >", value, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidGreaterThanOrEqualTo(Integer value) {
			addCriterion("sid >=", value, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidLessThan(Integer value) {
			addCriterion("sid <", value, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidLessThanOrEqualTo(Integer value) {
			addCriterion("sid <=", value, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidIn(List<Integer> values) {
			addCriterion("sid in", values, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidNotIn(List<Integer> values) {
			addCriterion("sid not in", values, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidBetween(Integer value1, Integer value2) {
			addCriterion("sid between", value1, value2, "sid");
			return (Criteria) this;
		}
		
		public Criteria andSidNotBetween(Integer value1, Integer value2) {
			addCriterion("sid not between", value1, value2, "sid");
			return (Criteria) this;
		}
		
		public Criteria andGoldIsNull() {
			addCriterion("gold is null");
			return (Criteria) this;
		}
		
		public Criteria andGoldIsNotNull() {
			addCriterion("gold is not null");
			return (Criteria) this;
		}
		
		public Criteria andGoldEqualTo(Integer value) {
			addCriterion("gold =", value, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldNotEqualTo(Integer value) {
			addCriterion("gold <>", value, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldGreaterThan(Integer value) {
			addCriterion("gold >", value, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldGreaterThanOrEqualTo(Integer value) {
			addCriterion("gold >=", value, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldLessThan(Integer value) {
			addCriterion("gold <", value, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldLessThanOrEqualTo(Integer value) {
			addCriterion("gold <=", value, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldIn(List<Integer> values) {
			addCriterion("gold in", values, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldNotIn(List<Integer> values) {
			addCriterion("gold not in", values, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldBetween(Integer value1, Integer value2) {
			addCriterion("gold between", value1, value2, "gold");
			return (Criteria) this;
		}
		
		public Criteria andGoldNotBetween(Integer value1, Integer value2) {
			addCriterion("gold not between", value1, value2, "gold");
			return (Criteria) this;
		}
		
		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyEqualTo(Double value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyNotEqualTo(Double value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyGreaterThan(Double value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyLessThan(Double value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyLessThanOrEqualTo(Double value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyIn(List<Double> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyNotIn(List<Double> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyBetween(Double value1, Double value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyNotBetween(Double value1, Double value2) {
			addCriterion("money not between", value1, value2, "money");
			return (Criteria) this;
		}
		
		public Criteria andBillnoIsNull() {
			addCriterion("billno is null");
			return (Criteria) this;
		}
		
		public Criteria andBillnoIsNotNull() {
			addCriterion("billno is not null");
			return (Criteria) this;
		}
		
		public Criteria andBillnoEqualTo(String value) {
			addCriterion("billno =", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotEqualTo(String value) {
			addCriterion("billno <>", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoGreaterThan(String value) {
			addCriterion("billno >", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoGreaterThanOrEqualTo(String value) {
			addCriterion("billno >=", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoLessThan(String value) {
			addCriterion("billno <", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoLessThanOrEqualTo(String value) {
			addCriterion("billno <=", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoLike(String value) {
			addCriterion("billno like", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotLike(String value) {
			addCriterion("billno not like", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoIn(List<String> values) {
			addCriterion("billno in", values, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotIn(List<String> values) {
			addCriterion("billno not in", values, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoBetween(String value1, String value2) {
			addCriterion("billno between", value1, value2, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotBetween(String value1, String value2) {
			addCriterion("billno not between", value1, value2, "billno");
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
		
		public Criteria andTimeEqualTo(Integer value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotEqualTo(Integer value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeGreaterThan(Integer value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLessThan(Integer value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLessThanOrEqualTo(Integer value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeIn(List<Integer> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotIn(List<Integer> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeBetween(Integer value1, Integer value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}
		
		public Criteria andFlagIsNull() {
			addCriterion("flag is null");
			return (Criteria) this;
		}
		
		public Criteria andFlagIsNotNull() {
			addCriterion("flag is not null");
			return (Criteria) this;
		}
		
		public Criteria andFlagEqualTo(String value) {
			addCriterion("flag =", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagNotEqualTo(String value) {
			addCriterion("flag <>", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagGreaterThan(String value) {
			addCriterion("flag >", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagGreaterThanOrEqualTo(String value) {
			addCriterion("flag >=", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagLessThan(String value) {
			addCriterion("flag <", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagLessThanOrEqualTo(String value) {
			addCriterion("flag <=", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagLike(String value) {
			addCriterion("flag like", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagNotLike(String value) {
			addCriterion("flag not like", value, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagIn(List<String> values) {
			addCriterion("flag in", values, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagNotIn(List<String> values) {
			addCriterion("flag not in", values, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagBetween(String value1, String value2) {
			addCriterion("flag between", value1, value2, "flag");
			return (Criteria) this;
		}
		
		public Criteria andFlagNotBetween(String value1, String value2) {
			addCriterion("flag not between", value1, value2, "flag");
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
		
		public Criteria andResIsNull() {
			addCriterion("res is null");
			return (Criteria) this;
		}
		
		public Criteria andResIsNotNull() {
			addCriterion("res is not null");
			return (Criteria) this;
		}
		
		public Criteria andResEqualTo(String value) {
			addCriterion("res =", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResNotEqualTo(String value) {
			addCriterion("res <>", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResGreaterThan(String value) {
			addCriterion("res >", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResGreaterThanOrEqualTo(String value) {
			addCriterion("res >=", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResLessThan(String value) {
			addCriterion("res <", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResLessThanOrEqualTo(String value) {
			addCriterion("res <=", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResLike(String value) {
			addCriterion("res like", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResNotLike(String value) {
			addCriterion("res not like", value, "res");
			return (Criteria) this;
		}
		
		public Criteria andResIn(List<String> values) {
			addCriterion("res in", values, "res");
			return (Criteria) this;
		}
		
		public Criteria andResNotIn(List<String> values) {
			addCriterion("res not in", values, "res");
			return (Criteria) this;
		}
		
		public Criteria andResBetween(String value1, String value2) {
			addCriterion("res between", value1, value2, "res");
			return (Criteria) this;
		}
		
		public Criteria andResNotBetween(String value1, String value2) {
			addCriterion("res not between", value1, value2, "res");
			return (Criteria) this;
		}
		
		public Criteria andInfoIsNull() {
			addCriterion("info is null");
			return (Criteria) this;
		}
		
		public Criteria andInfoIsNotNull() {
			addCriterion("info is not null");
			return (Criteria) this;
		}
		
		public Criteria andInfoEqualTo(String value) {
			addCriterion("info =", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoNotEqualTo(String value) {
			addCriterion("info <>", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoGreaterThan(String value) {
			addCriterion("info >", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoGreaterThanOrEqualTo(String value) {
			addCriterion("info >=", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoLessThan(String value) {
			addCriterion("info <", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoLessThanOrEqualTo(String value) {
			addCriterion("info <=", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoLike(String value) {
			addCriterion("info like", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoNotLike(String value) {
			addCriterion("info not like", value, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoIn(List<String> values) {
			addCriterion("info in", values, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoNotIn(List<String> values) {
			addCriterion("info not in", values, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoBetween(String value1, String value2) {
			addCriterion("info between", value1, value2, "info");
			return (Criteria) this;
		}
		
		public Criteria andInfoNotBetween(String value1, String value2) {
			addCriterion("info not between", value1, value2, "info");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andPassportLikeInsensitive(String value) {
			addCriterion("upper(passport) like", value.toUpperCase(), "passport");
			return this;
		}
		
		public Criteria andBillnoLikeInsensitive(String value) {
			addCriterion("upper(billno) like", value.toUpperCase(), "billno");
			return this;
		}
		
		public Criteria andFlagLikeInsensitive(String value) {
			addCriterion("upper(flag) like", value.toUpperCase(), "flag");
			return this;
		}
		
		public Criteria andAddtimeLikeInsensitive(String value) {
			addCriterion("upper(addtime) like", value.toUpperCase(), "addtime");
			return this;
		}
		
		public Criteria andResLikeInsensitive(String value) {
			addCriterion("upper(res) like", value.toUpperCase(), "res");
			return this;
		}
		
		public Criteria andInfoLikeInsensitive(String value) {
			addCriterion("upper(info) like", value.toUpperCase(), "info");
			return this;
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