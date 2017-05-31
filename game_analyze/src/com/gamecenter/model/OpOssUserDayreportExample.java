package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssUserDayreportExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssUserDayreportExample() {
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
		
		public Criteria andRegnumIsNull() {
			addCriterion("regnum is null");
			return (Criteria) this;
		}
		
		public Criteria andRegnumIsNotNull() {
			addCriterion("regnum is not null");
			return (Criteria) this;
		}
		
		public Criteria andRegnumEqualTo(Integer value) {
			addCriterion("regnum =", value, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumNotEqualTo(Integer value) {
			addCriterion("regnum <>", value, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumGreaterThan(Integer value) {
			addCriterion("regnum >", value, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("regnum >=", value, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumLessThan(Integer value) {
			addCriterion("regnum <", value, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumLessThanOrEqualTo(Integer value) {
			addCriterion("regnum <=", value, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumIn(List<Integer> values) {
			addCriterion("regnum in", values, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumNotIn(List<Integer> values) {
			addCriterion("regnum not in", values, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumBetween(Integer value1, Integer value2) {
			addCriterion("regnum between", value1, value2, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andRegnumNotBetween(Integer value1, Integer value2) {
			addCriterion("regnum not between", value1, value2, "regnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumIsNull() {
			addCriterion("createnum is null");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumIsNotNull() {
			addCriterion("createnum is not null");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumEqualTo(Integer value) {
			addCriterion("createnum =", value, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumNotEqualTo(Integer value) {
			addCriterion("createnum <>", value, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumGreaterThan(Integer value) {
			addCriterion("createnum >", value, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumGreaterThanOrEqualTo(Integer value) {
			addCriterion("createnum >=", value, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumLessThan(Integer value) {
			addCriterion("createnum <", value, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumLessThanOrEqualTo(Integer value) {
			addCriterion("createnum <=", value, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumIn(List<Integer> values) {
			addCriterion("createnum in", values, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumNotIn(List<Integer> values) {
			addCriterion("createnum not in", values, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumBetween(Integer value1, Integer value2) {
			addCriterion("createnum between", value1, value2, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andCreatenumNotBetween(Integer value1, Integer value2) {
			addCriterion("createnum not between", value1, value2, "createnum");
			return (Criteria) this;
		}
		
		public Criteria andDauIsNull() {
			addCriterion("dau is null");
			return (Criteria) this;
		}
		
		public Criteria andDauIsNotNull() {
			addCriterion("dau is not null");
			return (Criteria) this;
		}
		
		public Criteria andDauEqualTo(Integer value) {
			addCriterion("dau =", value, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauNotEqualTo(Integer value) {
			addCriterion("dau <>", value, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauGreaterThan(Integer value) {
			addCriterion("dau >", value, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauGreaterThanOrEqualTo(Integer value) {
			addCriterion("dau >=", value, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauLessThan(Integer value) {
			addCriterion("dau <", value, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauLessThanOrEqualTo(Integer value) {
			addCriterion("dau <=", value, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauIn(List<Integer> values) {
			addCriterion("dau in", values, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauNotIn(List<Integer> values) {
			addCriterion("dau not in", values, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauBetween(Integer value1, Integer value2) {
			addCriterion("dau between", value1, value2, "dau");
			return (Criteria) this;
		}
		
		public Criteria andDauNotBetween(Integer value1, Integer value2) {
			addCriterion("dau not between", value1, value2, "dau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauIsNull() {
			addCriterion("newdau is null");
			return (Criteria) this;
		}
		
		public Criteria andNewdauIsNotNull() {
			addCriterion("newdau is not null");
			return (Criteria) this;
		}
		
		public Criteria andNewdauEqualTo(Integer value) {
			addCriterion("newdau =", value, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauNotEqualTo(Integer value) {
			addCriterion("newdau <>", value, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauGreaterThan(Integer value) {
			addCriterion("newdau >", value, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauGreaterThanOrEqualTo(Integer value) {
			addCriterion("newdau >=", value, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauLessThan(Integer value) {
			addCriterion("newdau <", value, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauLessThanOrEqualTo(Integer value) {
			addCriterion("newdau <=", value, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauIn(List<Integer> values) {
			addCriterion("newdau in", values, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauNotIn(List<Integer> values) {
			addCriterion("newdau not in", values, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauBetween(Integer value1, Integer value2) {
			addCriterion("newdau between", value1, value2, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andNewdauNotBetween(Integer value1, Integer value2) {
			addCriterion("newdau not between", value1, value2, "newdau");
			return (Criteria) this;
		}
		
		public Criteria andAcuIsNull() {
			addCriterion("acu is null");
			return (Criteria) this;
		}
		
		public Criteria andAcuIsNotNull() {
			addCriterion("acu is not null");
			return (Criteria) this;
		}
		
		public Criteria andAcuEqualTo(Integer value) {
			addCriterion("acu =", value, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuNotEqualTo(Integer value) {
			addCriterion("acu <>", value, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuGreaterThan(Integer value) {
			addCriterion("acu >", value, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuGreaterThanOrEqualTo(Integer value) {
			addCriterion("acu >=", value, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuLessThan(Integer value) {
			addCriterion("acu <", value, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuLessThanOrEqualTo(Integer value) {
			addCriterion("acu <=", value, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuIn(List<Integer> values) {
			addCriterion("acu in", values, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuNotIn(List<Integer> values) {
			addCriterion("acu not in", values, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuBetween(Integer value1, Integer value2) {
			addCriterion("acu between", value1, value2, "acu");
			return (Criteria) this;
		}
		
		public Criteria andAcuNotBetween(Integer value1, Integer value2) {
			addCriterion("acu not between", value1, value2, "acu");
			return (Criteria) this;
		}
		
		public Criteria andPcuIsNull() {
			addCriterion("pcu is null");
			return (Criteria) this;
		}
		
		public Criteria andPcuIsNotNull() {
			addCriterion("pcu is not null");
			return (Criteria) this;
		}
		
		public Criteria andPcuEqualTo(Integer value) {
			addCriterion("pcu =", value, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuNotEqualTo(Integer value) {
			addCriterion("pcu <>", value, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuGreaterThan(Integer value) {
			addCriterion("pcu >", value, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuGreaterThanOrEqualTo(Integer value) {
			addCriterion("pcu >=", value, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuLessThan(Integer value) {
			addCriterion("pcu <", value, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuLessThanOrEqualTo(Integer value) {
			addCriterion("pcu <=", value, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuIn(List<Integer> values) {
			addCriterion("pcu in", values, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuNotIn(List<Integer> values) {
			addCriterion("pcu not in", values, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuBetween(Integer value1, Integer value2) {
			addCriterion("pcu between", value1, value2, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andPcuNotBetween(Integer value1, Integer value2) {
			addCriterion("pcu not between", value1, value2, "pcu");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeIsNull() {
			addCriterion("maxtime is null");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeIsNotNull() {
			addCriterion("maxtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeEqualTo(Integer value) {
			addCriterion("maxtime =", value, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeNotEqualTo(Integer value) {
			addCriterion("maxtime <>", value, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeGreaterThan(Integer value) {
			addCriterion("maxtime >", value, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("maxtime >=", value, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeLessThan(Integer value) {
			addCriterion("maxtime <", value, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeLessThanOrEqualTo(Integer value) {
			addCriterion("maxtime <=", value, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeIn(List<Integer> values) {
			addCriterion("maxtime in", values, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeNotIn(List<Integer> values) {
			addCriterion("maxtime not in", values, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeBetween(Integer value1, Integer value2) {
			addCriterion("maxtime between", value1, value2, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andMaxtimeNotBetween(Integer value1, Integer value2) {
			addCriterion("maxtime not between", value1, value2, "maxtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeIsNull() {
			addCriterion("avgtime is null");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeIsNotNull() {
			addCriterion("avgtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeEqualTo(Integer value) {
			addCriterion("avgtime =", value, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeNotEqualTo(Integer value) {
			addCriterion("avgtime <>", value, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeGreaterThan(Integer value) {
			addCriterion("avgtime >", value, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("avgtime >=", value, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeLessThan(Integer value) {
			addCriterion("avgtime <", value, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeLessThanOrEqualTo(Integer value) {
			addCriterion("avgtime <=", value, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeIn(List<Integer> values) {
			addCriterion("avgtime in", values, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeNotIn(List<Integer> values) {
			addCriterion("avgtime not in", values, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeBetween(Integer value1, Integer value2) {
			addCriterion("avgtime between", value1, value2, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgtimeNotBetween(Integer value1, Integer value2) {
			addCriterion("avgtime not between", value1, value2, "avgtime");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginIsNull() {
			addCriterion("avglogin is null");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginIsNotNull() {
			addCriterion("avglogin is not null");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginEqualTo(Integer value) {
			addCriterion("avglogin =", value, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginNotEqualTo(Integer value) {
			addCriterion("avglogin <>", value, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginGreaterThan(Integer value) {
			addCriterion("avglogin >", value, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginGreaterThanOrEqualTo(Integer value) {
			addCriterion("avglogin >=", value, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginLessThan(Integer value) {
			addCriterion("avglogin <", value, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginLessThanOrEqualTo(Integer value) {
			addCriterion("avglogin <=", value, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginIn(List<Integer> values) {
			addCriterion("avglogin in", values, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginNotIn(List<Integer> values) {
			addCriterion("avglogin not in", values, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginBetween(Integer value1, Integer value2) {
			addCriterion("avglogin between", value1, value2, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andAvgloginNotBetween(Integer value1, Integer value2) {
			addCriterion("avglogin not between", value1, value2, "avglogin");
			return (Criteria) this;
		}
		
		public Criteria andCreateperIsNull() {
			addCriterion("createper is null");
			return (Criteria) this;
		}
		
		public Criteria andCreateperIsNotNull() {
			addCriterion("createper is not null");
			return (Criteria) this;
		}
		
		public Criteria andCreateperEqualTo(Double value) {
			addCriterion("createper =", value, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperNotEqualTo(Double value) {
			addCriterion("createper <>", value, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperGreaterThan(Double value) {
			addCriterion("createper >", value, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperGreaterThanOrEqualTo(Double value) {
			addCriterion("createper >=", value, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperLessThan(Double value) {
			addCriterion("createper <", value, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperLessThanOrEqualTo(Double value) {
			addCriterion("createper <=", value, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperIn(List<Double> values) {
			addCriterion("createper in", values, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperNotIn(List<Double> values) {
			addCriterion("createper not in", values, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperBetween(Double value1, Double value2) {
			addCriterion("createper between", value1, value2, "createper");
			return (Criteria) this;
		}
		
		public Criteria andCreateperNotBetween(Double value1, Double value2) {
			addCriterion("createper not between", value1, value2, "createper");
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