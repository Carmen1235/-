package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandStyleIsNull() {
            addCriterion("brandStyle is null");
            return (Criteria) this;
        }

        public Criteria andBrandStyleIsNotNull() {
            addCriterion("brandStyle is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStyleEqualTo(String value) {
            addCriterion("brandStyle =", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleNotEqualTo(String value) {
            addCriterion("brandStyle <>", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleGreaterThan(String value) {
            addCriterion("brandStyle >", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleGreaterThanOrEqualTo(String value) {
            addCriterion("brandStyle >=", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleLessThan(String value) {
            addCriterion("brandStyle <", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleLessThanOrEqualTo(String value) {
            addCriterion("brandStyle <=", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleLike(String value) {
            addCriterion("brandStyle like", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleNotLike(String value) {
            addCriterion("brandStyle not like", value, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleIn(List<String> values) {
            addCriterion("brandStyle in", values, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleNotIn(List<String> values) {
            addCriterion("brandStyle not in", values, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleBetween(String value1, String value2) {
            addCriterion("brandStyle between", value1, value2, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandStyleNotBetween(String value1, String value2) {
            addCriterion("brandStyle not between", value1, value2, "brandStyle");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brandName =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brandName <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brandName >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brandName >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brandName <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brandName <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brandName like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brandName not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brandName in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brandName not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brandName between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brandName not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andFileNumberIsNull() {
            addCriterion("fileNumber is null");
            return (Criteria) this;
        }

        public Criteria andFileNumberIsNotNull() {
            addCriterion("fileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFileNumberEqualTo(String value) {
            addCriterion("fileNumber =", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotEqualTo(String value) {
            addCriterion("fileNumber <>", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberGreaterThan(String value) {
            addCriterion("fileNumber >", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fileNumber >=", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLessThan(String value) {
            addCriterion("fileNumber <", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLessThanOrEqualTo(String value) {
            addCriterion("fileNumber <=", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLike(String value) {
            addCriterion("fileNumber like", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotLike(String value) {
            addCriterion("fileNumber not like", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberIn(List<String> values) {
            addCriterion("fileNumber in", values, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotIn(List<String> values) {
            addCriterion("fileNumber not in", values, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberBetween(String value1, String value2) {
            addCriterion("fileNumber between", value1, value2, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotBetween(String value1, String value2) {
            addCriterion("fileNumber not between", value1, value2, "fileNumber");
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

        public Criteria andApplyNameIsNull() {
            addCriterion("applyName is null");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNotNull() {
            addCriterion("applyName is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNameEqualTo(String value) {
            addCriterion("applyName =", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotEqualTo(String value) {
            addCriterion("applyName <>", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThan(String value) {
            addCriterion("applyName >", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("applyName >=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThan(String value) {
            addCriterion("applyName <", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThanOrEqualTo(String value) {
            addCriterion("applyName <=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLike(String value) {
            addCriterion("applyName like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotLike(String value) {
            addCriterion("applyName not like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameIn(List<String> values) {
            addCriterion("applyName in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotIn(List<String> values) {
            addCriterion("applyName not in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameBetween(String value1, String value2) {
            addCriterion("applyName between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotBetween(String value1, String value2) {
            addCriterion("applyName not between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasIsNull() {
            addCriterion("protectedAreas is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasIsNotNull() {
            addCriterion("protectedAreas is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasEqualTo(String value) {
            addCriterion("protectedAreas =", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotEqualTo(String value) {
            addCriterion("protectedAreas <>", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasGreaterThan(String value) {
            addCriterion("protectedAreas >", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasGreaterThanOrEqualTo(String value) {
            addCriterion("protectedAreas >=", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasLessThan(String value) {
            addCriterion("protectedAreas <", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasLessThanOrEqualTo(String value) {
            addCriterion("protectedAreas <=", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasLike(String value) {
            addCriterion("protectedAreas like", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotLike(String value) {
            addCriterion("protectedAreas not like", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasIn(List<String> values) {
            addCriterion("protectedAreas in", values, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotIn(List<String> values) {
            addCriterion("protectedAreas not in", values, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasBetween(String value1, String value2) {
            addCriterion("protectedAreas between", value1, value2, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotBetween(String value1, String value2) {
            addCriterion("protectedAreas not between", value1, value2, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNull() {
            addCriterion("applyNumber is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNotNull() {
            addCriterion("applyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberEqualTo(String value) {
            addCriterion("applyNumber =", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotEqualTo(String value) {
            addCriterion("applyNumber <>", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThan(String value) {
            addCriterion("applyNumber >", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("applyNumber >=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThan(String value) {
            addCriterion("applyNumber <", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThanOrEqualTo(String value) {
            addCriterion("applyNumber <=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLike(String value) {
            addCriterion("applyNumber like", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotLike(String value) {
            addCriterion("applyNumber not like", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIn(List<String> values) {
            addCriterion("applyNumber in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotIn(List<String> values) {
            addCriterion("applyNumber not in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberBetween(String value1, String value2) {
            addCriterion("applyNumber between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotBetween(String value1, String value2) {
            addCriterion("applyNumber not between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("applyDate is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("applyDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("applyDate >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterionForJDBCDate("applyDate <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyDate <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterionForJDBCDate("applyDate in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("applyDate not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyDate between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyDate not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andRegNumberIsNull() {
            addCriterion("regNumber is null");
            return (Criteria) this;
        }

        public Criteria andRegNumberIsNotNull() {
            addCriterion("regNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRegNumberEqualTo(String value) {
            addCriterion("regNumber =", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotEqualTo(String value) {
            addCriterion("regNumber <>", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberGreaterThan(String value) {
            addCriterion("regNumber >", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberGreaterThanOrEqualTo(String value) {
            addCriterion("regNumber >=", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberLessThan(String value) {
            addCriterion("regNumber <", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberLessThanOrEqualTo(String value) {
            addCriterion("regNumber <=", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberLike(String value) {
            addCriterion("regNumber like", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotLike(String value) {
            addCriterion("regNumber not like", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberIn(List<String> values) {
            addCriterion("regNumber in", values, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotIn(List<String> values) {
            addCriterion("regNumber not in", values, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberBetween(String value1, String value2) {
            addCriterion("regNumber between", value1, value2, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotBetween(String value1, String value2) {
            addCriterion("regNumber not between", value1, value2, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("regDate is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("regDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterionForJDBCDate("regDate =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("regDate <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterionForJDBCDate("regDate >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regDate >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterionForJDBCDate("regDate <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regDate <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterionForJDBCDate("regDate in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("regDate not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regDate between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regDate not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterionForJDBCDate("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterionForJDBCDate("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterionForJDBCDate("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterionForJDBCDate("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterionForJDBCDate("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNull() {
            addCriterion("groups is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNotNull() {
            addCriterion("groups is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsEqualTo(String value) {
            addCriterion("groups =", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotEqualTo(String value) {
            addCriterion("groups <>", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThan(String value) {
            addCriterion("groups >", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("groups >=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThan(String value) {
            addCriterion("groups <", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThanOrEqualTo(String value) {
            addCriterion("groups <=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLike(String value) {
            addCriterion("groups like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotLike(String value) {
            addCriterion("groups not like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsIn(List<String> values) {
            addCriterion("groups in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotIn(List<String> values) {
            addCriterion("groups not in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsBetween(String value1, String value2) {
            addCriterion("groups between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotBetween(String value1, String value2) {
            addCriterion("groups not between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNull() {
            addCriterion("commodity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNotNull() {
            addCriterion("commodity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEqualTo(String value) {
            addCriterion("commodity =", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotEqualTo(String value) {
            addCriterion("commodity <>", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThan(String value) {
            addCriterion("commodity >", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThanOrEqualTo(String value) {
            addCriterion("commodity >=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThan(String value) {
            addCriterion("commodity <", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThanOrEqualTo(String value) {
            addCriterion("commodity <=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLike(String value) {
            addCriterion("commodity like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotLike(String value) {
            addCriterion("commodity not like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityIn(List<String> values) {
            addCriterion("commodity in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotIn(List<String> values) {
            addCriterion("commodity not in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityBetween(String value1, String value2) {
            addCriterion("commodity between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotBetween(String value1, String value2) {
            addCriterion("commodity not between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNull() {
            addCriterion("brandType is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNotNull() {
            addCriterion("brandType is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeEqualTo(String value) {
            addCriterion("brandType =", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotEqualTo(String value) {
            addCriterion("brandType <>", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThan(String value) {
            addCriterion("brandType >", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("brandType >=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThan(String value) {
            addCriterion("brandType <", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThanOrEqualTo(String value) {
            addCriterion("brandType <=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLike(String value) {
            addCriterion("brandType like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotLike(String value) {
            addCriterion("brandType not like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIn(List<String> values) {
            addCriterion("brandType in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotIn(List<String> values) {
            addCriterion("brandType not in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeBetween(String value1, String value2) {
            addCriterion("brandType between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotBetween(String value1, String value2) {
            addCriterion("brandType not between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIsNull() {
            addCriterion("authorization is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIsNotNull() {
            addCriterion("authorization is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationEqualTo(Date value) {
            addCriterionForJDBCDate("authorization =", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotEqualTo(Date value) {
            addCriterionForJDBCDate("authorization <>", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationGreaterThan(Date value) {
            addCriterionForJDBCDate("authorization >", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authorization >=", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationLessThan(Date value) {
            addCriterionForJDBCDate("authorization <", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authorization <=", value, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIn(List<Date> values) {
            addCriterionForJDBCDate("authorization in", values, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotIn(List<Date> values) {
            addCriterionForJDBCDate("authorization not in", values, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authorization between", value1, value2, "authorization");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authorization not between", value1, value2, "authorization");
            return (Criteria) this;
        }

        public Criteria andPartOwerIsNull() {
            addCriterion("partOwer is null");
            return (Criteria) this;
        }

        public Criteria andPartOwerIsNotNull() {
            addCriterion("partOwer is not null");
            return (Criteria) this;
        }

        public Criteria andPartOwerEqualTo(String value) {
            addCriterion("partOwer =", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerNotEqualTo(String value) {
            addCriterion("partOwer <>", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerGreaterThan(String value) {
            addCriterion("partOwer >", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerGreaterThanOrEqualTo(String value) {
            addCriterion("partOwer >=", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerLessThan(String value) {
            addCriterion("partOwer <", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerLessThanOrEqualTo(String value) {
            addCriterion("partOwer <=", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerLike(String value) {
            addCriterion("partOwer like", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerNotLike(String value) {
            addCriterion("partOwer not like", value, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerIn(List<String> values) {
            addCriterion("partOwer in", values, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerNotIn(List<String> values) {
            addCriterion("partOwer not in", values, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerBetween(String value1, String value2) {
            addCriterion("partOwer between", value1, value2, "partOwer");
            return (Criteria) this;
        }

        public Criteria andPartOwerNotBetween(String value1, String value2) {
            addCriterion("partOwer not between", value1, value2, "partOwer");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
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

        public Criteria andFirstDateIsNull() {
            addCriterion("firstDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNotNull() {
            addCriterion("firstDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateEqualTo(Date value) {
            addCriterionForJDBCDate("firstDate =", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstDate <>", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThan(Date value) {
            addCriterionForJDBCDate("firstDate >", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstDate >=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThan(Date value) {
            addCriterionForJDBCDate("firstDate <", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstDate <=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateIn(List<Date> values) {
            addCriterionForJDBCDate("firstDate in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstDate not in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstDate between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstDate not between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andBrandSourceIsNull() {
            addCriterion("brandSource is null");
            return (Criteria) this;
        }

        public Criteria andBrandSourceIsNotNull() {
            addCriterion("brandSource is not null");
            return (Criteria) this;
        }

        public Criteria andBrandSourceEqualTo(String value) {
            addCriterion("brandSource =", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceNotEqualTo(String value) {
            addCriterion("brandSource <>", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceGreaterThan(String value) {
            addCriterion("brandSource >", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceGreaterThanOrEqualTo(String value) {
            addCriterion("brandSource >=", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceLessThan(String value) {
            addCriterion("brandSource <", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceLessThanOrEqualTo(String value) {
            addCriterion("brandSource <=", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceLike(String value) {
            addCriterion("brandSource like", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceNotLike(String value) {
            addCriterion("brandSource not like", value, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceIn(List<String> values) {
            addCriterion("brandSource in", values, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceNotIn(List<String> values) {
            addCriterion("brandSource not in", values, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceBetween(String value1, String value2) {
            addCriterion("brandSource between", value1, value2, "brandSource");
            return (Criteria) this;
        }

        public Criteria andBrandSourceNotBetween(String value1, String value2) {
            addCriterion("brandSource not between", value1, value2, "brandSource");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberIsNull() {
            addCriterion("projectApplyNumber is null");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberIsNotNull() {
            addCriterion("projectApplyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberEqualTo(String value) {
            addCriterion("projectApplyNumber =", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberNotEqualTo(String value) {
            addCriterion("projectApplyNumber <>", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberGreaterThan(String value) {
            addCriterion("projectApplyNumber >", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("projectApplyNumber >=", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberLessThan(String value) {
            addCriterion("projectApplyNumber <", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberLessThanOrEqualTo(String value) {
            addCriterion("projectApplyNumber <=", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberLike(String value) {
            addCriterion("projectApplyNumber like", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberNotLike(String value) {
            addCriterion("projectApplyNumber not like", value, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberIn(List<String> values) {
            addCriterion("projectApplyNumber in", values, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberNotIn(List<String> values) {
            addCriterion("projectApplyNumber not in", values, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberBetween(String value1, String value2) {
            addCriterion("projectApplyNumber between", value1, value2, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andProjectApplyNumberNotBetween(String value1, String value2) {
            addCriterion("projectApplyNumber not between", value1, value2, "projectApplyNumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andApplyUnitIsNull() {
            addCriterion("applyUnit is null");
            return (Criteria) this;
        }

        public Criteria andApplyUnitIsNotNull() {
            addCriterion("applyUnit is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUnitEqualTo(String value) {
            addCriterion("applyUnit =", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotEqualTo(String value) {
            addCriterion("applyUnit <>", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitGreaterThan(String value) {
            addCriterion("applyUnit >", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("applyUnit >=", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitLessThan(String value) {
            addCriterion("applyUnit <", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitLessThanOrEqualTo(String value) {
            addCriterion("applyUnit <=", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitLike(String value) {
            addCriterion("applyUnit like", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotLike(String value) {
            addCriterion("applyUnit not like", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitIn(List<String> values) {
            addCriterion("applyUnit in", values, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotIn(List<String> values) {
            addCriterion("applyUnit not in", values, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitBetween(String value1, String value2) {
            addCriterion("applyUnit between", value1, value2, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotBetween(String value1, String value2) {
            addCriterion("applyUnit not between", value1, value2, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitIsNull() {
            addCriterion("useUnit is null");
            return (Criteria) this;
        }

        public Criteria andUseUnitIsNotNull() {
            addCriterion("useUnit is not null");
            return (Criteria) this;
        }

        public Criteria andUseUnitEqualTo(String value) {
            addCriterion("useUnit =", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotEqualTo(String value) {
            addCriterion("useUnit <>", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitGreaterThan(String value) {
            addCriterion("useUnit >", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("useUnit >=", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitLessThan(String value) {
            addCriterion("useUnit <", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitLessThanOrEqualTo(String value) {
            addCriterion("useUnit <=", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitLike(String value) {
            addCriterion("useUnit like", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotLike(String value) {
            addCriterion("useUnit not like", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitIn(List<String> values) {
            addCriterion("useUnit in", values, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotIn(List<String> values) {
            addCriterion("useUnit not in", values, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitBetween(String value1, String value2) {
            addCriterion("useUnit between", value1, value2, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotBetween(String value1, String value2) {
            addCriterion("useUnit not between", value1, value2, "useUnit");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("acceptDate is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("acceptDate is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterionForJDBCDate("acceptDate =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("acceptDate <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterionForJDBCDate("acceptDate >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptDate >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterionForJDBCDate("acceptDate <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptDate <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterionForJDBCDate("acceptDate in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("acceptDate not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptDate between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptDate not between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNull() {
            addCriterion("noticeDate is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNotNull() {
            addCriterion("noticeDate is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateEqualTo(Date value) {
            addCriterionForJDBCDate("noticeDate =", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("noticeDate <>", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("noticeDate >", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("noticeDate >=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThan(Date value) {
            addCriterionForJDBCDate("noticeDate <", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("noticeDate <=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIn(List<Date> values) {
            addCriterionForJDBCDate("noticeDate in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("noticeDate not in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("noticeDate between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("noticeDate not between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateIsNull() {
            addCriterion("intRegDate is null");
            return (Criteria) this;
        }

        public Criteria andIntRegDateIsNotNull() {
            addCriterion("intRegDate is not null");
            return (Criteria) this;
        }

        public Criteria andIntRegDateEqualTo(Date value) {
            addCriterionForJDBCDate("intRegDate =", value, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("intRegDate <>", value, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateGreaterThan(Date value) {
            addCriterionForJDBCDate("intRegDate >", value, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("intRegDate >=", value, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateLessThan(Date value) {
            addCriterionForJDBCDate("intRegDate <", value, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("intRegDate <=", value, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateIn(List<Date> values) {
            addCriterionForJDBCDate("intRegDate in", values, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("intRegDate not in", values, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("intRegDate between", value1, value2, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andIntRegDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("intRegDate not between", value1, value2, "intRegDate");
            return (Criteria) this;
        }

        public Criteria andLateDateIsNull() {
            addCriterion("lateDate is null");
            return (Criteria) this;
        }

        public Criteria andLateDateIsNotNull() {
            addCriterion("lateDate is not null");
            return (Criteria) this;
        }

        public Criteria andLateDateEqualTo(Date value) {
            addCriterionForJDBCDate("lateDate =", value, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lateDate <>", value, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("lateDate >", value, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lateDate >=", value, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateLessThan(Date value) {
            addCriterionForJDBCDate("lateDate <", value, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lateDate <=", value, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateIn(List<Date> values) {
            addCriterionForJDBCDate("lateDate in", values, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lateDate not in", values, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lateDate between", value1, value2, "lateDate");
            return (Criteria) this;
        }

        public Criteria andLateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lateDate not between", value1, value2, "lateDate");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkIsNull() {
            addCriterion("faomousTrademark is null");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkIsNotNull() {
            addCriterion("faomousTrademark is not null");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkEqualTo(String value) {
            addCriterion("faomousTrademark =", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkNotEqualTo(String value) {
            addCriterion("faomousTrademark <>", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkGreaterThan(String value) {
            addCriterion("faomousTrademark >", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("faomousTrademark >=", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkLessThan(String value) {
            addCriterion("faomousTrademark <", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkLessThanOrEqualTo(String value) {
            addCriterion("faomousTrademark <=", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkLike(String value) {
            addCriterion("faomousTrademark like", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkNotLike(String value) {
            addCriterion("faomousTrademark not like", value, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkIn(List<String> values) {
            addCriterion("faomousTrademark in", values, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkNotIn(List<String> values) {
            addCriterion("faomousTrademark not in", values, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkBetween(String value1, String value2) {
            addCriterion("faomousTrademark between", value1, value2, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andFaomousTrademarkNotBetween(String value1, String value2) {
            addCriterion("faomousTrademark not between", value1, value2, "faomousTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkIsNull() {
            addCriterion("reputedTrademark is null");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkIsNotNull() {
            addCriterion("reputedTrademark is not null");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkEqualTo(String value) {
            addCriterion("reputedTrademark =", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkNotEqualTo(String value) {
            addCriterion("reputedTrademark <>", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkGreaterThan(String value) {
            addCriterion("reputedTrademark >", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("reputedTrademark >=", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkLessThan(String value) {
            addCriterion("reputedTrademark <", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkLessThanOrEqualTo(String value) {
            addCriterion("reputedTrademark <=", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkLike(String value) {
            addCriterion("reputedTrademark like", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkNotLike(String value) {
            addCriterion("reputedTrademark not like", value, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkIn(List<String> values) {
            addCriterion("reputedTrademark in", values, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkNotIn(List<String> values) {
            addCriterion("reputedTrademark not in", values, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkBetween(String value1, String value2) {
            addCriterion("reputedTrademark between", value1, value2, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andReputedTrademarkNotBetween(String value1, String value2) {
            addCriterion("reputedTrademark not between", value1, value2, "reputedTrademark");
            return (Criteria) this;
        }

        public Criteria andRejectIsNull() {
            addCriterion("reject is null");
            return (Criteria) this;
        }

        public Criteria andRejectIsNotNull() {
            addCriterion("reject is not null");
            return (Criteria) this;
        }

        public Criteria andRejectEqualTo(String value) {
            addCriterion("reject =", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectNotEqualTo(String value) {
            addCriterion("reject <>", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectGreaterThan(String value) {
            addCriterion("reject >", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectGreaterThanOrEqualTo(String value) {
            addCriterion("reject >=", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectLessThan(String value) {
            addCriterion("reject <", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectLessThanOrEqualTo(String value) {
            addCriterion("reject <=", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectLike(String value) {
            addCriterion("reject like", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectNotLike(String value) {
            addCriterion("reject not like", value, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectIn(List<String> values) {
            addCriterion("reject in", values, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectNotIn(List<String> values) {
            addCriterion("reject not in", values, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectBetween(String value1, String value2) {
            addCriterion("reject between", value1, value2, "reject");
            return (Criteria) this;
        }

        public Criteria andRejectNotBetween(String value1, String value2) {
            addCriterion("reject not between", value1, value2, "reject");
            return (Criteria) this;
        }

        public Criteria andCbsdggrIsNull() {
            addCriterion("cbsdggr is null");
            return (Criteria) this;
        }

        public Criteria andCbsdggrIsNotNull() {
            addCriterion("cbsdggr is not null");
            return (Criteria) this;
        }

        public Criteria andCbsdggrEqualTo(Date value) {
            addCriterionForJDBCDate("cbsdggr =", value, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrNotEqualTo(Date value) {
            addCriterionForJDBCDate("cbsdggr <>", value, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrGreaterThan(Date value) {
            addCriterionForJDBCDate("cbsdggr >", value, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbsdggr >=", value, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrLessThan(Date value) {
            addCriterionForJDBCDate("cbsdggr <", value, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbsdggr <=", value, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrIn(List<Date> values) {
            addCriterionForJDBCDate("cbsdggr in", values, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrNotIn(List<Date> values) {
            addCriterionForJDBCDate("cbsdggr not in", values, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbsdggr between", value1, value2, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andCbsdggrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbsdggr not between", value1, value2, "cbsdggr");
            return (Criteria) this;
        }

        public Criteria andZcggrIsNull() {
            addCriterion("zcggr is null");
            return (Criteria) this;
        }

        public Criteria andZcggrIsNotNull() {
            addCriterion("zcggr is not null");
            return (Criteria) this;
        }

        public Criteria andZcggrEqualTo(Date value) {
            addCriterionForJDBCDate("zcggr =", value, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrNotEqualTo(Date value) {
            addCriterionForJDBCDate("zcggr <>", value, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrGreaterThan(Date value) {
            addCriterionForJDBCDate("zcggr >", value, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zcggr >=", value, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrLessThan(Date value) {
            addCriterionForJDBCDate("zcggr <", value, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zcggr <=", value, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrIn(List<Date> values) {
            addCriterionForJDBCDate("zcggr in", values, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrNotIn(List<Date> values) {
            addCriterionForJDBCDate("zcggr not in", values, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zcggr between", value1, value2, "zcggr");
            return (Criteria) this;
        }

        public Criteria andZcggrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zcggr not between", value1, value2, "zcggr");
            return (Criteria) this;
        }

        public Criteria andSqxmbIsNull() {
            addCriterion("sqxmb is null");
            return (Criteria) this;
        }

        public Criteria andSqxmbIsNotNull() {
            addCriterion("sqxmb is not null");
            return (Criteria) this;
        }

        public Criteria andSqxmbEqualTo(String value) {
            addCriterion("sqxmb =", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbNotEqualTo(String value) {
            addCriterion("sqxmb <>", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbGreaterThan(String value) {
            addCriterion("sqxmb >", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbGreaterThanOrEqualTo(String value) {
            addCriterion("sqxmb >=", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbLessThan(String value) {
            addCriterion("sqxmb <", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbLessThanOrEqualTo(String value) {
            addCriterion("sqxmb <=", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbLike(String value) {
            addCriterion("sqxmb like", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbNotLike(String value) {
            addCriterion("sqxmb not like", value, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbIn(List<String> values) {
            addCriterion("sqxmb in", values, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbNotIn(List<String> values) {
            addCriterion("sqxmb not in", values, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbBetween(String value1, String value2) {
            addCriterion("sqxmb between", value1, value2, "sqxmb");
            return (Criteria) this;
        }

        public Criteria andSqxmbNotBetween(String value1, String value2) {
            addCriterion("sqxmb not between", value1, value2, "sqxmb");
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

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("ext5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(String value) {
            addCriterion("ext5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(String value) {
            addCriterion("ext5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(String value) {
            addCriterion("ext5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ext5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(String value) {
            addCriterion("ext5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(String value) {
            addCriterion("ext5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Like(String value) {
            addCriterion("ext5 like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotLike(String value) {
            addCriterion("ext5 not like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<String> values) {
            addCriterion("ext5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<String> values) {
            addCriterion("ext5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(String value1, String value2) {
            addCriterion("ext5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(String value1, String value2) {
            addCriterion("ext5 not between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt6IsNull() {
            addCriterion("ext6 is null");
            return (Criteria) this;
        }

        public Criteria andExt6IsNotNull() {
            addCriterion("ext6 is not null");
            return (Criteria) this;
        }

        public Criteria andExt6EqualTo(String value) {
            addCriterion("ext6 =", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotEqualTo(String value) {
            addCriterion("ext6 <>", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThan(String value) {
            addCriterion("ext6 >", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThanOrEqualTo(String value) {
            addCriterion("ext6 >=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThan(String value) {
            addCriterion("ext6 <", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThanOrEqualTo(String value) {
            addCriterion("ext6 <=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Like(String value) {
            addCriterion("ext6 like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotLike(String value) {
            addCriterion("ext6 not like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6In(List<String> values) {
            addCriterion("ext6 in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotIn(List<String> values) {
            addCriterion("ext6 not in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Between(String value1, String value2) {
            addCriterion("ext6 between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotBetween(String value1, String value2) {
            addCriterion("ext6 not between", value1, value2, "ext6");
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