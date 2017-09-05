package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpActivityExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpActivityExample() {
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
		
		public Criteria andAidIsNull() {
			addCriterion("aid is null");
			return (Criteria) this;
		}
		
		public Criteria andAidIsNotNull() {
			addCriterion("aid is not null");
			return (Criteria) this;
		}
		
		public Criteria andAidEqualTo(Integer value) {
			addCriterion("aid =", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidNotEqualTo(Integer value) {
			addCriterion("aid <>", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidGreaterThan(Integer value) {
			addCriterion("aid >", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidGreaterThanOrEqualTo(Integer value) {
			addCriterion("aid >=", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidLessThan(Integer value) {
			addCriterion("aid <", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidLessThanOrEqualTo(Integer value) {
			addCriterion("aid <=", value, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidIn(List<Integer> values) {
			addCriterion("aid in", values, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidNotIn(List<Integer> values) {
			addCriterion("aid not in", values, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidBetween(Integer value1, Integer value2) {
			addCriterion("aid between", value1, value2, "aid");
			return (Criteria) this;
		}
		
		public Criteria andAidNotBetween(Integer value1, Integer value2) {
			addCriterion("aid not between", value1, value2, "aid");
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
		
		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}
		
		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}
		
		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}
		
		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}
		
		public Criteria andKeywordIsNull() {
			addCriterion("keyword is null");
			return (Criteria) this;
		}
		
		public Criteria andKeywordIsNotNull() {
			addCriterion("keyword is not null");
			return (Criteria) this;
		}
		
		public Criteria andKeywordEqualTo(String value) {
			addCriterion("keyword =", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordNotEqualTo(String value) {
			addCriterion("keyword <>", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordGreaterThan(String value) {
			addCriterion("keyword >", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordGreaterThanOrEqualTo(String value) {
			addCriterion("keyword >=", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordLessThan(String value) {
			addCriterion("keyword <", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordLessThanOrEqualTo(String value) {
			addCriterion("keyword <=", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordLike(String value) {
			addCriterion("keyword like", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordNotLike(String value) {
			addCriterion("keyword not like", value, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordIn(List<String> values) {
			addCriterion("keyword in", values, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordNotIn(List<String> values) {
			addCriterion("keyword not in", values, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordBetween(String value1, String value2) {
			addCriterion("keyword between", value1, value2, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andKeywordNotBetween(String value1, String value2) {
			addCriterion("keyword not between", value1, value2, "keyword");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeIsNull() {
			addCriterion("begintime is null");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeIsNotNull() {
			addCriterion("begintime is not null");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeEqualTo(String value) {
			addCriterion("begintime =", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeNotEqualTo(String value) {
			addCriterion("begintime <>", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeGreaterThan(String value) {
			addCriterion("begintime >", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
			addCriterion("begintime >=", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeLessThan(String value) {
			addCriterion("begintime <", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeLessThanOrEqualTo(String value) {
			addCriterion("begintime <=", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeLike(String value) {
			addCriterion("begintime like", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeNotLike(String value) {
			addCriterion("begintime not like", value, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeIn(List<String> values) {
			addCriterion("begintime in", values, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeNotIn(List<String> values) {
			addCriterion("begintime not in", values, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeBetween(String value1, String value2) {
			addCriterion("begintime between", value1, value2, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andBegintimeNotBetween(String value1, String value2) {
			addCriterion("begintime not between", value1, value2, "begintime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeIsNull() {
			addCriterion("endtime is null");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeIsNotNull() {
			addCriterion("endtime is not null");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeEqualTo(String value) {
			addCriterion("endtime =", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeNotEqualTo(String value) {
			addCriterion("endtime <>", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeGreaterThan(String value) {
			addCriterion("endtime >", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
			addCriterion("endtime >=", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeLessThan(String value) {
			addCriterion("endtime <", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeLessThanOrEqualTo(String value) {
			addCriterion("endtime <=", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeLike(String value) {
			addCriterion("endtime like", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeNotLike(String value) {
			addCriterion("endtime not like", value, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeIn(List<String> values) {
			addCriterion("endtime in", values, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeNotIn(List<String> values) {
			addCriterion("endtime not in", values, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeBetween(String value1, String value2) {
			addCriterion("endtime between", value1, value2, "endtime");
			return (Criteria) this;
		}
		
		public Criteria andEndtimeNotBetween(String value1, String value2) {
			addCriterion("endtime not between", value1, value2, "endtime");
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
		
		public Criteria andIsbingIsNull() {
			addCriterion("isbing is null");
			return (Criteria) this;
		}
		
		public Criteria andIsbingIsNotNull() {
			addCriterion("isbing is not null");
			return (Criteria) this;
		}
		
		public Criteria andIsbingEqualTo(String value) {
			addCriterion("isbing =", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingNotEqualTo(String value) {
			addCriterion("isbing <>", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingGreaterThan(String value) {
			addCriterion("isbing >", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingGreaterThanOrEqualTo(String value) {
			addCriterion("isbing >=", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingLessThan(String value) {
			addCriterion("isbing <", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingLessThanOrEqualTo(String value) {
			addCriterion("isbing <=", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingLike(String value) {
			addCriterion("isbing like", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingNotLike(String value) {
			addCriterion("isbing not like", value, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingIn(List<String> values) {
			addCriterion("isbing in", values, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingNotIn(List<String> values) {
			addCriterion("isbing not in", values, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingBetween(String value1, String value2) {
			addCriterion("isbing between", value1, value2, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andIsbingNotBetween(String value1, String value2) {
			addCriterion("isbing not between", value1, value2, "isbing");
			return (Criteria) this;
		}
		
		public Criteria andJoincountIsNull() {
			addCriterion("joincount is null");
			return (Criteria) this;
		}
		
		public Criteria andJoincountIsNotNull() {
			addCriterion("joincount is not null");
			return (Criteria) this;
		}
		
		public Criteria andJoincountEqualTo(Integer value) {
			addCriterion("joincount =", value, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountNotEqualTo(Integer value) {
			addCriterion("joincount <>", value, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountGreaterThan(Integer value) {
			addCriterion("joincount >", value, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountGreaterThanOrEqualTo(Integer value) {
			addCriterion("joincount >=", value, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountLessThan(Integer value) {
			addCriterion("joincount <", value, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountLessThanOrEqualTo(Integer value) {
			addCriterion("joincount <=", value, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountIn(List<Integer> values) {
			addCriterion("joincount in", values, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountNotIn(List<Integer> values) {
			addCriterion("joincount not in", values, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountBetween(Integer value1, Integer value2) {
			addCriterion("joincount between", value1, value2, "joincount");
			return (Criteria) this;
		}
		
		public Criteria andJoincountNotBetween(Integer value1, Integer value2) {
			addCriterion("joincount not between", value1, value2, "joincount");
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
		
		public Criteria andWorldidsIsNull() {
			addCriterion("worldids is null");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsIsNotNull() {
			addCriterion("worldids is not null");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsEqualTo(String value) {
			addCriterion("worldids =", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsNotEqualTo(String value) {
			addCriterion("worldids <>", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsGreaterThan(String value) {
			addCriterion("worldids >", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsGreaterThanOrEqualTo(String value) {
			addCriterion("worldids >=", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsLessThan(String value) {
			addCriterion("worldids <", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsLessThanOrEqualTo(String value) {
			addCriterion("worldids <=", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsLike(String value) {
			addCriterion("worldids like", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsNotLike(String value) {
			addCriterion("worldids not like", value, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsIn(List<String> values) {
			addCriterion("worldids in", values, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsNotIn(List<String> values) {
			addCriterion("worldids not in", values, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsBetween(String value1, String value2) {
			addCriterion("worldids between", value1, value2, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andWorldidsNotBetween(String value1, String value2) {
			addCriterion("worldids not between", value1, value2, "worldids");
			return (Criteria) this;
		}
		
		public Criteria andCardnumIsNull() {
			addCriterion("cardnum is null");
			return (Criteria) this;
		}
		
		public Criteria andCardnumIsNotNull() {
			addCriterion("cardnum is not null");
			return (Criteria) this;
		}
		
		public Criteria andCardnumEqualTo(Integer value) {
			addCriterion("cardnum =", value, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumNotEqualTo(Integer value) {
			addCriterion("cardnum <>", value, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumGreaterThan(Integer value) {
			addCriterion("cardnum >", value, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("cardnum >=", value, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumLessThan(Integer value) {
			addCriterion("cardnum <", value, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumLessThanOrEqualTo(Integer value) {
			addCriterion("cardnum <=", value, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumIn(List<Integer> values) {
			addCriterion("cardnum in", values, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumNotIn(List<Integer> values) {
			addCriterion("cardnum not in", values, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumBetween(Integer value1, Integer value2) {
			addCriterion("cardnum between", value1, value2, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andCardnumNotBetween(Integer value1, Integer value2) {
			addCriterion("cardnum not between", value1, value2, "cardnum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumIsNull() {
			addCriterion("usenum is null");
			return (Criteria) this;
		}
		
		public Criteria andUsenumIsNotNull() {
			addCriterion("usenum is not null");
			return (Criteria) this;
		}
		
		public Criteria andUsenumEqualTo(Integer value) {
			addCriterion("usenum =", value, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumNotEqualTo(Integer value) {
			addCriterion("usenum <>", value, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumGreaterThan(Integer value) {
			addCriterion("usenum >", value, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumGreaterThanOrEqualTo(Integer value) {
			addCriterion("usenum >=", value, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumLessThan(Integer value) {
			addCriterion("usenum <", value, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumLessThanOrEqualTo(Integer value) {
			addCriterion("usenum <=", value, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumIn(List<Integer> values) {
			addCriterion("usenum in", values, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumNotIn(List<Integer> values) {
			addCriterion("usenum not in", values, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumBetween(Integer value1, Integer value2) {
			addCriterion("usenum between", value1, value2, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andUsenumNotBetween(Integer value1, Integer value2) {
			addCriterion("usenum not between", value1, value2, "usenum");
			return (Criteria) this;
		}
		
		public Criteria andAwardIsNull() {
			addCriterion("award is null");
			return (Criteria) this;
		}
		
		public Criteria andAwardIsNotNull() {
			addCriterion("award is not null");
			return (Criteria) this;
		}
		
		public Criteria andAwardEqualTo(String value) {
			addCriterion("award =", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardNotEqualTo(String value) {
			addCriterion("award <>", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardGreaterThan(String value) {
			addCriterion("award >", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardGreaterThanOrEqualTo(String value) {
			addCriterion("award >=", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardLessThan(String value) {
			addCriterion("award <", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardLessThanOrEqualTo(String value) {
			addCriterion("award <=", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardLike(String value) {
			addCriterion("award like", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardNotLike(String value) {
			addCriterion("award not like", value, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardIn(List<String> values) {
			addCriterion("award in", values, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardNotIn(List<String> values) {
			addCriterion("award not in", values, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardBetween(String value1, String value2) {
			addCriterion("award between", value1, value2, "award");
			return (Criteria) this;
		}
		
		public Criteria andAwardNotBetween(String value1, String value2) {
			addCriterion("award not between", value1, value2, "award");
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
		
		public Criteria andContentLikeInsensitive(String value) {
			addCriterion("upper(content) like", value.toUpperCase(), "content");
			return this;
		}
		
		public Criteria andKeywordLikeInsensitive(String value) {
			addCriterion("upper(keyword) like", value.toUpperCase(), "keyword");
			return this;
		}
		
		public Criteria andBegintimeLikeInsensitive(String value) {
			addCriterion("upper(begintime) like", value.toUpperCase(), "begintime");
			return this;
		}
		
		public Criteria andEndtimeLikeInsensitive(String value) {
			addCriterion("upper(endtime) like", value.toUpperCase(), "endtime");
			return this;
		}
		
		public Criteria andInfoLikeInsensitive(String value) {
			addCriterion("upper(info) like", value.toUpperCase(), "info");
			return this;
		}
		
		public Criteria andStatusLikeInsensitive(String value) {
			addCriterion("upper(status) like", value.toUpperCase(), "status");
			return this;
		}
		
		public Criteria andAddtimeLikeInsensitive(String value) {
			addCriterion("upper(addtime) like", value.toUpperCase(), "addtime");
			return this;
		}
		
		public Criteria andIsbingLikeInsensitive(String value) {
			addCriterion("upper(isbing) like", value.toUpperCase(), "isbing");
			return this;
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andWorldidsLikeInsensitive(String value) {
			addCriterion("upper(worldids) like", value.toUpperCase(), "worldids");
			return this;
		}
		
		public Criteria andAwardLikeInsensitive(String value) {
			addCriterion("upper(award) like", value.toUpperCase(), "award");
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