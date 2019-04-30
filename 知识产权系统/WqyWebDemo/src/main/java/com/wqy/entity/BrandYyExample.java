package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandYyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandYyExample() {
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

        public Criteria andYyfIsNull() {
            addCriterion("yyf is null");
            return (Criteria) this;
        }

        public Criteria andYyfIsNotNull() {
            addCriterion("yyf is not null");
            return (Criteria) this;
        }

        public Criteria andYyfEqualTo(String value) {
            addCriterion("yyf =", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfNotEqualTo(String value) {
            addCriterion("yyf <>", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfGreaterThan(String value) {
            addCriterion("yyf >", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfGreaterThanOrEqualTo(String value) {
            addCriterion("yyf >=", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfLessThan(String value) {
            addCriterion("yyf <", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfLessThanOrEqualTo(String value) {
            addCriterion("yyf <=", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfLike(String value) {
            addCriterion("yyf like", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfNotLike(String value) {
            addCriterion("yyf not like", value, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfIn(List<String> values) {
            addCriterion("yyf in", values, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfNotIn(List<String> values) {
            addCriterion("yyf not in", values, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfBetween(String value1, String value2) {
            addCriterion("yyf between", value1, value2, "yyf");
            return (Criteria) this;
        }

        public Criteria andYyfNotBetween(String value1, String value2) {
            addCriterion("yyf not between", value1, value2, "yyf");
            return (Criteria) this;
        }

        public Criteria andByyfIsNull() {
            addCriterion("byyf is null");
            return (Criteria) this;
        }

        public Criteria andByyfIsNotNull() {
            addCriterion("byyf is not null");
            return (Criteria) this;
        }

        public Criteria andByyfEqualTo(String value) {
            addCriterion("byyf =", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfNotEqualTo(String value) {
            addCriterion("byyf <>", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfGreaterThan(String value) {
            addCriterion("byyf >", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfGreaterThanOrEqualTo(String value) {
            addCriterion("byyf >=", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfLessThan(String value) {
            addCriterion("byyf <", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfLessThanOrEqualTo(String value) {
            addCriterion("byyf <=", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfLike(String value) {
            addCriterion("byyf like", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfNotLike(String value) {
            addCriterion("byyf not like", value, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfIn(List<String> values) {
            addCriterion("byyf in", values, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfNotIn(List<String> values) {
            addCriterion("byyf not in", values, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfBetween(String value1, String value2) {
            addCriterion("byyf between", value1, value2, "byyf");
            return (Criteria) this;
        }

        public Criteria andByyfNotBetween(String value1, String value2) {
            addCriterion("byyf not between", value1, value2, "byyf");
            return (Criteria) this;
        }

        public Criteria andYyqzIsNull() {
            addCriterion("yyqz is null");
            return (Criteria) this;
        }

        public Criteria andYyqzIsNotNull() {
            addCriterion("yyqz is not null");
            return (Criteria) this;
        }

        public Criteria andYyqzEqualTo(String value) {
            addCriterion("yyqz =", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzNotEqualTo(String value) {
            addCriterion("yyqz <>", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzGreaterThan(String value) {
            addCriterion("yyqz >", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzGreaterThanOrEqualTo(String value) {
            addCriterion("yyqz >=", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzLessThan(String value) {
            addCriterion("yyqz <", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzLessThanOrEqualTo(String value) {
            addCriterion("yyqz <=", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzLike(String value) {
            addCriterion("yyqz like", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzNotLike(String value) {
            addCriterion("yyqz not like", value, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzIn(List<String> values) {
            addCriterion("yyqz in", values, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzNotIn(List<String> values) {
            addCriterion("yyqz not in", values, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzBetween(String value1, String value2) {
            addCriterion("yyqz between", value1, value2, "yyqz");
            return (Criteria) this;
        }

        public Criteria andYyqzNotBetween(String value1, String value2) {
            addCriterion("yyqz not between", value1, value2, "yyqz");
            return (Criteria) this;
        }

        public Criteria andTyyrqIsNull() {
            addCriterion("tyyrq is null");
            return (Criteria) this;
        }

        public Criteria andTyyrqIsNotNull() {
            addCriterion("tyyrq is not null");
            return (Criteria) this;
        }

        public Criteria andTyyrqEqualTo(Date value) {
            addCriterionForJDBCDate("tyyrq =", value, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("tyyrq <>", value, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqGreaterThan(Date value) {
            addCriterionForJDBCDate("tyyrq >", value, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tyyrq >=", value, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqLessThan(Date value) {
            addCriterionForJDBCDate("tyyrq <", value, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tyyrq <=", value, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqIn(List<Date> values) {
            addCriterionForJDBCDate("tyyrq in", values, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("tyyrq not in", values, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tyyrq between", value1, value2, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andTyyrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tyyrq not between", value1, value2, "tyyrq");
            return (Criteria) this;
        }

        public Criteria andYydljgIsNull() {
            addCriterion("yydljg is null");
            return (Criteria) this;
        }

        public Criteria andYydljgIsNotNull() {
            addCriterion("yydljg is not null");
            return (Criteria) this;
        }

        public Criteria andYydljgEqualTo(String value) {
            addCriterion("yydljg =", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgNotEqualTo(String value) {
            addCriterion("yydljg <>", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgGreaterThan(String value) {
            addCriterion("yydljg >", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgGreaterThanOrEqualTo(String value) {
            addCriterion("yydljg >=", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgLessThan(String value) {
            addCriterion("yydljg <", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgLessThanOrEqualTo(String value) {
            addCriterion("yydljg <=", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgLike(String value) {
            addCriterion("yydljg like", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgNotLike(String value) {
            addCriterion("yydljg not like", value, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgIn(List<String> values) {
            addCriterion("yydljg in", values, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgNotIn(List<String> values) {
            addCriterion("yydljg not in", values, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgBetween(String value1, String value2) {
            addCriterion("yydljg between", value1, value2, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYydljgNotBetween(String value1, String value2) {
            addCriterion("yydljg not between", value1, value2, "yydljg");
            return (Criteria) this;
        }

        public Criteria andYyjgIsNull() {
            addCriterion("yyjg is null");
            return (Criteria) this;
        }

        public Criteria andYyjgIsNotNull() {
            addCriterion("yyjg is not null");
            return (Criteria) this;
        }

        public Criteria andYyjgEqualTo(String value) {
            addCriterion("yyjg =", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgNotEqualTo(String value) {
            addCriterion("yyjg <>", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgGreaterThan(String value) {
            addCriterion("yyjg >", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgGreaterThanOrEqualTo(String value) {
            addCriterion("yyjg >=", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgLessThan(String value) {
            addCriterion("yyjg <", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgLessThanOrEqualTo(String value) {
            addCriterion("yyjg <=", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgLike(String value) {
            addCriterion("yyjg like", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgNotLike(String value) {
            addCriterion("yyjg not like", value, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgIn(List<String> values) {
            addCriterion("yyjg in", values, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgNotIn(List<String> values) {
            addCriterion("yyjg not in", values, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgBetween(String value1, String value2) {
            addCriterion("yyjg between", value1, value2, "yyjg");
            return (Criteria) this;
        }

        public Criteria andYyjgNotBetween(String value1, String value2) {
            addCriterion("yyjg not between", value1, value2, "yyjg");
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