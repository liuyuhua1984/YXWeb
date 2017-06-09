package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

import com.gamecenter.common.PageListNum;

public class TNodeExample extends PageListNum {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public TNodeExample() {
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
		
		public Criteria andActionIsNull() {
			addCriterion("action is null");
			return (Criteria) this;
		}
		
		public Criteria andActionIsNotNull() {
			addCriterion("action is not null");
			return (Criteria) this;
		}
		
		public Criteria andActionEqualTo(String value) {
			addCriterion("action =", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionNotEqualTo(String value) {
			addCriterion("action <>", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionGreaterThan(String value) {
			addCriterion("action >", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionGreaterThanOrEqualTo(String value) {
			addCriterion("action >=", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionLessThan(String value) {
			addCriterion("action <", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionLessThanOrEqualTo(String value) {
			addCriterion("action <=", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionLike(String value) {
			addCriterion("action like", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionNotLike(String value) {
			addCriterion("action not like", value, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionIn(List<String> values) {
			addCriterion("action in", values, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionNotIn(List<String> values) {
			addCriterion("action not in", values, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionBetween(String value1, String value2) {
			addCriterion("action between", value1, value2, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionNotBetween(String value1, String value2) {
			addCriterion("action not between", value1, value2, "action");
			return (Criteria) this;
		}
		
		public Criteria andActionNameIsNull() {
			addCriterion("action_name is null");
			return (Criteria) this;
		}
		
		public Criteria andActionNameIsNotNull() {
			addCriterion("action_name is not null");
			return (Criteria) this;
		}
		
		public Criteria andActionNameEqualTo(String value) {
			addCriterion("action_name =", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameNotEqualTo(String value) {
			addCriterion("action_name <>", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameGreaterThan(String value) {
			addCriterion("action_name >", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameGreaterThanOrEqualTo(String value) {
			addCriterion("action_name >=", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameLessThan(String value) {
			addCriterion("action_name <", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameLessThanOrEqualTo(String value) {
			addCriterion("action_name <=", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameLike(String value) {
			addCriterion("action_name like", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameNotLike(String value) {
			addCriterion("action_name not like", value, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameIn(List<String> values) {
			addCriterion("action_name in", values, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameNotIn(List<String> values) {
			addCriterion("action_name not in", values, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameBetween(String value1, String value2) {
			addCriterion("action_name between", value1, value2, "actionName");
			return (Criteria) this;
		}
		
		public Criteria andActionNameNotBetween(String value1, String value2) {
			addCriterion("action_name not between", value1, value2, "actionName");
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
		
		public Criteria andStatusEqualTo(Byte value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotEqualTo(Byte value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThan(Byte value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThan(Byte value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThanOrEqualTo(Byte value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusIn(List<Byte> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotIn(List<Byte> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusBetween(Byte value1, Byte value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
		
		public Criteria andModuleIsNull() {
			addCriterion("module is null");
			return (Criteria) this;
		}
		
		public Criteria andModuleIsNotNull() {
			addCriterion("module is not null");
			return (Criteria) this;
		}
		
		public Criteria andModuleEqualTo(String value) {
			addCriterion("module =", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleNotEqualTo(String value) {
			addCriterion("module <>", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleGreaterThan(String value) {
			addCriterion("module >", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleGreaterThanOrEqualTo(String value) {
			addCriterion("module >=", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleLessThan(String value) {
			addCriterion("module <", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleLessThanOrEqualTo(String value) {
			addCriterion("module <=", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleLike(String value) {
			addCriterion("module like", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleNotLike(String value) {
			addCriterion("module not like", value, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleIn(List<String> values) {
			addCriterion("module in", values, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleNotIn(List<String> values) {
			addCriterion("module not in", values, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleBetween(String value1, String value2) {
			addCriterion("module between", value1, value2, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleNotBetween(String value1, String value2) {
			addCriterion("module not between", value1, value2, "module");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameIsNull() {
			addCriterion("module_name is null");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameIsNotNull() {
			addCriterion("module_name is not null");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameEqualTo(String value) {
			addCriterion("module_name =", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameNotEqualTo(String value) {
			addCriterion("module_name <>", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameGreaterThan(String value) {
			addCriterion("module_name >", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
			addCriterion("module_name >=", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameLessThan(String value) {
			addCriterion("module_name <", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameLessThanOrEqualTo(String value) {
			addCriterion("module_name <=", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameLike(String value) {
			addCriterion("module_name like", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameNotLike(String value) {
			addCriterion("module_name not like", value, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameIn(List<String> values) {
			addCriterion("module_name in", values, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameNotIn(List<String> values) {
			addCriterion("module_name not in", values, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameBetween(String value1, String value2) {
			addCriterion("module_name between", value1, value2, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andModuleNameNotBetween(String value1, String value2) {
			addCriterion("module_name not between", value1, value2, "moduleName");
			return (Criteria) this;
		}
		
		public Criteria andNavidIsNull() {
			addCriterion("navId is null");
			return (Criteria) this;
		}
		
		public Criteria andNavidIsNotNull() {
			addCriterion("navId is not null");
			return (Criteria) this;
		}
		
		public Criteria andNavidEqualTo(Integer value) {
			addCriterion("navId =", value, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidNotEqualTo(Integer value) {
			addCriterion("navId <>", value, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidGreaterThan(Integer value) {
			addCriterion("navId >", value, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidGreaterThanOrEqualTo(Integer value) {
			addCriterion("navId >=", value, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidLessThan(Integer value) {
			addCriterion("navId <", value, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidLessThanOrEqualTo(Integer value) {
			addCriterion("navId <=", value, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidIn(List<Integer> values) {
			addCriterion("navId in", values, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidNotIn(List<Integer> values) {
			addCriterion("navId not in", values, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidBetween(Integer value1, Integer value2) {
			addCriterion("navId between", value1, value2, "navid");
			return (Criteria) this;
		}
		
		public Criteria andNavidNotBetween(Integer value1, Integer value2) {
			addCriterion("navId not between", value1, value2, "navid");
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
		
		public Criteria andSortEqualTo(Short value) {
			addCriterion("sort =", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotEqualTo(Short value) {
			addCriterion("sort <>", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortGreaterThan(Short value) {
			addCriterion("sort >", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortGreaterThanOrEqualTo(Short value) {
			addCriterion("sort >=", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortLessThan(Short value) {
			addCriterion("sort <", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortLessThanOrEqualTo(Short value) {
			addCriterion("sort <=", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortIn(List<Short> values) {
			addCriterion("sort in", values, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotIn(List<Short> values) {
			addCriterion("sort not in", values, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortBetween(Short value1, Short value2) {
			addCriterion("sort between", value1, value2, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotBetween(Short value1, Short value2) {
			addCriterion("sort not between", value1, value2, "sort");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeIsNull() {
			addCriterion("auth_type is null");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeIsNotNull() {
			addCriterion("auth_type is not null");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeEqualTo(Byte value) {
			addCriterion("auth_type =", value, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeNotEqualTo(Byte value) {
			addCriterion("auth_type <>", value, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeGreaterThan(Byte value) {
			addCriterion("auth_type >", value, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeGreaterThanOrEqualTo(Byte value) {
			addCriterion("auth_type >=", value, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeLessThan(Byte value) {
			addCriterion("auth_type <", value, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeLessThanOrEqualTo(Byte value) {
			addCriterion("auth_type <=", value, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeIn(List<Byte> values) {
			addCriterion("auth_type in", values, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeNotIn(List<Byte> values) {
			addCriterion("auth_type not in", values, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeBetween(Byte value1, Byte value2) {
			addCriterion("auth_type between", value1, value2, "authType");
			return (Criteria) this;
		}
		
		public Criteria andAuthTypeNotBetween(Byte value1, Byte value2) {
			addCriterion("auth_type not between", value1, value2, "authType");
			return (Criteria) this;
		}
		
		public Criteria andIsShowIsNull() {
			addCriterion("is_show is null");
			return (Criteria) this;
		}
		
		public Criteria andIsShowIsNotNull() {
			addCriterion("is_show is not null");
			return (Criteria) this;
		}
		
		public Criteria andIsShowEqualTo(Byte value) {
			addCriterion("is_show =", value, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowNotEqualTo(Byte value) {
			addCriterion("is_show <>", value, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowGreaterThan(Byte value) {
			addCriterion("is_show >", value, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowGreaterThanOrEqualTo(Byte value) {
			addCriterion("is_show >=", value, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowLessThan(Byte value) {
			addCriterion("is_show <", value, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowLessThanOrEqualTo(Byte value) {
			addCriterion("is_show <=", value, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowIn(List<Byte> values) {
			addCriterion("is_show in", values, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowNotIn(List<Byte> values) {
			addCriterion("is_show not in", values, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowBetween(Byte value1, Byte value2) {
			addCriterion("is_show between", value1, value2, "isShow");
			return (Criteria) this;
		}
		
		public Criteria andIsShowNotBetween(Byte value1, Byte value2) {
			addCriterion("is_show not between", value1, value2, "isShow");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andActionLikeInsensitive(String value) {
			addCriterion("upper(action) like", value.toUpperCase(), "action");
			return this;
		}
		
		public Criteria andActionNameLikeInsensitive(String value) {
			addCriterion("upper(action_name) like", value.toUpperCase(), "actionName");
			return this;
		}
		
		public Criteria andModuleLikeInsensitive(String value) {
			addCriterion("upper(module) like", value.toUpperCase(), "module");
			return this;
		}
		
		public Criteria andModuleNameLikeInsensitive(String value) {
			addCriterion("upper(module_name) like", value.toUpperCase(), "moduleName");
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