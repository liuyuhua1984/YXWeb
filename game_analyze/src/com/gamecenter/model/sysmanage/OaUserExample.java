package com.gamecenter.sysmanage.model;

import java.util.ArrayList;
import java.util.List;

public class OaUserExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OaUserExample() {
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
		
		public Criteria andPassportIsNull() {
			addCriterion("passport is null");
			return (Criteria) this;
		}
		
		public Criteria andPassportIsNotNull() {
			addCriterion("passport is not null");
			return (Criteria) this;
		}
		
		public Criteria andPassportEqualTo(String value) {
			addCriterion("passport =", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotEqualTo(String value) {
			addCriterion("passport <>", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportGreaterThan(String value) {
			addCriterion("passport >", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportGreaterThanOrEqualTo(String value) {
			addCriterion("passport >=", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLessThan(String value) {
			addCriterion("passport <", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLessThanOrEqualTo(String value) {
			addCriterion("passport <=", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLike(String value) {
			addCriterion("passport like", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotLike(String value) {
			addCriterion("passport not like", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportIn(List<String> values) {
			addCriterion("passport in", values, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotIn(List<String> values) {
			addCriterion("passport not in", values, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportBetween(String value1, String value2) {
			addCriterion("passport between", value1, value2, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotBetween(String value1, String value2) {
			addCriterion("passport not between", value1, value2, "passport");
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
		
		public Criteria andUnameIsNull() {
			addCriterion("uname is null");
			return (Criteria) this;
		}
		
		public Criteria andUnameIsNotNull() {
			addCriterion("uname is not null");
			return (Criteria) this;
		}
		
		public Criteria andUnameEqualTo(String value) {
			addCriterion("uname =", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameNotEqualTo(String value) {
			addCriterion("uname <>", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameGreaterThan(String value) {
			addCriterion("uname >", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameGreaterThanOrEqualTo(String value) {
			addCriterion("uname >=", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameLessThan(String value) {
			addCriterion("uname <", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameLessThanOrEqualTo(String value) {
			addCriterion("uname <=", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameLike(String value) {
			addCriterion("uname like", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameNotLike(String value) {
			addCriterion("uname not like", value, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameIn(List<String> values) {
			addCriterion("uname in", values, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameNotIn(List<String> values) {
			addCriterion("uname not in", values, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameBetween(String value1, String value2) {
			addCriterion("uname between", value1, value2, "uname");
			return (Criteria) this;
		}
		
		public Criteria andUnameNotBetween(String value1, String value2) {
			addCriterion("uname not between", value1, value2, "uname");
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
		
		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}
		
		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}
		
		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}
		
		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
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
		
		public Criteria andRegtimeEqualTo(String value) {
			addCriterion("regTime =", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotEqualTo(String value) {
			addCriterion("regTime <>", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeGreaterThan(String value) {
			addCriterion("regTime >", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeGreaterThanOrEqualTo(String value) {
			addCriterion("regTime >=", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLessThan(String value) {
			addCriterion("regTime <", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLessThanOrEqualTo(String value) {
			addCriterion("regTime <=", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLike(String value) {
			addCriterion("regTime like", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotLike(String value) {
			addCriterion("regTime not like", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIn(List<String> values) {
			addCriterion("regTime in", values, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotIn(List<String> values) {
			addCriterion("regTime not in", values, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeBetween(String value1, String value2) {
			addCriterion("regTime between", value1, value2, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotBetween(String value1, String value2) {
			addCriterion("regTime not between", value1, value2, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andLogincountIsNull() {
			addCriterion("logincount is null");
			return (Criteria) this;
		}
		
		public Criteria andLogincountIsNotNull() {
			addCriterion("logincount is not null");
			return (Criteria) this;
		}
		
		public Criteria andLogincountEqualTo(Integer value) {
			addCriterion("logincount =", value, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountNotEqualTo(Integer value) {
			addCriterion("logincount <>", value, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountGreaterThan(Integer value) {
			addCriterion("logincount >", value, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountGreaterThanOrEqualTo(Integer value) {
			addCriterion("logincount >=", value, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountLessThan(Integer value) {
			addCriterion("logincount <", value, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountLessThanOrEqualTo(Integer value) {
			addCriterion("logincount <=", value, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountIn(List<Integer> values) {
			addCriterion("logincount in", values, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountNotIn(List<Integer> values) {
			addCriterion("logincount not in", values, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountBetween(Integer value1, Integer value2) {
			addCriterion("logincount between", value1, value2, "logincount");
			return (Criteria) this;
		}
		
		public Criteria andLogincountNotBetween(Integer value1, Integer value2) {
			addCriterion("logincount not between", value1, value2, "logincount");
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
		
		public Criteria andLastlogintimeEqualTo(String value) {
			addCriterion("lastLoginTime =", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotEqualTo(String value) {
			addCriterion("lastLoginTime <>", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeGreaterThan(String value) {
			addCriterion("lastLoginTime >", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeGreaterThanOrEqualTo(String value) {
			addCriterion("lastLoginTime >=", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLessThan(String value) {
			addCriterion("lastLoginTime <", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLessThanOrEqualTo(String value) {
			addCriterion("lastLoginTime <=", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLike(String value) {
			addCriterion("lastLoginTime like", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotLike(String value) {
			addCriterion("lastLoginTime not like", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIn(List<String> values) {
			addCriterion("lastLoginTime in", values, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotIn(List<String> values) {
			addCriterion("lastLoginTime not in", values, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeBetween(String value1, String value2) {
			addCriterion("lastLoginTime between", value1, value2, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotBetween(String value1, String value2) {
			addCriterion("lastLoginTime not between", value1, value2, "lastlogintime");
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
		
		public Criteria andIsonineIsNull() {
			addCriterion("isonine is null");
			return (Criteria) this;
		}
		
		public Criteria andIsonineIsNotNull() {
			addCriterion("isonine is not null");
			return (Criteria) this;
		}
		
		public Criteria andIsonineEqualTo(String value) {
			addCriterion("isonine =", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineNotEqualTo(String value) {
			addCriterion("isonine <>", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineGreaterThan(String value) {
			addCriterion("isonine >", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineGreaterThanOrEqualTo(String value) {
			addCriterion("isonine >=", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineLessThan(String value) {
			addCriterion("isonine <", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineLessThanOrEqualTo(String value) {
			addCriterion("isonine <=", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineLike(String value) {
			addCriterion("isonine like", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineNotLike(String value) {
			addCriterion("isonine not like", value, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineIn(List<String> values) {
			addCriterion("isonine in", values, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineNotIn(List<String> values) {
			addCriterion("isonine not in", values, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineBetween(String value1, String value2) {
			addCriterion("isonine between", value1, value2, "isonine");
			return (Criteria) this;
		}
		
		public Criteria andIsonineNotBetween(String value1, String value2) {
			addCriterion("isonine not between", value1, value2, "isonine");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andPassportLikeInsensitive(String value) {
			addCriterion("upper(passport) like", value.toUpperCase(), "passport");
			return this;
		}
		
		public Criteria andPwdLikeInsensitive(String value) {
			addCriterion("upper(pwd) like", value.toUpperCase(), "pwd");
			return this;
		}
		
		public Criteria andUnameLikeInsensitive(String value) {
			addCriterion("upper(uname) like", value.toUpperCase(), "uname");
			return this;
		}
		
		public Criteria andTelLikeInsensitive(String value) {
			addCriterion("upper(tel) like", value.toUpperCase(), "tel");
			return this;
		}
		
		public Criteria andEmailLikeInsensitive(String value) {
			addCriterion("upper(email) like", value.toUpperCase(), "email");
			return this;
		}
		
		public Criteria andRegtimeLikeInsensitive(String value) {
			addCriterion("upper(regTime) like", value.toUpperCase(), "regtime");
			return this;
		}
		
		public Criteria andLastlogintimeLikeInsensitive(String value) {
			addCriterion("upper(lastLoginTime) like", value.toUpperCase(), "lastlogintime");
			return this;
		}
		
		public Criteria andStatusLikeInsensitive(String value) {
			addCriterion("upper(status) like", value.toUpperCase(), "status");
			return this;
		}
		
		public Criteria andIsonineLikeInsensitive(String value) {
			addCriterion("upper(isonine) like", value.toUpperCase(), "isonine");
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