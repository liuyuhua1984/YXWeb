package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpAgentConfigExample {
    /**
     * op_agent_config
     */
    protected String orderByClause;

    /**
     * op_agent_config
     */
    protected boolean distinct;

    /**
     * op_agent_config
     */
    protected List<Criteria> oredCriteria;

    public OpAgentConfigExample() {
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

    /**
     * op_agent_config null
     */
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

        public Criteria andOneLevelIsNull() {
            addCriterion("one_level is null");
            return (Criteria) this;
        }

        public Criteria andOneLevelIsNotNull() {
            addCriterion("one_level is not null");
            return (Criteria) this;
        }

        public Criteria andOneLevelEqualTo(String value) {
            addCriterion("one_level =", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotEqualTo(String value) {
            addCriterion("one_level <>", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelGreaterThan(String value) {
            addCriterion("one_level >", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelGreaterThanOrEqualTo(String value) {
            addCriterion("one_level >=", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelLessThan(String value) {
            addCriterion("one_level <", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelLessThanOrEqualTo(String value) {
            addCriterion("one_level <=", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelLike(String value) {
            addCriterion("one_level like", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotLike(String value) {
            addCriterion("one_level not like", value, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelIn(List<String> values) {
            addCriterion("one_level in", values, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotIn(List<String> values) {
            addCriterion("one_level not in", values, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelBetween(String value1, String value2) {
            addCriterion("one_level between", value1, value2, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andOneLevelNotBetween(String value1, String value2) {
            addCriterion("one_level not between", value1, value2, "oneLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelIsNull() {
            addCriterion("two_level is null");
            return (Criteria) this;
        }

        public Criteria andTwoLevelIsNotNull() {
            addCriterion("two_level is not null");
            return (Criteria) this;
        }

        public Criteria andTwoLevelEqualTo(String value) {
            addCriterion("two_level =", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotEqualTo(String value) {
            addCriterion("two_level <>", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelGreaterThan(String value) {
            addCriterion("two_level >", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelGreaterThanOrEqualTo(String value) {
            addCriterion("two_level >=", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelLessThan(String value) {
            addCriterion("two_level <", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelLessThanOrEqualTo(String value) {
            addCriterion("two_level <=", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelLike(String value) {
            addCriterion("two_level like", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotLike(String value) {
            addCriterion("two_level not like", value, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelIn(List<String> values) {
            addCriterion("two_level in", values, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotIn(List<String> values) {
            addCriterion("two_level not in", values, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelBetween(String value1, String value2) {
            addCriterion("two_level between", value1, value2, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andTwoLevelNotBetween(String value1, String value2) {
            addCriterion("two_level not between", value1, value2, "twoLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIsNull() {
            addCriterion("three_level is null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIsNotNull() {
            addCriterion("three_level is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelEqualTo(String value) {
            addCriterion("three_level =", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotEqualTo(String value) {
            addCriterion("three_level <>", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelGreaterThan(String value) {
            addCriterion("three_level >", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("three_level >=", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelLessThan(String value) {
            addCriterion("three_level <", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelLessThanOrEqualTo(String value) {
            addCriterion("three_level <=", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelLike(String value) {
            addCriterion("three_level like", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotLike(String value) {
            addCriterion("three_level not like", value, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIn(List<String> values) {
            addCriterion("three_level in", values, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotIn(List<String> values) {
            addCriterion("three_level not in", values, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelBetween(String value1, String value2) {
            addCriterion("three_level between", value1, value2, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNotBetween(String value1, String value2) {
            addCriterion("three_level not between", value1, value2, "threeLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelIsNull() {
            addCriterion("none_level is null");
            return (Criteria) this;
        }

        public Criteria andNoneLevelIsNotNull() {
            addCriterion("none_level is not null");
            return (Criteria) this;
        }

        public Criteria andNoneLevelEqualTo(String value) {
            addCriterion("none_level =", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelNotEqualTo(String value) {
            addCriterion("none_level <>", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelGreaterThan(String value) {
            addCriterion("none_level >", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelGreaterThanOrEqualTo(String value) {
            addCriterion("none_level >=", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelLessThan(String value) {
            addCriterion("none_level <", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelLessThanOrEqualTo(String value) {
            addCriterion("none_level <=", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelLike(String value) {
            addCriterion("none_level like", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelNotLike(String value) {
            addCriterion("none_level not like", value, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelIn(List<String> values) {
            addCriterion("none_level in", values, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelNotIn(List<String> values) {
            addCriterion("none_level not in", values, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelBetween(String value1, String value2) {
            addCriterion("none_level between", value1, value2, "noneLevel");
            return (Criteria) this;
        }

        public Criteria andNoneLevelNotBetween(String value1, String value2) {
            addCriterion("none_level not between", value1, value2, "noneLevel");
            return (Criteria) this;
        }
    }

    /**
     * op_agent_config
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * op_agent_config null
     */
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