package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOperatorProductExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOperatorProductExample() {
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
		
		public Criteria andAppkeyIsNull() {
			addCriterion("appkey is null");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyIsNotNull() {
			addCriterion("appkey is not null");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyEqualTo(String value) {
			addCriterion("appkey =", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyNotEqualTo(String value) {
			addCriterion("appkey <>", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyGreaterThan(String value) {
			addCriterion("appkey >", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
			addCriterion("appkey >=", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyLessThan(String value) {
			addCriterion("appkey <", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyLessThanOrEqualTo(String value) {
			addCriterion("appkey <=", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyLike(String value) {
			addCriterion("appkey like", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyNotLike(String value) {
			addCriterion("appkey not like", value, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyIn(List<String> values) {
			addCriterion("appkey in", values, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyNotIn(List<String> values) {
			addCriterion("appkey not in", values, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyBetween(String value1, String value2) {
			addCriterion("appkey between", value1, value2, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andAppkeyNotBetween(String value1, String value2) {
			addCriterion("appkey not between", value1, value2, "appkey");
			return (Criteria) this;
		}
		
		public Criteria andCheckipIsNull() {
			addCriterion("checkip is null");
			return (Criteria) this;
		}
		
		public Criteria andCheckipIsNotNull() {
			addCriterion("checkip is not null");
			return (Criteria) this;
		}
		
		public Criteria andCheckipEqualTo(String value) {
			addCriterion("checkip =", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipNotEqualTo(String value) {
			addCriterion("checkip <>", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipGreaterThan(String value) {
			addCriterion("checkip >", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipGreaterThanOrEqualTo(String value) {
			addCriterion("checkip >=", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipLessThan(String value) {
			addCriterion("checkip <", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipLessThanOrEqualTo(String value) {
			addCriterion("checkip <=", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipLike(String value) {
			addCriterion("checkip like", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipNotLike(String value) {
			addCriterion("checkip not like", value, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipIn(List<String> values) {
			addCriterion("checkip in", values, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipNotIn(List<String> values) {
			addCriterion("checkip not in", values, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipBetween(String value1, String value2) {
			addCriterion("checkip between", value1, value2, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andCheckipNotBetween(String value1, String value2) {
			addCriterion("checkip not between", value1, value2, "checkip");
			return (Criteria) this;
		}
		
		public Criteria andPfurlIsNull() {
			addCriterion("pfurl is null");
			return (Criteria) this;
		}
		
		public Criteria andPfurlIsNotNull() {
			addCriterion("pfurl is not null");
			return (Criteria) this;
		}
		
		public Criteria andPfurlEqualTo(String value) {
			addCriterion("pfurl =", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlNotEqualTo(String value) {
			addCriterion("pfurl <>", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlGreaterThan(String value) {
			addCriterion("pfurl >", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlGreaterThanOrEqualTo(String value) {
			addCriterion("pfurl >=", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlLessThan(String value) {
			addCriterion("pfurl <", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlLessThanOrEqualTo(String value) {
			addCriterion("pfurl <=", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlLike(String value) {
			addCriterion("pfurl like", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlNotLike(String value) {
			addCriterion("pfurl not like", value, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlIn(List<String> values) {
			addCriterion("pfurl in", values, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlNotIn(List<String> values) {
			addCriterion("pfurl not in", values, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlBetween(String value1, String value2) {
			addCriterion("pfurl between", value1, value2, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andPfurlNotBetween(String value1, String value2) {
			addCriterion("pfurl not between", value1, value2, "pfurl");
			return (Criteria) this;
		}
		
		public Criteria andWnumIsNull() {
			addCriterion("wnum is null");
			return (Criteria) this;
		}
		
		public Criteria andWnumIsNotNull() {
			addCriterion("wnum is not null");
			return (Criteria) this;
		}
		
		public Criteria andWnumEqualTo(Integer value) {
			addCriterion("wnum =", value, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumNotEqualTo(Integer value) {
			addCriterion("wnum <>", value, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumGreaterThan(Integer value) {
			addCriterion("wnum >", value, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("wnum >=", value, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumLessThan(Integer value) {
			addCriterion("wnum <", value, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumLessThanOrEqualTo(Integer value) {
			addCriterion("wnum <=", value, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumIn(List<Integer> values) {
			addCriterion("wnum in", values, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumNotIn(List<Integer> values) {
			addCriterion("wnum not in", values, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumBetween(Integer value1, Integer value2) {
			addCriterion("wnum between", value1, value2, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andWnumNotBetween(Integer value1, Integer value2) {
			addCriterion("wnum not between", value1, value2, "wnum");
			return (Criteria) this;
		}
		
		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}
		
		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}
		
		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
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
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andAppkeyLikeInsensitive(String value) {
			addCriterion("upper(appkey) like", value.toUpperCase(), "appkey");
			return this;
		}
		
		public Criteria andCheckipLikeInsensitive(String value) {
			addCriterion("upper(checkip) like", value.toUpperCase(), "checkip");
			return this;
		}
		
		public Criteria andPfurlLikeInsensitive(String value) {
			addCriterion("upper(pfurl) like", value.toUpperCase(), "pfurl");
			return this;
		}
		
		public Criteria andStatusLikeInsensitive(String value) {
			addCriterion("upper(status) like", value.toUpperCase(), "status");
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