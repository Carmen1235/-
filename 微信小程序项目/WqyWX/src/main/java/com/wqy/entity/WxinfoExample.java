package com.wqy.entity;

import java.util.ArrayList;
import java.util.List;

public class WxinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxinfoExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTAppidIsNull() {
            addCriterion("t_appid is null");
            return (Criteria) this;
        }

        public Criteria andTAppidIsNotNull() {
            addCriterion("t_appid is not null");
            return (Criteria) this;
        }

        public Criteria andTAppidEqualTo(String value) {
            addCriterion("t_appid =", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidNotEqualTo(String value) {
            addCriterion("t_appid <>", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidGreaterThan(String value) {
            addCriterion("t_appid >", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidGreaterThanOrEqualTo(String value) {
            addCriterion("t_appid >=", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidLessThan(String value) {
            addCriterion("t_appid <", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidLessThanOrEqualTo(String value) {
            addCriterion("t_appid <=", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidLike(String value) {
            addCriterion("t_appid like", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidNotLike(String value) {
            addCriterion("t_appid not like", value, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidIn(List<String> values) {
            addCriterion("t_appid in", values, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidNotIn(List<String> values) {
            addCriterion("t_appid not in", values, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidBetween(String value1, String value2) {
            addCriterion("t_appid between", value1, value2, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppidNotBetween(String value1, String value2) {
            addCriterion("t_appid not between", value1, value2, "tAppid");
            return (Criteria) this;
        }

        public Criteria andTAppsecretIsNull() {
            addCriterion("t_appsecret is null");
            return (Criteria) this;
        }

        public Criteria andTAppsecretIsNotNull() {
            addCriterion("t_appsecret is not null");
            return (Criteria) this;
        }

        public Criteria andTAppsecretEqualTo(String value) {
            addCriterion("t_appsecret =", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretNotEqualTo(String value) {
            addCriterion("t_appsecret <>", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretGreaterThan(String value) {
            addCriterion("t_appsecret >", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("t_appsecret >=", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretLessThan(String value) {
            addCriterion("t_appsecret <", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretLessThanOrEqualTo(String value) {
            addCriterion("t_appsecret <=", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretLike(String value) {
            addCriterion("t_appsecret like", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretNotLike(String value) {
            addCriterion("t_appsecret not like", value, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretIn(List<String> values) {
            addCriterion("t_appsecret in", values, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretNotIn(List<String> values) {
            addCriterion("t_appsecret not in", values, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretBetween(String value1, String value2) {
            addCriterion("t_appsecret between", value1, value2, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAppsecretNotBetween(String value1, String value2) {
            addCriterion("t_appsecret not between", value1, value2, "tAppsecret");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenIsNull() {
            addCriterion("t_access_token is null");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenIsNotNull() {
            addCriterion("t_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenEqualTo(String value) {
            addCriterion("t_access_token =", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenNotEqualTo(String value) {
            addCriterion("t_access_token <>", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenGreaterThan(String value) {
            addCriterion("t_access_token >", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("t_access_token >=", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenLessThan(String value) {
            addCriterion("t_access_token <", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("t_access_token <=", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenLike(String value) {
            addCriterion("t_access_token like", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenNotLike(String value) {
            addCriterion("t_access_token not like", value, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenIn(List<String> values) {
            addCriterion("t_access_token in", values, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenNotIn(List<String> values) {
            addCriterion("t_access_token not in", values, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenBetween(String value1, String value2) {
            addCriterion("t_access_token between", value1, value2, "tAccessToken");
            return (Criteria) this;
        }

        public Criteria andTAccessTokenNotBetween(String value1, String value2) {
            addCriterion("t_access_token not between", value1, value2, "tAccessToken");
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