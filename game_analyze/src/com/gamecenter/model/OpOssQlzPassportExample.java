package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

import com.gamecenter.common.PageListNum;

public class OpOssQlzPassportExample extends PageListNum {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssQlzPassportExample() {
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
		
		public Criteria andOpenidIsNull() {
			addCriterion("openid is null");
			return (Criteria) this;
		}
		
		public Criteria andOpenidIsNotNull() {
			addCriterion("openid is not null");
			return (Criteria) this;
		}
		
		public Criteria andOpenidEqualTo(String value) {
			addCriterion("openid =", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotEqualTo(String value) {
			addCriterion("openid <>", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidGreaterThan(String value) {
			addCriterion("openid >", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidGreaterThanOrEqualTo(String value) {
			addCriterion("openid >=", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidLessThan(String value) {
			addCriterion("openid <", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidLessThanOrEqualTo(String value) {
			addCriterion("openid <=", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidLike(String value) {
			addCriterion("openid like", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotLike(String value) {
			addCriterion("openid not like", value, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidIn(List<String> values) {
			addCriterion("openid in", values, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotIn(List<String> values) {
			addCriterion("openid not in", values, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidBetween(String value1, String value2) {
			addCriterion("openid between", value1, value2, "openid");
			return (Criteria) this;
		}
		
		public Criteria andOpenidNotBetween(String value1, String value2) {
			addCriterion("openid not between", value1, value2, "openid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidIsNull() {
			addCriterion("worldid is null");
			return (Criteria) this;
		}
		
		public Criteria andWorldidIsNotNull() {
			addCriterion("worldid is not null");
			return (Criteria) this;
		}
		
		public Criteria andWorldidEqualTo(String value) {
			addCriterion("worldid =", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotEqualTo(String value) {
			addCriterion("worldid <>", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidGreaterThan(String value) {
			addCriterion("worldid >", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidGreaterThanOrEqualTo(String value) {
			addCriterion("worldid >=", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidLessThan(String value) {
			addCriterion("worldid <", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidLessThanOrEqualTo(String value) {
			addCriterion("worldid <=", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidLike(String value) {
			addCriterion("worldid like", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotLike(String value) {
			addCriterion("worldid not like", value, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidIn(List<String> values) {
			addCriterion("worldid in", values, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotIn(List<String> values) {
			addCriterion("worldid not in", values, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidBetween(String value1, String value2) {
			addCriterion("worldid between", value1, value2, "worldid");
			return (Criteria) this;
		}
		
		public Criteria andWorldidNotBetween(String value1, String value2) {
			addCriterion("worldid not between", value1, value2, "worldid");
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
		
		public Criteria andGradeIsNull() {
			addCriterion("grade is null");
			return (Criteria) this;
		}
		
		public Criteria andGradeIsNotNull() {
			addCriterion("grade is not null");
			return (Criteria) this;
		}
		
		public Criteria andGradeEqualTo(Integer value) {
			addCriterion("grade =", value, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeNotEqualTo(Integer value) {
			addCriterion("grade <>", value, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeGreaterThan(Integer value) {
			addCriterion("grade >", value, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
			addCriterion("grade >=", value, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeLessThan(Integer value) {
			addCriterion("grade <", value, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeLessThanOrEqualTo(Integer value) {
			addCriterion("grade <=", value, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeIn(List<Integer> values) {
			addCriterion("grade in", values, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeNotIn(List<Integer> values) {
			addCriterion("grade not in", values, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeBetween(Integer value1, Integer value2) {
			addCriterion("grade between", value1, value2, "grade");
			return (Criteria) this;
		}
		
		public Criteria andGradeNotBetween(Integer value1, Integer value2) {
			addCriterion("grade not between", value1, value2, "grade");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyIsNull() {
			addCriterion("curmoney is null");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyIsNotNull() {
			addCriterion("curmoney is not null");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyEqualTo(Double value) {
			addCriterion("curmoney =", value, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyNotEqualTo(Double value) {
			addCriterion("curmoney <>", value, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyGreaterThan(Double value) {
			addCriterion("curmoney >", value, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyGreaterThanOrEqualTo(Double value) {
			addCriterion("curmoney >=", value, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyLessThan(Double value) {
			addCriterion("curmoney <", value, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyLessThanOrEqualTo(Double value) {
			addCriterion("curmoney <=", value, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyIn(List<Double> values) {
			addCriterion("curmoney in", values, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyNotIn(List<Double> values) {
			addCriterion("curmoney not in", values, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyBetween(Double value1, Double value2) {
			addCriterion("curmoney between", value1, value2, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andCurmoneyNotBetween(Double value1, Double value2) {
			addCriterion("curmoney not between", value1, value2, "curmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyIsNull() {
			addCriterion("totalmoney is null");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyIsNotNull() {
			addCriterion("totalmoney is not null");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyEqualTo(Double value) {
			addCriterion("totalmoney =", value, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyNotEqualTo(Double value) {
			addCriterion("totalmoney <>", value, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyGreaterThan(Double value) {
			addCriterion("totalmoney >", value, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyGreaterThanOrEqualTo(Double value) {
			addCriterion("totalmoney >=", value, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyLessThan(Double value) {
			addCriterion("totalmoney <", value, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyLessThanOrEqualTo(Double value) {
			addCriterion("totalmoney <=", value, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyIn(List<Double> values) {
			addCriterion("totalmoney in", values, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyNotIn(List<Double> values) {
			addCriterion("totalmoney not in", values, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyBetween(Double value1, Double value2) {
			addCriterion("totalmoney between", value1, value2, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andTotalmoneyNotBetween(Double value1, Double value2) {
			addCriterion("totalmoney not between", value1, value2, "totalmoney");
			return (Criteria) this;
		}
		
		public Criteria andCareerIsNull() {
			addCriterion("career is null");
			return (Criteria) this;
		}
		
		public Criteria andCareerIsNotNull() {
			addCriterion("career is not null");
			return (Criteria) this;
		}
		
		public Criteria andCareerEqualTo(Integer value) {
			addCriterion("career =", value, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerNotEqualTo(Integer value) {
			addCriterion("career <>", value, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerGreaterThan(Integer value) {
			addCriterion("career >", value, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerGreaterThanOrEqualTo(Integer value) {
			addCriterion("career >=", value, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerLessThan(Integer value) {
			addCriterion("career <", value, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerLessThanOrEqualTo(Integer value) {
			addCriterion("career <=", value, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerIn(List<Integer> values) {
			addCriterion("career in", values, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerNotIn(List<Integer> values) {
			addCriterion("career not in", values, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerBetween(Integer value1, Integer value2) {
			addCriterion("career between", value1, value2, "career");
			return (Criteria) this;
		}
		
		public Criteria andCareerNotBetween(Integer value1, Integer value2) {
			addCriterion("career not between", value1, value2, "career");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineIsNull() {
			addCriterion("isonline is null");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineIsNotNull() {
			addCriterion("isonline is not null");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineEqualTo(Integer value) {
			addCriterion("isonline =", value, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineNotEqualTo(Integer value) {
			addCriterion("isonline <>", value, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineGreaterThan(Integer value) {
			addCriterion("isonline >", value, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineGreaterThanOrEqualTo(Integer value) {
			addCriterion("isonline >=", value, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineLessThan(Integer value) {
			addCriterion("isonline <", value, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineLessThanOrEqualTo(Integer value) {
			addCriterion("isonline <=", value, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineIn(List<Integer> values) {
			addCriterion("isonline in", values, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineNotIn(List<Integer> values) {
			addCriterion("isonline not in", values, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineBetween(Integer value1, Integer value2) {
			addCriterion("isonline between", value1, value2, "isonline");
			return (Criteria) this;
		}
		
		public Criteria andIsonlineNotBetween(Integer value1, Integer value2) {
			addCriterion("isonline not between", value1, value2, "isonline");
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
		
		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}
		
		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipIsNull() {
			addCriterion("lastloginip is null");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipIsNotNull() {
			addCriterion("lastloginip is not null");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipEqualTo(String value) {
			addCriterion("lastloginip =", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotEqualTo(String value) {
			addCriterion("lastloginip <>", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipGreaterThan(String value) {
			addCriterion("lastloginip >", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
			addCriterion("lastloginip >=", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipLessThan(String value) {
			addCriterion("lastloginip <", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipLessThanOrEqualTo(String value) {
			addCriterion("lastloginip <=", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipLike(String value) {
			addCriterion("lastloginip like", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotLike(String value) {
			addCriterion("lastloginip not like", value, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipIn(List<String> values) {
			addCriterion("lastloginip in", values, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotIn(List<String> values) {
			addCriterion("lastloginip not in", values, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipBetween(String value1, String value2) {
			addCriterion("lastloginip between", value1, value2, "lastloginip");
			return (Criteria) this;
		}
		
		public Criteria andLastloginipNotBetween(String value1, String value2) {
			addCriterion("lastloginip not between", value1, value2, "lastloginip");
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
		
		public Criteria andFristlogintimeIsNull() {
			addCriterion("fristlogintime is null");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeIsNotNull() {
			addCriterion("fristlogintime is not null");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeEqualTo(String value) {
			addCriterion("fristlogintime =", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeNotEqualTo(String value) {
			addCriterion("fristlogintime <>", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeGreaterThan(String value) {
			addCriterion("fristlogintime >", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeGreaterThanOrEqualTo(String value) {
			addCriterion("fristlogintime >=", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeLessThan(String value) {
			addCriterion("fristlogintime <", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeLessThanOrEqualTo(String value) {
			addCriterion("fristlogintime <=", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeLike(String value) {
			addCriterion("fristlogintime like", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeNotLike(String value) {
			addCriterion("fristlogintime not like", value, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeIn(List<String> values) {
			addCriterion("fristlogintime in", values, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeNotIn(List<String> values) {
			addCriterion("fristlogintime not in", values, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeBetween(String value1, String value2) {
			addCriterion("fristlogintime between", value1, value2, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andFristlogintimeNotBetween(String value1, String value2) {
			addCriterion("fristlogintime not between", value1, value2, "fristlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIsNull() {
			addCriterion("lastlogintime is null");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIsNotNull() {
			addCriterion("lastlogintime is not null");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeEqualTo(String value) {
			addCriterion("lastlogintime =", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotEqualTo(String value) {
			addCriterion("lastlogintime <>", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeGreaterThan(String value) {
			addCriterion("lastlogintime >", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeGreaterThanOrEqualTo(String value) {
			addCriterion("lastlogintime >=", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLessThan(String value) {
			addCriterion("lastlogintime <", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLessThanOrEqualTo(String value) {
			addCriterion("lastlogintime <=", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeLike(String value) {
			addCriterion("lastlogintime like", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotLike(String value) {
			addCriterion("lastlogintime not like", value, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeIn(List<String> values) {
			addCriterion("lastlogintime in", values, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotIn(List<String> values) {
			addCriterion("lastlogintime not in", values, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeBetween(String value1, String value2) {
			addCriterion("lastlogintime between", value1, value2, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andLastlogintimeNotBetween(String value1, String value2) {
			addCriterion("lastlogintime not between", value1, value2, "lastlogintime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIsNull() {
			addCriterion("regtime is null");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIsNotNull() {
			addCriterion("regtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeEqualTo(String value) {
			addCriterion("regtime =", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotEqualTo(String value) {
			addCriterion("regtime <>", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeGreaterThan(String value) {
			addCriterion("regtime >", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeGreaterThanOrEqualTo(String value) {
			addCriterion("regtime >=", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLessThan(String value) {
			addCriterion("regtime <", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLessThanOrEqualTo(String value) {
			addCriterion("regtime <=", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeLike(String value) {
			addCriterion("regtime like", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotLike(String value) {
			addCriterion("regtime not like", value, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeIn(List<String> values) {
			addCriterion("regtime in", values, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotIn(List<String> values) {
			addCriterion("regtime not in", values, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeBetween(String value1, String value2) {
			addCriterion("regtime between", value1, value2, "regtime");
			return (Criteria) this;
		}
		
		public Criteria andRegtimeNotBetween(String value1, String value2) {
			addCriterion("regtime not between", value1, value2, "regtime");
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
		
		public Criteria andTotalonlineIsNull() {
			addCriterion("totalonline is null");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineIsNotNull() {
			addCriterion("totalonline is not null");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineEqualTo(Integer value) {
			addCriterion("totalonline =", value, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineNotEqualTo(Integer value) {
			addCriterion("totalonline <>", value, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineGreaterThan(Integer value) {
			addCriterion("totalonline >", value, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineGreaterThanOrEqualTo(Integer value) {
			addCriterion("totalonline >=", value, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineLessThan(Integer value) {
			addCriterion("totalonline <", value, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineLessThanOrEqualTo(Integer value) {
			addCriterion("totalonline <=", value, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineIn(List<Integer> values) {
			addCriterion("totalonline in", values, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineNotIn(List<Integer> values) {
			addCriterion("totalonline not in", values, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineBetween(Integer value1, Integer value2) {
			addCriterion("totalonline between", value1, value2, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalonlineNotBetween(Integer value1, Integer value2) {
			addCriterion("totalonline not between", value1, value2, "totalonline");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeIsNull() {
			addCriterion("totalconsume is null");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeIsNotNull() {
			addCriterion("totalconsume is not null");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeEqualTo(Double value) {
			addCriterion("totalconsume =", value, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeNotEqualTo(Double value) {
			addCriterion("totalconsume <>", value, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeGreaterThan(Double value) {
			addCriterion("totalconsume >", value, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeGreaterThanOrEqualTo(Double value) {
			addCriterion("totalconsume >=", value, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeLessThan(Double value) {
			addCriterion("totalconsume <", value, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeLessThanOrEqualTo(Double value) {
			addCriterion("totalconsume <=", value, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeIn(List<Double> values) {
			addCriterion("totalconsume in", values, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeNotIn(List<Double> values) {
			addCriterion("totalconsume not in", values, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeBetween(Double value1, Double value2) {
			addCriterion("totalconsume between", value1, value2, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andTotalconsumeNotBetween(Double value1, Double value2) {
			addCriterion("totalconsume not between", value1, value2, "totalconsume");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeIsNull() {
			addCriterion("vipgrade is null");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeIsNotNull() {
			addCriterion("vipgrade is not null");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeEqualTo(Integer value) {
			addCriterion("vipgrade =", value, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeNotEqualTo(Integer value) {
			addCriterion("vipgrade <>", value, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeGreaterThan(Integer value) {
			addCriterion("vipgrade >", value, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeGreaterThanOrEqualTo(Integer value) {
			addCriterion("vipgrade >=", value, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeLessThan(Integer value) {
			addCriterion("vipgrade <", value, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeLessThanOrEqualTo(Integer value) {
			addCriterion("vipgrade <=", value, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeIn(List<Integer> values) {
			addCriterion("vipgrade in", values, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeNotIn(List<Integer> values) {
			addCriterion("vipgrade not in", values, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeBetween(Integer value1, Integer value2) {
			addCriterion("vipgrade between", value1, value2, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andVipgradeNotBetween(Integer value1, Integer value2) {
			addCriterion("vipgrade not between", value1, value2, "vipgrade");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeIsNull() {
			addCriterion("fristpaytime is null");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeIsNotNull() {
			addCriterion("fristpaytime is not null");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeEqualTo(String value) {
			addCriterion("fristpaytime =", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeNotEqualTo(String value) {
			addCriterion("fristpaytime <>", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeGreaterThan(String value) {
			addCriterion("fristpaytime >", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeGreaterThanOrEqualTo(String value) {
			addCriterion("fristpaytime >=", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeLessThan(String value) {
			addCriterion("fristpaytime <", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeLessThanOrEqualTo(String value) {
			addCriterion("fristpaytime <=", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeLike(String value) {
			addCriterion("fristpaytime like", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeNotLike(String value) {
			addCriterion("fristpaytime not like", value, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeIn(List<String> values) {
			addCriterion("fristpaytime in", values, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeNotIn(List<String> values) {
			addCriterion("fristpaytime not in", values, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeBetween(String value1, String value2) {
			addCriterion("fristpaytime between", value1, value2, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andFristpaytimeNotBetween(String value1, String value2) {
			addCriterion("fristpaytime not between", value1, value2, "fristpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeIsNull() {
			addCriterion("lastpaytime is null");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeIsNotNull() {
			addCriterion("lastpaytime is not null");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeEqualTo(String value) {
			addCriterion("lastpaytime =", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeNotEqualTo(String value) {
			addCriterion("lastpaytime <>", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeGreaterThan(String value) {
			addCriterion("lastpaytime >", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeGreaterThanOrEqualTo(String value) {
			addCriterion("lastpaytime >=", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeLessThan(String value) {
			addCriterion("lastpaytime <", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeLessThanOrEqualTo(String value) {
			addCriterion("lastpaytime <=", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeLike(String value) {
			addCriterion("lastpaytime like", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeNotLike(String value) {
			addCriterion("lastpaytime not like", value, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeIn(List<String> values) {
			addCriterion("lastpaytime in", values, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeNotIn(List<String> values) {
			addCriterion("lastpaytime not in", values, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeBetween(String value1, String value2) {
			addCriterion("lastpaytime between", value1, value2, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andLastpaytimeNotBetween(String value1, String value2) {
			addCriterion("lastpaytime not between", value1, value2, "lastpaytime");
			return (Criteria) this;
		}
		
		public Criteria andOptidIsNull() {
			addCriterion("optid is null");
			return (Criteria) this;
		}
		
		public Criteria andOptidIsNotNull() {
			addCriterion("optid is not null");
			return (Criteria) this;
		}
		
		public Criteria andOptidEqualTo(String value) {
			addCriterion("optid =", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotEqualTo(String value) {
			addCriterion("optid <>", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidGreaterThan(String value) {
			addCriterion("optid >", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidGreaterThanOrEqualTo(String value) {
			addCriterion("optid >=", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidLessThan(String value) {
			addCriterion("optid <", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidLessThanOrEqualTo(String value) {
			addCriterion("optid <=", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidLike(String value) {
			addCriterion("optid like", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotLike(String value) {
			addCriterion("optid not like", value, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidIn(List<String> values) {
			addCriterion("optid in", values, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotIn(List<String> values) {
			addCriterion("optid not in", values, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidBetween(String value1, String value2) {
			addCriterion("optid between", value1, value2, "optid");
			return (Criteria) this;
		}
		
		public Criteria andOptidNotBetween(String value1, String value2) {
			addCriterion("optid not between", value1, value2, "optid");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumIsNull() {
			addCriterion("guidenum is null");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumIsNotNull() {
			addCriterion("guidenum is not null");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumEqualTo(String value) {
			addCriterion("guidenum =", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumNotEqualTo(String value) {
			addCriterion("guidenum <>", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumGreaterThan(String value) {
			addCriterion("guidenum >", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumGreaterThanOrEqualTo(String value) {
			addCriterion("guidenum >=", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumLessThan(String value) {
			addCriterion("guidenum <", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumLessThanOrEqualTo(String value) {
			addCriterion("guidenum <=", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumLike(String value) {
			addCriterion("guidenum like", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumNotLike(String value) {
			addCriterion("guidenum not like", value, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumIn(List<String> values) {
			addCriterion("guidenum in", values, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumNotIn(List<String> values) {
			addCriterion("guidenum not in", values, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumBetween(String value1, String value2) {
			addCriterion("guidenum between", value1, value2, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andGuidenumNotBetween(String value1, String value2) {
			addCriterion("guidenum not between", value1, value2, "guidenum");
			return (Criteria) this;
		}
		
		public Criteria andSfromIsNull() {
			addCriterion("sfrom is null");
			return (Criteria) this;
		}
		
		public Criteria andSfromIsNotNull() {
			addCriterion("sfrom is not null");
			return (Criteria) this;
		}
		
		public Criteria andSfromEqualTo(String value) {
			addCriterion("sfrom =", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotEqualTo(String value) {
			addCriterion("sfrom <>", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromGreaterThan(String value) {
			addCriterion("sfrom >", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromGreaterThanOrEqualTo(String value) {
			addCriterion("sfrom >=", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromLessThan(String value) {
			addCriterion("sfrom <", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromLessThanOrEqualTo(String value) {
			addCriterion("sfrom <=", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromLike(String value) {
			addCriterion("sfrom like", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotLike(String value) {
			addCriterion("sfrom not like", value, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromIn(List<String> values) {
			addCriterion("sfrom in", values, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotIn(List<String> values) {
			addCriterion("sfrom not in", values, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromBetween(String value1, String value2) {
			addCriterion("sfrom between", value1, value2, "sfrom");
			return (Criteria) this;
		}
		
		public Criteria andSfromNotBetween(String value1, String value2) {
			addCriterion("sfrom not between", value1, value2, "sfrom");
			return (Criteria) this;
		}
        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }
    }

    /**
     * op_oss_qlz_passport
     */
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