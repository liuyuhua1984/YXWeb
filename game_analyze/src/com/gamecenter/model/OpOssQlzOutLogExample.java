package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssQlzOutLogExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssQlzOutLogExample() {
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
		
		public Criteria andUseripIsNull() {
			addCriterion("userip is null");
			return (Criteria) this;
		}
		
		public Criteria andUseripIsNotNull() {
			addCriterion("userip is not null");
			return (Criteria) this;
		}
		
		public Criteria andUseripEqualTo(String value) {
			addCriterion("userip =", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotEqualTo(String value) {
			addCriterion("userip <>", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripGreaterThan(String value) {
			addCriterion("userip >", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripGreaterThanOrEqualTo(String value) {
			addCriterion("userip >=", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripLessThan(String value) {
			addCriterion("userip <", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripLessThanOrEqualTo(String value) {
			addCriterion("userip <=", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripLike(String value) {
			addCriterion("userip like", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotLike(String value) {
			addCriterion("userip not like", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripIn(List<String> values) {
			addCriterion("userip in", values, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotIn(List<String> values) {
			addCriterion("userip not in", values, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripBetween(String value1, String value2) {
			addCriterion("userip between", value1, value2, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotBetween(String value1, String value2) {
			addCriterion("userip not between", value1, value2, "userip");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeIsNull() {
			addCriterion("outtime is null");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeIsNotNull() {
			addCriterion("outtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeEqualTo(String value) {
			addCriterion("outtime =", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeNotEqualTo(String value) {
			addCriterion("outtime <>", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeGreaterThan(String value) {
			addCriterion("outtime >", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeGreaterThanOrEqualTo(String value) {
			addCriterion("outtime >=", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeLessThan(String value) {
			addCriterion("outtime <", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeLessThanOrEqualTo(String value) {
			addCriterion("outtime <=", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeLike(String value) {
			addCriterion("outtime like", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeNotLike(String value) {
			addCriterion("outtime not like", value, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeIn(List<String> values) {
			addCriterion("outtime in", values, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeNotIn(List<String> values) {
			addCriterion("outtime not in", values, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeBetween(String value1, String value2) {
			addCriterion("outtime between", value1, value2, "outtime");
			return (Criteria) this;
		}
		
		public Criteria andOuttimeNotBetween(String value1, String value2) {
			addCriterion("outtime not between", value1, value2, "outtime");
			return (Criteria) this;
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
		
		public Criteria andOnlinetimeIsNull() {
			addCriterion("onlinetime is null");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeIsNotNull() {
			addCriterion("onlinetime is not null");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeEqualTo(Integer value) {
			addCriterion("onlinetime =", value, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeNotEqualTo(Integer value) {
			addCriterion("onlinetime <>", value, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeGreaterThan(Integer value) {
			addCriterion("onlinetime >", value, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("onlinetime >=", value, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeLessThan(Integer value) {
			addCriterion("onlinetime <", value, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeLessThanOrEqualTo(Integer value) {
			addCriterion("onlinetime <=", value, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeIn(List<Integer> values) {
			addCriterion("onlinetime in", values, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeNotIn(List<Integer> values) {
			addCriterion("onlinetime not in", values, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeBetween(Integer value1, Integer value2) {
			addCriterion("onlinetime between", value1, value2, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andOnlinetimeNotBetween(Integer value1, Integer value2) {
			addCriterion("onlinetime not between", value1, value2, "onlinetime");
			return (Criteria) this;
		}
		
		public Criteria andLevelIsNull() {
			addCriterion("level is null");
			return (Criteria) this;
		}
		
		public Criteria andLevelIsNotNull() {
			addCriterion("level is not null");
			return (Criteria) this;
		}
		
		public Criteria andLevelEqualTo(Integer value) {
			addCriterion("level =", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelNotEqualTo(Integer value) {
			addCriterion("level <>", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelGreaterThan(Integer value) {
			addCriterion("level >", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("level >=", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelLessThan(Integer value) {
			addCriterion("level <", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelLessThanOrEqualTo(Integer value) {
			addCriterion("level <=", value, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelIn(List<Integer> values) {
			addCriterion("level in", values, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelNotIn(List<Integer> values) {
			addCriterion("level not in", values, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelBetween(Integer value1, Integer value2) {
			addCriterion("level between", value1, value2, "level");
			return (Criteria) this;
		}
		
		public Criteria andLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("level not between", value1, value2, "level");
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
		
		public Criteria andAddtimeIsNull() {
			addCriterion("addtime is null");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeIsNotNull() {
			addCriterion("addtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeEqualTo(String value) {
			addCriterion("addtime =", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotEqualTo(String value) {
			addCriterion("addtime <>", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeGreaterThan(String value) {
			addCriterion("addtime >", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
			addCriterion("addtime >=", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeLessThan(String value) {
			addCriterion("addtime <", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeLessThanOrEqualTo(String value) {
			addCriterion("addtime <=", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeLike(String value) {
			addCriterion("addtime like", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotLike(String value) {
			addCriterion("addtime not like", value, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeIn(List<String> values) {
			addCriterion("addtime in", values, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotIn(List<String> values) {
			addCriterion("addtime not in", values, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeBetween(String value1, String value2) {
			addCriterion("addtime between", value1, value2, "addtime");
			return (Criteria) this;
		}
		
		public Criteria andAddtimeNotBetween(String value1, String value2) {
			addCriterion("addtime not between", value1, value2, "addtime");
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
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andUseripLikeInsensitive(String value) {
			addCriterion("upper(userip) like", value.toUpperCase(), "userip");
			return this;
		}
		
		public Criteria andOuttimeLikeInsensitive(String value) {
			addCriterion("upper(outtime) like", value.toUpperCase(), "outtime");
			return this;
		}
		
		public Criteria andOpenidLikeInsensitive(String value) {
			addCriterion("upper(openid) like", value.toUpperCase(), "openid");
			return this;
		}
		
		public Criteria andRolenameLikeInsensitive(String value) {
			addCriterion("upper(rolename) like", value.toUpperCase(), "rolename");
			return this;
		}
		
		public Criteria andAddtimeLikeInsensitive(String value) {
			addCriterion("upper(addtime) like", value.toUpperCase(), "addtime");
			return this;
		}
		
		public Criteria andGuidenumLikeInsensitive(String value) {
			addCriterion("upper(guidenum) like", value.toUpperCase(), "guidenum");
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