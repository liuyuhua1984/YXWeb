package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

import com.gamecenter.common.PageListNum;

public class OpGmtSendmoneyPayExample extends PageListNum {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpGmtSendmoneyPayExample() {
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
		
		public Criteria andOrderidIsNull() {
			addCriterion("orderid is null");
			return (Criteria) this;
		}
		
		public Criteria andOrderidIsNotNull() {
			addCriterion("orderid is not null");
			return (Criteria) this;
		}
		
		public Criteria andOrderidEqualTo(String value) {
			addCriterion("orderid =", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidNotEqualTo(String value) {
			addCriterion("orderid <>", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidGreaterThan(String value) {
			addCriterion("orderid >", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidGreaterThanOrEqualTo(String value) {
			addCriterion("orderid >=", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidLessThan(String value) {
			addCriterion("orderid <", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidLessThanOrEqualTo(String value) {
			addCriterion("orderid <=", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidLike(String value) {
			addCriterion("orderid like", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidNotLike(String value) {
			addCriterion("orderid not like", value, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidIn(List<String> values) {
			addCriterion("orderid in", values, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidNotIn(List<String> values) {
			addCriterion("orderid not in", values, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidBetween(String value1, String value2) {
			addCriterion("orderid between", value1, value2, "orderid");
			return (Criteria) this;
		}
		
		public Criteria andOrderidNotBetween(String value1, String value2) {
			addCriterion("orderid not between", value1, value2, "orderid");
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
		
		public Criteria andPassportIsNull() {
			addCriterion("passport is null");
			return (Criteria) this;
		}
		
		public Criteria andPassportIsNotNull() {
			addCriterion("passport is not null");
			return (Criteria) this;
		}
		
		public Criteria andPassportEqualTo(String value) {
			addCriterion("passport =", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotEqualTo(String value) {
			addCriterion("passport <>", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportGreaterThan(String value) {
			addCriterion("passport >", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportGreaterThanOrEqualTo(String value) {
			addCriterion("passport >=", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLessThan(String value) {
			addCriterion("passport <", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLessThanOrEqualTo(String value) {
			addCriterion("passport <=", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportLike(String value) {
			addCriterion("passport like", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotLike(String value) {
			addCriterion("passport not like", value, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportIn(List<String> values) {
			addCriterion("passport in", values, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotIn(List<String> values) {
			addCriterion("passport not in", values, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportBetween(String value1, String value2) {
			addCriterion("passport between", value1, value2, "passport");
			return (Criteria) this;
		}
		
		public Criteria andPassportNotBetween(String value1, String value2) {
			addCriterion("passport not between", value1, value2, "passport");
			return (Criteria) this;
		}
		
		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}
		
		public Criteria andMoneyEqualTo(Double value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyNotEqualTo(Double value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyGreaterThan(Double value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyLessThan(Double value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyLessThanOrEqualTo(Double value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyIn(List<Double> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyNotIn(List<Double> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyBetween(Double value1, Double value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}
		
		public Criteria andMoneyNotBetween(Double value1, Double value2) {
			addCriterion("money not between", value1, value2, "money");
			return (Criteria) this;
		}
		
		public Criteria andSendidIsNull() {
			addCriterion("sendid is null");
			return (Criteria) this;
		}
		
		public Criteria andSendidIsNotNull() {
			addCriterion("sendid is not null");
			return (Criteria) this;
		}
		
		public Criteria andSendidEqualTo(Integer value) {
			addCriterion("sendid =", value, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidNotEqualTo(Integer value) {
			addCriterion("sendid <>", value, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidGreaterThan(Integer value) {
			addCriterion("sendid >", value, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidGreaterThanOrEqualTo(Integer value) {
			addCriterion("sendid >=", value, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidLessThan(Integer value) {
			addCriterion("sendid <", value, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidLessThanOrEqualTo(Integer value) {
			addCriterion("sendid <=", value, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidIn(List<Integer> values) {
			addCriterion("sendid in", values, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidNotIn(List<Integer> values) {
			addCriterion("sendid not in", values, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidBetween(Integer value1, Integer value2) {
			addCriterion("sendid between", value1, value2, "sendid");
			return (Criteria) this;
		}
		
		public Criteria andSendidNotBetween(Integer value1, Integer value2) {
			addCriterion("sendid not between", value1, value2, "sendid");
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
	}
	
	public static class Criteria extends GeneratedCriteria {
		
		protected Criteria() {
			super();
		}
		
		public Criteria andOrderidLikeInsensitive(String value) {
			addCriterion("upper(orderid) like", value.toUpperCase(), "orderid");
			return this;
		}
		
		public Criteria andAppidLikeInsensitive(String value) {
			addCriterion("upper(appid) like", value.toUpperCase(), "appid");
			return this;
		}
		
		public Criteria andWorldidLikeInsensitive(String value) {
			addCriterion("upper(worldid) like", value.toUpperCase(), "worldid");
			return this;
		}
		
		public Criteria andPassportLikeInsensitive(String value) {
			addCriterion("upper(passport) like", value.toUpperCase(), "passport");
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
		
		public Criteria andAddtimeLikeInsensitive(String value) {
			addCriterion("upper(addtime) like", value.toUpperCase(), "addtime");
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