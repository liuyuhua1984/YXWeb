package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OaUserPermitExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OaUserPermitExample() {
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
		
		public Criteria andUidIsNull() {
			addCriterion("uid is null");
			return (Criteria) this;
		}
		
		public Criteria andUidIsNotNull() {
			addCriterion("uid is not null");
			return (Criteria) this;
		}
		
		public Criteria andUidEqualTo(Integer value) {
			addCriterion("uid =", value, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("uid <>", value, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("uid >", value, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("uid >=", value, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidLessThan(Integer value) {
			addCriterion("uid <", value, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("uid <=", value, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidIn(List<Integer> values) {
			addCriterion("uid in", values, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("uid not in", values, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("uid between", value1, value2, "uid");
			return (Criteria) this;
		}
		
		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("uid not between", value1, value2, "uid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidIsNull() {
			addCriterion("deptid is null");
			return (Criteria) this;
		}
		
		public Criteria andDeptidIsNotNull() {
			addCriterion("deptid is not null");
			return (Criteria) this;
		}
		
		public Criteria andDeptidEqualTo(Integer value) {
			addCriterion("deptid =", value, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidNotEqualTo(Integer value) {
			addCriterion("deptid <>", value, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidGreaterThan(Integer value) {
			addCriterion("deptid >", value, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
			addCriterion("deptid >=", value, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidLessThan(Integer value) {
			addCriterion("deptid <", value, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidLessThanOrEqualTo(Integer value) {
			addCriterion("deptid <=", value, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidIn(List<Integer> values) {
			addCriterion("deptid in", values, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidNotIn(List<Integer> values) {
			addCriterion("deptid not in", values, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidBetween(Integer value1, Integer value2) {
			addCriterion("deptid between", value1, value2, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
			addCriterion("deptid not between", value1, value2, "deptid");
			return (Criteria) this;
		}
		
		public Criteria andPosidIsNull() {
			addCriterion("posid is null");
			return (Criteria) this;
		}
		
		public Criteria andPosidIsNotNull() {
			addCriterion("posid is not null");
			return (Criteria) this;
		}
		
		public Criteria andPosidEqualTo(Integer value) {
			addCriterion("posid =", value, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidNotEqualTo(Integer value) {
			addCriterion("posid <>", value, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidGreaterThan(Integer value) {
			addCriterion("posid >", value, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidGreaterThanOrEqualTo(Integer value) {
			addCriterion("posid >=", value, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidLessThan(Integer value) {
			addCriterion("posid <", value, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidLessThanOrEqualTo(Integer value) {
			addCriterion("posid <=", value, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidIn(List<Integer> values) {
			addCriterion("posid in", values, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidNotIn(List<Integer> values) {
			addCriterion("posid not in", values, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidBetween(Integer value1, Integer value2) {
			addCriterion("posid between", value1, value2, "posid");
			return (Criteria) this;
		}
		
		public Criteria andPosidNotBetween(Integer value1, Integer value2) {
			addCriterion("posid not between", value1, value2, "posid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidIsNull() {
			addCriterion("roleid is null");
			return (Criteria) this;
		}
		
		public Criteria andRoleidIsNotNull() {
			addCriterion("roleid is not null");
			return (Criteria) this;
		}
		
		public Criteria andRoleidEqualTo(Integer value) {
			addCriterion("roleid =", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidNotEqualTo(Integer value) {
			addCriterion("roleid <>", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidGreaterThan(Integer value) {
			addCriterion("roleid >", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
			addCriterion("roleid >=", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidLessThan(Integer value) {
			addCriterion("roleid <", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidLessThanOrEqualTo(Integer value) {
			addCriterion("roleid <=", value, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidIn(List<Integer> values) {
			addCriterion("roleid in", values, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidNotIn(List<Integer> values) {
			addCriterion("roleid not in", values, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidBetween(Integer value1, Integer value2) {
			addCriterion("roleid between", value1, value2, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
			addCriterion("roleid not between", value1, value2, "roleid");
			return (Criteria) this;
		}
		
		public Criteria andPgidIsNull() {
			addCriterion("pgid is null");
			return (Criteria) this;
		}
		
		public Criteria andPgidIsNotNull() {
			addCriterion("pgid is not null");
			return (Criteria) this;
		}
		
		public Criteria andPgidEqualTo(Integer value) {
			addCriterion("pgid =", value, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidNotEqualTo(Integer value) {
			addCriterion("pgid <>", value, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidGreaterThan(Integer value) {
			addCriterion("pgid >", value, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidGreaterThanOrEqualTo(Integer value) {
			addCriterion("pgid >=", value, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidLessThan(Integer value) {
			addCriterion("pgid <", value, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidLessThanOrEqualTo(Integer value) {
			addCriterion("pgid <=", value, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidIn(List<Integer> values) {
			addCriterion("pgid in", values, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidNotIn(List<Integer> values) {
			addCriterion("pgid not in", values, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidBetween(Integer value1, Integer value2) {
			addCriterion("pgid between", value1, value2, "pgid");
			return (Criteria) this;
		}
		
		public Criteria andPgidNotBetween(Integer value1, Integer value2) {
			addCriterion("pgid not between", value1, value2, "pgid");
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