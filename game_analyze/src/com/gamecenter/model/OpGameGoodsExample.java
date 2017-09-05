package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpGameGoodsExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpGameGoodsExample() {
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
		
		public Criteria andGidIsNull() {
			addCriterion("gid is null");
			return (Criteria) this;
		}
		
		public Criteria andGidIsNotNull() {
			addCriterion("gid is not null");
			return (Criteria) this;
		}
		
		public Criteria andGidEqualTo(Integer value) {
			addCriterion("gid =", value, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidNotEqualTo(Integer value) {
			addCriterion("gid <>", value, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidGreaterThan(Integer value) {
			addCriterion("gid >", value, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidGreaterThanOrEqualTo(Integer value) {
			addCriterion("gid >=", value, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidLessThan(Integer value) {
			addCriterion("gid <", value, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidLessThanOrEqualTo(Integer value) {
			addCriterion("gid <=", value, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidIn(List<Integer> values) {
			addCriterion("gid in", values, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidNotIn(List<Integer> values) {
			addCriterion("gid not in", values, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidBetween(Integer value1, Integer value2) {
			addCriterion("gid between", value1, value2, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGidNotBetween(Integer value1, Integer value2) {
			addCriterion("gid not between", value1, value2, "gid");
			return (Criteria) this;
		}
		
		public Criteria andGtypeIsNull() {
			addCriterion("gtype is null");
			return (Criteria) this;
		}
		
		public Criteria andGtypeIsNotNull() {
			addCriterion("gtype is not null");
			return (Criteria) this;
		}
		
		public Criteria andGtypeEqualTo(String value) {
			addCriterion("gtype =", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeNotEqualTo(String value) {
			addCriterion("gtype <>", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeGreaterThan(String value) {
			addCriterion("gtype >", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeGreaterThanOrEqualTo(String value) {
			addCriterion("gtype >=", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeLessThan(String value) {
			addCriterion("gtype <", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeLessThanOrEqualTo(String value) {
			addCriterion("gtype <=", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeLike(String value) {
			addCriterion("gtype like", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeNotLike(String value) {
			addCriterion("gtype not like", value, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeIn(List<String> values) {
			addCriterion("gtype in", values, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeNotIn(List<String> values) {
			addCriterion("gtype not in", values, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeBetween(String value1, String value2) {
			addCriterion("gtype between", value1, value2, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGtypeNotBetween(String value1, String value2) {
			addCriterion("gtype not between", value1, value2, "gtype");
			return (Criteria) this;
		}
		
		public Criteria andGcodeIsNull() {
			addCriterion("gcode is null");
			return (Criteria) this;
		}
		
		public Criteria andGcodeIsNotNull() {
			addCriterion("gcode is not null");
			return (Criteria) this;
		}
		
		public Criteria andGcodeEqualTo(String value) {
			addCriterion("gcode =", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeNotEqualTo(String value) {
			addCriterion("gcode <>", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeGreaterThan(String value) {
			addCriterion("gcode >", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeGreaterThanOrEqualTo(String value) {
			addCriterion("gcode >=", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeLessThan(String value) {
			addCriterion("gcode <", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeLessThanOrEqualTo(String value) {
			addCriterion("gcode <=", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeLike(String value) {
			addCriterion("gcode like", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeNotLike(String value) {
			addCriterion("gcode not like", value, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeIn(List<String> values) {
			addCriterion("gcode in", values, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeNotIn(List<String> values) {
			addCriterion("gcode not in", values, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeBetween(String value1, String value2) {
			addCriterion("gcode between", value1, value2, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGcodeNotBetween(String value1, String value2) {
			addCriterion("gcode not between", value1, value2, "gcode");
			return (Criteria) this;
		}
		
		public Criteria andGnameIsNull() {
			addCriterion("gname is null");
			return (Criteria) this;
		}
		
		public Criteria andGnameIsNotNull() {
			addCriterion("gname is not null");
			return (Criteria) this;
		}
		
		public Criteria andGnameEqualTo(String value) {
			addCriterion("gname =", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameNotEqualTo(String value) {
			addCriterion("gname <>", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameGreaterThan(String value) {
			addCriterion("gname >", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameGreaterThanOrEqualTo(String value) {
			addCriterion("gname >=", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameLessThan(String value) {
			addCriterion("gname <", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameLessThanOrEqualTo(String value) {
			addCriterion("gname <=", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameLike(String value) {
			addCriterion("gname like", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameNotLike(String value) {
			addCriterion("gname not like", value, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameIn(List<String> values) {
			addCriterion("gname in", values, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameNotIn(List<String> values) {
			addCriterion("gname not in", values, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameBetween(String value1, String value2) {
			addCriterion("gname between", value1, value2, "gname");
			return (Criteria) this;
		}
		
		public Criteria andGnameNotBetween(String value1, String value2) {
			addCriterion("gname not between", value1, value2, "gname");
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
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andGtypeLikeInsensitive(String value) {
			addCriterion("upper(gtype) like", value.toUpperCase(), "gtype");
			return this;
		}
		
		public Criteria andGcodeLikeInsensitive(String value) {
			addCriterion("upper(gcode) like", value.toUpperCase(), "gcode");
			return this;
		}
		
		public Criteria andGnameLikeInsensitive(String value) {
			addCriterion("upper(gname) like", value.toUpperCase(), "gname");
			return this;
		}
		
		public Criteria andInfoLikeInsensitive(String value) {
			addCriterion("upper(info) like", value.toUpperCase(), "info");
			return this;
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
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