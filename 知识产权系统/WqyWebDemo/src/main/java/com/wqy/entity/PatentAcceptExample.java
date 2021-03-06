package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatentAcceptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentAcceptExample() {
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

        public Criteria andAssignNumberIsNull() {
            addCriterion("assign_number is null");
            return (Criteria) this;
        }

        public Criteria andAssignNumberIsNotNull() {
            addCriterion("assign_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssignNumberEqualTo(String value) {
            addCriterion("assign_number =", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberNotEqualTo(String value) {
            addCriterion("assign_number <>", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberGreaterThan(String value) {
            addCriterion("assign_number >", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberGreaterThanOrEqualTo(String value) {
            addCriterion("assign_number >=", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberLessThan(String value) {
            addCriterion("assign_number <", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberLessThanOrEqualTo(String value) {
            addCriterion("assign_number <=", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberLike(String value) {
            addCriterion("assign_number like", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberNotLike(String value) {
            addCriterion("assign_number not like", value, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberIn(List<String> values) {
            addCriterion("assign_number in", values, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberNotIn(List<String> values) {
            addCriterion("assign_number not in", values, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberBetween(String value1, String value2) {
            addCriterion("assign_number between", value1, value2, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNumberNotBetween(String value1, String value2) {
            addCriterion("assign_number not between", value1, value2, "assignNumber");
            return (Criteria) this;
        }

        public Criteria andAssignNameIsNull() {
            addCriterion("assign_name is null");
            return (Criteria) this;
        }

        public Criteria andAssignNameIsNotNull() {
            addCriterion("assign_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssignNameEqualTo(String value) {
            addCriterion("assign_name =", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameNotEqualTo(String value) {
            addCriterion("assign_name <>", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameGreaterThan(String value) {
            addCriterion("assign_name >", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameGreaterThanOrEqualTo(String value) {
            addCriterion("assign_name >=", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameLessThan(String value) {
            addCriterion("assign_name <", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameLessThanOrEqualTo(String value) {
            addCriterion("assign_name <=", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameLike(String value) {
            addCriterion("assign_name like", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameNotLike(String value) {
            addCriterion("assign_name not like", value, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameIn(List<String> values) {
            addCriterion("assign_name in", values, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameNotIn(List<String> values) {
            addCriterion("assign_name not in", values, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameBetween(String value1, String value2) {
            addCriterion("assign_name between", value1, value2, "assignName");
            return (Criteria) this;
        }

        public Criteria andAssignNameNotBetween(String value1, String value2) {
            addCriterion("assign_name not between", value1, value2, "assignName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameIsNull() {
            addCriterion("accept_name is null");
            return (Criteria) this;
        }

        public Criteria andAcceptNameIsNotNull() {
            addCriterion("accept_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptNameEqualTo(String value) {
            addCriterion("accept_name =", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotEqualTo(String value) {
            addCriterion("accept_name <>", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameGreaterThan(String value) {
            addCriterion("accept_name >", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameGreaterThanOrEqualTo(String value) {
            addCriterion("accept_name >=", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameLessThan(String value) {
            addCriterion("accept_name <", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameLessThanOrEqualTo(String value) {
            addCriterion("accept_name <=", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameLike(String value) {
            addCriterion("accept_name like", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotLike(String value) {
            addCriterion("accept_name not like", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameIn(List<String> values) {
            addCriterion("accept_name in", values, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotIn(List<String> values) {
            addCriterion("accept_name not in", values, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameBetween(String value1, String value2) {
            addCriterion("accept_name between", value1, value2, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotBetween(String value1, String value2) {
            addCriterion("accept_name not between", value1, value2, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("accept_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("accept_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterionForJDBCDate("accept_date =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accept_date <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterionForJDBCDate("accept_date >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accept_date >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterionForJDBCDate("accept_date <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accept_date <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterionForJDBCDate("accept_date in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accept_date not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accept_date between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accept_date not between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateIsNull() {
            addCriterion("accept_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateIsNotNull() {
            addCriterion("accept_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateEqualTo(Date value) {
            addCriterionForJDBCDate("accept_finish_date =", value, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accept_finish_date <>", value, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("accept_finish_date >", value, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accept_finish_date >=", value, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateLessThan(Date value) {
            addCriterionForJDBCDate("accept_finish_date <", value, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accept_finish_date <=", value, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateIn(List<Date> values) {
            addCriterionForJDBCDate("accept_finish_date in", values, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accept_finish_date not in", values, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accept_finish_date between", value1, value2, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andAcceptFinishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accept_finish_date not between", value1, value2, "acceptFinishDate");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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