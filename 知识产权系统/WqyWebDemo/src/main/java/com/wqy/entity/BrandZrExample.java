package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandZrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandZrExample() {
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

        public Criteria andZrslrIsNull() {
            addCriterion("zrslr is null");
            return (Criteria) this;
        }

        public Criteria andZrslrIsNotNull() {
            addCriterion("zrslr is not null");
            return (Criteria) this;
        }

        public Criteria andZrslrEqualTo(Date value) {
            addCriterionForJDBCDate("zrslr =", value, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrNotEqualTo(Date value) {
            addCriterionForJDBCDate("zrslr <>", value, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrGreaterThan(Date value) {
            addCriterionForJDBCDate("zrslr >", value, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zrslr >=", value, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrLessThan(Date value) {
            addCriterionForJDBCDate("zrslr <", value, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zrslr <=", value, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrIn(List<Date> values) {
            addCriterionForJDBCDate("zrslr in", values, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrNotIn(List<Date> values) {
            addCriterionForJDBCDate("zrslr not in", values, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zrslr between", value1, value2, "zrslr");
            return (Criteria) this;
        }

        public Criteria andZrslrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zrslr not between", value1, value2, "zrslr");
            return (Criteria) this;
        }

        public Criteria andSrrIsNull() {
            addCriterion("srr is null");
            return (Criteria) this;
        }

        public Criteria andSrrIsNotNull() {
            addCriterion("srr is not null");
            return (Criteria) this;
        }

        public Criteria andSrrEqualTo(String value) {
            addCriterion("srr =", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrNotEqualTo(String value) {
            addCriterion("srr <>", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrGreaterThan(String value) {
            addCriterion("srr >", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrGreaterThanOrEqualTo(String value) {
            addCriterion("srr >=", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrLessThan(String value) {
            addCriterion("srr <", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrLessThanOrEqualTo(String value) {
            addCriterion("srr <=", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrLike(String value) {
            addCriterion("srr like", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrNotLike(String value) {
            addCriterion("srr not like", value, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrIn(List<String> values) {
            addCriterion("srr in", values, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrNotIn(List<String> values) {
            addCriterion("srr not in", values, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrBetween(String value1, String value2) {
            addCriterion("srr between", value1, value2, "srr");
            return (Criteria) this;
        }

        public Criteria andSrrNotBetween(String value1, String value2) {
            addCriterion("srr not between", value1, value2, "srr");
            return (Criteria) this;
        }

        public Criteria andDljgIsNull() {
            addCriterion("dljg is null");
            return (Criteria) this;
        }

        public Criteria andDljgIsNotNull() {
            addCriterion("dljg is not null");
            return (Criteria) this;
        }

        public Criteria andDljgEqualTo(String value) {
            addCriterion("dljg =", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgNotEqualTo(String value) {
            addCriterion("dljg <>", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgGreaterThan(String value) {
            addCriterion("dljg >", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgGreaterThanOrEqualTo(String value) {
            addCriterion("dljg >=", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgLessThan(String value) {
            addCriterion("dljg <", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgLessThanOrEqualTo(String value) {
            addCriterion("dljg <=", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgLike(String value) {
            addCriterion("dljg like", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgNotLike(String value) {
            addCriterion("dljg not like", value, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgIn(List<String> values) {
            addCriterion("dljg in", values, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgNotIn(List<String> values) {
            addCriterion("dljg not in", values, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgBetween(String value1, String value2) {
            addCriterion("dljg between", value1, value2, "dljg");
            return (Criteria) this;
        }

        public Criteria andDljgNotBetween(String value1, String value2) {
            addCriterion("dljg not between", value1, value2, "dljg");
            return (Criteria) this;
        }

        public Criteria andZryyIsNull() {
            addCriterion("zryy is null");
            return (Criteria) this;
        }

        public Criteria andZryyIsNotNull() {
            addCriterion("zryy is not null");
            return (Criteria) this;
        }

        public Criteria andZryyEqualTo(String value) {
            addCriterion("zryy =", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyNotEqualTo(String value) {
            addCriterion("zryy <>", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyGreaterThan(String value) {
            addCriterion("zryy >", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyGreaterThanOrEqualTo(String value) {
            addCriterion("zryy >=", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyLessThan(String value) {
            addCriterion("zryy <", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyLessThanOrEqualTo(String value) {
            addCriterion("zryy <=", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyLike(String value) {
            addCriterion("zryy like", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyNotLike(String value) {
            addCriterion("zryy not like", value, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyIn(List<String> values) {
            addCriterion("zryy in", values, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyNotIn(List<String> values) {
            addCriterion("zryy not in", values, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyBetween(String value1, String value2) {
            addCriterion("zryy between", value1, value2, "zryy");
            return (Criteria) this;
        }

        public Criteria andZryyNotBetween(String value1, String value2) {
            addCriterion("zryy not between", value1, value2, "zryy");
            return (Criteria) this;
        }

        public Criteria andZrwcrIsNull() {
            addCriterion("zrwcr is null");
            return (Criteria) this;
        }

        public Criteria andZrwcrIsNotNull() {
            addCriterion("zrwcr is not null");
            return (Criteria) this;
        }

        public Criteria andZrwcrEqualTo(Date value) {
            addCriterionForJDBCDate("zrwcr =", value, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrNotEqualTo(Date value) {
            addCriterionForJDBCDate("zrwcr <>", value, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrGreaterThan(Date value) {
            addCriterionForJDBCDate("zrwcr >", value, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zrwcr >=", value, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrLessThan(Date value) {
            addCriterionForJDBCDate("zrwcr <", value, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zrwcr <=", value, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrIn(List<Date> values) {
            addCriterionForJDBCDate("zrwcr in", values, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrNotIn(List<Date> values) {
            addCriterionForJDBCDate("zrwcr not in", values, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zrwcr between", value1, value2, "zrwcr");
            return (Criteria) this;
        }

        public Criteria andZrwcrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zrwcr not between", value1, value2, "zrwcr");
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