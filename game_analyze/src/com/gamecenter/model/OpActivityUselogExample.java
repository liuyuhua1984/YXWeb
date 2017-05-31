package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpActivityUselogExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpActivityUselogExample() {
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
		
		public Criteria andCdkcodeIsNull() {
			addCriterion("cdkcode is null");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeIsNotNull() {
			addCriterion("cdkcode is not null");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeEqualTo(String value) {
			addCriterion("cdkcode =", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeNotEqualTo(String value) {
			addCriterion("cdkcode <>", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeGreaterThan(String value) {
			addCriterion("cdkcode >", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeGreaterThanOrEqualTo(String value) {
			addCriterion("cdkcode >=", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeLessThan(String value) {
			addCriterion("cdkcode <", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeLessThanOrEqualTo(String value) {
			addCriterion("cdkcode <=", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeLike(String value) {
			addCriterion("cdkcode like", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeNotLike(String value) {
			addCriterion("cdkcode not like", value, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeIn(List<String> values) {
			addCriterion("cdkcode in", values, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeNotIn(List<String> values) {
			addCriterion("cdkcode not in", values, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeBetween(String value1, String value2) {
			addCriterion("cdkcode between", value1, value2, "cdkcode");
			return (Criteria) this;
		}
		
		public Criteria andCdkcodeNotBetween(String value1, String value2) {
			addCriterion("cdkcode not between", value1, value2, "cdkcode");
			return (Criteria) this;
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
		
		public Criteria andUseridIsNull() {
			addCriterion("userid is null");
			return (Criteria) this;
		}
		
		public Criteria andUseridIsNotNull() {
			addCriterion("userid is not null");
			return (Criteria) this;
		}
		
		public Criteria andUseridEqualTo(String value) {
			addCriterion("userid =", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridNotEqualTo(String value) {
			addCriterion("userid <>", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridGreaterThan(String value) {
			addCriterion("userid >", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridGreaterThanOrEqualTo(String value) {
			addCriterion("userid >=", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridLessThan(String value) {
			addCriterion("userid <", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridLessThanOrEqualTo(String value) {
			addCriterion("userid <=", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridLike(String value) {
			addCriterion("userid like", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridNotLike(String value) {
			addCriterion("userid not like", value, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridIn(List<String> values) {
			addCriterion("userid in", values, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridNotIn(List<String> values) {
			addCriterion("userid not in", values, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridBetween(String value1, String value2) {
			addCriterion("userid between", value1, value2, "userid");
			return (Criteria) this;
		}
		
		public Criteria andUseridNotBetween(String value1, String value2) {
			addCriterion("userid not between", value1, value2, "userid");
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
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andCdkcodeLikeInsensitive(String value) {
			addCriterion("upper(cdkcode) like", value.toUpperCase(), "cdkcode");
			return this;
		}
		
		public Criteria andUseridLikeInsensitive(String value) {
			addCriterion("upper(userid) like", value.toUpperCase(), "userid");
			return this;
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andTimeLikeInsensitive(String value) {
			addCriterion("upper(time) like", value.toUpperCase(), "time");
			return this;
		}
		
		public Criteria andUseripLikeInsensitive(String value) {
			addCriterion("upper(userip) like", value.toUpperCase(), "userip");
			return this;
		}
		
		public Criteria andInfoLikeInsensitive(String value) {
			addCriterion("upper(info) like", value.toUpperCase(), "info");
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