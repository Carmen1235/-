package com.wqy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IdeaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdeaExample() {
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

        public Criteria andTWxidIsNull() {
            addCriterion("t_wxid is null");
            return (Criteria) this;
        }

        public Criteria andTWxidIsNotNull() {
            addCriterion("t_wxid is not null");
            return (Criteria) this;
        }

        public Criteria andTWxidEqualTo(String value) {
            addCriterion("t_wxid =", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidNotEqualTo(String value) {
            addCriterion("t_wxid <>", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidGreaterThan(String value) {
            addCriterion("t_wxid >", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidGreaterThanOrEqualTo(String value) {
            addCriterion("t_wxid >=", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidLessThan(String value) {
            addCriterion("t_wxid <", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidLessThanOrEqualTo(String value) {
            addCriterion("t_wxid <=", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidLike(String value) {
            addCriterion("t_wxid like", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidNotLike(String value) {
            addCriterion("t_wxid not like", value, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidIn(List<String> values) {
            addCriterion("t_wxid in", values, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidNotIn(List<String> values) {
            addCriterion("t_wxid not in", values, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidBetween(String value1, String value2) {
            addCriterion("t_wxid between", value1, value2, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTWxidNotBetween(String value1, String value2) {
            addCriterion("t_wxid not between", value1, value2, "tWxid");
            return (Criteria) this;
        }

        public Criteria andTUsernameIsNull() {
            addCriterion("t_username is null");
            return (Criteria) this;
        }

        public Criteria andTUsernameIsNotNull() {
            addCriterion("t_username is not null");
            return (Criteria) this;
        }

        public Criteria andTUsernameEqualTo(String value) {
            addCriterion("t_username =", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotEqualTo(String value) {
            addCriterion("t_username <>", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameGreaterThan(String value) {
            addCriterion("t_username >", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("t_username >=", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLessThan(String value) {
            addCriterion("t_username <", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLessThanOrEqualTo(String value) {
            addCriterion("t_username <=", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLike(String value) {
            addCriterion("t_username like", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotLike(String value) {
            addCriterion("t_username not like", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameIn(List<String> values) {
            addCriterion("t_username in", values, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotIn(List<String> values) {
            addCriterion("t_username not in", values, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameBetween(String value1, String value2) {
            addCriterion("t_username between", value1, value2, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotBetween(String value1, String value2) {
            addCriterion("t_username not between", value1, value2, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTDepartmentIsNull() {
            addCriterion("t_department is null");
            return (Criteria) this;
        }

        public Criteria andTDepartmentIsNotNull() {
            addCriterion("t_department is not null");
            return (Criteria) this;
        }

        public Criteria andTDepartmentEqualTo(String value) {
            addCriterion("t_department =", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentNotEqualTo(String value) {
            addCriterion("t_department <>", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentGreaterThan(String value) {
            addCriterion("t_department >", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("t_department >=", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentLessThan(String value) {
            addCriterion("t_department <", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentLessThanOrEqualTo(String value) {
            addCriterion("t_department <=", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentLike(String value) {
            addCriterion("t_department like", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentNotLike(String value) {
            addCriterion("t_department not like", value, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentIn(List<String> values) {
            addCriterion("t_department in", values, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentNotIn(List<String> values) {
            addCriterion("t_department not in", values, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentBetween(String value1, String value2) {
            addCriterion("t_department between", value1, value2, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTDepartmentNotBetween(String value1, String value2) {
            addCriterion("t_department not between", value1, value2, "tDepartment");
            return (Criteria) this;
        }

        public Criteria andTUseridIsNull() {
            addCriterion("t_userid is null");
            return (Criteria) this;
        }

        public Criteria andTUseridIsNotNull() {
            addCriterion("t_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTUseridEqualTo(String value) {
            addCriterion("t_userid =", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotEqualTo(String value) {
            addCriterion("t_userid <>", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridGreaterThan(String value) {
            addCriterion("t_userid >", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridGreaterThanOrEqualTo(String value) {
            addCriterion("t_userid >=", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLessThan(String value) {
            addCriterion("t_userid <", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLessThanOrEqualTo(String value) {
            addCriterion("t_userid <=", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLike(String value) {
            addCriterion("t_userid like", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotLike(String value) {
            addCriterion("t_userid not like", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridIn(List<String> values) {
            addCriterion("t_userid in", values, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotIn(List<String> values) {
            addCriterion("t_userid not in", values, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridBetween(String value1, String value2) {
            addCriterion("t_userid between", value1, value2, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotBetween(String value1, String value2) {
            addCriterion("t_userid not between", value1, value2, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTTelphoneIsNull() {
            addCriterion("t_telphone is null");
            return (Criteria) this;
        }

        public Criteria andTTelphoneIsNotNull() {
            addCriterion("t_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTTelphoneEqualTo(Long value) {
            addCriterion("t_telphone =", value, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneNotEqualTo(Long value) {
            addCriterion("t_telphone <>", value, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneGreaterThan(Long value) {
            addCriterion("t_telphone >", value, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("t_telphone >=", value, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneLessThan(Long value) {
            addCriterion("t_telphone <", value, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneLessThanOrEqualTo(Long value) {
            addCriterion("t_telphone <=", value, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneIn(List<Long> values) {
            addCriterion("t_telphone in", values, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneNotIn(List<Long> values) {
            addCriterion("t_telphone not in", values, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneBetween(Long value1, Long value2) {
            addCriterion("t_telphone between", value1, value2, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTTelphoneNotBetween(Long value1, Long value2) {
            addCriterion("t_telphone not between", value1, value2, "tTelphone");
            return (Criteria) this;
        }

        public Criteria andTCreatedateIsNull() {
            addCriterion("t_createdate is null");
            return (Criteria) this;
        }

        public Criteria andTCreatedateIsNotNull() {
            addCriterion("t_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andTCreatedateEqualTo(Date value) {
            addCriterion("t_createdate =", value, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateNotEqualTo(Date value) {
            addCriterion("t_createdate <>", value, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateGreaterThan(Date value) {
            addCriterion("t_createdate >", value, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("t_createdate >=", value, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateLessThan(Date value) {
            addCriterion("t_createdate <", value, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("t_createdate <=", value, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateIn(List<Date> values) {
            addCriterion("t_createdate in", values, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateNotIn(List<Date> values) {
            addCriterion("t_createdate not in", values, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateBetween(Date value1, Date value2) {
            addCriterion("t_createdate between", value1, value2, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("t_createdate not between", value1, value2, "tCreatedate");
            return (Criteria) this;
        }

        public Criteria andTNicknameIsNull() {
            addCriterion("t_nickname is null");
            return (Criteria) this;
        }

        public Criteria andTNicknameIsNotNull() {
            addCriterion("t_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andTNicknameEqualTo(String value) {
            addCriterion("t_nickname =", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameNotEqualTo(String value) {
            addCriterion("t_nickname <>", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameGreaterThan(String value) {
            addCriterion("t_nickname >", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("t_nickname >=", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameLessThan(String value) {
            addCriterion("t_nickname <", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameLessThanOrEqualTo(String value) {
            addCriterion("t_nickname <=", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameLike(String value) {
            addCriterion("t_nickname like", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameNotLike(String value) {
            addCriterion("t_nickname not like", value, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameIn(List<String> values) {
            addCriterion("t_nickname in", values, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameNotIn(List<String> values) {
            addCriterion("t_nickname not in", values, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameBetween(String value1, String value2) {
            addCriterion("t_nickname between", value1, value2, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTNicknameNotBetween(String value1, String value2) {
            addCriterion("t_nickname not between", value1, value2, "tNickname");
            return (Criteria) this;
        }

        public Criteria andTSortIsNull() {
            addCriterion("t_sort is null");
            return (Criteria) this;
        }

        public Criteria andTSortIsNotNull() {
            addCriterion("t_sort is not null");
            return (Criteria) this;
        }

        public Criteria andTSortEqualTo(String value) {
            addCriterion("t_sort =", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotEqualTo(String value) {
            addCriterion("t_sort <>", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortGreaterThan(String value) {
            addCriterion("t_sort >", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortGreaterThanOrEqualTo(String value) {
            addCriterion("t_sort >=", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLessThan(String value) {
            addCriterion("t_sort <", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLessThanOrEqualTo(String value) {
            addCriterion("t_sort <=", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLike(String value) {
            addCriterion("t_sort like", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotLike(String value) {
            addCriterion("t_sort not like", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortIn(List<String> values) {
            addCriterion("t_sort in", values, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotIn(List<String> values) {
            addCriterion("t_sort not in", values, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortBetween(String value1, String value2) {
            addCriterion("t_sort between", value1, value2, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotBetween(String value1, String value2) {
            addCriterion("t_sort not between", value1, value2, "tSort");
            return (Criteria) this;
        }

        public Criteria andTEx1IsNull() {
            addCriterion("t_ex1 is null");
            return (Criteria) this;
        }

        public Criteria andTEx1IsNotNull() {
            addCriterion("t_ex1 is not null");
            return (Criteria) this;
        }

        public Criteria andTEx1EqualTo(String value) {
            addCriterion("t_ex1 =", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1NotEqualTo(String value) {
            addCriterion("t_ex1 <>", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1GreaterThan(String value) {
            addCriterion("t_ex1 >", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1GreaterThanOrEqualTo(String value) {
            addCriterion("t_ex1 >=", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1LessThan(String value) {
            addCriterion("t_ex1 <", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1LessThanOrEqualTo(String value) {
            addCriterion("t_ex1 <=", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1Like(String value) {
            addCriterion("t_ex1 like", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1NotLike(String value) {
            addCriterion("t_ex1 not like", value, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1In(List<String> values) {
            addCriterion("t_ex1 in", values, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1NotIn(List<String> values) {
            addCriterion("t_ex1 not in", values, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1Between(String value1, String value2) {
            addCriterion("t_ex1 between", value1, value2, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx1NotBetween(String value1, String value2) {
            addCriterion("t_ex1 not between", value1, value2, "tEx1");
            return (Criteria) this;
        }

        public Criteria andTEx2IsNull() {
            addCriterion("t_ex2 is null");
            return (Criteria) this;
        }

        public Criteria andTEx2IsNotNull() {
            addCriterion("t_ex2 is not null");
            return (Criteria) this;
        }

        public Criteria andTEx2EqualTo(String value) {
            addCriterion("t_ex2 =", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2NotEqualTo(String value) {
            addCriterion("t_ex2 <>", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2GreaterThan(String value) {
            addCriterion("t_ex2 >", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2GreaterThanOrEqualTo(String value) {
            addCriterion("t_ex2 >=", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2LessThan(String value) {
            addCriterion("t_ex2 <", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2LessThanOrEqualTo(String value) {
            addCriterion("t_ex2 <=", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2Like(String value) {
            addCriterion("t_ex2 like", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2NotLike(String value) {
            addCriterion("t_ex2 not like", value, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2In(List<String> values) {
            addCriterion("t_ex2 in", values, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2NotIn(List<String> values) {
            addCriterion("t_ex2 not in", values, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2Between(String value1, String value2) {
            addCriterion("t_ex2 between", value1, value2, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx2NotBetween(String value1, String value2) {
            addCriterion("t_ex2 not between", value1, value2, "tEx2");
            return (Criteria) this;
        }

        public Criteria andTEx3IsNull() {
            addCriterion("t_ex3 is null");
            return (Criteria) this;
        }

        public Criteria andTEx3IsNotNull() {
            addCriterion("t_ex3 is not null");
            return (Criteria) this;
        }

        public Criteria andTEx3EqualTo(String value) {
            addCriterion("t_ex3 =", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3NotEqualTo(String value) {
            addCriterion("t_ex3 <>", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3GreaterThan(String value) {
            addCriterion("t_ex3 >", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3GreaterThanOrEqualTo(String value) {
            addCriterion("t_ex3 >=", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3LessThan(String value) {
            addCriterion("t_ex3 <", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3LessThanOrEqualTo(String value) {
            addCriterion("t_ex3 <=", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3Like(String value) {
            addCriterion("t_ex3 like", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3NotLike(String value) {
            addCriterion("t_ex3 not like", value, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3In(List<String> values) {
            addCriterion("t_ex3 in", values, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3NotIn(List<String> values) {
            addCriterion("t_ex3 not in", values, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3Between(String value1, String value2) {
            addCriterion("t_ex3 between", value1, value2, "tEx3");
            return (Criteria) this;
        }

        public Criteria andTEx3NotBetween(String value1, String value2) {
            addCriterion("t_ex3 not between", value1, value2, "tEx3");
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