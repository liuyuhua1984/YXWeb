package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssQlzComparsExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssQlzComparsExample() {
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
		
		public Criteria andParsIsNull() {
			addCriterion("pars is null");
			return (Criteria) this;
		}
		
		public Criteria andParsIsNotNull() {
			addCriterion("pars is not null");
			return (Criteria) this;
		}
		
		public Criteria andParsEqualTo(String value) {
			addCriterion("pars =", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsNotEqualTo(String value) {
			addCriterion("pars <>", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsGreaterThan(String value) {
			addCriterion("pars >", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsGreaterThanOrEqualTo(String value) {
			addCriterion("pars >=", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsLessThan(String value) {
			addCriterion("pars <", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsLessThanOrEqualTo(String value) {
			addCriterion("pars <=", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsLike(String value) {
			addCriterion("pars like", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsNotLike(String value) {
			addCriterion("pars not like", value, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsIn(List<String> values) {
			addCriterion("pars in", values, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsNotIn(List<String> values) {
			addCriterion("pars not in", values, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsBetween(String value1, String value2) {
			addCriterion("pars between", value1, value2, "pars");
			return (Criteria) this;
		}
		
		public Criteria andParsNotBetween(String value1, String value2) {
			addCriterion("pars not between", value1, value2, "pars");
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
		
		public Criteria andOpenidLikeInsensitive(String value) {
			addCriterion("upper(openid) like", value.toUpperCase(), "openid");
			return this;
		}
		
		public Criteria andParsLikeInsensitive(String value) {
			addCriterion("upper(pars) like", value.toUpperCase(), "pars");
			return this;
		}
		
		public Criteria andTimeLikeInsensitive(String value) {
			addCriterion("upper(time) like", value.toUpperCase(), "time");
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