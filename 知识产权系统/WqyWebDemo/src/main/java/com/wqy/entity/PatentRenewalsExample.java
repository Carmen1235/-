package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatentRenewalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentRenewalsExample() {
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

        public Criteria andTechnicalclfIsNull() {
            addCriterion("technicalClf is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfIsNotNull() {
            addCriterion("technicalClf is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfEqualTo(String value) {
            addCriterion("technicalClf =", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfNotEqualTo(String value) {
            addCriterion("technicalClf <>", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfGreaterThan(String value) {
            addCriterion("technicalClf >", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfGreaterThanOrEqualTo(String value) {
            addCriterion("technicalClf >=", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfLessThan(String value) {
            addCriterion("technicalClf <", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfLessThanOrEqualTo(String value) {
            addCriterion("technicalClf <=", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfLike(String value) {
            addCriterion("technicalClf like", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfNotLike(String value) {
            addCriterion("technicalClf not like", value, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfIn(List<String> values) {
            addCriterion("technicalClf in", values, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfNotIn(List<String> values) {
            addCriterion("technicalClf not in", values, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfBetween(String value1, String value2) {
            addCriterion("technicalClf between", value1, value2, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andTechnicalclfNotBetween(String value1, String value2) {
            addCriterion("technicalClf not between", value1, value2, "technicalclf");
            return (Criteria) this;
        }

        public Criteria andPatentnameIsNull() {
            addCriterion("patentName is null");
            return (Criteria) this;
        }

        public Criteria andPatentnameIsNotNull() {
            addCriterion("patentName is not null");
            return (Criteria) this;
        }

        public Criteria andPatentnameEqualTo(String value) {
            addCriterion("patentName =", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotEqualTo(String value) {
            addCriterion("patentName <>", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameGreaterThan(String value) {
            addCriterion("patentName >", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameGreaterThanOrEqualTo(String value) {
            addCriterion("patentName >=", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameLessThan(String value) {
            addCriterion("patentName <", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameLessThanOrEqualTo(String value) {
            addCriterion("patentName <=", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameLike(String value) {
            addCriterion("patentName like", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotLike(String value) {
            addCriterion("patentName not like", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameIn(List<String> values) {
            addCriterion("patentName in", values, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotIn(List<String> values) {
            addCriterion("patentName not in", values, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameBetween(String value1, String value2) {
            addCriterion("patentName between", value1, value2, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotBetween(String value1, String value2) {
            addCriterion("patentName not between", value1, value2, "patentname");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andPatenttypeIsNull() {
            addCriterion("patentType is null");
            return (Criteria) this;
        }

        public Criteria andPatenttypeIsNotNull() {
            addCriterion("patentType is not null");
            return (Criteria) this;
        }

        public Criteria andPatenttypeEqualTo(String value) {
            addCriterion("patentType =", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeNotEqualTo(String value) {
            addCriterion("patentType <>", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeGreaterThan(String value) {
            addCriterion("patentType >", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("patentType >=", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeLessThan(String value) {
            addCriterion("patentType <", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeLessThanOrEqualTo(String value) {
            addCriterion("patentType <=", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeLike(String value) {
            addCriterion("patentType like", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeNotLike(String value) {
            addCriterion("patentType not like", value, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeIn(List<String> values) {
            addCriterion("patentType in", values, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeNotIn(List<String> values) {
            addCriterion("patentType not in", values, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeBetween(String value1, String value2) {
            addCriterion("patentType between", value1, value2, "patenttype");
            return (Criteria) this;
        }

        public Criteria andPatenttypeNotBetween(String value1, String value2) {
            addCriterion("patentType not between", value1, value2, "patenttype");
            return (Criteria) this;
        }

        public Criteria andProtectedareasIsNull() {
            addCriterion("protectedAreas is null");
            return (Criteria) this;
        }

        public Criteria andProtectedareasIsNotNull() {
            addCriterion("protectedAreas is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedareasEqualTo(String value) {
            addCriterion("protectedAreas =", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasNotEqualTo(String value) {
            addCriterion("protectedAreas <>", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasGreaterThan(String value) {
            addCriterion("protectedAreas >", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasGreaterThanOrEqualTo(String value) {
            addCriterion("protectedAreas >=", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasLessThan(String value) {
            addCriterion("protectedAreas <", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasLessThanOrEqualTo(String value) {
            addCriterion("protectedAreas <=", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasLike(String value) {
            addCriterion("protectedAreas like", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasNotLike(String value) {
            addCriterion("protectedAreas not like", value, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasIn(List<String> values) {
            addCriterion("protectedAreas in", values, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasNotIn(List<String> values) {
            addCriterion("protectedAreas not in", values, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasBetween(String value1, String value2) {
            addCriterion("protectedAreas between", value1, value2, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andProtectedareasNotBetween(String value1, String value2) {
            addCriterion("protectedAreas not between", value1, value2, "protectedareas");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNull() {
            addCriterion("applyType is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("applyType is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(String value) {
            addCriterion("applyType =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(String value) {
            addCriterion("applyType <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(String value) {
            addCriterion("applyType >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("applyType >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(String value) {
            addCriterion("applyType <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(String value) {
            addCriterion("applyType <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLike(String value) {
            addCriterion("applyType like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotLike(String value) {
            addCriterion("applyType not like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<String> values) {
            addCriterion("applyType in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<String> values) {
            addCriterion("applyType not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(String value1, String value2) {
            addCriterion("applyType between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(String value1, String value2) {
            addCriterion("applyType not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("applyDate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applyDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterionForJDBCDate("applyDate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterionForJDBCDate("applyDate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterionForJDBCDate("applyDate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("applyDate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyDate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyDate not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNull() {
            addCriterion("applyName is null");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNotNull() {
            addCriterion("applyName is not null");
            return (Criteria) this;
        }

        public Criteria andApplynameEqualTo(String value) {
            addCriterion("applyName =", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotEqualTo(String value) {
            addCriterion("applyName <>", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThan(String value) {
            addCriterion("applyName >", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThanOrEqualTo(String value) {
            addCriterion("applyName >=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThan(String value) {
            addCriterion("applyName <", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThanOrEqualTo(String value) {
            addCriterion("applyName <=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLike(String value) {
            addCriterion("applyName like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotLike(String value) {
            addCriterion("applyName not like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameIn(List<String> values) {
            addCriterion("applyName in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotIn(List<String> values) {
            addCriterion("applyName not in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameBetween(String value1, String value2) {
            addCriterion("applyName between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotBetween(String value1, String value2) {
            addCriterion("applyName not between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynumberIsNull() {
            addCriterion("applyNumber is null");
            return (Criteria) this;
        }

        public Criteria andApplynumberIsNotNull() {
            addCriterion("applyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andApplynumberEqualTo(String value) {
            addCriterion("applyNumber =", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberNotEqualTo(String value) {
            addCriterion("applyNumber <>", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberGreaterThan(String value) {
            addCriterion("applyNumber >", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberGreaterThanOrEqualTo(String value) {
            addCriterion("applyNumber >=", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberLessThan(String value) {
            addCriterion("applyNumber <", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberLessThanOrEqualTo(String value) {
            addCriterion("applyNumber <=", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberLike(String value) {
            addCriterion("applyNumber like", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberNotLike(String value) {
            addCriterion("applyNumber not like", value, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberIn(List<String> values) {
            addCriterion("applyNumber in", values, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberNotIn(List<String> values) {
            addCriterion("applyNumber not in", values, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberBetween(String value1, String value2) {
            addCriterion("applyNumber between", value1, value2, "applynumber");
            return (Criteria) this;
        }

        public Criteria andApplynumberNotBetween(String value1, String value2) {
            addCriterion("applyNumber not between", value1, value2, "applynumber");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAccreditdateIsNull() {
            addCriterion("accreditDate is null");
            return (Criteria) this;
        }

        public Criteria andAccreditdateIsNotNull() {
            addCriterion("accreditDate is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditdateEqualTo(Date value) {
            addCriterionForJDBCDate("accreditDate =", value, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accreditDate <>", value, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateGreaterThan(Date value) {
            addCriterionForJDBCDate("accreditDate >", value, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accreditDate >=", value, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateLessThan(Date value) {
            addCriterionForJDBCDate("accreditDate <", value, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accreditDate <=", value, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateIn(List<Date> values) {
            addCriterionForJDBCDate("accreditDate in", values, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accreditDate not in", values, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accreditDate between", value1, value2, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andAccreditdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accreditDate not between", value1, value2, "accreditdate");
            return (Criteria) this;
        }

        public Criteria andPatentnumberIsNull() {
            addCriterion("patentNumber is null");
            return (Criteria) this;
        }

        public Criteria andPatentnumberIsNotNull() {
            addCriterion("patentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPatentnumberEqualTo(String value) {
            addCriterion("patentNumber =", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberNotEqualTo(String value) {
            addCriterion("patentNumber <>", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberGreaterThan(String value) {
            addCriterion("patentNumber >", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("patentNumber >=", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberLessThan(String value) {
            addCriterion("patentNumber <", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberLessThanOrEqualTo(String value) {
            addCriterion("patentNumber <=", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberLike(String value) {
            addCriterion("patentNumber like", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberNotLike(String value) {
            addCriterion("patentNumber not like", value, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberIn(List<String> values) {
            addCriterion("patentNumber in", values, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberNotIn(List<String> values) {
            addCriterion("patentNumber not in", values, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberBetween(String value1, String value2) {
            addCriterion("patentNumber between", value1, value2, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andPatentnumberNotBetween(String value1, String value2) {
            addCriterion("patentNumber not between", value1, value2, "patentnumber");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNull() {
            addCriterion("agency is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNotNull() {
            addCriterion("agency is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyEqualTo(String value) {
            addCriterion("agency =", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotEqualTo(String value) {
            addCriterion("agency <>", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThan(String value) {
            addCriterion("agency >", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("agency >=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThan(String value) {
            addCriterion("agency <", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThanOrEqualTo(String value) {
            addCriterion("agency <=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLike(String value) {
            addCriterion("agency like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotLike(String value) {
            addCriterion("agency not like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyIn(List<String> values) {
            addCriterion("agency in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotIn(List<String> values) {
            addCriterion("agency not in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyBetween(String value1, String value2) {
            addCriterion("agency between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotBetween(String value1, String value2) {
            addCriterion("agency not between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeIsNull() {
            addCriterion("annualFee is null");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeIsNotNull() {
            addCriterion("annualFee is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeEqualTo(String value) {
            addCriterion("annualFee =", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeNotEqualTo(String value) {
            addCriterion("annualFee <>", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeGreaterThan(String value) {
            addCriterion("annualFee >", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeGreaterThanOrEqualTo(String value) {
            addCriterion("annualFee >=", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeLessThan(String value) {
            addCriterion("annualFee <", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeLessThanOrEqualTo(String value) {
            addCriterion("annualFee <=", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeLike(String value) {
            addCriterion("annualFee like", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeNotLike(String value) {
            addCriterion("annualFee not like", value, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeIn(List<String> values) {
            addCriterion("annualFee in", values, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeNotIn(List<String> values) {
            addCriterion("annualFee not in", values, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeBetween(String value1, String value2) {
            addCriterion("annualFee between", value1, value2, "annualfee");
            return (Criteria) this;
        }

        public Criteria andAnnualfeeNotBetween(String value1, String value2) {
            addCriterion("annualFee not between", value1, value2, "annualfee");
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