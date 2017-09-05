package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssUserRemainExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssUserRemainExample() {
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
		
		public Criteria andAppidIsNull() {
			addCriterion("appid is null");
			return (Criteria) this;
		}
		
		public Criteria andAppidIsNotNull() {
			addCriterion("appid is not null");
			return (Criteria) this;
		}
		
		public Criteria andAppidEqualTo(String value) {
			addCriterion("appid =", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotEqualTo(String value) {
			addCriterion("appid <>", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidGreaterThan(String value) {
			addCriterion("appid >", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidGreaterThanOrEqualTo(String value) {
			addCriterion("appid >=", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidLessThan(String value) {
			addCriterion("appid <", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidLessThanOrEqualTo(String value) {
			addCriterion("appid <=", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidLike(String value) {
			addCriterion("appid like", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotLike(String value) {
			addCriterion("appid not like", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidIn(List<String> values) {
			addCriterion("appid in", values, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotIn(List<String> values) {
			addCriterion("appid not in", values, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidBetween(String value1, String value2) {
			addCriterion("appid between", value1, value2, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotBetween(String value1, String value2) {
			addCriterion("appid not between", value1, value2, "appid");
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
		
		public Criteria andGoaltimeIsNull() {
			addCriterion("goaltime is null");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeIsNotNull() {
			addCriterion("goaltime is not null");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeEqualTo(String value) {
			addCriterion("goaltime =", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeNotEqualTo(String value) {
			addCriterion("goaltime <>", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeGreaterThan(String value) {
			addCriterion("goaltime >", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeGreaterThanOrEqualTo(String value) {
			addCriterion("goaltime >=", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeLessThan(String value) {
			addCriterion("goaltime <", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeLessThanOrEqualTo(String value) {
			addCriterion("goaltime <=", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeLike(String value) {
			addCriterion("goaltime like", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeNotLike(String value) {
			addCriterion("goaltime not like", value, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeIn(List<String> values) {
			addCriterion("goaltime in", values, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeNotIn(List<String> values) {
			addCriterion("goaltime not in", values, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeBetween(String value1, String value2) {
			addCriterion("goaltime between", value1, value2, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andGoaltimeNotBetween(String value1, String value2) {
			addCriterion("goaltime not between", value1, value2, "goaltime");
			return (Criteria) this;
		}
		
		public Criteria andLc2IsNull() {
			addCriterion("lc2 is null");
			return (Criteria) this;
		}
		
		public Criteria andLc2IsNotNull() {
			addCriterion("lc2 is not null");
			return (Criteria) this;
		}
		
		public Criteria andLc2EqualTo(Double value) {
			addCriterion("lc2 =", value, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2NotEqualTo(Double value) {
			addCriterion("lc2 <>", value, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2GreaterThan(Double value) {
			addCriterion("lc2 >", value, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2GreaterThanOrEqualTo(Double value) {
			addCriterion("lc2 >=", value, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2LessThan(Double value) {
			addCriterion("lc2 <", value, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2LessThanOrEqualTo(Double value) {
			addCriterion("lc2 <=", value, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2In(List<Double> values) {
			addCriterion("lc2 in", values, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2NotIn(List<Double> values) {
			addCriterion("lc2 not in", values, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2Between(Double value1, Double value2) {
			addCriterion("lc2 between", value1, value2, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc2NotBetween(Double value1, Double value2) {
			addCriterion("lc2 not between", value1, value2, "lc2");
			return (Criteria) this;
		}
		
		public Criteria andLc3IsNull() {
			addCriterion("lc3 is null");
			return (Criteria) this;
		}
		
		public Criteria andLc3IsNotNull() {
			addCriterion("lc3 is not null");
			return (Criteria) this;
		}
		
		public Criteria andLc3EqualTo(Double value) {
			addCriterion("lc3 =", value, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3NotEqualTo(Double value) {
			addCriterion("lc3 <>", value, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3GreaterThan(Double value) {
			addCriterion("lc3 >", value, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3GreaterThanOrEqualTo(Double value) {
			addCriterion("lc3 >=", value, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3LessThan(Double value) {
			addCriterion("lc3 <", value, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3LessThanOrEqualTo(Double value) {
			addCriterion("lc3 <=", value, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3In(List<Double> values) {
			addCriterion("lc3 in", values, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3NotIn(List<Double> values) {
			addCriterion("lc3 not in", values, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3Between(Double value1, Double value2) {
			addCriterion("lc3 between", value1, value2, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc3NotBetween(Double value1, Double value2) {
			addCriterion("lc3 not between", value1, value2, "lc3");
			return (Criteria) this;
		}
		
		public Criteria andLc7IsNull() {
			addCriterion("lc7 is null");
			return (Criteria) this;
		}
		
		public Criteria andLc7IsNotNull() {
			addCriterion("lc7 is not null");
			return (Criteria) this;
		}
		
		public Criteria andLc7EqualTo(Double value) {
			addCriterion("lc7 =", value, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7NotEqualTo(Double value) {
			addCriterion("lc7 <>", value, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7GreaterThan(Double value) {
			addCriterion("lc7 >", value, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7GreaterThanOrEqualTo(Double value) {
			addCriterion("lc7 >=", value, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7LessThan(Double value) {
			addCriterion("lc7 <", value, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7LessThanOrEqualTo(Double value) {
			addCriterion("lc7 <=", value, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7In(List<Double> values) {
			addCriterion("lc7 in", values, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7NotIn(List<Double> values) {
			addCriterion("lc7 not in", values, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7Between(Double value1, Double value2) {
			addCriterion("lc7 between", value1, value2, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc7NotBetween(Double value1, Double value2) {
			addCriterion("lc7 not between", value1, value2, "lc7");
			return (Criteria) this;
		}
		
		public Criteria andLc30IsNull() {
			addCriterion("lc30 is null");
			return (Criteria) this;
		}
		
		public Criteria andLc30IsNotNull() {
			addCriterion("lc30 is not null");
			return (Criteria) this;
		}
		
		public Criteria andLc30EqualTo(Double value) {
			addCriterion("lc30 =", value, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30NotEqualTo(Double value) {
			addCriterion("lc30 <>", value, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30GreaterThan(Double value) {
			addCriterion("lc30 >", value, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30GreaterThanOrEqualTo(Double value) {
			addCriterion("lc30 >=", value, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30LessThan(Double value) {
			addCriterion("lc30 <", value, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30LessThanOrEqualTo(Double value) {
			addCriterion("lc30 <=", value, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30In(List<Double> values) {
			addCriterion("lc30 in", values, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30NotIn(List<Double> values) {
			addCriterion("lc30 not in", values, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30Between(Double value1, Double value2) {
			addCriterion("lc30 between", value1, value2, "lc30");
			return (Criteria) this;
		}
		
		public Criteria andLc30NotBetween(Double value1, Double value2) {
			addCriterion("lc30 not between", value1, value2, "lc30");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andGoaltimeLikeInsensitive(String value) {
			addCriterion("upper(goaltime) like", value.toUpperCase(), "goaltime");
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