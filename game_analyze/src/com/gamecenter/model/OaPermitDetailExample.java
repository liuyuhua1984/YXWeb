package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OaPermitDetailExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OaPermitDetailExample() {
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
		
		public Criteria andDidIsNull() {
			addCriterion("did is null");
			return (Criteria) this;
		}
		
		public Criteria andDidIsNotNull() {
			addCriterion("did is not null");
			return (Criteria) this;
		}
		
		public Criteria andDidEqualTo(Integer value) {
			addCriterion("did =", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidNotEqualTo(Integer value) {
			addCriterion("did <>", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidGreaterThan(Integer value) {
			addCriterion("did >", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidGreaterThanOrEqualTo(Integer value) {
			addCriterion("did >=", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidLessThan(Integer value) {
			addCriterion("did <", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidLessThanOrEqualTo(Integer value) {
			addCriterion("did <=", value, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidIn(List<Integer> values) {
			addCriterion("did in", values, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidNotIn(List<Integer> values) {
			addCriterion("did not in", values, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidBetween(Integer value1, Integer value2) {
			addCriterion("did between", value1, value2, "did");
			return (Criteria) this;
		}
		
		public Criteria andDidNotBetween(Integer value1, Integer value2) {
			addCriterion("did not between", value1, value2, "did");
			return (Criteria) this;
		}
		
		public Criteria andSourceidIsNull() {
			addCriterion("sourceid is null");
			return (Criteria) this;
		}
		
		public Criteria andSourceidIsNotNull() {
			addCriterion("sourceid is not null");
			return (Criteria) this;
		}
		
		public Criteria andSourceidEqualTo(Integer value) {
			addCriterion("sourceid =", value, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidNotEqualTo(Integer value) {
			addCriterion("sourceid <>", value, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidGreaterThan(Integer value) {
			addCriterion("sourceid >", value, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidGreaterThanOrEqualTo(Integer value) {
			addCriterion("sourceid >=", value, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidLessThan(Integer value) {
			addCriterion("sourceid <", value, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidLessThanOrEqualTo(Integer value) {
			addCriterion("sourceid <=", value, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidIn(List<Integer> values) {
			addCriterion("sourceid in", values, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidNotIn(List<Integer> values) {
			addCriterion("sourceid not in", values, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidBetween(Integer value1, Integer value2) {
			addCriterion("sourceid between", value1, value2, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andSourceidNotBetween(Integer value1, Integer value2) {
			addCriterion("sourceid not between", value1, value2, "sourceid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidIsNull() {
			addCriterion("permitid is null");
			return (Criteria) this;
		}
		
		public Criteria andPermitidIsNotNull() {
			addCriterion("permitid is not null");
			return (Criteria) this;
		}
		
		public Criteria andPermitidEqualTo(Integer value) {
			addCriterion("permitid =", value, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidNotEqualTo(Integer value) {
			addCriterion("permitid <>", value, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidGreaterThan(Integer value) {
			addCriterion("permitid >", value, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidGreaterThanOrEqualTo(Integer value) {
			addCriterion("permitid >=", value, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidLessThan(Integer value) {
			addCriterion("permitid <", value, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidLessThanOrEqualTo(Integer value) {
			addCriterion("permitid <=", value, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidIn(List<Integer> values) {
			addCriterion("permitid in", values, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidNotIn(List<Integer> values) {
			addCriterion("permitid not in", values, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidBetween(Integer value1, Integer value2) {
			addCriterion("permitid between", value1, value2, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andPermitidNotBetween(Integer value1, Integer value2) {
			addCriterion("permitid not between", value1, value2, "permitid");
			return (Criteria) this;
		}
		
		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}
		
		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}
		
		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
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