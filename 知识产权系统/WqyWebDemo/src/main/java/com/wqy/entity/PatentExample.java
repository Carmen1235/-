package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentExample() {
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

        public Criteria andTechnicalClassificationIsNull() {
            addCriterion("technical_classification is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationIsNotNull() {
            addCriterion("technical_classification is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationEqualTo(String value) {
            addCriterion("technical_classification =", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationNotEqualTo(String value) {
            addCriterion("technical_classification <>", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationGreaterThan(String value) {
            addCriterion("technical_classification >", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("technical_classification >=", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationLessThan(String value) {
            addCriterion("technical_classification <", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationLessThanOrEqualTo(String value) {
            addCriterion("technical_classification <=", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationLike(String value) {
            addCriterion("technical_classification like", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationNotLike(String value) {
            addCriterion("technical_classification not like", value, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationIn(List<String> values) {
            addCriterion("technical_classification in", values, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationNotIn(List<String> values) {
            addCriterion("technical_classification not in", values, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationBetween(String value1, String value2) {
            addCriterion("technical_classification between", value1, value2, "technicalClassification");
            return (Criteria) this;
        }

        public Criteria andTechnicalClassificationNotBetween(String value1, String value2) {
            addCriterion("technical_classification not between", value1, value2, "technicalClassification");
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

        public Criteria andPatentProductIsNull() {
            addCriterion("patent_product is null");
            return (Criteria) this;
        }

        public Criteria andPatentProductIsNotNull() {
            addCriterion("patent_product is not null");
            return (Criteria) this;
        }

        public Criteria andPatentProductEqualTo(String value) {
            addCriterion("patent_product =", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductNotEqualTo(String value) {
            addCriterion("patent_product <>", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductGreaterThan(String value) {
            addCriterion("patent_product >", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductGreaterThanOrEqualTo(String value) {
            addCriterion("patent_product >=", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductLessThan(String value) {
            addCriterion("patent_product <", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductLessThanOrEqualTo(String value) {
            addCriterion("patent_product <=", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductLike(String value) {
            addCriterion("patent_product like", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductNotLike(String value) {
            addCriterion("patent_product not like", value, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductIn(List<String> values) {
            addCriterion("patent_product in", values, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductNotIn(List<String> values) {
            addCriterion("patent_product not in", values, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductBetween(String value1, String value2) {
            addCriterion("patent_product between", value1, value2, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andPatentProductNotBetween(String value1, String value2) {
            addCriterion("patent_product not between", value1, value2, "patentProduct");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasIsNull() {
            addCriterion("protected_areas is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasIsNotNull() {
            addCriterion("protected_areas is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasEqualTo(String value) {
            addCriterion("protected_areas =", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotEqualTo(String value) {
            addCriterion("protected_areas <>", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasGreaterThan(String value) {
            addCriterion("protected_areas >", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasGreaterThanOrEqualTo(String value) {
            addCriterion("protected_areas >=", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasLessThan(String value) {
            addCriterion("protected_areas <", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasLessThanOrEqualTo(String value) {
            addCriterion("protected_areas <=", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasLike(String value) {
            addCriterion("protected_areas like", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotLike(String value) {
            addCriterion("protected_areas not like", value, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasIn(List<String> values) {
            addCriterion("protected_areas in", values, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotIn(List<String> values) {
            addCriterion("protected_areas not in", values, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasBetween(String value1, String value2) {
            addCriterion("protected_areas between", value1, value2, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andProtectedAreasNotBetween(String value1, String value2) {
            addCriterion("protected_areas not between", value1, value2, "protectedAreas");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIsNull() {
            addCriterion("patent_type is null");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIsNotNull() {
            addCriterion("patent_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatentTypeEqualTo(String value) {
            addCriterion("patent_type =", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotEqualTo(String value) {
            addCriterion("patent_type <>", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeGreaterThan(String value) {
            addCriterion("patent_type >", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("patent_type >=", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLessThan(String value) {
            addCriterion("patent_type <", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLessThanOrEqualTo(String value) {
            addCriterion("patent_type <=", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLike(String value) {
            addCriterion("patent_type like", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotLike(String value) {
            addCriterion("patent_type not like", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIn(List<String> values) {
            addCriterion("patent_type in", values, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotIn(List<String> values) {
            addCriterion("patent_type not in", values, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeBetween(String value1, String value2) {
            addCriterion("patent_type between", value1, value2, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotBetween(String value1, String value2) {
            addCriterion("patent_type not between", value1, value2, "patentType");
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

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterionForJDBCDate("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterionForJDBCDate("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNull() {
            addCriterion("apply_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNotNull() {
            addCriterion("apply_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNameEqualTo(String value) {
            addCriterion("apply_name =", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotEqualTo(String value) {
            addCriterion("apply_name <>", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThan(String value) {
            addCriterion("apply_name >", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_name >=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThan(String value) {
            addCriterion("apply_name <", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThanOrEqualTo(String value) {
            addCriterion("apply_name <=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLike(String value) {
            addCriterion("apply_name like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotLike(String value) {
            addCriterion("apply_name not like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameIn(List<String> values) {
            addCriterion("apply_name in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotIn(List<String> values) {
            addCriterion("apply_name not in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameBetween(String value1, String value2) {
            addCriterion("apply_name between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotBetween(String value1, String value2) {
            addCriterion("apply_name not between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNull() {
            addCriterion("apply_number is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNotNull() {
            addCriterion("apply_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberEqualTo(String value) {
            addCriterion("apply_number =", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotEqualTo(String value) {
            addCriterion("apply_number <>", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThan(String value) {
            addCriterion("apply_number >", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("apply_number >=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThan(String value) {
            addCriterion("apply_number <", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThanOrEqualTo(String value) {
            addCriterion("apply_number <=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLike(String value) {
            addCriterion("apply_number like", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotLike(String value) {
            addCriterion("apply_number not like", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIn(List<String> values) {
            addCriterion("apply_number in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotIn(List<String> values) {
            addCriterion("apply_number not in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberBetween(String value1, String value2) {
            addCriterion("apply_number between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotBetween(String value1, String value2) {
            addCriterion("apply_number not between", value1, value2, "applyNumber");
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

        public Criteria andAccreditDateIsNull() {
            addCriterion("accredit_date is null");
            return (Criteria) this;
        }

        public Criteria andAccreditDateIsNotNull() {
            addCriterion("accredit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditDateEqualTo(Date value) {
            addCriterionForJDBCDate("accredit_date =", value, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accredit_date <>", value, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateGreaterThan(Date value) {
            addCriterionForJDBCDate("accredit_date >", value, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accredit_date >=", value, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateLessThan(Date value) {
            addCriterionForJDBCDate("accredit_date <", value, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accredit_date <=", value, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateIn(List<Date> values) {
            addCriterionForJDBCDate("accredit_date in", values, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accredit_date not in", values, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accredit_date between", value1, value2, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andAccreditDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accredit_date not between", value1, value2, "accreditDate");
            return (Criteria) this;
        }

        public Criteria andPatentNumberIsNull() {
            addCriterion("patent_number is null");
            return (Criteria) this;
        }

        public Criteria andPatentNumberIsNotNull() {
            addCriterion("patent_number is not null");
            return (Criteria) this;
        }

        public Criteria andPatentNumberEqualTo(String value) {
            addCriterion("patent_number =", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotEqualTo(String value) {
            addCriterion("patent_number <>", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberGreaterThan(String value) {
            addCriterion("patent_number >", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("patent_number >=", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberLessThan(String value) {
            addCriterion("patent_number <", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberLessThanOrEqualTo(String value) {
            addCriterion("patent_number <=", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberLike(String value) {
            addCriterion("patent_number like", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotLike(String value) {
            addCriterion("patent_number not like", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberIn(List<String> values) {
            addCriterion("patent_number in", values, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotIn(List<String> values) {
            addCriterion("patent_number not in", values, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberBetween(String value1, String value2) {
            addCriterion("patent_number between", value1, value2, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotBetween(String value1, String value2) {
            addCriterion("patent_number not between", value1, value2, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateIsNull() {
            addCriterion("patent_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateIsNotNull() {
            addCriterion("patent_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("patent_end_date =", value, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("patent_end_date <>", value, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("patent_end_date >", value, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patent_end_date >=", value, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateLessThan(Date value) {
            addCriterionForJDBCDate("patent_end_date <", value, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patent_end_date <=", value, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("patent_end_date in", values, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("patent_end_date not in", values, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patent_end_date between", value1, value2, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patent_end_date not between", value1, value2, "patentEndDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateIsNull() {
            addCriterion("patent_invalid_date is null");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateIsNotNull() {
            addCriterion("patent_invalid_date is not null");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateEqualTo(Date value) {
            addCriterionForJDBCDate("patent_invalid_date =", value, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("patent_invalid_date <>", value, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("patent_invalid_date >", value, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patent_invalid_date >=", value, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateLessThan(Date value) {
            addCriterionForJDBCDate("patent_invalid_date <", value, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patent_invalid_date <=", value, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateIn(List<Date> values) {
            addCriterionForJDBCDate("patent_invalid_date in", values, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("patent_invalid_date not in", values, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patent_invalid_date between", value1, value2, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andPatentInvalidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patent_invalid_date not between", value1, value2, "patentInvalidDate");
            return (Criteria) this;
        }

        public Criteria andEgencyIsNull() {
            addCriterion("egency is null");
            return (Criteria) this;
        }

        public Criteria andEgencyIsNotNull() {
            addCriterion("egency is not null");
            return (Criteria) this;
        }

        public Criteria andEgencyEqualTo(String value) {
            addCriterion("egency =", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyNotEqualTo(String value) {
            addCriterion("egency <>", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyGreaterThan(String value) {
            addCriterion("egency >", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyGreaterThanOrEqualTo(String value) {
            addCriterion("egency >=", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyLessThan(String value) {
            addCriterion("egency <", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyLessThanOrEqualTo(String value) {
            addCriterion("egency <=", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyLike(String value) {
            addCriterion("egency like", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyNotLike(String value) {
            addCriterion("egency not like", value, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyIn(List<String> values) {
            addCriterion("egency in", values, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyNotIn(List<String> values) {
            addCriterion("egency not in", values, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyBetween(String value1, String value2) {
            addCriterion("egency between", value1, value2, "egency");
            return (Criteria) this;
        }

        public Criteria andEgencyNotBetween(String value1, String value2) {
            addCriterion("egency not between", value1, value2, "egency");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineIsNull() {
            addCriterion("priority_deadline is null");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineIsNotNull() {
            addCriterion("priority_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineEqualTo(Date value) {
            addCriterionForJDBCDate("priority_deadline =", value, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineNotEqualTo(Date value) {
            addCriterionForJDBCDate("priority_deadline <>", value, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineGreaterThan(Date value) {
            addCriterionForJDBCDate("priority_deadline >", value, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("priority_deadline >=", value, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineLessThan(Date value) {
            addCriterionForJDBCDate("priority_deadline <", value, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("priority_deadline <=", value, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineIn(List<Date> values) {
            addCriterionForJDBCDate("priority_deadline in", values, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineNotIn(List<Date> values) {
            addCriterionForJDBCDate("priority_deadline not in", values, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("priority_deadline between", value1, value2, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andPriorityDeadlineNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("priority_deadline not between", value1, value2, "priorityDeadline");
            return (Criteria) this;
        }

        public Criteria andApplyTableIsNull() {
            addCriterion("apply_table is null");
            return (Criteria) this;
        }

        public Criteria andApplyTableIsNotNull() {
            addCriterion("apply_table is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTableEqualTo(String value) {
            addCriterion("apply_table =", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableNotEqualTo(String value) {
            addCriterion("apply_table <>", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableGreaterThan(String value) {
            addCriterion("apply_table >", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableGreaterThanOrEqualTo(String value) {
            addCriterion("apply_table >=", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableLessThan(String value) {
            addCriterion("apply_table <", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableLessThanOrEqualTo(String value) {
            addCriterion("apply_table <=", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableLike(String value) {
            addCriterion("apply_table like", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableNotLike(String value) {
            addCriterion("apply_table not like", value, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableIn(List<String> values) {
            addCriterion("apply_table in", values, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableNotIn(List<String> values) {
            addCriterion("apply_table not in", values, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableBetween(String value1, String value2) {
            addCriterion("apply_table between", value1, value2, "applyTable");
            return (Criteria) this;
        }

        public Criteria andApplyTableNotBetween(String value1, String value2) {
            addCriterion("apply_table not between", value1, value2, "applyTable");
            return (Criteria) this;
        }

        public Criteria andPatentLevelIsNull() {
            addCriterion("patent_level is null");
            return (Criteria) this;
        }

        public Criteria andPatentLevelIsNotNull() {
            addCriterion("patent_level is not null");
            return (Criteria) this;
        }

        public Criteria andPatentLevelEqualTo(String value) {
            addCriterion("patent_level =", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelNotEqualTo(String value) {
            addCriterion("patent_level <>", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelGreaterThan(String value) {
            addCriterion("patent_level >", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelGreaterThanOrEqualTo(String value) {
            addCriterion("patent_level >=", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelLessThan(String value) {
            addCriterion("patent_level <", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelLessThanOrEqualTo(String value) {
            addCriterion("patent_level <=", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelLike(String value) {
            addCriterion("patent_level like", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelNotLike(String value) {
            addCriterion("patent_level not like", value, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelIn(List<String> values) {
            addCriterion("patent_level in", values, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelNotIn(List<String> values) {
            addCriterion("patent_level not in", values, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelBetween(String value1, String value2) {
            addCriterion("patent_level between", value1, value2, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andPatentLevelNotBetween(String value1, String value2) {
            addCriterion("patent_level not between", value1, value2, "patentLevel");
            return (Criteria) this;
        }

        public Criteria andVettingProcessIsNull() {
            addCriterion("vetting_process is null");
            return (Criteria) this;
        }

        public Criteria andVettingProcessIsNotNull() {
            addCriterion("vetting_process is not null");
            return (Criteria) this;
        }

        public Criteria andVettingProcessEqualTo(String value) {
            addCriterion("vetting_process =", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessNotEqualTo(String value) {
            addCriterion("vetting_process <>", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessGreaterThan(String value) {
            addCriterion("vetting_process >", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessGreaterThanOrEqualTo(String value) {
            addCriterion("vetting_process >=", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessLessThan(String value) {
            addCriterion("vetting_process <", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessLessThanOrEqualTo(String value) {
            addCriterion("vetting_process <=", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessLike(String value) {
            addCriterion("vetting_process like", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessNotLike(String value) {
            addCriterion("vetting_process not like", value, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessIn(List<String> values) {
            addCriterion("vetting_process in", values, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessNotIn(List<String> values) {
            addCriterion("vetting_process not in", values, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessBetween(String value1, String value2) {
            addCriterion("vetting_process between", value1, value2, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andVettingProcessNotBetween(String value1, String value2) {
            addCriterion("vetting_process not between", value1, value2, "vettingProcess");
            return (Criteria) this;
        }

        public Criteria andGkhIsNull() {
            addCriterion("gkh is null");
            return (Criteria) this;
        }

        public Criteria andGkhIsNotNull() {
            addCriterion("gkh is not null");
            return (Criteria) this;
        }

        public Criteria andGkhEqualTo(String value) {
            addCriterion("gkh =", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhNotEqualTo(String value) {
            addCriterion("gkh <>", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhGreaterThan(String value) {
            addCriterion("gkh >", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhGreaterThanOrEqualTo(String value) {
            addCriterion("gkh >=", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhLessThan(String value) {
            addCriterion("gkh <", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhLessThanOrEqualTo(String value) {
            addCriterion("gkh <=", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhLike(String value) {
            addCriterion("gkh like", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhNotLike(String value) {
            addCriterion("gkh not like", value, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhIn(List<String> values) {
            addCriterion("gkh in", values, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhNotIn(List<String> values) {
            addCriterion("gkh not in", values, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhBetween(String value1, String value2) {
            addCriterion("gkh between", value1, value2, "gkh");
            return (Criteria) this;
        }

        public Criteria andGkhNotBetween(String value1, String value2) {
            addCriterion("gkh not between", value1, value2, "gkh");
            return (Criteria) this;
        }

        public Criteria andLyIsNull() {
            addCriterion("ly is null");
            return (Criteria) this;
        }

        public Criteria andLyIsNotNull() {
            addCriterion("ly is not null");
            return (Criteria) this;
        }

        public Criteria andLyEqualTo(String value) {
            addCriterion("ly =", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotEqualTo(String value) {
            addCriterion("ly <>", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyGreaterThan(String value) {
            addCriterion("ly >", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyGreaterThanOrEqualTo(String value) {
            addCriterion("ly >=", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyLessThan(String value) {
            addCriterion("ly <", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyLessThanOrEqualTo(String value) {
            addCriterion("ly <=", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyLike(String value) {
            addCriterion("ly like", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotLike(String value) {
            addCriterion("ly not like", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyIn(List<String> values) {
            addCriterion("ly in", values, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotIn(List<String> values) {
            addCriterion("ly not in", values, "ly");
            return (Criteria) this;
        }

        public Criteria andLyBetween(String value1, String value2) {
            addCriterion("ly between", value1, value2, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotBetween(String value1, String value2) {
            addCriterion("ly not between", value1, value2, "ly");
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