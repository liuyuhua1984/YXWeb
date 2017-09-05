package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class TRoleAccessExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public TRoleAccessExample() {
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
		
		public Criteria andNodeidIsNull() {
			addCriterion("nodeId is null");
			return (Criteria) this;
		}
		
		public Criteria andNodeidIsNotNull() {
			addCriterion("nodeId is not null");
			return (Criteria) this;
		}
		
		public Criteria andNodeidEqualTo(Integer value) {
			addCriterion("nodeId =", value, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidNotEqualTo(Integer value) {
			addCriterion("nodeId <>", value, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidGreaterThan(Integer value) {
			addCriterion("nodeId >", value, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("nodeId >=", value, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidLessThan(Integer value) {
			addCriterion("nodeId <", value, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidLessThanOrEqualTo(Integer value) {
			addCriterion("nodeId <=", value, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidIn(List<Integer> values) {
			addCriterion("nodeId in", values, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidNotIn(List<Integer> values) {
			addCriterion("nodeId not in", values, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidBetween(Integer value1, Integer value2) {
			addCriterion("nodeId between", value1, value2, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andNodeidNotBetween(Integer value1, Integer value2) {
			addCriterion("nodeId not between", value1, value2, "nodeid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidIsNull() {
			addCriterion("roleId is null");
			return (Criteria) this;
		}
		
		public Criteria andRoleidIsNotNull() {
			addCriterion("roleId is not null");
			return (Criteria) this;
		}
		
		public Criteria andRoleidEqualTo(Integer value) {
			addCriterion("roleId =", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidNotEqualTo(Integer value) {
			addCriterion("roleId <>", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidGreaterThan(Integer value) {
			addCriterion("roleId >", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
			addCriterion("roleId >=", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidLessThan(Integer value) {
			addCriterion("roleId <", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidLessThanOrEqualTo(Integer value) {
			addCriterion("roleId <=", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidIn(List<Integer> values) {
			addCriterion("roleId in", values, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidNotIn(List<Integer> values) {
			addCriterion("roleId not in", values, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidBetween(Integer value1, Integer value2) {
			addCriterion("roleId between", value1, value2, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
			addCriterion("roleId not between", value1, value2, "roleid");
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