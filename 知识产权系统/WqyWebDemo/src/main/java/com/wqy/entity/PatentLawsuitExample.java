package com.wqy.entity;

import java.util.ArrayList;
import java.util.List;

public class PatentLawsuitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentLawsuitExample() {
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

        public Criteria andSuitIsNull() {
            addCriterion("suit is null");
            return (Criteria) this;
        }

        public Criteria andSuitIsNotNull() {
            addCriterion("suit is not null");
            return (Criteria) this;
        }

        public Criteria andSuitEqualTo(String value) {
            addCriterion("suit =", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitNotEqualTo(String value) {
            addCriterion("suit <>", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitGreaterThan(String value) {
            addCriterion("suit >", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitGreaterThanOrEqualTo(String value) {
            addCriterion("suit >=", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitLessThan(String value) {
            addCriterion("suit <", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitLessThanOrEqualTo(String value) {
            addCriterion("suit <=", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitLike(String value) {
            addCriterion("suit like", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitNotLike(String value) {
            addCriterion("suit not like", value, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitIn(List<String> values) {
            addCriterion("suit in", values, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitNotIn(List<String> values) {
            addCriterion("suit not in", values, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitBetween(String value1, String value2) {
            addCriterion("suit between", value1, value2, "suit");
            return (Criteria) this;
        }

        public Criteria andSuitNotBetween(String value1, String value2) {
            addCriterion("suit not between", value1, value2, "suit");
            return (Criteria) this;
        }

        public Criteria andSolicitorIsNull() {
            addCriterion("solicitor is null");
            return (Criteria) this;
        }

        public Criteria andSolicitorIsNotNull() {
            addCriterion("solicitor is not null");
            return (Criteria) this;
        }

        public Criteria andSolicitorEqualTo(String value) {
            addCriterion("solicitor =", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorNotEqualTo(String value) {
            addCriterion("solicitor <>", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorGreaterThan(String value) {
            addCriterion("solicitor >", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorGreaterThanOrEqualTo(String value) {
            addCriterion("solicitor >=", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorLessThan(String value) {
            addCriterion("solicitor <", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorLessThanOrEqualTo(String value) {
            addCriterion("solicitor <=", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorLike(String value) {
            addCriterion("solicitor like", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorNotLike(String value) {
            addCriterion("solicitor not like", value, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorIn(List<String> values) {
            addCriterion("solicitor in", values, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorNotIn(List<String> values) {
            addCriterion("solicitor not in", values, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorBetween(String value1, String value2) {
            addCriterion("solicitor between", value1, value2, "solicitor");
            return (Criteria) this;
        }

        public Criteria andSolicitorNotBetween(String value1, String value2) {
            addCriterion("solicitor not between", value1, value2, "solicitor");
            return (Criteria) this;
        }

        public Criteria andLawyerIsNull() {
            addCriterion("lawyer is null");
            return (Criteria) this;
        }

        public Criteria andLawyerIsNotNull() {
            addCriterion("lawyer is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerEqualTo(String value) {
            addCriterion("lawyer =", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerNotEqualTo(String value) {
            addCriterion("lawyer <>", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerGreaterThan(String value) {
            addCriterion("lawyer >", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerGreaterThanOrEqualTo(String value) {
            addCriterion("lawyer >=", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerLessThan(String value) {
            addCriterion("lawyer <", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerLessThanOrEqualTo(String value) {
            addCriterion("lawyer <=", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerLike(String value) {
            addCriterion("lawyer like", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerNotLike(String value) {
            addCriterion("lawyer not like", value, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerIn(List<String> values) {
            addCriterion("lawyer in", values, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerNotIn(List<String> values) {
            addCriterion("lawyer not in", values, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerBetween(String value1, String value2) {
            addCriterion("lawyer between", value1, value2, "lawyer");
            return (Criteria) this;
        }

        public Criteria andLawyerNotBetween(String value1, String value2) {
            addCriterion("lawyer not between", value1, value2, "lawyer");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("process like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("process not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("process not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andResultsIsNull() {
            addCriterion("results is null");
            return (Criteria) this;
        }

        public Criteria andResultsIsNotNull() {
            addCriterion("results is not null");
            return (Criteria) this;
        }

        public Criteria andResultsEqualTo(String value) {
            addCriterion("results =", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotEqualTo(String value) {
            addCriterion("results <>", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsGreaterThan(String value) {
            addCriterion("results >", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsGreaterThanOrEqualTo(String value) {
            addCriterion("results >=", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsLessThan(String value) {
            addCriterion("results <", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsLessThanOrEqualTo(String value) {
            addCriterion("results <=", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsLike(String value) {
            addCriterion("results like", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotLike(String value) {
            addCriterion("results not like", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsIn(List<String> values) {
            addCriterion("results in", values, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotIn(List<String> values) {
            addCriterion("results not in", values, "results");
            return (Criteria) this;
        }

        public Criteria andResultsBetween(String value1, String value2) {
            addCriterion("results between", value1, value2, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotBetween(String value1, String value2) {
            addCriterion("results not between", value1, value2, "results");
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