package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpGmtNoticeCycleExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpGmtNoticeCycleExample() {
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
		
		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}
		
		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}
		
		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}
		
		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeIsNull() {
			addCriterion("cycletime is null");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeIsNotNull() {
			addCriterion("cycletime is not null");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeEqualTo(Integer value) {
			addCriterion("cycletime =", value, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeNotEqualTo(Integer value) {
			addCriterion("cycletime <>", value, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeGreaterThan(Integer value) {
			addCriterion("cycletime >", value, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("cycletime >=", value, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeLessThan(Integer value) {
			addCriterion("cycletime <", value, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeLessThanOrEqualTo(Integer value) {
			addCriterion("cycletime <=", value, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeIn(List<Integer> values) {
			addCriterion("cycletime in", values, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeNotIn(List<Integer> values) {
			addCriterion("cycletime not in", values, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeBetween(Integer value1, Integer value2) {
			addCriterion("cycletime between", value1, value2, "cycletime");
			return (Criteria) this;
		}
		
		public Criteria andCycletimeNotBetween(Integer value1, Integer value2) {
			addCriterion("cycletime not between", value1, value2, "cycletime");
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
		
		public Criteria andMsgIsNull() {
			addCriterion("msg is null");
			return (Criteria) this;
		}
		
		public Criteria andMsgIsNotNull() {
			addCriterion("msg is not null");
			return (Criteria) this;
		}
		
		public Criteria andMsgEqualTo(String value) {
			addCriterion("msg =", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgNotEqualTo(String value) {
			addCriterion("msg <>", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgGreaterThan(String value) {
			addCriterion("msg >", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgGreaterThanOrEqualTo(String value) {
			addCriterion("msg >=", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgLessThan(String value) {
			addCriterion("msg <", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgLessThanOrEqualTo(String value) {
			addCriterion("msg <=", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgLike(String value) {
			addCriterion("msg like", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgNotLike(String value) {
			addCriterion("msg not like", value, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgIn(List<String> values) {
			addCriterion("msg in", values, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgNotIn(List<String> values) {
			addCriterion("msg not in", values, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgBetween(String value1, String value2) {
			addCriterion("msg between", value1, value2, "msg");
			return (Criteria) this;
		}
		
		public Criteria andMsgNotBetween(String value1, String value2) {
			addCriterion("msg not between", value1, value2, "msg");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeIsNull() {
			addCriterion("opttime is null");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeIsNotNull() {
			addCriterion("opttime is not null");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeEqualTo(String value) {
			addCriterion("opttime =", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeNotEqualTo(String value) {
			addCriterion("opttime <>", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeGreaterThan(String value) {
			addCriterion("opttime >", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeGreaterThanOrEqualTo(String value) {
			addCriterion("opttime >=", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeLessThan(String value) {
			addCriterion("opttime <", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeLessThanOrEqualTo(String value) {
			addCriterion("opttime <=", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeLike(String value) {
			addCriterion("opttime like", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeNotLike(String value) {
			addCriterion("opttime not like", value, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeIn(List<String> values) {
			addCriterion("opttime in", values, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeNotIn(List<String> values) {
			addCriterion("opttime not in", values, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeBetween(String value1, String value2) {
			addCriterion("opttime between", value1, value2, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andOpttimeNotBetween(String value1, String value2) {
			addCriterion("opttime not between", value1, value2, "opttime");
			return (Criteria) this;
		}
		
		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}
		
		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}
		
		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}
		
		public Criteria andSettimeIsNull() {
			addCriterion("settime is null");
			return (Criteria) this;
		}
		
		public Criteria andSettimeIsNotNull() {
			addCriterion("settime is not null");
			return (Criteria) this;
		}
		
		public Criteria andSettimeEqualTo(String value) {
			addCriterion("settime =", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeNotEqualTo(String value) {
			addCriterion("settime <>", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeGreaterThan(String value) {
			addCriterion("settime >", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeGreaterThanOrEqualTo(String value) {
			addCriterion("settime >=", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeLessThan(String value) {
			addCriterion("settime <", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeLessThanOrEqualTo(String value) {
			addCriterion("settime <=", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeLike(String value) {
			addCriterion("settime like", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeNotLike(String value) {
			addCriterion("settime not like", value, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeIn(List<String> values) {
			addCriterion("settime in", values, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeNotIn(List<String> values) {
			addCriterion("settime not in", values, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeBetween(String value1, String value2) {
			addCriterion("settime between", value1, value2, "settime");
			return (Criteria) this;
		}
		
		public Criteria andSettimeNotBetween(String value1, String value2) {
			addCriterion("settime not between", value1, value2, "settime");
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
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andContentLikeInsensitive(String value) {
			addCriterion("upper(content) like", value.toUpperCase(), "content");
			return this;
		}
		
		public Criteria andMsgLikeInsensitive(String value) {
			addCriterion("upper(msg) like", value.toUpperCase(), "msg");
			return this;
		}
		
		public Criteria andOpttimeLikeInsensitive(String value) {
			addCriterion("upper(opttime) like", value.toUpperCase(), "opttime");
			return this;
		}
		
		public Criteria andUsernameLikeInsensitive(String value) {
			addCriterion("upper(username) like", value.toUpperCase(), "username");
			return this;
		}
		
		public Criteria andSettimeLikeInsensitive(String value) {
			addCriterion("upper(settime) like", value.toUpperCase(), "settime");
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