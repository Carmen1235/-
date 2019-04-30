package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandNoticeExample() {
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

        public Criteria andTxrqIsNull() {
            addCriterion("txrq is null");
            return (Criteria) this;
        }

        public Criteria andTxrqIsNotNull() {
            addCriterion("txrq is not null");
            return (Criteria) this;
        }

        public Criteria andTxrqEqualTo(Date value) {
            addCriterionForJDBCDate("txrq =", value, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("txrq <>", value, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqGreaterThan(Date value) {
            addCriterionForJDBCDate("txrq >", value, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("txrq >=", value, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqLessThan(Date value) {
            addCriterionForJDBCDate("txrq <", value, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("txrq <=", value, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqIn(List<Date> values) {
            addCriterionForJDBCDate("txrq in", values, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("txrq not in", values, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("txrq between", value1, value2, "txrq");
            return (Criteria) this;
        }

        public Criteria andTxrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("txrq not between", value1, value2, "txrq");
            return (Criteria) this;
        }

        public Criteria andYxrqIsNull() {
            addCriterion("yxrq is null");
            return (Criteria) this;
        }

        public Criteria andYxrqIsNotNull() {
            addCriterion("yxrq is not null");
            return (Criteria) this;
        }

        public Criteria andYxrqEqualTo(Date value) {
            addCriterionForJDBCDate("yxrq =", value, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("yxrq <>", value, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqGreaterThan(Date value) {
            addCriterionForJDBCDate("yxrq >", value, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("yxrq >=", value, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqLessThan(Date value) {
            addCriterionForJDBCDate("yxrq <", value, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("yxrq <=", value, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqIn(List<Date> values) {
            addCriterionForJDBCDate("yxrq in", values, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("yxrq not in", values, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("yxrq between", value1, value2, "yxrq");
            return (Criteria) this;
        }

        public Criteria andYxrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("yxrq not between", value1, value2, "yxrq");
            return (Criteria) this;
        }

        public Criteria andXzrqIsNull() {
            addCriterion("xzrq is null");
            return (Criteria) this;
        }

        public Criteria andXzrqIsNotNull() {
            addCriterion("xzrq is not null");
            return (Criteria) this;
        }

        public Criteria andXzrqEqualTo(Date value) {
            addCriterionForJDBCDate("xzrq =", value, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("xzrq <>", value, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("xzrq >", value, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xzrq >=", value, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqLessThan(Date value) {
            addCriterionForJDBCDate("xzrq <", value, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xzrq <=", value, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqIn(List<Date> values) {
            addCriterionForJDBCDate("xzrq in", values, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("xzrq not in", values, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xzrq between", value1, value2, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xzrq not between", value1, value2, "xzrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqIsNull() {
            addCriterion("xztxrq is null");
            return (Criteria) this;
        }

        public Criteria andXztxrqIsNotNull() {
            addCriterion("xztxrq is not null");
            return (Criteria) this;
        }

        public Criteria andXztxrqEqualTo(Date value) {
            addCriterionForJDBCDate("xztxrq =", value, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("xztxrq <>", value, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqGreaterThan(Date value) {
            addCriterionForJDBCDate("xztxrq >", value, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xztxrq >=", value, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqLessThan(Date value) {
            addCriterionForJDBCDate("xztxrq <", value, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xztxrq <=", value, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqIn(List<Date> values) {
            addCriterionForJDBCDate("xztxrq in", values, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("xztxrq not in", values, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xztxrq between", value1, value2, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andXztxrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xztxrq not between", value1, value2, "xztxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqIsNull() {
            addCriterion("gwcljxtxrq is null");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqIsNotNull() {
            addCriterion("gwcljxtxrq is not null");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqEqualTo(Date value) {
            addCriterionForJDBCDate("gwcljxtxrq =", value, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("gwcljxtxrq <>", value, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqGreaterThan(Date value) {
            addCriterionForJDBCDate("gwcljxtxrq >", value, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gwcljxtxrq >=", value, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqLessThan(Date value) {
            addCriterionForJDBCDate("gwcljxtxrq <", value, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gwcljxtxrq <=", value, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqIn(List<Date> values) {
            addCriterionForJDBCDate("gwcljxtxrq in", values, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("gwcljxtxrq not in", values, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gwcljxtxrq between", value1, value2, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andGwcljxtxrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gwcljxtxrq not between", value1, value2, "gwcljxtxrq");
            return (Criteria) this;
        }

        public Criteria andJxrq1IsNull() {
            addCriterion("jxrq1 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq1IsNotNull() {
            addCriterion("jxrq1 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq1EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq1 =", value, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq1 <>", value, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq1 >", value, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq1 >=", value, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1LessThan(Date value) {
            addCriterionForJDBCDate("jxrq1 <", value, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq1 <=", value, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1In(List<Date> values) {
            addCriterionForJDBCDate("jxrq1 in", values, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq1 not in", values, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq1 between", value1, value2, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq1 not between", value1, value2, "jxrq1");
            return (Criteria) this;
        }

        public Criteria andJxrq2IsNull() {
            addCriterion("jxrq2 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq2IsNotNull() {
            addCriterion("jxrq2 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq2EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq2 =", value, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq2 <>", value, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq2 >", value, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq2 >=", value, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2LessThan(Date value) {
            addCriterionForJDBCDate("jxrq2 <", value, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq2 <=", value, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2In(List<Date> values) {
            addCriterionForJDBCDate("jxrq2 in", values, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq2 not in", values, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq2 between", value1, value2, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq2 not between", value1, value2, "jxrq2");
            return (Criteria) this;
        }

        public Criteria andJxrq3IsNull() {
            addCriterion("jxrq3 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq3IsNotNull() {
            addCriterion("jxrq3 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq3EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq3 =", value, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq3 <>", value, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq3 >", value, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq3 >=", value, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3LessThan(Date value) {
            addCriterionForJDBCDate("jxrq3 <", value, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq3 <=", value, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3In(List<Date> values) {
            addCriterionForJDBCDate("jxrq3 in", values, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq3 not in", values, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq3 between", value1, value2, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq3NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq3 not between", value1, value2, "jxrq3");
            return (Criteria) this;
        }

        public Criteria andJxrq4IsNull() {
            addCriterion("jxrq4 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq4IsNotNull() {
            addCriterion("jxrq4 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq4EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq4 =", value, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq4 <>", value, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq4 >", value, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq4 >=", value, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4LessThan(Date value) {
            addCriterionForJDBCDate("jxrq4 <", value, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq4 <=", value, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4In(List<Date> values) {
            addCriterionForJDBCDate("jxrq4 in", values, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq4 not in", values, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq4 between", value1, value2, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq4NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq4 not between", value1, value2, "jxrq4");
            return (Criteria) this;
        }

        public Criteria andJxrq5IsNull() {
            addCriterion("jxrq5 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq5IsNotNull() {
            addCriterion("jxrq5 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq5EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq5 =", value, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq5 <>", value, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq5 >", value, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq5 >=", value, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5LessThan(Date value) {
            addCriterionForJDBCDate("jxrq5 <", value, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq5 <=", value, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5In(List<Date> values) {
            addCriterionForJDBCDate("jxrq5 in", values, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq5 not in", values, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq5 between", value1, value2, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq5 not between", value1, value2, "jxrq5");
            return (Criteria) this;
        }

        public Criteria andJxrq6IsNull() {
            addCriterion("jxrq6 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq6IsNotNull() {
            addCriterion("jxrq6 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq6EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq6 =", value, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq6 <>", value, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq6 >", value, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq6 >=", value, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6LessThan(Date value) {
            addCriterionForJDBCDate("jxrq6 <", value, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq6 <=", value, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6In(List<Date> values) {
            addCriterionForJDBCDate("jxrq6 in", values, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq6 not in", values, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq6 between", value1, value2, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq6NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq6 not between", value1, value2, "jxrq6");
            return (Criteria) this;
        }

        public Criteria andJxrq7IsNull() {
            addCriterion("jxrq7 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq7IsNotNull() {
            addCriterion("jxrq7 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq7EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq7 =", value, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq7 <>", value, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq7 >", value, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq7 >=", value, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7LessThan(Date value) {
            addCriterionForJDBCDate("jxrq7 <", value, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq7 <=", value, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7In(List<Date> values) {
            addCriterionForJDBCDate("jxrq7 in", values, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq7 not in", values, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq7 between", value1, value2, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq7NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq7 not between", value1, value2, "jxrq7");
            return (Criteria) this;
        }

        public Criteria andJxrq8IsNull() {
            addCriterion("jxrq8 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq8IsNotNull() {
            addCriterion("jxrq8 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq8EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq8 =", value, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq8 <>", value, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq8 >", value, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq8 >=", value, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8LessThan(Date value) {
            addCriterionForJDBCDate("jxrq8 <", value, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq8 <=", value, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8In(List<Date> values) {
            addCriterionForJDBCDate("jxrq8 in", values, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq8 not in", values, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq8 between", value1, value2, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq8NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq8 not between", value1, value2, "jxrq8");
            return (Criteria) this;
        }

        public Criteria andJxrq9IsNull() {
            addCriterion("jxrq9 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq9IsNotNull() {
            addCriterion("jxrq9 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq9EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq9 =", value, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq9 <>", value, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq9 >", value, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq9 >=", value, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9LessThan(Date value) {
            addCriterionForJDBCDate("jxrq9 <", value, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq9 <=", value, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9In(List<Date> values) {
            addCriterionForJDBCDate("jxrq9 in", values, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq9 not in", values, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq9 between", value1, value2, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq9NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq9 not between", value1, value2, "jxrq9");
            return (Criteria) this;
        }

        public Criteria andJxrq10IsNull() {
            addCriterion("jxrq10 is null");
            return (Criteria) this;
        }

        public Criteria andJxrq10IsNotNull() {
            addCriterion("jxrq10 is not null");
            return (Criteria) this;
        }

        public Criteria andJxrq10EqualTo(Date value) {
            addCriterionForJDBCDate("jxrq10 =", value, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10NotEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq10 <>", value, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10GreaterThan(Date value) {
            addCriterionForJDBCDate("jxrq10 >", value, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq10 >=", value, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10LessThan(Date value) {
            addCriterionForJDBCDate("jxrq10 <", value, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxrq10 <=", value, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10In(List<Date> values) {
            addCriterionForJDBCDate("jxrq10 in", values, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10NotIn(List<Date> values) {
            addCriterionForJDBCDate("jxrq10 not in", values, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10Between(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq10 between", value1, value2, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andJxrq10NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxrq10 not between", value1, value2, "jxrq10");
            return (Criteria) this;
        }

        public Criteria andEnablesIsNull() {
            addCriterion("enables is null");
            return (Criteria) this;
        }

        public Criteria andEnablesIsNotNull() {
            addCriterion("enables is not null");
            return (Criteria) this;
        }

        public Criteria andEnablesEqualTo(String value) {
            addCriterion("enables =", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesNotEqualTo(String value) {
            addCriterion("enables <>", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesGreaterThan(String value) {
            addCriterion("enables >", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesGreaterThanOrEqualTo(String value) {
            addCriterion("enables >=", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesLessThan(String value) {
            addCriterion("enables <", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesLessThanOrEqualTo(String value) {
            addCriterion("enables <=", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesLike(String value) {
            addCriterion("enables like", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesNotLike(String value) {
            addCriterion("enables not like", value, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesIn(List<String> values) {
            addCriterion("enables in", values, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesNotIn(List<String> values) {
            addCriterion("enables not in", values, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesBetween(String value1, String value2) {
            addCriterion("enables between", value1, value2, "enables");
            return (Criteria) this;
        }

        public Criteria andEnablesNotBetween(String value1, String value2) {
            addCriterion("enables not between", value1, value2, "enables");
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