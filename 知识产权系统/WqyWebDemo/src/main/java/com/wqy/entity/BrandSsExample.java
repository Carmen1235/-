package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandSsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandSsExample() {
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

        public Criteria andSslxIsNull() {
            addCriterion("sslx is null");
            return (Criteria) this;
        }

        public Criteria andSslxIsNotNull() {
            addCriterion("sslx is not null");
            return (Criteria) this;
        }

        public Criteria andSslxEqualTo(String value) {
            addCriterion("sslx =", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxNotEqualTo(String value) {
            addCriterion("sslx <>", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxGreaterThan(String value) {
            addCriterion("sslx >", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxGreaterThanOrEqualTo(String value) {
            addCriterion("sslx >=", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxLessThan(String value) {
            addCriterion("sslx <", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxLessThanOrEqualTo(String value) {
            addCriterion("sslx <=", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxLike(String value) {
            addCriterion("sslx like", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxNotLike(String value) {
            addCriterion("sslx not like", value, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxIn(List<String> values) {
            addCriterion("sslx in", values, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxNotIn(List<String> values) {
            addCriterion("sslx not in", values, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxBetween(String value1, String value2) {
            addCriterion("sslx between", value1, value2, "sslx");
            return (Criteria) this;
        }

        public Criteria andSslxNotBetween(String value1, String value2) {
            addCriterion("sslx not between", value1, value2, "sslx");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(String value) {
            addCriterion("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(String value) {
            addCriterion("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(String value) {
            addCriterion("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(String value) {
            addCriterion("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(String value) {
            addCriterion("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(String value) {
            addCriterion("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLike(String value) {
            addCriterion("sj like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotLike(String value) {
            addCriterion("sj not like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<String> values) {
            addCriterion("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<String> values) {
            addCriterion("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(String value1, String value2) {
            addCriterion("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(String value1, String value2) {
            addCriterion("sj not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andYgIsNull() {
            addCriterion("yg is null");
            return (Criteria) this;
        }

        public Criteria andYgIsNotNull() {
            addCriterion("yg is not null");
            return (Criteria) this;
        }

        public Criteria andYgEqualTo(String value) {
            addCriterion("yg =", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgNotEqualTo(String value) {
            addCriterion("yg <>", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgGreaterThan(String value) {
            addCriterion("yg >", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgGreaterThanOrEqualTo(String value) {
            addCriterion("yg >=", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgLessThan(String value) {
            addCriterion("yg <", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgLessThanOrEqualTo(String value) {
            addCriterion("yg <=", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgLike(String value) {
            addCriterion("yg like", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgNotLike(String value) {
            addCriterion("yg not like", value, "yg");
            return (Criteria) this;
        }

        public Criteria andYgIn(List<String> values) {
            addCriterion("yg in", values, "yg");
            return (Criteria) this;
        }

        public Criteria andYgNotIn(List<String> values) {
            addCriterion("yg not in", values, "yg");
            return (Criteria) this;
        }

        public Criteria andYgBetween(String value1, String value2) {
            addCriterion("yg between", value1, value2, "yg");
            return (Criteria) this;
        }

        public Criteria andYgNotBetween(String value1, String value2) {
            addCriterion("yg not between", value1, value2, "yg");
            return (Criteria) this;
        }

        public Criteria andBgIsNull() {
            addCriterion("bg is null");
            return (Criteria) this;
        }

        public Criteria andBgIsNotNull() {
            addCriterion("bg is not null");
            return (Criteria) this;
        }

        public Criteria andBgEqualTo(String value) {
            addCriterion("bg =", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotEqualTo(String value) {
            addCriterion("bg <>", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThan(String value) {
            addCriterion("bg >", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThanOrEqualTo(String value) {
            addCriterion("bg >=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThan(String value) {
            addCriterion("bg <", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThanOrEqualTo(String value) {
            addCriterion("bg <=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLike(String value) {
            addCriterion("bg like", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotLike(String value) {
            addCriterion("bg not like", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgIn(List<String> values) {
            addCriterion("bg in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotIn(List<String> values) {
            addCriterion("bg not in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgBetween(String value1, String value2) {
            addCriterion("bg between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotBetween(String value1, String value2) {
            addCriterion("bg not between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andAyIsNull() {
            addCriterion("ay is null");
            return (Criteria) this;
        }

        public Criteria andAyIsNotNull() {
            addCriterion("ay is not null");
            return (Criteria) this;
        }

        public Criteria andAyEqualTo(String value) {
            addCriterion("ay =", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyNotEqualTo(String value) {
            addCriterion("ay <>", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyGreaterThan(String value) {
            addCriterion("ay >", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyGreaterThanOrEqualTo(String value) {
            addCriterion("ay >=", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyLessThan(String value) {
            addCriterion("ay <", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyLessThanOrEqualTo(String value) {
            addCriterion("ay <=", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyLike(String value) {
            addCriterion("ay like", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyNotLike(String value) {
            addCriterion("ay not like", value, "ay");
            return (Criteria) this;
        }

        public Criteria andAyIn(List<String> values) {
            addCriterion("ay in", values, "ay");
            return (Criteria) this;
        }

        public Criteria andAyNotIn(List<String> values) {
            addCriterion("ay not in", values, "ay");
            return (Criteria) this;
        }

        public Criteria andAyBetween(String value1, String value2) {
            addCriterion("ay between", value1, value2, "ay");
            return (Criteria) this;
        }

        public Criteria andAyNotBetween(String value1, String value2) {
            addCriterion("ay not between", value1, value2, "ay");
            return (Criteria) this;
        }

        public Criteria andSsqqIsNull() {
            addCriterion("ssqq is null");
            return (Criteria) this;
        }

        public Criteria andSsqqIsNotNull() {
            addCriterion("ssqq is not null");
            return (Criteria) this;
        }

        public Criteria andSsqqEqualTo(String value) {
            addCriterion("ssqq =", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqNotEqualTo(String value) {
            addCriterion("ssqq <>", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqGreaterThan(String value) {
            addCriterion("ssqq >", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqGreaterThanOrEqualTo(String value) {
            addCriterion("ssqq >=", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqLessThan(String value) {
            addCriterion("ssqq <", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqLessThanOrEqualTo(String value) {
            addCriterion("ssqq <=", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqLike(String value) {
            addCriterion("ssqq like", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqNotLike(String value) {
            addCriterion("ssqq not like", value, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqIn(List<String> values) {
            addCriterion("ssqq in", values, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqNotIn(List<String> values) {
            addCriterion("ssqq not in", values, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqBetween(String value1, String value2) {
            addCriterion("ssqq between", value1, value2, "ssqq");
            return (Criteria) this;
        }

        public Criteria andSsqqNotBetween(String value1, String value2) {
            addCriterion("ssqq not between", value1, value2, "ssqq");
            return (Criteria) this;
        }

        public Criteria andAjjgIsNull() {
            addCriterion("ajjg is null");
            return (Criteria) this;
        }

        public Criteria andAjjgIsNotNull() {
            addCriterion("ajjg is not null");
            return (Criteria) this;
        }

        public Criteria andAjjgEqualTo(String value) {
            addCriterion("ajjg =", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgNotEqualTo(String value) {
            addCriterion("ajjg <>", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgGreaterThan(String value) {
            addCriterion("ajjg >", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgGreaterThanOrEqualTo(String value) {
            addCriterion("ajjg >=", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgLessThan(String value) {
            addCriterion("ajjg <", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgLessThanOrEqualTo(String value) {
            addCriterion("ajjg <=", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgLike(String value) {
            addCriterion("ajjg like", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgNotLike(String value) {
            addCriterion("ajjg not like", value, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgIn(List<String> values) {
            addCriterion("ajjg in", values, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgNotIn(List<String> values) {
            addCriterion("ajjg not in", values, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgBetween(String value1, String value2) {
            addCriterion("ajjg between", value1, value2, "ajjg");
            return (Criteria) this;
        }

        public Criteria andAjjgNotBetween(String value1, String value2) {
            addCriterion("ajjg not between", value1, value2, "ajjg");
            return (Criteria) this;
        }

        public Criteria andCprqIsNull() {
            addCriterion("cprq is null");
            return (Criteria) this;
        }

        public Criteria andCprqIsNotNull() {
            addCriterion("cprq is not null");
            return (Criteria) this;
        }

        public Criteria andCprqEqualTo(Date value) {
            addCriterionForJDBCDate("cprq =", value, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqNotEqualTo(Date value) {
            addCriterionForJDBCDate("cprq <>", value, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqGreaterThan(Date value) {
            addCriterionForJDBCDate("cprq >", value, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cprq >=", value, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqLessThan(Date value) {
            addCriterionForJDBCDate("cprq <", value, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cprq <=", value, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqIn(List<Date> values) {
            addCriterionForJDBCDate("cprq in", values, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqNotIn(List<Date> values) {
            addCriterionForJDBCDate("cprq not in", values, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cprq between", value1, value2, "cprq");
            return (Criteria) this;
        }

        public Criteria andCprqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cprq not between", value1, value2, "cprq");
            return (Criteria) this;
        }

        public Criteria andYsfyIsNull() {
            addCriterion("ysfy is null");
            return (Criteria) this;
        }

        public Criteria andYsfyIsNotNull() {
            addCriterion("ysfy is not null");
            return (Criteria) this;
        }

        public Criteria andYsfyEqualTo(String value) {
            addCriterion("ysfy =", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyNotEqualTo(String value) {
            addCriterion("ysfy <>", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyGreaterThan(String value) {
            addCriterion("ysfy >", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyGreaterThanOrEqualTo(String value) {
            addCriterion("ysfy >=", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyLessThan(String value) {
            addCriterion("ysfy <", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyLessThanOrEqualTo(String value) {
            addCriterion("ysfy <=", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyLike(String value) {
            addCriterion("ysfy like", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyNotLike(String value) {
            addCriterion("ysfy not like", value, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyIn(List<String> values) {
            addCriterion("ysfy in", values, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyNotIn(List<String> values) {
            addCriterion("ysfy not in", values, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyBetween(String value1, String value2) {
            addCriterion("ysfy between", value1, value2, "ysfy");
            return (Criteria) this;
        }

        public Criteria andYsfyNotBetween(String value1, String value2) {
            addCriterion("ysfy not between", value1, value2, "ysfy");
            return (Criteria) this;
        }

        public Criteria andLsIsNull() {
            addCriterion("ls is null");
            return (Criteria) this;
        }

        public Criteria andLsIsNotNull() {
            addCriterion("ls is not null");
            return (Criteria) this;
        }

        public Criteria andLsEqualTo(String value) {
            addCriterion("ls =", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotEqualTo(String value) {
            addCriterion("ls <>", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsGreaterThan(String value) {
            addCriterion("ls >", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsGreaterThanOrEqualTo(String value) {
            addCriterion("ls >=", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsLessThan(String value) {
            addCriterion("ls <", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsLessThanOrEqualTo(String value) {
            addCriterion("ls <=", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsLike(String value) {
            addCriterion("ls like", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotLike(String value) {
            addCriterion("ls not like", value, "ls");
            return (Criteria) this;
        }

        public Criteria andLsIn(List<String> values) {
            addCriterion("ls in", values, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotIn(List<String> values) {
            addCriterion("ls not in", values, "ls");
            return (Criteria) this;
        }

        public Criteria andLsBetween(String value1, String value2) {
            addCriterion("ls between", value1, value2, "ls");
            return (Criteria) this;
        }

        public Criteria andLsNotBetween(String value1, String value2) {
            addCriterion("ls not between", value1, value2, "ls");
            return (Criteria) this;
        }

        public Criteria andLsswsIsNull() {
            addCriterion("lssws is null");
            return (Criteria) this;
        }

        public Criteria andLsswsIsNotNull() {
            addCriterion("lssws is not null");
            return (Criteria) this;
        }

        public Criteria andLsswsEqualTo(String value) {
            addCriterion("lssws =", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsNotEqualTo(String value) {
            addCriterion("lssws <>", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsGreaterThan(String value) {
            addCriterion("lssws >", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsGreaterThanOrEqualTo(String value) {
            addCriterion("lssws >=", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsLessThan(String value) {
            addCriterion("lssws <", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsLessThanOrEqualTo(String value) {
            addCriterion("lssws <=", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsLike(String value) {
            addCriterion("lssws like", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsNotLike(String value) {
            addCriterion("lssws not like", value, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsIn(List<String> values) {
            addCriterion("lssws in", values, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsNotIn(List<String> values) {
            addCriterion("lssws not in", values, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsBetween(String value1, String value2) {
            addCriterion("lssws between", value1, value2, "lssws");
            return (Criteria) this;
        }

        public Criteria andLsswsNotBetween(String value1, String value2) {
            addCriterion("lssws not between", value1, value2, "lssws");
            return (Criteria) this;
        }

        public Criteria andDsrIsNull() {
            addCriterion("dsr is null");
            return (Criteria) this;
        }

        public Criteria andDsrIsNotNull() {
            addCriterion("dsr is not null");
            return (Criteria) this;
        }

        public Criteria andDsrEqualTo(String value) {
            addCriterion("dsr =", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotEqualTo(String value) {
            addCriterion("dsr <>", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrGreaterThan(String value) {
            addCriterion("dsr >", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrGreaterThanOrEqualTo(String value) {
            addCriterion("dsr >=", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrLessThan(String value) {
            addCriterion("dsr <", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrLessThanOrEqualTo(String value) {
            addCriterion("dsr <=", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrLike(String value) {
            addCriterion("dsr like", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotLike(String value) {
            addCriterion("dsr not like", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrIn(List<String> values) {
            addCriterion("dsr in", values, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotIn(List<String> values) {
            addCriterion("dsr not in", values, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrBetween(String value1, String value2) {
            addCriterion("dsr between", value1, value2, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotBetween(String value1, String value2) {
            addCriterion("dsr not between", value1, value2, "dsr");
            return (Criteria) this;
        }

        public Criteria andSsxxIsNull() {
            addCriterion("ssxx is null");
            return (Criteria) this;
        }

        public Criteria andSsxxIsNotNull() {
            addCriterion("ssxx is not null");
            return (Criteria) this;
        }

        public Criteria andSsxxEqualTo(String value) {
            addCriterion("ssxx =", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxNotEqualTo(String value) {
            addCriterion("ssxx <>", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxGreaterThan(String value) {
            addCriterion("ssxx >", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxGreaterThanOrEqualTo(String value) {
            addCriterion("ssxx >=", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxLessThan(String value) {
            addCriterion("ssxx <", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxLessThanOrEqualTo(String value) {
            addCriterion("ssxx <=", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxLike(String value) {
            addCriterion("ssxx like", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxNotLike(String value) {
            addCriterion("ssxx not like", value, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxIn(List<String> values) {
            addCriterion("ssxx in", values, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxNotIn(List<String> values) {
            addCriterion("ssxx not in", values, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxBetween(String value1, String value2) {
            addCriterion("ssxx between", value1, value2, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSsxxNotBetween(String value1, String value2) {
            addCriterion("ssxx not between", value1, value2, "ssxx");
            return (Criteria) this;
        }

        public Criteria andSasbIsNull() {
            addCriterion("sasb is null");
            return (Criteria) this;
        }

        public Criteria andSasbIsNotNull() {
            addCriterion("sasb is not null");
            return (Criteria) this;
        }

        public Criteria andSasbEqualTo(String value) {
            addCriterion("sasb =", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbNotEqualTo(String value) {
            addCriterion("sasb <>", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbGreaterThan(String value) {
            addCriterion("sasb >", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbGreaterThanOrEqualTo(String value) {
            addCriterion("sasb >=", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbLessThan(String value) {
            addCriterion("sasb <", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbLessThanOrEqualTo(String value) {
            addCriterion("sasb <=", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbLike(String value) {
            addCriterion("sasb like", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbNotLike(String value) {
            addCriterion("sasb not like", value, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbIn(List<String> values) {
            addCriterion("sasb in", values, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbNotIn(List<String> values) {
            addCriterion("sasb not in", values, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbBetween(String value1, String value2) {
            addCriterion("sasb between", value1, value2, "sasb");
            return (Criteria) this;
        }

        public Criteria andSasbNotBetween(String value1, String value2) {
            addCriterion("sasb not between", value1, value2, "sasb");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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