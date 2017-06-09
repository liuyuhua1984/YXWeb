package com.gamecenter.sysmanage.model;

import java.util.ArrayList;
import java.util.List;

public class OaRoleExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OaRoleExample() {
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
		
		public Criteria andRolenameIsNull() {
			addCriterion("rolename is null");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIsNotNull() {
			addCriterion("rolename is not null");
			return (Criteria) this;
		}
		
		public Criteria andRolenameEqualTo(String value) {
			addCriterion("rolename =", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotEqualTo(String value) {
			addCriterion("rolename <>", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameGreaterThan(String value) {
			addCriterion("rolename >", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameGreaterThanOrEqualTo(String value) {
			addCriterion("rolename >=", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLessThan(String value) {
			addCriterion("rolename <", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLessThanOrEqualTo(String value) {
			addCriterion("rolename <=", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLike(String value) {
			addCriterion("rolename like", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotLike(String value) {
			addCriterion("rolename not like", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIn(List<String> values) {
			addCriterion("rolename in", values, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotIn(List<String> values) {
			addCriterion("rolename not in", values, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameBetween(String value1, String value2) {
			addCriterion("rolename between", value1, value2, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotBetween(String value1, String value2) {
			addCriterion("rolename not between", value1, value2, "rolename");
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
		
		public Criteria andPgidsIsNull() {
			addCriterion("pgids is null");
			return (Criteria) this;
		}
		
		public Criteria andPgidsIsNotNull() {
			addCriterion("pgids is not null");
			return (Criteria) this;
		}
		
		public Criteria andPgidsEqualTo(String value) {
			addCriterion("pgids =", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsNotEqualTo(String value) {
			addCriterion("pgids <>", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsGreaterThan(String value) {
			addCriterion("pgids >", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsGreaterThanOrEqualTo(String value) {
			addCriterion("pgids >=", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsLessThan(String value) {
			addCriterion("pgids <", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsLessThanOrEqualTo(String value) {
			addCriterion("pgids <=", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsLike(String value) {
			addCriterion("pgids like", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsNotLike(String value) {
			addCriterion("pgids not like", value, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsIn(List<String> values) {
			addCriterion("pgids in", values, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsNotIn(List<String> values) {
			addCriterion("pgids not in", values, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsBetween(String value1, String value2) {
			addCriterion("pgids between", value1, value2, "pgids");
			return (Criteria) this;
		}
		
		public Criteria andPgidsNotBetween(String value1, String value2) {
			addCriterion("pgids not between", value1, value2, "pgids");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andRolenameLikeInsensitive(String value) {
			addCriterion("upper(rolename) like", value.toUpperCase(), "rolename");
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
		
		public Criteria andPgidsLikeInsensitive(String value) {
			addCriterion("upper(pgids) like", value.toUpperCase(), "pgids");
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