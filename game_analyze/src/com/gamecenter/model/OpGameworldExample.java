package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpGameworldExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpGameworldExample() {
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
		
		public Criteria andWidIsNull() {
			addCriterion("wid is null");
			return (Criteria) this;
		}
		
		public Criteria andWidIsNotNull() {
			addCriterion("wid is not null");
			return (Criteria) this;
		}
		
		public Criteria andWidEqualTo(Integer value) {
			addCriterion("wid =", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidNotEqualTo(Integer value) {
			addCriterion("wid <>", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidGreaterThan(Integer value) {
			addCriterion("wid >", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidGreaterThanOrEqualTo(Integer value) {
			addCriterion("wid >=", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidLessThan(Integer value) {
			addCriterion("wid <", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidLessThanOrEqualTo(Integer value) {
			addCriterion("wid <=", value, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidIn(List<Integer> values) {
			addCriterion("wid in", values, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidNotIn(List<Integer> values) {
			addCriterion("wid not in", values, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidBetween(Integer value1, Integer value2) {
			addCriterion("wid between", value1, value2, "wid");
			return (Criteria) this;
		}
		
		public Criteria andWidNotBetween(Integer value1, Integer value2) {
			addCriterion("wid not between", value1, value2, "wid");
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
		
		public Criteria andVsidIsNull() {
			addCriterion("vsid is null");
			return (Criteria) this;
		}
		
		public Criteria andVsidIsNotNull() {
			addCriterion("vsid is not null");
			return (Criteria) this;
		}
		
		public Criteria andVsidEqualTo(String value) {
			addCriterion("vsid =", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotEqualTo(String value) {
			addCriterion("vsid <>", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidGreaterThan(String value) {
			addCriterion("vsid >", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidGreaterThanOrEqualTo(String value) {
			addCriterion("vsid >=", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidLessThan(String value) {
			addCriterion("vsid <", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidLessThanOrEqualTo(String value) {
			addCriterion("vsid <=", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidLike(String value) {
			addCriterion("vsid like", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotLike(String value) {
			addCriterion("vsid not like", value, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidIn(List<String> values) {
			addCriterion("vsid in", values, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotIn(List<String> values) {
			addCriterion("vsid not in", values, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidBetween(String value1, String value2) {
			addCriterion("vsid between", value1, value2, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andVsidNotBetween(String value1, String value2) {
			addCriterion("vsid not between", value1, value2, "vsid");
			return (Criteria) this;
		}
		
		public Criteria andWnameIsNull() {
			addCriterion("wname is null");
			return (Criteria) this;
		}
		
		public Criteria andWnameIsNotNull() {
			addCriterion("wname is not null");
			return (Criteria) this;
		}
		
		public Criteria andWnameEqualTo(String value) {
			addCriterion("wname =", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameNotEqualTo(String value) {
			addCriterion("wname <>", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameGreaterThan(String value) {
			addCriterion("wname >", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameGreaterThanOrEqualTo(String value) {
			addCriterion("wname >=", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameLessThan(String value) {
			addCriterion("wname <", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameLessThanOrEqualTo(String value) {
			addCriterion("wname <=", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameLike(String value) {
			addCriterion("wname like", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameNotLike(String value) {
			addCriterion("wname not like", value, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameIn(List<String> values) {
			addCriterion("wname in", values, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameNotIn(List<String> values) {
			addCriterion("wname not in", values, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameBetween(String value1, String value2) {
			addCriterion("wname between", value1, value2, "wname");
			return (Criteria) this;
		}
		
		public Criteria andWnameNotBetween(String value1, String value2) {
			addCriterion("wname not between", value1, value2, "wname");
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
		
		public Criteria andDomainIsNull() {
			addCriterion("domain is null");
			return (Criteria) this;
		}
		
		public Criteria andDomainIsNotNull() {
			addCriterion("domain is not null");
			return (Criteria) this;
		}
		
		public Criteria andDomainEqualTo(String value) {
			addCriterion("domain =", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainNotEqualTo(String value) {
			addCriterion("domain <>", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainGreaterThan(String value) {
			addCriterion("domain >", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainGreaterThanOrEqualTo(String value) {
			addCriterion("domain >=", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainLessThan(String value) {
			addCriterion("domain <", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainLessThanOrEqualTo(String value) {
			addCriterion("domain <=", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainLike(String value) {
			addCriterion("domain like", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainNotLike(String value) {
			addCriterion("domain not like", value, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainIn(List<String> values) {
			addCriterion("domain in", values, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainNotIn(List<String> values) {
			addCriterion("domain not in", values, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainBetween(String value1, String value2) {
			addCriterion("domain between", value1, value2, "domain");
			return (Criteria) this;
		}
		
		public Criteria andDomainNotBetween(String value1, String value2) {
			addCriterion("domain not between", value1, value2, "domain");
			return (Criteria) this;
		}
		
		public Criteria andIpIsNull() {
			addCriterion("ip is null");
			return (Criteria) this;
		}
		
		public Criteria andIpIsNotNull() {
			addCriterion("ip is not null");
			return (Criteria) this;
		}
		
		public Criteria andIpEqualTo(String value) {
			addCriterion("ip =", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpNotEqualTo(String value) {
			addCriterion("ip <>", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpGreaterThan(String value) {
			addCriterion("ip >", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("ip >=", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpLessThan(String value) {
			addCriterion("ip <", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("ip <=", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpLike(String value) {
			addCriterion("ip like", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpNotLike(String value) {
			addCriterion("ip not like", value, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpIn(List<String> values) {
			addCriterion("ip in", values, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpNotIn(List<String> values) {
			addCriterion("ip not in", values, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpBetween(String value1, String value2) {
			addCriterion("ip between", value1, value2, "ip");
			return (Criteria) this;
		}
		
		public Criteria andIpNotBetween(String value1, String value2) {
			addCriterion("ip not between", value1, value2, "ip");
			return (Criteria) this;
		}
		
		public Criteria andServerurlIsNull() {
			addCriterion("serverurl is null");
			return (Criteria) this;
		}
		
		public Criteria andServerurlIsNotNull() {
			addCriterion("serverurl is not null");
			return (Criteria) this;
		}
		
		public Criteria andServerurlEqualTo(String value) {
			addCriterion("serverurl =", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlNotEqualTo(String value) {
			addCriterion("serverurl <>", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlGreaterThan(String value) {
			addCriterion("serverurl >", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlGreaterThanOrEqualTo(String value) {
			addCriterion("serverurl >=", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlLessThan(String value) {
			addCriterion("serverurl <", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlLessThanOrEqualTo(String value) {
			addCriterion("serverurl <=", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlLike(String value) {
			addCriterion("serverurl like", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlNotLike(String value) {
			addCriterion("serverurl not like", value, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlIn(List<String> values) {
			addCriterion("serverurl in", values, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlNotIn(List<String> values) {
			addCriterion("serverurl not in", values, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlBetween(String value1, String value2) {
			addCriterion("serverurl between", value1, value2, "serverurl");
			return (Criteria) this;
		}
		
		public Criteria andServerurlNotBetween(String value1, String value2) {
			addCriterion("serverurl not between", value1, value2, "serverurl");
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
		
		public Criteria andIsmingleIsNull() {
			addCriterion("ismingle is null");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleIsNotNull() {
			addCriterion("ismingle is not null");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleEqualTo(String value) {
			addCriterion("ismingle =", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleNotEqualTo(String value) {
			addCriterion("ismingle <>", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleGreaterThan(String value) {
			addCriterion("ismingle >", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleGreaterThanOrEqualTo(String value) {
			addCriterion("ismingle >=", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleLessThan(String value) {
			addCriterion("ismingle <", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleLessThanOrEqualTo(String value) {
			addCriterion("ismingle <=", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleLike(String value) {
			addCriterion("ismingle like", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleNotLike(String value) {
			addCriterion("ismingle not like", value, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleIn(List<String> values) {
			addCriterion("ismingle in", values, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleNotIn(List<String> values) {
			addCriterion("ismingle not in", values, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleBetween(String value1, String value2) {
			addCriterion("ismingle between", value1, value2, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andIsmingleNotBetween(String value1, String value2) {
			addCriterion("ismingle not between", value1, value2, "ismingle");
			return (Criteria) this;
		}
		
		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}
		
		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}
		
		public Criteria andTimeEqualTo(String value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotEqualTo(String value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeGreaterThan(String value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeGreaterThanOrEqualTo(String value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLessThan(String value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLessThanOrEqualTo(String value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeLike(String value) {
			addCriterion("time like", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotLike(String value) {
			addCriterion("time not like", value, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeIn(List<String> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotIn(List<String> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeBetween(String value1, String value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}
		
		public Criteria andTimeNotBetween(String value1, String value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeIsNull() {
			addCriterion("opentime is null");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeIsNotNull() {
			addCriterion("opentime is not null");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeEqualTo(String value) {
			addCriterion("opentime =", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeNotEqualTo(String value) {
			addCriterion("opentime <>", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeGreaterThan(String value) {
			addCriterion("opentime >", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeGreaterThanOrEqualTo(String value) {
			addCriterion("opentime >=", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeLessThan(String value) {
			addCriterion("opentime <", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeLessThanOrEqualTo(String value) {
			addCriterion("opentime <=", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeLike(String value) {
			addCriterion("opentime like", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeNotLike(String value) {
			addCriterion("opentime not like", value, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeIn(List<String> values) {
			addCriterion("opentime in", values, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeNotIn(List<String> values) {
			addCriterion("opentime not in", values, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeBetween(String value1, String value2) {
			addCriterion("opentime between", value1, value2, "opentime");
			return (Criteria) this;
		}
		
		public Criteria andOpentimeNotBetween(String value1, String value2) {
			addCriterion("opentime not between", value1, value2, "opentime");
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
		
		public Criteria andVsidLikeInsensitive(String value) {
			addCriterion("upper(vsid) like", value.toUpperCase(), "vsid");
			return this;
		}
		
		public Criteria andWnameLikeInsensitive(String value) {
			addCriterion("upper(wname) like", value.toUpperCase(), "wname");
			return this;
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andStatusLikeInsensitive(String value) {
			addCriterion("upper(status) like", value.toUpperCase(), "status");
			return this;
		}
		
		public Criteria andDomainLikeInsensitive(String value) {
			addCriterion("upper(domain) like", value.toUpperCase(), "domain");
			return this;
		}
		
		public Criteria andIpLikeInsensitive(String value) {
			addCriterion("upper(ip) like", value.toUpperCase(), "ip");
			return this;
		}
		
		public Criteria andServerurlLikeInsensitive(String value) {
			addCriterion("upper(serverurl) like", value.toUpperCase(), "serverurl");
			return this;
		}
		
		public Criteria andInfoLikeInsensitive(String value) {
			addCriterion("upper(info) like", value.toUpperCase(), "info");
			return this;
		}
		
		public Criteria andIsmingleLikeInsensitive(String value) {
			addCriterion("upper(ismingle) like", value.toUpperCase(), "ismingle");
			return this;
		}
		
		public Criteria andTimeLikeInsensitive(String value) {
			addCriterion("upper(time) like", value.toUpperCase(), "time");
			return this;
		}
		
		public Criteria andOpentimeLikeInsensitive(String value) {
			addCriterion("upper(opentime) like", value.toUpperCase(), "opentime");
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