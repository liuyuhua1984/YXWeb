package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOperatorWorldExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOperatorWorldExample() {
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
		
		public Criteria andOptidIsNull() {
			addCriterion("optid is null");
			return (Criteria) this;
		}
		
		public Criteria andOptidIsNotNull() {
			addCriterion("optid is not null");
			return (Criteria) this;
		}
		
		public Criteria andOptidEqualTo(Integer value) {
			addCriterion("optid =", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotEqualTo(Integer value) {
			addCriterion("optid <>", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidGreaterThan(Integer value) {
			addCriterion("optid >", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidGreaterThanOrEqualTo(Integer value) {
			addCriterion("optid >=", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidLessThan(Integer value) {
			addCriterion("optid <", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidLessThanOrEqualTo(Integer value) {
			addCriterion("optid <=", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidIn(List<Integer> values) {
			addCriterion("optid in", values, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotIn(List<Integer> values) {
			addCriterion("optid not in", values, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidBetween(Integer value1, Integer value2) {
			addCriterion("optid between", value1, value2, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotBetween(Integer value1, Integer value2) {
			addCriterion("optid not between", value1, value2, "optid");
			return (Criteria) this;
		}
		
		public Criteria andWidIsNull() {
			addCriterion("wid is null");
			return (Criteria) this;
		}
		
		public Criteria andWidIsNotNull() {
			addCriterion("wid is not null");
			return (Criteria) this;
		}
		
		public Criteria andWidEqualTo(Integer value) {
			addCriterion("wid =", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidNotEqualTo(Integer value) {
			addCriterion("wid <>", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidGreaterThan(Integer value) {
			addCriterion("wid >", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidGreaterThanOrEqualTo(Integer value) {
			addCriterion("wid >=", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidLessThan(Integer value) {
			addCriterion("wid <", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidLessThanOrEqualTo(Integer value) {
			addCriterion("wid <=", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidIn(List<Integer> values) {
			addCriterion("wid in", values, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidNotIn(List<Integer> values) {
			addCriterion("wid not in", values, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidBetween(Integer value1, Integer value2) {
			addCriterion("wid between", value1, value2, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidNotBetween(Integer value1, Integer value2) {
			addCriterion("wid not between", value1, value2, "wid");
			return (Criteria) this;
		}
		
		public Criteria andNumberIsNull() {
			addCriterion("number is null");
			return (Criteria) this;
		}
		
		public Criteria andNumberIsNotNull() {
			addCriterion("number is not null");
			return (Criteria) this;
		}
		
		public Criteria andNumberEqualTo(String value) {
			addCriterion("number =", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberNotEqualTo(String value) {
			addCriterion("number <>", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberGreaterThan(String value) {
			addCriterion("number >", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberGreaterThanOrEqualTo(String value) {
			addCriterion("number >=", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberLessThan(String value) {
			addCriterion("number <", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberLessThanOrEqualTo(String value) {
			addCriterion("number <=", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberLike(String value) {
			addCriterion("number like", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberNotLike(String value) {
			addCriterion("number not like", value, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberIn(List<String> values) {
			addCriterion("number in", values, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberNotIn(List<String> values) {
			addCriterion("number not in", values, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberBetween(String value1, String value2) {
			addCriterion("number between", value1, value2, "number");
			return (Criteria) this;
		}
		
		public Criteria andNumberNotBetween(String value1, String value2) {
			addCriterion("number not between", value1, value2, "number");
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
		
		public Criteria andNumberLikeInsensitive(String value) {
			addCriterion("upper(number) like", value.toUpperCase(), "number");
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