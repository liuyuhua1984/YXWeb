package com.gamecenter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseGoldLogExample {
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public UseGoldLogExample() {
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
		
		public Criteria andGoldafterIsNull() {
			addCriterion("goldAfter is null");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterIsNotNull() {
			addCriterion("goldAfter is not null");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterEqualTo(Integer value) {
			addCriterion("goldAfter =", value, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterNotEqualTo(Integer value) {
			addCriterion("goldAfter <>", value, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterGreaterThan(Integer value) {
			addCriterion("goldAfter >", value, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterGreaterThanOrEqualTo(Integer value) {
			addCriterion("goldAfter >=", value, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterLessThan(Integer value) {
			addCriterion("goldAfter <", value, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterLessThanOrEqualTo(Integer value) {
			addCriterion("goldAfter <=", value, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterIn(List<Integer> values) {
			addCriterion("goldAfter in", values, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterNotIn(List<Integer> values) {
			addCriterion("goldAfter not in", values, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterBetween(Integer value1, Integer value2) {
			addCriterion("goldAfter between", value1, value2, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldafterNotBetween(Integer value1, Integer value2) {
			addCriterion("goldAfter not between", value1, value2, "goldafter");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeIsNull() {
			addCriterion("goldBefore is null");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeIsNotNull() {
			addCriterion("goldBefore is not null");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeEqualTo(Integer value) {
			addCriterion("goldBefore =", value, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeNotEqualTo(Integer value) {
			addCriterion("goldBefore <>", value, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeGreaterThan(Integer value) {
			addCriterion("goldBefore >", value, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeGreaterThanOrEqualTo(Integer value) {
			addCriterion("goldBefore >=", value, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeLessThan(Integer value) {
			addCriterion("goldBefore <", value, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeLessThanOrEqualTo(Integer value) {
			addCriterion("goldBefore <=", value, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeIn(List<Integer> values) {
			addCriterion("goldBefore in", values, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeNotIn(List<Integer> values) {
			addCriterion("goldBefore not in", values, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeBetween(Integer value1, Integer value2) {
			addCriterion("goldBefore between", value1, value2, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andGoldbeforeNotBetween(Integer value1, Integer value2) {
			addCriterion("goldBefore not between", value1, value2, "goldbefore");
			return (Criteria) this;
		}
		
		public Criteria andItemidIsNull() {
			addCriterion("itemId is null");
			return (Criteria) this;
		}
		
		public Criteria andItemidIsNotNull() {
			addCriterion("itemId is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemidEqualTo(Long value) {
			addCriterion("itemId =", value, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidNotEqualTo(Long value) {
			addCriterion("itemId <>", value, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidGreaterThan(Long value) {
			addCriterion("itemId >", value, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidGreaterThanOrEqualTo(Long value) {
			addCriterion("itemId >=", value, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidLessThan(Long value) {
			addCriterion("itemId <", value, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidLessThanOrEqualTo(Long value) {
			addCriterion("itemId <=", value, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidIn(List<Long> values) {
			addCriterion("itemId in", values, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidNotIn(List<Long> values) {
			addCriterion("itemId not in", values, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidBetween(Long value1, Long value2) {
			addCriterion("itemId between", value1, value2, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemidNotBetween(Long value1, Long value2) {
			addCriterion("itemId not between", value1, value2, "itemid");
			return (Criteria) this;
		}
		
		public Criteria andItemnameIsNull() {
			addCriterion("itemName is null");
			return (Criteria) this;
		}
		
		public Criteria andItemnameIsNotNull() {
			addCriterion("itemName is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemnameEqualTo(String value) {
			addCriterion("itemName =", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotEqualTo(String value) {
			addCriterion("itemName <>", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameGreaterThan(String value) {
			addCriterion("itemName >", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameGreaterThanOrEqualTo(String value) {
			addCriterion("itemName >=", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameLessThan(String value) {
			addCriterion("itemName <", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameLessThanOrEqualTo(String value) {
			addCriterion("itemName <=", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameLike(String value) {
			addCriterion("itemName like", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotLike(String value) {
			addCriterion("itemName not like", value, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameIn(List<String> values) {
			addCriterion("itemName in", values, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotIn(List<String> values) {
			addCriterion("itemName not in", values, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameBetween(String value1, String value2) {
			addCriterion("itemName between", value1, value2, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnameNotBetween(String value1, String value2) {
			addCriterion("itemName not between", value1, value2, "itemname");
			return (Criteria) this;
		}
		
		public Criteria andItemnumIsNull() {
			addCriterion("itemNum is null");
			return (Criteria) this;
		}
		
		public Criteria andItemnumIsNotNull() {
			addCriterion("itemNum is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemnumEqualTo(Integer value) {
			addCriterion("itemNum =", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumNotEqualTo(Integer value) {
			addCriterion("itemNum <>", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumGreaterThan(Integer value) {
			addCriterion("itemNum >", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("itemNum >=", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumLessThan(Integer value) {
			addCriterion("itemNum <", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumLessThanOrEqualTo(Integer value) {
			addCriterion("itemNum <=", value, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumIn(List<Integer> values) {
			addCriterion("itemNum in", values, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumNotIn(List<Integer> values) {
			addCriterion("itemNum not in", values, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumBetween(Integer value1, Integer value2) {
			addCriterion("itemNum between", value1, value2, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemnumNotBetween(Integer value1, Integer value2) {
			addCriterion("itemNum not between", value1, value2, "itemnum");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeIsNull() {
			addCriterion("itemType is null");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeIsNotNull() {
			addCriterion("itemType is not null");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeEqualTo(Integer value) {
			addCriterion("itemType =", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotEqualTo(Integer value) {
			addCriterion("itemType <>", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeGreaterThan(Integer value) {
			addCriterion("itemType >", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("itemType >=", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeLessThan(Integer value) {
			addCriterion("itemType <", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeLessThanOrEqualTo(Integer value) {
			addCriterion("itemType <=", value, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeIn(List<Integer> values) {
			addCriterion("itemType in", values, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotIn(List<Integer> values) {
			addCriterion("itemType not in", values, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeBetween(Integer value1, Integer value2) {
			addCriterion("itemType between", value1, value2, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andItemtypeNotBetween(Integer value1, Integer value2) {
			addCriterion("itemType not between", value1, value2, "itemtype");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldIsNull() {
			addCriterion("lostGold is null");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldIsNotNull() {
			addCriterion("lostGold is not null");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldEqualTo(Integer value) {
			addCriterion("lostGold =", value, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldNotEqualTo(Integer value) {
			addCriterion("lostGold <>", value, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldGreaterThan(Integer value) {
			addCriterion("lostGold >", value, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldGreaterThanOrEqualTo(Integer value) {
			addCriterion("lostGold >=", value, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldLessThan(Integer value) {
			addCriterion("lostGold <", value, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldLessThanOrEqualTo(Integer value) {
			addCriterion("lostGold <=", value, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldIn(List<Integer> values) {
			addCriterion("lostGold in", values, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldNotIn(List<Integer> values) {
			addCriterion("lostGold not in", values, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldBetween(Integer value1, Integer value2) {
			addCriterion("lostGold between", value1, value2, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andLostgoldNotBetween(Integer value1, Integer value2) {
			addCriterion("lostGold not between", value1, value2, "lostgold");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelIsNull() {
			addCriterion("roleLevel is null");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelIsNotNull() {
			addCriterion("roleLevel is not null");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelEqualTo(Integer value) {
			addCriterion("roleLevel =", value, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelNotEqualTo(Integer value) {
			addCriterion("roleLevel <>", value, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelGreaterThan(Integer value) {
			addCriterion("roleLevel >", value, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("roleLevel >=", value, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelLessThan(Integer value) {
			addCriterion("roleLevel <", value, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelLessThanOrEqualTo(Integer value) {
			addCriterion("roleLevel <=", value, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelIn(List<Integer> values) {
			addCriterion("roleLevel in", values, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelNotIn(List<Integer> values) {
			addCriterion("roleLevel not in", values, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelBetween(Integer value1, Integer value2) {
			addCriterion("roleLevel between", value1, value2, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolelevelNotBetween(Integer value1, Integer value2) {
			addCriterion("roleLevel not between", value1, value2, "rolelevel");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIsNull() {
			addCriterion("roleName is null");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIsNotNull() {
			addCriterion("roleName is not null");
			return (Criteria) this;
		}
		
		public Criteria andRolenameEqualTo(String value) {
			addCriterion("roleName =", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotEqualTo(String value) {
			addCriterion("roleName <>", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameGreaterThan(String value) {
			addCriterion("roleName >", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameGreaterThanOrEqualTo(String value) {
			addCriterion("roleName >=", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLessThan(String value) {
			addCriterion("roleName <", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLessThanOrEqualTo(String value) {
			addCriterion("roleName <=", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameLike(String value) {
			addCriterion("roleName like", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotLike(String value) {
			addCriterion("roleName not like", value, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameIn(List<String> values) {
			addCriterion("roleName in", values, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotIn(List<String> values) {
			addCriterion("roleName not in", values, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameBetween(String value1, String value2) {
			addCriterion("roleName between", value1, value2, "rolename");
			return (Criteria) this;
		}
		
		public Criteria andRolenameNotBetween(String value1, String value2) {
			addCriterion("roleName not between", value1, value2, "rolename");
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
		
		public Criteria andItemnameLikeInsensitive(String value) {
			addCriterion("upper(itemName) like", value.toUpperCase(), "itemname");
			return this;
		}
		
		public Criteria andRolenameLikeInsensitive(String value) {
			addCriterion("upper(roleName) like", value.toUpperCase(), "rolename");
			return this;
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