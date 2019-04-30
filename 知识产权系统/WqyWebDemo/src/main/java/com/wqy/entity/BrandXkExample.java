package com.wqy.entity;

import java.util.ArrayList;
import java.util.List;

public class BrandXkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandXkExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andBxkfIsNull() {
            addCriterion("bxkf is null");
            return (Criteria) this;
        }

        public Criteria andBxkfIsNotNull() {
            addCriterion("bxkf is not null");
            return (Criteria) this;
        }

        public Criteria andBxkfEqualTo(String value) {
            addCriterion("bxkf =", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfNotEqualTo(String value) {
            addCriterion("bxkf <>", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfGreaterThan(String value) {
            addCriterion("bxkf >", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfGreaterThanOrEqualTo(String value) {
            addCriterion("bxkf >=", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfLessThan(String value) {
            addCriterion("bxkf <", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfLessThanOrEqualTo(String value) {
            addCriterion("bxkf <=", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfLike(String value) {
            addCriterion("bxkf like", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfNotLike(String value) {
            addCriterion("bxkf not like", value, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfIn(List<String> values) {
            addCriterion("bxkf in", values, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfNotIn(List<String> values) {
            addCriterion("bxkf not in", values, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfBetween(String value1, String value2) {
            addCriterion("bxkf between", value1, value2, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkfNotBetween(String value1, String value2) {
            addCriterion("bxkf not between", value1, value2, "bxkf");
            return (Criteria) this;
        }

        public Criteria andBxkqxIsNull() {
            addCriterion("bxkqx is null");
            return (Criteria) this;
        }

        public Criteria andBxkqxIsNotNull() {
            addCriterion("bxkqx is not null");
            return (Criteria) this;
        }

        public Criteria andBxkqxEqualTo(String value) {
            addCriterion("bxkqx =", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxNotEqualTo(String value) {
            addCriterion("bxkqx <>", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxGreaterThan(String value) {
            addCriterion("bxkqx >", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxGreaterThanOrEqualTo(String value) {
            addCriterion("bxkqx >=", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxLessThan(String value) {
            addCriterion("bxkqx <", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxLessThanOrEqualTo(String value) {
            addCriterion("bxkqx <=", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxLike(String value) {
            addCriterion("bxkqx like", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxNotLike(String value) {
            addCriterion("bxkqx not like", value, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxIn(List<String> values) {
            addCriterion("bxkqx in", values, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxNotIn(List<String> values) {
            addCriterion("bxkqx not in", values, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxBetween(String value1, String value2) {
            addCriterion("bxkqx between", value1, value2, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkqxNotBetween(String value1, String value2) {
            addCriterion("bxkqx not between", value1, value2, "bxkqx");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwIsNull() {
            addCriterion("bxkspjfw is null");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwIsNotNull() {
            addCriterion("bxkspjfw is not null");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwEqualTo(String value) {
            addCriterion("bxkspjfw =", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwNotEqualTo(String value) {
            addCriterion("bxkspjfw <>", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwGreaterThan(String value) {
            addCriterion("bxkspjfw >", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwGreaterThanOrEqualTo(String value) {
            addCriterion("bxkspjfw >=", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwLessThan(String value) {
            addCriterion("bxkspjfw <", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwLessThanOrEqualTo(String value) {
            addCriterion("bxkspjfw <=", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwLike(String value) {
            addCriterion("bxkspjfw like", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwNotLike(String value) {
            addCriterion("bxkspjfw not like", value, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwIn(List<String> values) {
            addCriterion("bxkspjfw in", values, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwNotIn(List<String> values) {
            addCriterion("bxkspjfw not in", values, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwBetween(String value1, String value2) {
            addCriterion("bxkspjfw between", value1, value2, "bxkspjfw");
            return (Criteria) this;
        }

        public Criteria andBxkspjfwNotBetween(String value1, String value2) {
            addCriterion("bxkspjfw not between", value1, value2, "bxkspjfw");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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