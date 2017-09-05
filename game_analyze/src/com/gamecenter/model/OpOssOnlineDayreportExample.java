package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssOnlineDayreportExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssOnlineDayreportExample() {
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
		
		public Criteria andCtimeIsNull() {
			addCriterion("ctime is null");
			return (Criteria) this;
		}
		
		public Criteria andCtimeIsNotNull() {
			addCriterion("ctime is not null");
			return (Criteria) this;
		}
		
		public Criteria andCtimeEqualTo(String value) {
			addCriterion("ctime =", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotEqualTo(String value) {
			addCriterion("ctime <>", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeGreaterThan(String value) {
			addCriterion("ctime >", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeGreaterThanOrEqualTo(String value) {
			addCriterion("ctime >=", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeLessThan(String value) {
			addCriterion("ctime <", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeLessThanOrEqualTo(String value) {
			addCriterion("ctime <=", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeLike(String value) {
			addCriterion("ctime like", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotLike(String value) {
			addCriterion("ctime not like", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeIn(List<String> values) {
			addCriterion("ctime in", values, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotIn(List<String> values) {
			addCriterion("ctime not in", values, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeBetween(String value1, String value2) {
			addCriterion("ctime between", value1, value2, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotBetween(String value1, String value2) {
			addCriterion("ctime not between", value1, value2, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalIsNull() {
			addCriterion("maxval is null");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalIsNotNull() {
			addCriterion("maxval is not null");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalEqualTo(Integer value) {
			addCriterion("maxval =", value, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalNotEqualTo(Integer value) {
			addCriterion("maxval <>", value, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalGreaterThan(Integer value) {
			addCriterion("maxval >", value, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalGreaterThanOrEqualTo(Integer value) {
			addCriterion("maxval >=", value, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalLessThan(Integer value) {
			addCriterion("maxval <", value, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalLessThanOrEqualTo(Integer value) {
			addCriterion("maxval <=", value, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalIn(List<Integer> values) {
			addCriterion("maxval in", values, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalNotIn(List<Integer> values) {
			addCriterion("maxval not in", values, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalBetween(Integer value1, Integer value2) {
			addCriterion("maxval between", value1, value2, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMaxvalNotBetween(Integer value1, Integer value2) {
			addCriterion("maxval not between", value1, value2, "maxval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalIsNull() {
			addCriterion("minval is null");
			return (Criteria) this;
		}
		
		public Criteria andMinvalIsNotNull() {
			addCriterion("minval is not null");
			return (Criteria) this;
		}
		
		public Criteria andMinvalEqualTo(Integer value) {
			addCriterion("minval =", value, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalNotEqualTo(Integer value) {
			addCriterion("minval <>", value, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalGreaterThan(Integer value) {
			addCriterion("minval >", value, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalGreaterThanOrEqualTo(Integer value) {
			addCriterion("minval >=", value, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalLessThan(Integer value) {
			addCriterion("minval <", value, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalLessThanOrEqualTo(Integer value) {
			addCriterion("minval <=", value, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalIn(List<Integer> values) {
			addCriterion("minval in", values, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalNotIn(List<Integer> values) {
			addCriterion("minval not in", values, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalBetween(Integer value1, Integer value2) {
			addCriterion("minval between", value1, value2, "minval");
			return (Criteria) this;
		}
		
		public Criteria andMinvalNotBetween(Integer value1, Integer value2) {
			addCriterion("minval not between", value1, value2, "minval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalIsNull() {
			addCriterion("avgval is null");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalIsNotNull() {
			addCriterion("avgval is not null");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalEqualTo(Integer value) {
			addCriterion("avgval =", value, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalNotEqualTo(Integer value) {
			addCriterion("avgval <>", value, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalGreaterThan(Integer value) {
			addCriterion("avgval >", value, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalGreaterThanOrEqualTo(Integer value) {
			addCriterion("avgval >=", value, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalLessThan(Integer value) {
			addCriterion("avgval <", value, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalLessThanOrEqualTo(Integer value) {
			addCriterion("avgval <=", value, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalIn(List<Integer> values) {
			addCriterion("avgval in", values, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalNotIn(List<Integer> values) {
			addCriterion("avgval not in", values, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalBetween(Integer value1, Integer value2) {
			addCriterion("avgval between", value1, value2, "avgval");
			return (Criteria) this;
		}
		
		public Criteria andAvgvalNotBetween(Integer value1, Integer value2) {
			addCriterion("avgval not between", value1, value2, "avgval");
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
		
		public Criteria andCtimeLikeInsensitive(String value) {
			addCriterion("upper(ctime) like", value.toUpperCase(), "ctime");
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