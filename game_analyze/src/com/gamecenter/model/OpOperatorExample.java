package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOperatorExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOperatorExample() {
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
		
		public Criteria andOpcodeIsNull() {
			addCriterion("opcode is null");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeIsNotNull() {
			addCriterion("opcode is not null");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeEqualTo(String value) {
			addCriterion("opcode =", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeNotEqualTo(String value) {
			addCriterion("opcode <>", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeGreaterThan(String value) {
			addCriterion("opcode >", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
			addCriterion("opcode >=", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeLessThan(String value) {
			addCriterion("opcode <", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeLessThanOrEqualTo(String value) {
			addCriterion("opcode <=", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeLike(String value) {
			addCriterion("opcode like", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeNotLike(String value) {
			addCriterion("opcode not like", value, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeIn(List<String> values) {
			addCriterion("opcode in", values, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeNotIn(List<String> values) {
			addCriterion("opcode not in", values, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeBetween(String value1, String value2) {
			addCriterion("opcode between", value1, value2, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOpcodeNotBetween(String value1, String value2) {
			addCriterion("opcode not between", value1, value2, "opcode");
			return (Criteria) this;
		}
		
		public Criteria andOptnameIsNull() {
			addCriterion("optname is null");
			return (Criteria) this;
		}
		
		public Criteria andOptnameIsNotNull() {
			addCriterion("optname is not null");
			return (Criteria) this;
		}
		
		public Criteria andOptnameEqualTo(String value) {
			addCriterion("optname =", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameNotEqualTo(String value) {
			addCriterion("optname <>", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameGreaterThan(String value) {
			addCriterion("optname >", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameGreaterThanOrEqualTo(String value) {
			addCriterion("optname >=", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameLessThan(String value) {
			addCriterion("optname <", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameLessThanOrEqualTo(String value) {
			addCriterion("optname <=", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameLike(String value) {
			addCriterion("optname like", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameNotLike(String value) {
			addCriterion("optname not like", value, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameIn(List<String> values) {
			addCriterion("optname in", values, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameNotIn(List<String> values) {
			addCriterion("optname not in", values, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameBetween(String value1, String value2) {
			addCriterion("optname between", value1, value2, "optname");
			return (Criteria) this;
		}
		
		public Criteria andOptnameNotBetween(String value1, String value2) {
			addCriterion("optname not between", value1, value2, "optname");
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
		
		public Criteria andOpcodeLikeInsensitive(String value) {
			addCriterion("upper(opcode) like", value.toUpperCase(), "opcode");
			return this;
		}
		
		public Criteria andOptnameLikeInsensitive(String value) {
			addCriterion("upper(optname) like", value.toUpperCase(), "optname");
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