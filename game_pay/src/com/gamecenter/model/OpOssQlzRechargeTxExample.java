package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssQlzRechargeTxExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssQlzRechargeTxExample() {
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
		
		public Criteria andBillnoIsNull() {
			addCriterion("billno is null");
			return (Criteria) this;
		}
		
		public Criteria andBillnoIsNotNull() {
			addCriterion("billno is not null");
			return (Criteria) this;
		}
		
		public Criteria andBillnoEqualTo(String value) {
			addCriterion("billno =", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotEqualTo(String value) {
			addCriterion("billno <>", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoGreaterThan(String value) {
			addCriterion("billno >", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoGreaterThanOrEqualTo(String value) {
			addCriterion("billno >=", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoLessThan(String value) {
			addCriterion("billno <", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoLessThanOrEqualTo(String value) {
			addCriterion("billno <=", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoLike(String value) {
			addCriterion("billno like", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotLike(String value) {
			addCriterion("billno not like", value, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoIn(List<String> values) {
			addCriterion("billno in", values, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotIn(List<String> values) {
			addCriterion("billno not in", values, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoBetween(String value1, String value2) {
			addCriterion("billno between", value1, value2, "billno");
			return (Criteria) this;
		}
		
		public Criteria andBillnoNotBetween(String value1, String value2) {
			addCriterion("billno not between", value1, value2, "billno");
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
		
		public Criteria andTsIsNull() {
			addCriterion("ts is null");
			return (Criteria) this;
		}
		
		public Criteria andTsIsNotNull() {
			addCriterion("ts is not null");
			return (Criteria) this;
		}
		
		public Criteria andTsEqualTo(String value) {
			addCriterion("ts =", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsNotEqualTo(String value) {
			addCriterion("ts <>", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsGreaterThan(String value) {
			addCriterion("ts >", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsGreaterThanOrEqualTo(String value) {
			addCriterion("ts >=", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsLessThan(String value) {
			addCriterion("ts <", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsLessThanOrEqualTo(String value) {
			addCriterion("ts <=", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsLike(String value) {
			addCriterion("ts like", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsNotLike(String value) {
			addCriterion("ts not like", value, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsIn(List<String> values) {
			addCriterion("ts in", values, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsNotIn(List<String> values) {
			addCriterion("ts not in", values, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsBetween(String value1, String value2) {
			addCriterion("ts between", value1, value2, "ts");
			return (Criteria) this;
		}
		
		public Criteria andTsNotBetween(String value1, String value2) {
			addCriterion("ts not between", value1, value2, "ts");
			return (Criteria) this;
		}
		
		public Criteria andPayitemIsNull() {
			addCriterion("payitem is null");
			return (Criteria) this;
		}
		
		public Criteria andPayitemIsNotNull() {
			addCriterion("payitem is not null");
			return (Criteria) this;
		}
		
		public Criteria andPayitemEqualTo(String value) {
			addCriterion("payitem =", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemNotEqualTo(String value) {
			addCriterion("payitem <>", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemGreaterThan(String value) {
			addCriterion("payitem >", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemGreaterThanOrEqualTo(String value) {
			addCriterion("payitem >=", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemLessThan(String value) {
			addCriterion("payitem <", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemLessThanOrEqualTo(String value) {
			addCriterion("payitem <=", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemLike(String value) {
			addCriterion("payitem like", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemNotLike(String value) {
			addCriterion("payitem not like", value, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemIn(List<String> values) {
			addCriterion("payitem in", values, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemNotIn(List<String> values) {
			addCriterion("payitem not in", values, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemBetween(String value1, String value2) {
			addCriterion("payitem between", value1, value2, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andPayitemNotBetween(String value1, String value2) {
			addCriterion("payitem not between", value1, value2, "payitem");
			return (Criteria) this;
		}
		
		public Criteria andTokenIsNull() {
			addCriterion("token is null");
			return (Criteria) this;
		}
		
		public Criteria andTokenIsNotNull() {
			addCriterion("token is not null");
			return (Criteria) this;
		}
		
		public Criteria andTokenEqualTo(String value) {
			addCriterion("token =", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenNotEqualTo(String value) {
			addCriterion("token <>", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenGreaterThan(String value) {
			addCriterion("token >", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenGreaterThanOrEqualTo(String value) {
			addCriterion("token >=", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenLessThan(String value) {
			addCriterion("token <", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenLessThanOrEqualTo(String value) {
			addCriterion("token <=", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenLike(String value) {
			addCriterion("token like", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenNotLike(String value) {
			addCriterion("token not like", value, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenIn(List<String> values) {
			addCriterion("token in", values, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenNotIn(List<String> values) {
			addCriterion("token not in", values, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenBetween(String value1, String value2) {
			addCriterion("token between", value1, value2, "token");
			return (Criteria) this;
		}
		
		public Criteria andTokenNotBetween(String value1, String value2) {
			addCriterion("token not between", value1, value2, "token");
			return (Criteria) this;
		}
		
		public Criteria andVersionIsNull() {
			addCriterion("version is null");
			return (Criteria) this;
		}
		
		public Criteria andVersionIsNotNull() {
			addCriterion("version is not null");
			return (Criteria) this;
		}
		
		public Criteria andVersionEqualTo(String value) {
			addCriterion("version =", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionNotEqualTo(String value) {
			addCriterion("version <>", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionGreaterThan(String value) {
			addCriterion("version >", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionGreaterThanOrEqualTo(String value) {
			addCriterion("version >=", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionLessThan(String value) {
			addCriterion("version <", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionLessThanOrEqualTo(String value) {
			addCriterion("version <=", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionLike(String value) {
			addCriterion("version like", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionNotLike(String value) {
			addCriterion("version not like", value, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionIn(List<String> values) {
			addCriterion("version in", values, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionNotIn(List<String> values) {
			addCriterion("version not in", values, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionBetween(String value1, String value2) {
			addCriterion("version between", value1, value2, "version");
			return (Criteria) this;
		}
		
		public Criteria andVersionNotBetween(String value1, String value2) {
			addCriterion("version not between", value1, value2, "version");
			return (Criteria) this;
		}
		
		public Criteria andZoneidIsNull() {
			addCriterion("zoneid is null");
			return (Criteria) this;
		}
		
		public Criteria andZoneidIsNotNull() {
			addCriterion("zoneid is not null");
			return (Criteria) this;
		}
		
		public Criteria andZoneidEqualTo(String value) {
			addCriterion("zoneid =", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidNotEqualTo(String value) {
			addCriterion("zoneid <>", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidGreaterThan(String value) {
			addCriterion("zoneid >", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidGreaterThanOrEqualTo(String value) {
			addCriterion("zoneid >=", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidLessThan(String value) {
			addCriterion("zoneid <", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidLessThanOrEqualTo(String value) {
			addCriterion("zoneid <=", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidLike(String value) {
			addCriterion("zoneid like", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidNotLike(String value) {
			addCriterion("zoneid not like", value, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidIn(List<String> values) {
			addCriterion("zoneid in", values, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidNotIn(List<String> values) {
			addCriterion("zoneid not in", values, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidBetween(String value1, String value2) {
			addCriterion("zoneid between", value1, value2, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andZoneidNotBetween(String value1, String value2) {
			addCriterion("zoneid not between", value1, value2, "zoneid");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeIsNull() {
			addCriterion("providetype is null");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeIsNotNull() {
			addCriterion("providetype is not null");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeEqualTo(String value) {
			addCriterion("providetype =", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeNotEqualTo(String value) {
			addCriterion("providetype <>", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeGreaterThan(String value) {
			addCriterion("providetype >", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeGreaterThanOrEqualTo(String value) {
			addCriterion("providetype >=", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeLessThan(String value) {
			addCriterion("providetype <", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeLessThanOrEqualTo(String value) {
			addCriterion("providetype <=", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeLike(String value) {
			addCriterion("providetype like", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeNotLike(String value) {
			addCriterion("providetype not like", value, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeIn(List<String> values) {
			addCriterion("providetype in", values, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeNotIn(List<String> values) {
			addCriterion("providetype not in", values, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeBetween(String value1, String value2) {
			addCriterion("providetype between", value1, value2, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andProvidetypeNotBetween(String value1, String value2) {
			addCriterion("providetype not between", value1, value2, "providetype");
			return (Criteria) this;
		}
		
		public Criteria andAmtIsNull() {
			addCriterion("amt is null");
			return (Criteria) this;
		}
		
		public Criteria andAmtIsNotNull() {
			addCriterion("amt is not null");
			return (Criteria) this;
		}
		
		public Criteria andAmtEqualTo(String value) {
			addCriterion("amt =", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtNotEqualTo(String value) {
			addCriterion("amt <>", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtGreaterThan(String value) {
			addCriterion("amt >", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtGreaterThanOrEqualTo(String value) {
			addCriterion("amt >=", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtLessThan(String value) {
			addCriterion("amt <", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtLessThanOrEqualTo(String value) {
			addCriterion("amt <=", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtLike(String value) {
			addCriterion("amt like", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtNotLike(String value) {
			addCriterion("amt not like", value, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtIn(List<String> values) {
			addCriterion("amt in", values, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtNotIn(List<String> values) {
			addCriterion("amt not in", values, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtBetween(String value1, String value2) {
			addCriterion("amt between", value1, value2, "amt");
			return (Criteria) this;
		}
		
		public Criteria andAmtNotBetween(String value1, String value2) {
			addCriterion("amt not between", value1, value2, "amt");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsIsNull() {
			addCriterion("payamt_coins is null");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsIsNotNull() {
			addCriterion("payamt_coins is not null");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsEqualTo(String value) {
			addCriterion("payamt_coins =", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsNotEqualTo(String value) {
			addCriterion("payamt_coins <>", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsGreaterThan(String value) {
			addCriterion("payamt_coins >", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsGreaterThanOrEqualTo(String value) {
			addCriterion("payamt_coins >=", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsLessThan(String value) {
			addCriterion("payamt_coins <", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsLessThanOrEqualTo(String value) {
			addCriterion("payamt_coins <=", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsLike(String value) {
			addCriterion("payamt_coins like", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsNotLike(String value) {
			addCriterion("payamt_coins not like", value, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsIn(List<String> values) {
			addCriterion("payamt_coins in", values, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsNotIn(List<String> values) {
			addCriterion("payamt_coins not in", values, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsBetween(String value1, String value2) {
			addCriterion("payamt_coins between", value1, value2, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPayamtCoinsNotBetween(String value1, String value2) {
			addCriterion("payamt_coins not between", value1, value2, "payamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsIsNull() {
			addCriterion("pubacct_payamt_coins is null");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsIsNotNull() {
			addCriterion("pubacct_payamt_coins is not null");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsEqualTo(String value) {
			addCriterion("pubacct_payamt_coins =", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsNotEqualTo(String value) {
			addCriterion("pubacct_payamt_coins <>", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsGreaterThan(String value) {
			addCriterion("pubacct_payamt_coins >", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsGreaterThanOrEqualTo(String value) {
			addCriterion("pubacct_payamt_coins >=", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsLessThan(String value) {
			addCriterion("pubacct_payamt_coins <", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsLessThanOrEqualTo(String value) {
			addCriterion("pubacct_payamt_coins <=", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsLike(String value) {
			addCriterion("pubacct_payamt_coins like", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsNotLike(String value) {
			addCriterion("pubacct_payamt_coins not like", value, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsIn(List<String> values) {
			addCriterion("pubacct_payamt_coins in", values, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsNotIn(List<String> values) {
			addCriterion("pubacct_payamt_coins not in", values, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsBetween(String value1, String value2) {
			addCriterion("pubacct_payamt_coins between", value1, value2, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andPubacctPayamtCoinsNotBetween(String value1, String value2) {
			addCriterion("pubacct_payamt_coins not between", value1, value2, "pubacctPayamtCoins");
			return (Criteria) this;
		}
		
		public Criteria andSigIsNull() {
			addCriterion("sig is null");
			return (Criteria) this;
		}
		
		public Criteria andSigIsNotNull() {
			addCriterion("sig is not null");
			return (Criteria) this;
		}
		
		public Criteria andSigEqualTo(String value) {
			addCriterion("sig =", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigNotEqualTo(String value) {
			addCriterion("sig <>", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigGreaterThan(String value) {
			addCriterion("sig >", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigGreaterThanOrEqualTo(String value) {
			addCriterion("sig >=", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigLessThan(String value) {
			addCriterion("sig <", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigLessThanOrEqualTo(String value) {
			addCriterion("sig <=", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigLike(String value) {
			addCriterion("sig like", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigNotLike(String value) {
			addCriterion("sig not like", value, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigIn(List<String> values) {
			addCriterion("sig in", values, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigNotIn(List<String> values) {
			addCriterion("sig not in", values, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigBetween(String value1, String value2) {
			addCriterion("sig between", value1, value2, "sig");
			return (Criteria) this;
		}
		
		public Criteria andSigNotBetween(String value1, String value2) {
			addCriterion("sig not between", value1, value2, "sig");
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
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andBillnoLikeInsensitive(String value) {
			addCriterion("upper(billno) like", value.toUpperCase(), "billno");
			return this;
		}
		
		public Criteria andOpenidLikeInsensitive(String value) {
			addCriterion("upper(openid) like", value.toUpperCase(), "openid");
			return this;
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andTsLikeInsensitive(String value) {
			addCriterion("upper(ts) like", value.toUpperCase(), "ts");
			return this;
		}
		
		public Criteria andPayitemLikeInsensitive(String value) {
			addCriterion("upper(payitem) like", value.toUpperCase(), "payitem");
			return this;
		}
		
		public Criteria andTokenLikeInsensitive(String value) {
			addCriterion("upper(token) like", value.toUpperCase(), "token");
			return this;
		}
		
		public Criteria andVersionLikeInsensitive(String value) {
			addCriterion("upper(version) like", value.toUpperCase(), "version");
			return this;
		}
		
		public Criteria andZoneidLikeInsensitive(String value) {
			addCriterion("upper(zoneid) like", value.toUpperCase(), "zoneid");
			return this;
		}
		
		public Criteria andProvidetypeLikeInsensitive(String value) {
			addCriterion("upper(providetype) like", value.toUpperCase(), "providetype");
			return this;
		}
		
		public Criteria andAmtLikeInsensitive(String value) {
			addCriterion("upper(amt) like", value.toUpperCase(), "amt");
			return this;
		}
		
		public Criteria andPayamtCoinsLikeInsensitive(String value) {
			addCriterion("upper(payamt_coins) like", value.toUpperCase(), "payamtCoins");
			return this;
		}
		
		public Criteria andPubacctPayamtCoinsLikeInsensitive(String value) {
			addCriterion("upper(pubacct_payamt_coins) like", value.toUpperCase(), "pubacctPayamtCoins");
			return this;
		}
		
		public Criteria andSigLikeInsensitive(String value) {
			addCriterion("upper(sig) like", value.toUpperCase(), "sig");
			return this;
		}
		
		public Criteria andAddtimeLikeInsensitive(String value) {
			addCriterion("upper(addtime) like", value.toUpperCase(), "addtime");
			return this;
		}
		
		public Criteria andStatusLikeInsensitive(String value) {
			addCriterion("upper(status) like", value.toUpperCase(), "status");
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