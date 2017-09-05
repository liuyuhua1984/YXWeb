package com.gamecenter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterLogExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public RegisterLogExample() {
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
		
		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		
		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}
		
		public Criteria andAppidIsNull() {
			addCriterion("appId is null");
			return (Criteria) this;
		}
		
		public Criteria andAppidIsNotNull() {
			addCriterion("appId is not null");
			return (Criteria) this;
		}
		
		public Criteria andAppidEqualTo(Long value) {
			addCriterion("appId =", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotEqualTo(Long value) {
			addCriterion("appId <>", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidGreaterThan(Long value) {
			addCriterion("appId >", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidGreaterThanOrEqualTo(Long value) {
			addCriterion("appId >=", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidLessThan(Long value) {
			addCriterion("appId <", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidLessThanOrEqualTo(Long value) {
			addCriterion("appId <=", value, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidIn(List<Long> values) {
			addCriterion("appId in", values, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotIn(List<Long> values) {
			addCriterion("appId not in", values, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidBetween(Long value1, Long value2) {
			addCriterion("appId between", value1, value2, "appid");
			return (Criteria) this;
		}
		
		public Criteria andAppidNotBetween(Long value1, Long value2) {
			addCriterion("appId not between", value1, value2, "appid");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime in", values, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in", values, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeBetween(Date value1, Date value2) {
			addCriterion("createTime between", value1, value2, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
			addCriterion("createTime not between", value1, value2, "createtime");
			return (Criteria) this;
		}
		
		public Criteria andServeridIsNull() {
			addCriterion("serverId is null");
			return (Criteria) this;
		}
		
		public Criteria andServeridIsNotNull() {
			addCriterion("serverId is not null");
			return (Criteria) this;
		}
		
		public Criteria andServeridEqualTo(String value) {
			addCriterion("serverId =", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridNotEqualTo(String value) {
			addCriterion("serverId <>", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridGreaterThan(String value) {
			addCriterion("serverId >", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridGreaterThanOrEqualTo(String value) {
			addCriterion("serverId >=", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridLessThan(String value) {
			addCriterion("serverId <", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridLessThanOrEqualTo(String value) {
			addCriterion("serverId <=", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridLike(String value) {
			addCriterion("serverId like", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridNotLike(String value) {
			addCriterion("serverId not like", value, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridIn(List<String> values) {
			addCriterion("serverId in", values, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridNotIn(List<String> values) {
			addCriterion("serverId not in", values, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridBetween(String value1, String value2) {
			addCriterion("serverId between", value1, value2, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeridNotBetween(String value1, String value2) {
			addCriterion("serverId not between", value1, value2, "serverid");
			return (Criteria) this;
		}
		
		public Criteria andServeripIsNull() {
			addCriterion("serverIp is null");
			return (Criteria) this;
		}
		
		public Criteria andServeripIsNotNull() {
			addCriterion("serverIp is not null");
			return (Criteria) this;
		}
		
		public Criteria andServeripEqualTo(String value) {
			addCriterion("serverIp =", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripNotEqualTo(String value) {
			addCriterion("serverIp <>", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripGreaterThan(String value) {
			addCriterion("serverIp >", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripGreaterThanOrEqualTo(String value) {
			addCriterion("serverIp >=", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripLessThan(String value) {
			addCriterion("serverIp <", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripLessThanOrEqualTo(String value) {
			addCriterion("serverIp <=", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripLike(String value) {
			addCriterion("serverIp like", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripNotLike(String value) {
			addCriterion("serverIp not like", value, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripIn(List<String> values) {
			addCriterion("serverIp in", values, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripNotIn(List<String> values) {
			addCriterion("serverIp not in", values, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripBetween(String value1, String value2) {
			addCriterion("serverIp between", value1, value2, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andServeripNotBetween(String value1, String value2) {
			addCriterion("serverIp not between", value1, value2, "serverip");
			return (Criteria) this;
		}
		
		public Criteria andUseripIsNull() {
			addCriterion("userIp is null");
			return (Criteria) this;
		}
		
		public Criteria andUseripIsNotNull() {
			addCriterion("userIp is not null");
			return (Criteria) this;
		}
		
		public Criteria andUseripEqualTo(String value) {
			addCriterion("userIp =", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotEqualTo(String value) {
			addCriterion("userIp <>", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripGreaterThan(String value) {
			addCriterion("userIp >", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripGreaterThanOrEqualTo(String value) {
			addCriterion("userIp >=", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripLessThan(String value) {
			addCriterion("userIp <", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripLessThanOrEqualTo(String value) {
			addCriterion("userIp <=", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripLike(String value) {
			addCriterion("userIp like", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotLike(String value) {
			addCriterion("userIp not like", value, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripIn(List<String> values) {
			addCriterion("userIp in", values, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotIn(List<String> values) {
			addCriterion("userIp not in", values, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripBetween(String value1, String value2) {
			addCriterion("userIp between", value1, value2, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUseripNotBetween(String value1, String value2) {
			addCriterion("userIp not between", value1, value2, "userip");
			return (Criteria) this;
		}
		
		public Criteria andUsernameIsNull() {
			addCriterion("userName is null");
			return (Criteria) this;
		}
		
		public Criteria andUsernameIsNotNull() {
			addCriterion("userName is not null");
			return (Criteria) this;
		}
		
		public Criteria andUsernameEqualTo(String value) {
			addCriterion("userName =", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("userName <>", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("userName >", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("userName >=", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameLessThan(String value) {
			addCriterion("userName <", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("userName <=", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameLike(String value) {
			addCriterion("userName like", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotLike(String value) {
			addCriterion("userName not like", value, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameIn(List<String> values) {
			addCriterion("userName in", values, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("userName not in", values, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("userName between", value1, value2, "username");
			return (Criteria) this;
		}
		
		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("userName not between", value1, value2, "username");
			return (Criteria) this;
		}
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andServeridLikeInsensitive(String value) {
			addCriterion("upper(serverId) like", value.toUpperCase(), "serverid");
			return this;
		}
		
		public Criteria andServeripLikeInsensitive(String value) {
			addCriterion("upper(serverIp) like", value.toUpperCase(), "serverip");
			return this;
		}
		
		public Criteria andUseripLikeInsensitive(String value) {
			addCriterion("upper(userIp) like", value.toUpperCase(), "userip");
			return this;
		}
		
		public Criteria andUsernameLikeInsensitive(String value) {
			addCriterion("upper(userName) like", value.toUpperCase(), "username");
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