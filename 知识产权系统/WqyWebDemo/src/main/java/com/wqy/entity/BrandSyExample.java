package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandSyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandSyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSbsydwIsNull() {
            addCriterion("sbsydw is null");
            return (Criteria) this;
        }

        public Criteria andSbsydwIsNotNull() {
            addCriterion("sbsydw is not null");
            return (Criteria) this;
        }

        public Criteria andSbsydwEqualTo(String value) {
            addCriterion("sbsydw =", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwNotEqualTo(String value) {
            addCriterion("sbsydw <>", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwGreaterThan(String value) {
            addCriterion("sbsydw >", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwGreaterThanOrEqualTo(String value) {
            addCriterion("sbsydw >=", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwLessThan(String value) {
            addCriterion("sbsydw <", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwLessThanOrEqualTo(String value) {
            addCriterion("sbsydw <=", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwLike(String value) {
            addCriterion("sbsydw like", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwNotLike(String value) {
            addCriterion("sbsydw not like", value, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwIn(List<String> values) {
            addCriterion("sbsydw in", values, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwNotIn(List<String> values) {
            addCriterion("sbsydw not in", values, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwBetween(String value1, String value2) {
            addCriterion("sbsydw between", value1, value2, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSbsydwNotBetween(String value1, String value2) {
            addCriterion("sbsydw not between", value1, value2, "sbsydw");
            return (Criteria) this;
        }

        public Criteria andSpjfwIsNull() {
            addCriterion("spjfw is null");
            return (Criteria) this;
        }

        public Criteria andSpjfwIsNotNull() {
            addCriterion("spjfw is not null");
            return (Criteria) this;
        }

        public Criteria andSpjfwEqualTo(String value) {
            addCriterion("spjfw =", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwNotEqualTo(String value) {
            addCriterion("spjfw <>", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwGreaterThan(String value) {
            addCriterion("spjfw >", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwGreaterThanOrEqualTo(String value) {
            addCriterion("spjfw >=", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwLessThan(String value) {
            addCriterion("spjfw <", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwLessThanOrEqualTo(String value) {
            addCriterion("spjfw <=", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwLike(String value) {
            addCriterion("spjfw like", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwNotLike(String value) {
            addCriterion("spjfw not like", value, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwIn(List<String> values) {
            addCriterion("spjfw in", values, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwNotIn(List<String> values) {
            addCriterion("spjfw not in", values, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwBetween(String value1, String value2) {
            addCriterion("spjfw between", value1, value2, "spjfw");
            return (Criteria) this;
        }

        public Criteria andSpjfwNotBetween(String value1, String value2) {
            addCriterion("spjfw not between", value1, value2, "spjfw");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIsNull() {
            addCriterion("use_start_date is null");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIsNotNull() {
            addCriterion("use_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date =", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date <>", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("use_start_date >", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date >=", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateLessThan(Date value) {
            addCriterionForJDBCDate("use_start_date <", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date <=", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("use_start_date in", values, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("use_start_date not in", values, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_start_date between", value1, value2, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_start_date not between", value1, value2, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andSyzjIsNull() {
            addCriterion("syzj is null");
            return (Criteria) this;
        }

        public Criteria andSyzjIsNotNull() {
            addCriterion("syzj is not null");
            return (Criteria) this;
        }

        public Criteria andSyzjEqualTo(String value) {
            addCriterion("syzj =", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjNotEqualTo(String value) {
            addCriterion("syzj <>", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjGreaterThan(String value) {
            addCriterion("syzj >", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjGreaterThanOrEqualTo(String value) {
            addCriterion("syzj >=", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjLessThan(String value) {
            addCriterion("syzj <", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjLessThanOrEqualTo(String value) {
            addCriterion("syzj <=", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjLike(String value) {
            addCriterion("syzj like", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjNotLike(String value) {
            addCriterion("syzj not like", value, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjIn(List<String> values) {
            addCriterion("syzj in", values, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjNotIn(List<String> values) {
            addCriterion("syzj not in", values, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjBetween(String value1, String value2) {
            addCriterion("syzj between", value1, value2, "syzj");
            return (Criteria) this;
        }

        public Criteria andSyzjNotBetween(String value1, String value2) {
            addCriterion("syzj not between", value1, value2, "syzj");
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