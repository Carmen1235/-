package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandCxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandCxExample() {
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

        public Criteria andCxfIsNull() {
            addCriterion("cxf is null");
            return (Criteria) this;
        }

        public Criteria andCxfIsNotNull() {
            addCriterion("cxf is not null");
            return (Criteria) this;
        }

        public Criteria andCxfEqualTo(String value) {
            addCriterion("cxf =", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfNotEqualTo(String value) {
            addCriterion("cxf <>", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfGreaterThan(String value) {
            addCriterion("cxf >", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfGreaterThanOrEqualTo(String value) {
            addCriterion("cxf >=", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfLessThan(String value) {
            addCriterion("cxf <", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfLessThanOrEqualTo(String value) {
            addCriterion("cxf <=", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfLike(String value) {
            addCriterion("cxf like", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfNotLike(String value) {
            addCriterion("cxf not like", value, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfIn(List<String> values) {
            addCriterion("cxf in", values, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfNotIn(List<String> values) {
            addCriterion("cxf not in", values, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfBetween(String value1, String value2) {
            addCriterion("cxf between", value1, value2, "cxf");
            return (Criteria) this;
        }

        public Criteria andCxfNotBetween(String value1, String value2) {
            addCriterion("cxf not between", value1, value2, "cxf");
            return (Criteria) this;
        }

        public Criteria andBcxfIsNull() {
            addCriterion("bcxf is null");
            return (Criteria) this;
        }

        public Criteria andBcxfIsNotNull() {
            addCriterion("bcxf is not null");
            return (Criteria) this;
        }

        public Criteria andBcxfEqualTo(String value) {
            addCriterion("bcxf =", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfNotEqualTo(String value) {
            addCriterion("bcxf <>", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfGreaterThan(String value) {
            addCriterion("bcxf >", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfGreaterThanOrEqualTo(String value) {
            addCriterion("bcxf >=", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfLessThan(String value) {
            addCriterion("bcxf <", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfLessThanOrEqualTo(String value) {
            addCriterion("bcxf <=", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfLike(String value) {
            addCriterion("bcxf like", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfNotLike(String value) {
            addCriterion("bcxf not like", value, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfIn(List<String> values) {
            addCriterion("bcxf in", values, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfNotIn(List<String> values) {
            addCriterion("bcxf not in", values, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfBetween(String value1, String value2) {
            addCriterion("bcxf between", value1, value2, "bcxf");
            return (Criteria) this;
        }

        public Criteria andBcxfNotBetween(String value1, String value2) {
            addCriterion("bcxf not between", value1, value2, "bcxf");
            return (Criteria) this;
        }

        public Criteria andCxqzIsNull() {
            addCriterion("cxqz is null");
            return (Criteria) this;
        }

        public Criteria andCxqzIsNotNull() {
            addCriterion("cxqz is not null");
            return (Criteria) this;
        }

        public Criteria andCxqzEqualTo(String value) {
            addCriterion("cxqz =", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzNotEqualTo(String value) {
            addCriterion("cxqz <>", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzGreaterThan(String value) {
            addCriterion("cxqz >", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzGreaterThanOrEqualTo(String value) {
            addCriterion("cxqz >=", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzLessThan(String value) {
            addCriterion("cxqz <", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzLessThanOrEqualTo(String value) {
            addCriterion("cxqz <=", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzLike(String value) {
            addCriterion("cxqz like", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzNotLike(String value) {
            addCriterion("cxqz not like", value, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzIn(List<String> values) {
            addCriterion("cxqz in", values, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzNotIn(List<String> values) {
            addCriterion("cxqz not in", values, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzBetween(String value1, String value2) {
            addCriterion("cxqz between", value1, value2, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxqzNotBetween(String value1, String value2) {
            addCriterion("cxqz not between", value1, value2, "cxqz");
            return (Criteria) this;
        }

        public Criteria andCxrqIsNull() {
            addCriterion("cxrq is null");
            return (Criteria) this;
        }

        public Criteria andCxrqIsNotNull() {
            addCriterion("cxrq is not null");
            return (Criteria) this;
        }

        public Criteria andCxrqEqualTo(Date value) {
            addCriterionForJDBCDate("cxrq =", value, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("cxrq <>", value, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqGreaterThan(Date value) {
            addCriterionForJDBCDate("cxrq >", value, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cxrq >=", value, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqLessThan(Date value) {
            addCriterionForJDBCDate("cxrq <", value, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cxrq <=", value, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqIn(List<Date> values) {
            addCriterionForJDBCDate("cxrq in", values, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("cxrq not in", values, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cxrq between", value1, value2, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cxrq not between", value1, value2, "cxrq");
            return (Criteria) this;
        }

        public Criteria andCxdljgIsNull() {
            addCriterion("cxdljg is null");
            return (Criteria) this;
        }

        public Criteria andCxdljgIsNotNull() {
            addCriterion("cxdljg is not null");
            return (Criteria) this;
        }

        public Criteria andCxdljgEqualTo(String value) {
            addCriterion("cxdljg =", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgNotEqualTo(String value) {
            addCriterion("cxdljg <>", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgGreaterThan(String value) {
            addCriterion("cxdljg >", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgGreaterThanOrEqualTo(String value) {
            addCriterion("cxdljg >=", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgLessThan(String value) {
            addCriterion("cxdljg <", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgLessThanOrEqualTo(String value) {
            addCriterion("cxdljg <=", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgLike(String value) {
            addCriterion("cxdljg like", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgNotLike(String value) {
            addCriterion("cxdljg not like", value, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgIn(List<String> values) {
            addCriterion("cxdljg in", values, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgNotIn(List<String> values) {
            addCriterion("cxdljg not in", values, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgBetween(String value1, String value2) {
            addCriterion("cxdljg between", value1, value2, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxdljgNotBetween(String value1, String value2) {
            addCriterion("cxdljg not between", value1, value2, "cxdljg");
            return (Criteria) this;
        }

        public Criteria andCxjgIsNull() {
            addCriterion("cxjg is null");
            return (Criteria) this;
        }

        public Criteria andCxjgIsNotNull() {
            addCriterion("cxjg is not null");
            return (Criteria) this;
        }

        public Criteria andCxjgEqualTo(String value) {
            addCriterion("cxjg =", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgNotEqualTo(String value) {
            addCriterion("cxjg <>", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgGreaterThan(String value) {
            addCriterion("cxjg >", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgGreaterThanOrEqualTo(String value) {
            addCriterion("cxjg >=", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgLessThan(String value) {
            addCriterion("cxjg <", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgLessThanOrEqualTo(String value) {
            addCriterion("cxjg <=", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgLike(String value) {
            addCriterion("cxjg like", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgNotLike(String value) {
            addCriterion("cxjg not like", value, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgIn(List<String> values) {
            addCriterion("cxjg in", values, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgNotIn(List<String> values) {
            addCriterion("cxjg not in", values, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgBetween(String value1, String value2) {
            addCriterion("cxjg between", value1, value2, "cxjg");
            return (Criteria) this;
        }

        public Criteria andCxjgNotBetween(String value1, String value2) {
            addCriterion("cxjg not between", value1, value2, "cxjg");
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