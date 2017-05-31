package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpGameappVersionExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpGameappVersionExample() {
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
		
		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotBetween(String value1, String value2) {
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
		
		public Criteria andVsidIsNull() {
			addCriterion("vsid is null");
			return (Criteria) this;
		}
		
		public Criteria andVsidIsNotNull() {
			addCriterion("vsid is not null");
			return (Criteria) this;
		}
		
		public Criteria andVsidEqualTo(String value) {
			addCriterion("vsid =", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotEqualTo(String value) {
			addCriterion("vsid <>", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidGreaterThan(String value) {
			addCriterion("vsid >", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidGreaterThanOrEqualTo(String value) {
			addCriterion("vsid >=", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidLessThan(String value) {
			addCriterion("vsid <", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidLessThanOrEqualTo(String value) {
			addCriterion("vsid <=", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidLike(String value) {
			addCriterion("vsid like", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotLike(String value) {
			addCriterion("vsid not like", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidIn(List<String> values) {
			addCriterion("vsid in", values, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotIn(List<String> values) {
			addCriterion("vsid not in", values, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidBetween(String value1, String value2) {
			addCriterion("vsid between", value1, value2, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotBetween(String value1, String value2) {
			addCriterion("vsid not between", value1, value2, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVnameIsNull() {
			addCriterion("vname is null");
			return (Criteria) this;
		}
		
		public Criteria andVnameIsNotNull() {
			addCriterion("vname is not null");
			return (Criteria) this;
		}
		
		public Criteria andVnameEqualTo(String value) {
			addCriterion("vname =", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameNotEqualTo(String value) {
			addCriterion("vname <>", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameGreaterThan(String value) {
			addCriterion("vname >", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameGreaterThanOrEqualTo(String value) {
			addCriterion("vname >=", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameLessThan(String value) {
			addCriterion("vname <", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameLessThanOrEqualTo(String value) {
			addCriterion("vname <=", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameLike(String value) {
			addCriterion("vname like", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameNotLike(String value) {
			addCriterion("vname not like", value, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameIn(List<String> values) {
			addCriterion("vname in", values, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameNotIn(List<String> values) {
			addCriterion("vname not in", values, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameBetween(String value1, String value2) {
			addCriterion("vname between", value1, value2, "vname");
			return (Criteria) this;
		}
		
		public Criteria andVnameNotBetween(String value1, String value2) {
			addCriterion("vname not between", value1, value2, "vname");
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
		
		public Criteria andSendtimeIsNull() {
			addCriterion("sendtime is null");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeIsNotNull() {
			addCriterion("sendtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeEqualTo(String value) {
			addCriterion("sendtime =", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeNotEqualTo(String value) {
			addCriterion("sendtime <>", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeGreaterThan(String value) {
			addCriterion("sendtime >", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeGreaterThanOrEqualTo(String value) {
			addCriterion("sendtime >=", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeLessThan(String value) {
			addCriterion("sendtime <", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeLessThanOrEqualTo(String value) {
			addCriterion("sendtime <=", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeLike(String value) {
			addCriterion("sendtime like", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeNotLike(String value) {
			addCriterion("sendtime not like", value, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeIn(List<String> values) {
			addCriterion("sendtime in", values, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeNotIn(List<String> values) {
			addCriterion("sendtime not in", values, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeBetween(String value1, String value2) {
			addCriterion("sendtime between", value1, value2, "sendtime");
			return (Criteria) this;
		}
		
		public Criteria andSendtimeNotBetween(String value1, String value2) {
			addCriterion("sendtime not between", value1, value2, "sendtime");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andIdLikeInsensitive(String value) {
			addCriterion("upper(id) like", value.toUpperCase(), "id");
			return this;
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andVsidLikeInsensitive(String value) {
			addCriterion("upper(vsid) like", value.toUpperCase(), "vsid");
			return this;
		}
		
		public Criteria andVnameLikeInsensitive(String value) {
			addCriterion("upper(vname) like", value.toUpperCase(), "vname");
			return this;
		}
		
		public Criteria andInfoLikeInsensitive(String value) {
			addCriterion("upper(info) like", value.toUpperCase(), "info");
			return this;
		}
		
		public Criteria andSendtimeLikeInsensitive(String value) {
			addCriterion("upper(sendtime) like", value.toUpperCase(), "sendtime");
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