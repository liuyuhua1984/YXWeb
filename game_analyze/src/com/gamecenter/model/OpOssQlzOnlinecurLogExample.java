package com.gamecenter.model;

import java.util.ArrayList;
import java.util.List;

public class OpOssQlzOnlinecurLogExample {
    /**
     * op_oss_qlz_onlinecur_log
     */
    protected String orderByClause;

    /**
     * op_oss_qlz_onlinecur_log
     */
    protected boolean distinct;

    /**
     * op_oss_qlz_onlinecur_log
     */
    protected List<Criteria> oredCriteria;

    public OpOssQlzOnlinecurLogExample() {
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
     * op_oss_qlz_onlinecur_log null
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

        public Criteria andOnlinenumIsNull() {
            addCriterion("onlinenum is null");
            return (Criteria) this;
        }

        public Criteria andOnlinenumIsNotNull() {
            addCriterion("onlinenum is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinenumEqualTo(Integer value) {
            addCriterion("onlinenum =", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotEqualTo(Integer value) {
            addCriterion("onlinenum <>", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumGreaterThan(Integer value) {
            addCriterion("onlinenum >", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlinenum >=", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumLessThan(Integer value) {
            addCriterion("onlinenum <", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumLessThanOrEqualTo(Integer value) {
            addCriterion("onlinenum <=", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumIn(List<Integer> values) {
            addCriterion("onlinenum in", values, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotIn(List<Integer> values) {
            addCriterion("onlinenum not in", values, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumBetween(Integer value1, Integer value2) {
            addCriterion("onlinenum between", value1, value2, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("onlinenum not between", value1, value2, "onlinenum");
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }
    }

    /**
     * op_oss_qlz_onlinecur_log
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * op_oss_qlz_onlinecur_log null
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