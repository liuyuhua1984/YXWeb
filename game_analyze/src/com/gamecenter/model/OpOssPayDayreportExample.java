package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssPayDayreportExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssPayDayreportExample() {
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
		
		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}
		
		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}
		
		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
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
		
		public Criteria andCtimeIsNull() {
			addCriterion("ctime is null");
			return (Criteria) this;
		}
		
		public Criteria andCtimeIsNotNull() {
			addCriterion("ctime is not null");
			return (Criteria) this;
		}
		
		public Criteria andCtimeEqualTo(String value) {
			addCriterion("ctime =", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotEqualTo(String value) {
			addCriterion("ctime <>", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeGreaterThan(String value) {
			addCriterion("ctime >", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeGreaterThanOrEqualTo(String value) {
			addCriterion("ctime >=", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeLessThan(String value) {
			addCriterion("ctime <", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeLessThanOrEqualTo(String value) {
			addCriterion("ctime <=", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeLike(String value) {
			addCriterion("ctime like", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotLike(String value) {
			addCriterion("ctime not like", value, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeIn(List<String> values) {
			addCriterion("ctime in", values, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotIn(List<String> values) {
			addCriterion("ctime not in", values, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeBetween(String value1, String value2) {
			addCriterion("ctime between", value1, value2, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andCtimeNotBetween(String value1, String value2) {
			addCriterion("ctime not between", value1, value2, "ctime");
			return (Criteria) this;
		}
		
		public Criteria andApaIsNull() {
			addCriterion("apa is null");
			return (Criteria) this;
		}
		
		public Criteria andApaIsNotNull() {
			addCriterion("apa is not null");
			return (Criteria) this;
		}
		
		public Criteria andApaEqualTo(Integer value) {
			addCriterion("apa =", value, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaNotEqualTo(Integer value) {
			addCriterion("apa <>", value, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaGreaterThan(Integer value) {
			addCriterion("apa >", value, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaGreaterThanOrEqualTo(Integer value) {
			addCriterion("apa >=", value, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaLessThan(Integer value) {
			addCriterion("apa <", value, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaLessThanOrEqualTo(Integer value) {
			addCriterion("apa <=", value, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaIn(List<Integer> values) {
			addCriterion("apa in", values, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaNotIn(List<Integer> values) {
			addCriterion("apa not in", values, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaBetween(Integer value1, Integer value2) {
			addCriterion("apa between", value1, value2, "apa");
			return (Criteria) this;
		}
		
		public Criteria andApaNotBetween(Integer value1, Integer value2) {
			addCriterion("apa not between", value1, value2, "apa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaIsNull() {
			addCriterion("newapa is null");
			return (Criteria) this;
		}
		
		public Criteria andNewapaIsNotNull() {
			addCriterion("newapa is not null");
			return (Criteria) this;
		}
		
		public Criteria andNewapaEqualTo(Integer value) {
			addCriterion("newapa =", value, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaNotEqualTo(Integer value) {
			addCriterion("newapa <>", value, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaGreaterThan(Integer value) {
			addCriterion("newapa >", value, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaGreaterThanOrEqualTo(Integer value) {
			addCriterion("newapa >=", value, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaLessThan(Integer value) {
			addCriterion("newapa <", value, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaLessThanOrEqualTo(Integer value) {
			addCriterion("newapa <=", value, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaIn(List<Integer> values) {
			addCriterion("newapa in", values, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaNotIn(List<Integer> values) {
			addCriterion("newapa not in", values, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaBetween(Integer value1, Integer value2) {
			addCriterion("newapa between", value1, value2, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andNewapaNotBetween(Integer value1, Integer value2) {
			addCriterion("newapa not between", value1, value2, "newapa");
			return (Criteria) this;
		}
		
		public Criteria andTotalIsNull() {
			addCriterion("total is null");
			return (Criteria) this;
		}
		
		public Criteria andTotalIsNotNull() {
			addCriterion("total is not null");
			return (Criteria) this;
		}
		
		public Criteria andTotalEqualTo(Double value) {
			addCriterion("total =", value, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalNotEqualTo(Double value) {
			addCriterion("total <>", value, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalGreaterThan(Double value) {
			addCriterion("total >", value, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalGreaterThanOrEqualTo(Double value) {
			addCriterion("total >=", value, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalLessThan(Double value) {
			addCriterion("total <", value, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalLessThanOrEqualTo(Double value) {
			addCriterion("total <=", value, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalIn(List<Double> values) {
			addCriterion("total in", values, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalNotIn(List<Double> values) {
			addCriterion("total not in", values, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalBetween(Double value1, Double value2) {
			addCriterion("total between", value1, value2, "total");
			return (Criteria) this;
		}
		
		public Criteria andTotalNotBetween(Double value1, Double value2) {
			addCriterion("total not between", value1, value2, "total");
			return (Criteria) this;
		}
		
		public Criteria andArpuIsNull() {
			addCriterion("arpu is null");
			return (Criteria) this;
		}
		
		public Criteria andArpuIsNotNull() {
			addCriterion("arpu is not null");
			return (Criteria) this;
		}
		
		public Criteria andArpuEqualTo(Double value) {
			addCriterion("arpu =", value, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuNotEqualTo(Double value) {
			addCriterion("arpu <>", value, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuGreaterThan(Double value) {
			addCriterion("arpu >", value, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuGreaterThanOrEqualTo(Double value) {
			addCriterion("arpu >=", value, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuLessThan(Double value) {
			addCriterion("arpu <", value, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuLessThanOrEqualTo(Double value) {
			addCriterion("arpu <=", value, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuIn(List<Double> values) {
			addCriterion("arpu in", values, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuNotIn(List<Double> values) {
			addCriterion("arpu not in", values, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuBetween(Double value1, Double value2) {
			addCriterion("arpu between", value1, value2, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andArpuNotBetween(Double value1, Double value2) {
			addCriterion("arpu not between", value1, value2, "arpu");
			return (Criteria) this;
		}
		
		public Criteria andPayperIsNull() {
			addCriterion("payper is null");
			return (Criteria) this;
		}
		
		public Criteria andPayperIsNotNull() {
			addCriterion("payper is not null");
			return (Criteria) this;
		}
		
		public Criteria andPayperEqualTo(Double value) {
			addCriterion("payper =", value, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperNotEqualTo(Double value) {
			addCriterion("payper <>", value, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperGreaterThan(Double value) {
			addCriterion("payper >", value, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperGreaterThanOrEqualTo(Double value) {
			addCriterion("payper >=", value, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperLessThan(Double value) {
			addCriterion("payper <", value, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperLessThanOrEqualTo(Double value) {
			addCriterion("payper <=", value, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperIn(List<Double> values) {
			addCriterion("payper in", values, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperNotIn(List<Double> values) {
			addCriterion("payper not in", values, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperBetween(Double value1, Double value2) {
			addCriterion("payper between", value1, value2, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPayperNotBetween(Double value1, Double value2) {
			addCriterion("payper not between", value1, value2, "payper");
			return (Criteria) this;
		}
		
		public Criteria andPaycountIsNull() {
			addCriterion("paycount is null");
			return (Criteria) this;
		}
		
		public Criteria andPaycountIsNotNull() {
			addCriterion("paycount is not null");
			return (Criteria) this;
		}
		
		public Criteria andPaycountEqualTo(Integer value) {
			addCriterion("paycount =", value, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountNotEqualTo(Integer value) {
			addCriterion("paycount <>", value, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountGreaterThan(Integer value) {
			addCriterion("paycount >", value, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountGreaterThanOrEqualTo(Integer value) {
			addCriterion("paycount >=", value, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountLessThan(Integer value) {
			addCriterion("paycount <", value, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountLessThanOrEqualTo(Integer value) {
			addCriterion("paycount <=", value, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountIn(List<Integer> values) {
			addCriterion("paycount in", values, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountNotIn(List<Integer> values) {
			addCriterion("paycount not in", values, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountBetween(Integer value1, Integer value2) {
			addCriterion("paycount between", value1, value2, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andPaycountNotBetween(Integer value1, Integer value2) {
			addCriterion("paycount not between", value1, value2, "paycount");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayIsNull() {
			addCriterion("maxpay is null");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayIsNotNull() {
			addCriterion("maxpay is not null");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayEqualTo(Double value) {
			addCriterion("maxpay =", value, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayNotEqualTo(Double value) {
			addCriterion("maxpay <>", value, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayGreaterThan(Double value) {
			addCriterion("maxpay >", value, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayGreaterThanOrEqualTo(Double value) {
			addCriterion("maxpay >=", value, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayLessThan(Double value) {
			addCriterion("maxpay <", value, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayLessThanOrEqualTo(Double value) {
			addCriterion("maxpay <=", value, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayIn(List<Double> values) {
			addCriterion("maxpay in", values, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayNotIn(List<Double> values) {
			addCriterion("maxpay not in", values, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayBetween(Double value1, Double value2) {
			addCriterion("maxpay between", value1, value2, "maxpay");
			return (Criteria) this;
		}
		
		public Criteria andMaxpayNotBetween(Double value1, Double value2) {
			addCriterion("maxpay not between", value1, value2, "maxpay");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andOptidLikeInsensitive(String value) {
			addCriterion("upper(optid) like", value.toUpperCase(), "optid");
			return this;
		}
		
		public Criteria andSfromLikeInsensitive(String value) {
			addCriterion("upper(sfrom) like", value.toUpperCase(), "sfrom");
			return this;
		}
		
		public Criteria andCtimeLikeInsensitive(String value) {
			addCriterion("upper(ctime) like", value.toUpperCase(), "ctime");
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