package com.gamecenter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public TUserExample() {
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
		
		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}
		
		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}
		
		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}
		
		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}
		
		public Criteria andPwdIsNull() {
			addCriterion("pwd is null");
			return (Criteria) this;
		}
		
		public Criteria andPwdIsNotNull() {
			addCriterion("pwd is not null");
			return (Criteria) this;
		}
		
		public Criteria andPwdEqualTo(String value) {
			addCriterion("pwd =", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdNotEqualTo(String value) {
			addCriterion("pwd <>", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdGreaterThan(String value) {
			addCriterion("pwd >", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdGreaterThanOrEqualTo(String value) {
			addCriterion("pwd >=", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdLessThan(String value) {
			addCriterion("pwd <", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdLessThanOrEqualTo(String value) {
			addCriterion("pwd <=", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdLike(String value) {
			addCriterion("pwd like", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdNotLike(String value) {
			addCriterion("pwd not like", value, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdIn(List<String> values) {
			addCriterion("pwd in", values, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdNotIn(List<String> values) {
			addCriterion("pwd not in", values, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdBetween(String value1, String value2) {
			addCriterion("pwd between", value1, value2, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andPwdNotBetween(String value1, String value2) {
			addCriterion("pwd not between", value1, value2, "pwd");
			return (Criteria) this;
		}
		
		public Criteria andRealnameIsNull() {
			addCriterion("realName is null");
			return (Criteria) this;
		}
		
		public Criteria andRealnameIsNotNull() {
			addCriterion("realName is not null");
			return (Criteria) this;
		}
		
		public Criteria andRealnameEqualTo(String value) {
			addCriterion("realName =", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameNotEqualTo(String value) {
			addCriterion("realName <>", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameGreaterThan(String value) {
			addCriterion("realName >", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameGreaterThanOrEqualTo(String value) {
			addCriterion("realName >=", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameLessThan(String value) {
			addCriterion("realName <", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameLessThanOrEqualTo(String value) {
			addCriterion("realName <=", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameLike(String value) {
			addCriterion("realName like", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameNotLike(String value) {
			addCriterion("realName not like", value, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameIn(List<String> values) {
			addCriterion("realName in", values, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameNotIn(List<String> values) {
			addCriterion("realName not in", values, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameBetween(String value1, String value2) {
			addCriterion("realName between", value1, value2, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRealnameNotBetween(String value1, String value2) {
			addCriterion("realName not between", value1, value2, "realname");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIsNull() {
			addCriterion("regTime is null");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIsNotNull() {
			addCriterion("regTime is not null");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeEqualTo(Date value) {
			addCriterion("regTime =", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotEqualTo(Date value) {
			addCriterion("regTime <>", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeGreaterThan(Date value) {
			addCriterion("regTime >", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("regTime >=", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLessThan(Date value) {
			addCriterion("regTime <", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLessThanOrEqualTo(Date value) {
			addCriterion("regTime <=", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIn(List<Date> values) {
			addCriterion("regTime in", values, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotIn(List<Date> values) {
			addCriterion("regTime not in", values, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeBetween(Date value1, Date value2) {
			addCriterion("regTime between", value1, value2, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotBetween(Date value1, Date value2) {
			addCriterion("regTime not between", value1, value2, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIsNull() {
			addCriterion("lastLoginTime is null");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIsNotNull() {
			addCriterion("lastLoginTime is not null");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeEqualTo(Date value) {
			addCriterion("lastLoginTime =", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotEqualTo(Date value) {
			addCriterion("lastLoginTime <>", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeGreaterThan(Date value) {
			addCriterion("lastLoginTime >", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lastLoginTime >=", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLessThan(Date value) {
			addCriterion("lastLoginTime <", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
			addCriterion("lastLoginTime <=", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIn(List<Date> values) {
			addCriterion("lastLoginTime in", values, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotIn(List<Date> values) {
			addCriterion("lastLoginTime not in", values, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeBetween(Date value1, Date value2) {
			addCriterion("lastLoginTime between", value1, value2, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
			addCriterion("lastLoginTime not between", value1, value2, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipIsNull() {
			addCriterion("lastLoginIp is null");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipIsNotNull() {
			addCriterion("lastLoginIp is not null");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipEqualTo(String value) {
			addCriterion("lastLoginIp =", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotEqualTo(String value) {
			addCriterion("lastLoginIp <>", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipGreaterThan(String value) {
			addCriterion("lastLoginIp >", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
			addCriterion("lastLoginIp >=", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipLessThan(String value) {
			addCriterion("lastLoginIp <", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipLessThanOrEqualTo(String value) {
			addCriterion("lastLoginIp <=", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipLike(String value) {
			addCriterion("lastLoginIp like", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotLike(String value) {
			addCriterion("lastLoginIp not like", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipIn(List<String> values) {
			addCriterion("lastLoginIp in", values, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotIn(List<String> values) {
			addCriterion("lastLoginIp not in", values, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipBetween(String value1, String value2) {
			addCriterion("lastLoginIp between", value1, value2, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotBetween(String value1, String value2) {
			addCriterion("lastLoginIp not between", value1, value2, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andCountIsNull() {
			addCriterion("count is null");
			return (Criteria) this;
		}
		
		public Criteria andCountIsNotNull() {
			addCriterion("count is not null");
			return (Criteria) this;
		}
		
		public Criteria andCountEqualTo(Integer value) {
			addCriterion("count =", value, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountNotEqualTo(Integer value) {
			addCriterion("count <>", value, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountGreaterThan(Integer value) {
			addCriterion("count >", value, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("count >=", value, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountLessThan(Integer value) {
			addCriterion("count <", value, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountLessThanOrEqualTo(Integer value) {
			addCriterion("count <=", value, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountIn(List<Integer> values) {
			addCriterion("count in", values, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountNotIn(List<Integer> values) {
			addCriterion("count not in", values, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountBetween(Integer value1, Integer value2) {
			addCriterion("count between", value1, value2, "count");
			return (Criteria) this;
		}
		
		public Criteria andCountNotBetween(Integer value1, Integer value2) {
			addCriterion("count not between", value1, value2, "count");
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
		
		public Criteria andStatusEqualTo(Short value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotEqualTo(Short value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThan(Short value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThanOrEqualTo(Short value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThan(Short value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThanOrEqualTo(Short value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusIn(List<Short> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotIn(List<Short> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusBetween(Short value1, Short value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotBetween(Short value1, Short value2) {
			addCriterion("status not between", value1, value2, "status");
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
		
		public Criteria andTelIsNull() {
			addCriterion("tel is null");
			return (Criteria) this;
		}
		
		public Criteria andTelIsNotNull() {
			addCriterion("tel is not null");
			return (Criteria) this;
		}
		
		public Criteria andTelEqualTo(String value) {
			addCriterion("tel =", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelNotEqualTo(String value) {
			addCriterion("tel <>", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelGreaterThan(String value) {
			addCriterion("tel >", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelGreaterThanOrEqualTo(String value) {
			addCriterion("tel >=", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelLessThan(String value) {
			addCriterion("tel <", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelLessThanOrEqualTo(String value) {
			addCriterion("tel <=", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelLike(String value) {
			addCriterion("tel like", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelNotLike(String value) {
			addCriterion("tel not like", value, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelIn(List<String> values) {
			addCriterion("tel in", values, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelNotIn(List<String> values) {
			addCriterion("tel not in", values, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelBetween(String value1, String value2) {
			addCriterion("tel between", value1, value2, "tel");
			return (Criteria) this;
		}
		
		public Criteria andTelNotBetween(String value1, String value2) {
			addCriterion("tel not between", value1, value2, "tel");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andNameLikeInsensitive(String value) {
			addCriterion("upper(name) like", value.toUpperCase(), "name");
			return this;
		}
		
		public Criteria andPwdLikeInsensitive(String value) {
			addCriterion("upper(pwd) like", value.toUpperCase(), "pwd");
			return this;
		}
		
		public Criteria andRealnameLikeInsensitive(String value) {
			addCriterion("upper(realName) like", value.toUpperCase(), "realname");
			return this;
		}
		
		public Criteria andLastloginipLikeInsensitive(String value) {
			addCriterion("upper(lastLoginIp) like", value.toUpperCase(), "lastloginip");
			return this;
		}
		
		public Criteria andTelLikeInsensitive(String value) {
			addCriterion("upper(tel) like", value.toUpperCase(), "tel");
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