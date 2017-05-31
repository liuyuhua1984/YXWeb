package com.gamecenter.sysmanage.model;

import java.util.ArrayList;
import java.util.List;

public class OaModuleExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OaModuleExample() {
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
		
		public Criteria andMidIsNull() {
			addCriterion("mid is null");
			return (Criteria) this;
		}
		
		public Criteria andMidIsNotNull() {
			addCriterion("mid is not null");
			return (Criteria) this;
		}
		
		public Criteria andMidEqualTo(Integer value) {
			addCriterion("mid =", value, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidNotEqualTo(Integer value) {
			addCriterion("mid <>", value, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidGreaterThan(Integer value) {
			addCriterion("mid >", value, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidGreaterThanOrEqualTo(Integer value) {
			addCriterion("mid >=", value, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidLessThan(Integer value) {
			addCriterion("mid <", value, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidLessThanOrEqualTo(Integer value) {
			addCriterion("mid <=", value, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidIn(List<Integer> values) {
			addCriterion("mid in", values, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidNotIn(List<Integer> values) {
			addCriterion("mid not in", values, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidBetween(Integer value1, Integer value2) {
			addCriterion("mid between", value1, value2, "mid");
			return (Criteria) this;
		}
		
		public Criteria andMidNotBetween(Integer value1, Integer value2) {
			addCriterion("mid not between", value1, value2, "mid");
			return (Criteria) this;
		}
		
		public Criteria andPidIsNull() {
			addCriterion("pid is null");
			return (Criteria) this;
		}
		
		public Criteria andPidIsNotNull() {
			addCriterion("pid is not null");
			return (Criteria) this;
		}
		
		public Criteria andPidEqualTo(Integer value) {
			addCriterion("pid =", value, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidNotEqualTo(Integer value) {
			addCriterion("pid <>", value, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidGreaterThan(Integer value) {
			addCriterion("pid >", value, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidGreaterThanOrEqualTo(Integer value) {
			addCriterion("pid >=", value, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidLessThan(Integer value) {
			addCriterion("pid <", value, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidLessThanOrEqualTo(Integer value) {
			addCriterion("pid <=", value, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidIn(List<Integer> values) {
			addCriterion("pid in", values, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidNotIn(List<Integer> values) {
			addCriterion("pid not in", values, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidBetween(Integer value1, Integer value2) {
			addCriterion("pid between", value1, value2, "pid");
			return (Criteria) this;
		}
		
		public Criteria andPidNotBetween(Integer value1, Integer value2) {
			addCriterion("pid not between", value1, value2, "pid");
			return (Criteria) this;
		}
		
		public Criteria andModulenameIsNull() {
			addCriterion("modulename is null");
			return (Criteria) this;
		}
		
		public Criteria andModulenameIsNotNull() {
			addCriterion("modulename is not null");
			return (Criteria) this;
		}
		
		public Criteria andModulenameEqualTo(String value) {
			addCriterion("modulename =", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameNotEqualTo(String value) {
			addCriterion("modulename <>", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameGreaterThan(String value) {
			addCriterion("modulename >", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameGreaterThanOrEqualTo(String value) {
			addCriterion("modulename >=", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameLessThan(String value) {
			addCriterion("modulename <", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameLessThanOrEqualTo(String value) {
			addCriterion("modulename <=", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameLike(String value) {
			addCriterion("modulename like", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameNotLike(String value) {
			addCriterion("modulename not like", value, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameIn(List<String> values) {
			addCriterion("modulename in", values, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameNotIn(List<String> values) {
			addCriterion("modulename not in", values, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameBetween(String value1, String value2) {
			addCriterion("modulename between", value1, value2, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModulenameNotBetween(String value1, String value2) {
			addCriterion("modulename not between", value1, value2, "modulename");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlIsNull() {
			addCriterion("moduleurl is null");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlIsNotNull() {
			addCriterion("moduleurl is not null");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlEqualTo(String value) {
			addCriterion("moduleurl =", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlNotEqualTo(String value) {
			addCriterion("moduleurl <>", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlGreaterThan(String value) {
			addCriterion("moduleurl >", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlGreaterThanOrEqualTo(String value) {
			addCriterion("moduleurl >=", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlLessThan(String value) {
			addCriterion("moduleurl <", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlLessThanOrEqualTo(String value) {
			addCriterion("moduleurl <=", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlLike(String value) {
			addCriterion("moduleurl like", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlNotLike(String value) {
			addCriterion("moduleurl not like", value, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlIn(List<String> values) {
			addCriterion("moduleurl in", values, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlNotIn(List<String> values) {
			addCriterion("moduleurl not in", values, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlBetween(String value1, String value2) {
			addCriterion("moduleurl between", value1, value2, "moduleurl");
			return (Criteria) this;
		}
		
		public Criteria andModuleurlNotBetween(String value1, String value2) {
			addCriterion("moduleurl not between", value1, value2, "moduleurl");
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
		
		public Criteria andSortEqualTo(Integer value) {
			addCriterion("sort =", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotEqualTo(Integer value) {
			addCriterion("sort <>", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortGreaterThan(Integer value) {
			addCriterion("sort >", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("sort >=", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortLessThan(Integer value) {
			addCriterion("sort <", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortLessThanOrEqualTo(Integer value) {
			addCriterion("sort <=", value, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortIn(List<Integer> values) {
			addCriterion("sort in", values, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotIn(List<Integer> values) {
			addCriterion("sort not in", values, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortBetween(Integer value1, Integer value2) {
			addCriterion("sort between", value1, value2, "sort");
			return (Criteria) this;
		}
		
		public Criteria andSortNotBetween(Integer value1, Integer value2) {
			addCriterion("sort not between", value1, value2, "sort");
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
		
		public Criteria andIconIsNull() {
			addCriterion("icon is null");
			return (Criteria) this;
		}
		
		public Criteria andIconIsNotNull() {
			addCriterion("icon is not null");
			return (Criteria) this;
		}
		
		public Criteria andIconEqualTo(String value) {
			addCriterion("icon =", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotEqualTo(String value) {
			addCriterion("icon <>", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconGreaterThan(String value) {
			addCriterion("icon >", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconGreaterThanOrEqualTo(String value) {
			addCriterion("icon >=", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconLessThan(String value) {
			addCriterion("icon <", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconLessThanOrEqualTo(String value) {
			addCriterion("icon <=", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconLike(String value) {
			addCriterion("icon like", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotLike(String value) {
			addCriterion("icon not like", value, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconIn(List<String> values) {
			addCriterion("icon in", values, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotIn(List<String> values) {
			addCriterion("icon not in", values, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconBetween(String value1, String value2) {
			addCriterion("icon between", value1, value2, "icon");
			return (Criteria) this;
		}
		
		public Criteria andIconNotBetween(String value1, String value2) {
			addCriterion("icon not between", value1, value2, "icon");
			return (Criteria) this;
		}
		
		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}
		
		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}
		
		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}
		
		public Criteria andJoinidIsNull() {
			addCriterion("joinid is null");
			return (Criteria) this;
		}
		
		public Criteria andJoinidIsNotNull() {
			addCriterion("joinid is not null");
			return (Criteria) this;
		}
		
		public Criteria andJoinidEqualTo(String value) {
			addCriterion("joinid =", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidNotEqualTo(String value) {
			addCriterion("joinid <>", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidGreaterThan(String value) {
			addCriterion("joinid >", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidGreaterThanOrEqualTo(String value) {
			addCriterion("joinid >=", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidLessThan(String value) {
			addCriterion("joinid <", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidLessThanOrEqualTo(String value) {
			addCriterion("joinid <=", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidLike(String value) {
			addCriterion("joinid like", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidNotLike(String value) {
			addCriterion("joinid not like", value, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidIn(List<String> values) {
			addCriterion("joinid in", values, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidNotIn(List<String> values) {
			addCriterion("joinid not in", values, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidBetween(String value1, String value2) {
			addCriterion("joinid between", value1, value2, "joinid");
			return (Criteria) this;
		}
		
		public Criteria andJoinidNotBetween(String value1, String value2) {
			addCriterion("joinid not between", value1, value2, "joinid");
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
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andModulenameLikeInsensitive(String value) {
			addCriterion("upper(modulename) like", value.toUpperCase(), "modulename");
			return this;
		}
		
		public Criteria andModuleurlLikeInsensitive(String value) {
			addCriterion("upper(moduleurl) like", value.toUpperCase(), "moduleurl");
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
		
		public Criteria andIconLikeInsensitive(String value) {
			addCriterion("upper(icon) like", value.toUpperCase(), "icon");
			return this;
		}
		
		public Criteria andTypeLikeInsensitive(String value) {
			addCriterion("upper(type) like", value.toUpperCase(), "type");
			return this;
		}
		
		public Criteria andJoinidLikeInsensitive(String value) {
			addCriterion("upper(joinid) like", value.toUpperCase(), "joinid");
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