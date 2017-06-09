package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OaActionExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OaActionExample() {
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
		
		public Criteria andAidIsNull() {
			addCriterion("aid is null");
			return (Criteria) this;
		}
		
		public Criteria andAidIsNotNull() {
			addCriterion("aid is not null");
			return (Criteria) this;
		}
		
		public Criteria andAidEqualTo(Integer value) {
			addCriterion("aid =", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidNotEqualTo(Integer value) {
			addCriterion("aid <>", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidGreaterThan(Integer value) {
			addCriterion("aid >", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidGreaterThanOrEqualTo(Integer value) {
			addCriterion("aid >=", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidLessThan(Integer value) {
			addCriterion("aid <", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidLessThanOrEqualTo(Integer value) {
			addCriterion("aid <=", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidIn(List<Integer> values) {
			addCriterion("aid in", values, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidNotIn(List<Integer> values) {
			addCriterion("aid not in", values, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidBetween(Integer value1, Integer value2) {
			addCriterion("aid between", value1, value2, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidNotBetween(Integer value1, Integer value2) {
			addCriterion("aid not between", value1, value2, "aid");
			return (Criteria) this;
		}
		
		public Criteria andActionnameIsNull() {
			addCriterion("actionname is null");
			return (Criteria) this;
		}
		
		public Criteria andActionnameIsNotNull() {
			addCriterion("actionname is not null");
			return (Criteria) this;
		}
		
		public Criteria andActionnameEqualTo(String value) {
			addCriterion("actionname =", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameNotEqualTo(String value) {
			addCriterion("actionname <>", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameGreaterThan(String value) {
			addCriterion("actionname >", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameGreaterThanOrEqualTo(String value) {
			addCriterion("actionname >=", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameLessThan(String value) {
			addCriterion("actionname <", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameLessThanOrEqualTo(String value) {
			addCriterion("actionname <=", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameLike(String value) {
			addCriterion("actionname like", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameNotLike(String value) {
			addCriterion("actionname not like", value, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameIn(List<String> values) {
			addCriterion("actionname in", values, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameNotIn(List<String> values) {
			addCriterion("actionname not in", values, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameBetween(String value1, String value2) {
			addCriterion("actionname between", value1, value2, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActionnameNotBetween(String value1, String value2) {
			addCriterion("actionname not between", value1, value2, "actionname");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeIsNull() {
			addCriterion("actioncode is null");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeIsNotNull() {
			addCriterion("actioncode is not null");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeEqualTo(String value) {
			addCriterion("actioncode =", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeNotEqualTo(String value) {
			addCriterion("actioncode <>", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeGreaterThan(String value) {
			addCriterion("actioncode >", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeGreaterThanOrEqualTo(String value) {
			addCriterion("actioncode >=", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeLessThan(String value) {
			addCriterion("actioncode <", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeLessThanOrEqualTo(String value) {
			addCriterion("actioncode <=", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeLike(String value) {
			addCriterion("actioncode like", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeNotLike(String value) {
			addCriterion("actioncode not like", value, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeIn(List<String> values) {
			addCriterion("actioncode in", values, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeNotIn(List<String> values) {
			addCriterion("actioncode not in", values, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeBetween(String value1, String value2) {
			addCriterion("actioncode between", value1, value2, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andActioncodeNotBetween(String value1, String value2) {
			addCriterion("actioncode not between", value1, value2, "actioncode");
			return (Criteria) this;
		}
		
		public Criteria andIconIsNull() {
			addCriterion("icon is null");
			return (Criteria) this;
		}
		
		public Criteria andIconIsNotNull() {
			addCriterion("icon is not null");
			return (Criteria) this;
		}
		
		public Criteria andIconEqualTo(String value) {
			addCriterion("icon =", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotEqualTo(String value) {
			addCriterion("icon <>", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconGreaterThan(String value) {
			addCriterion("icon >", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconGreaterThanOrEqualTo(String value) {
			addCriterion("icon >=", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconLessThan(String value) {
			addCriterion("icon <", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconLessThanOrEqualTo(String value) {
			addCriterion("icon <=", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconLike(String value) {
			addCriterion("icon like", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotLike(String value) {
			addCriterion("icon not like", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconIn(List<String> values) {
			addCriterion("icon in", values, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotIn(List<String> values) {
			addCriterion("icon not in", values, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconBetween(String value1, String value2) {
			addCriterion("icon between", value1, value2, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotBetween(String value1, String value2) {
			addCriterion("icon not between", value1, value2, "icon");
			return (Criteria) this;
		}
		
		public Criteria andSortIsNull() {
			addCriterion("sort is null");
			return (Criteria) this;
		}
		
		public Criteria andSortIsNotNull() {
			addCriterion("sort is not null");
			return (Criteria) this;
		}
		
		public Criteria andSortEqualTo(Integer value) {
			addCriterion("sort =", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotEqualTo(Integer value) {
			addCriterion("sort <>", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortGreaterThan(Integer value) {
			addCriterion("sort >", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("sort >=", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortLessThan(Integer value) {
			addCriterion("sort <", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortLessThanOrEqualTo(Integer value) {
			addCriterion("sort <=", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortIn(List<Integer> values) {
			addCriterion("sort in", values, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotIn(List<Integer> values) {
			addCriterion("sort not in", values, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortBetween(Integer value1, Integer value2) {
			addCriterion("sort between", value1, value2, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotBetween(Integer value1, Integer value2) {
			addCriterion("sort not between", value1, value2, "sort");
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
		
		public Criteria andActionnameLikeInsensitive(String value) {
			addCriterion("upper(actionname) like", value.toUpperCase(), "actionname");
			return this;
		}
		
		public Criteria andActioncodeLikeInsensitive(String value) {
			addCriterion("upper(actioncode) like", value.toUpperCase(), "actioncode");
			return this;
		}
		
		public Criteria andIconLikeInsensitive(String value) {
			addCriterion("upper(icon) like", value.toUpperCase(), "icon");
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