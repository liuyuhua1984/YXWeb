package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssConsumeDayreportExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public OpOssConsumeDayreportExample() {
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
		
		public Criteria andItemtypeIsNull() {
			addCriterion("itemtype is null");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeIsNotNull() {
			addCriterion("itemtype is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeEqualTo(String value) {
			addCriterion("itemtype =", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotEqualTo(String value) {
			addCriterion("itemtype <>", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeGreaterThan(String value) {
			addCriterion("itemtype >", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeGreaterThanOrEqualTo(String value) {
			addCriterion("itemtype >=", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeLessThan(String value) {
			addCriterion("itemtype <", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeLessThanOrEqualTo(String value) {
			addCriterion("itemtype <=", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeLike(String value) {
			addCriterion("itemtype like", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotLike(String value) {
			addCriterion("itemtype not like", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeIn(List<String> values) {
			addCriterion("itemtype in", values, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotIn(List<String> values) {
			addCriterion("itemtype not in", values, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeBetween(String value1, String value2) {
			addCriterion("itemtype between", value1, value2, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotBetween(String value1, String value2) {
			addCriterion("itemtype not between", value1, value2, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemnameIsNull() {
			addCriterion("itemname is null");
			return (Criteria) this;
		}
		
		public Criteria andItemnameIsNotNull() {
			addCriterion("itemname is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemnameEqualTo(String value) {
			addCriterion("itemname =", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotEqualTo(String value) {
			addCriterion("itemname <>", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameGreaterThan(String value) {
			addCriterion("itemname >", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameGreaterThanOrEqualTo(String value) {
			addCriterion("itemname >=", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameLessThan(String value) {
			addCriterion("itemname <", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameLessThanOrEqualTo(String value) {
			addCriterion("itemname <=", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameLike(String value) {
			addCriterion("itemname like", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotLike(String value) {
			addCriterion("itemname not like", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameIn(List<String> values) {
			addCriterion("itemname in", values, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotIn(List<String> values) {
			addCriterion("itemname not in", values, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameBetween(String value1, String value2) {
			addCriterion("itemname between", value1, value2, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotBetween(String value1, String value2) {
			addCriterion("itemname not between", value1, value2, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnumIsNull() {
			addCriterion("itemnum is null");
			return (Criteria) this;
		}
		
		public Criteria andItemnumIsNotNull() {
			addCriterion("itemnum is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemnumEqualTo(Integer value) {
			addCriterion("itemnum =", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumNotEqualTo(Integer value) {
			addCriterion("itemnum <>", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumGreaterThan(Integer value) {
			addCriterion("itemnum >", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("itemnum >=", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumLessThan(Integer value) {
			addCriterion("itemnum <", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumLessThanOrEqualTo(Integer value) {
			addCriterion("itemnum <=", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumIn(List<Integer> values) {
			addCriterion("itemnum in", values, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumNotIn(List<Integer> values) {
			addCriterion("itemnum not in", values, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumBetween(Integer value1, Integer value2) {
			addCriterion("itemnum between", value1, value2, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumNotBetween(Integer value1, Integer value2) {
			addCriterion("itemnum not between", value1, value2, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumIsNull() {
			addCriterion("usernum is null");
			return (Criteria) this;
		}
		
		public Criteria andUsernumIsNotNull() {
			addCriterion("usernum is not null");
			return (Criteria) this;
		}
		
		public Criteria andUsernumEqualTo(Integer value) {
			addCriterion("usernum =", value, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumNotEqualTo(Integer value) {
			addCriterion("usernum <>", value, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumGreaterThan(Integer value) {
			addCriterion("usernum >", value, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumGreaterThanOrEqualTo(Integer value) {
			addCriterion("usernum >=", value, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumLessThan(Integer value) {
			addCriterion("usernum <", value, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumLessThanOrEqualTo(Integer value) {
			addCriterion("usernum <=", value, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumIn(List<Integer> values) {
			addCriterion("usernum in", values, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumNotIn(List<Integer> values) {
			addCriterion("usernum not in", values, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumBetween(Integer value1, Integer value2) {
			addCriterion("usernum between", value1, value2, "usernum");
			return (Criteria) this;
		}
		
		public Criteria andUsernumNotBetween(Integer value1, Integer value2) {
			addCriterion("usernum not between", value1, value2, "usernum");
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
		
		public Criteria andItemtypeLikeInsensitive(String value) {
			addCriterion("upper(itemtype) like", value.toUpperCase(), "itemtype");
			return this;
		}
		
		public Criteria andItemnameLikeInsensitive(String value) {
			addCriterion("upper(itemname) like", value.toUpperCase(), "itemname");
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