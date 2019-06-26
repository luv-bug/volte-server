package com.yuwei.volte.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterielDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MaterielDOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andPrcurlIsNull() {
            addCriterion("prcurl is null");
            return (Criteria) this;
        }

        public Criteria andPrcurlIsNotNull() {
            addCriterion("prcurl is not null");
            return (Criteria) this;
        }

        public Criteria andPrcurlEqualTo(String value) {
            addCriterion("prcurl =", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlNotEqualTo(String value) {
            addCriterion("prcurl <>", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlGreaterThan(String value) {
            addCriterion("prcurl >", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlGreaterThanOrEqualTo(String value) {
            addCriterion("prcurl >=", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlLessThan(String value) {
            addCriterion("prcurl <", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlLessThanOrEqualTo(String value) {
            addCriterion("prcurl <=", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlLike(String value) {
            addCriterion("prcurl like", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlNotLike(String value) {
            addCriterion("prcurl not like", value, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlIn(List<String> values) {
            addCriterion("prcurl in", values, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlNotIn(List<String> values) {
            addCriterion("prcurl not in", values, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlBetween(String value1, String value2) {
            addCriterion("prcurl between", value1, value2, "prcurl");
            return (Criteria) this;
        }

        public Criteria andPrcurlNotBetween(String value1, String value2) {
            addCriterion("prcurl not between", value1, value2, "prcurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlIsNull() {
            addCriterion("homeurl is null");
            return (Criteria) this;
        }

        public Criteria andHomeurlIsNotNull() {
            addCriterion("homeurl is not null");
            return (Criteria) this;
        }

        public Criteria andHomeurlEqualTo(String value) {
            addCriterion("homeurl =", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlNotEqualTo(String value) {
            addCriterion("homeurl <>", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlGreaterThan(String value) {
            addCriterion("homeurl >", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlGreaterThanOrEqualTo(String value) {
            addCriterion("homeurl >=", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlLessThan(String value) {
            addCriterion("homeurl <", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlLessThanOrEqualTo(String value) {
            addCriterion("homeurl <=", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlLike(String value) {
            addCriterion("homeurl like", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlNotLike(String value) {
            addCriterion("homeurl not like", value, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlIn(List<String> values) {
            addCriterion("homeurl in", values, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlNotIn(List<String> values) {
            addCriterion("homeurl not in", values, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlBetween(String value1, String value2) {
            addCriterion("homeurl between", value1, value2, "homeurl");
            return (Criteria) this;
        }

        public Criteria andHomeurlNotBetween(String value1, String value2) {
            addCriterion("homeurl not between", value1, value2, "homeurl");
            return (Criteria) this;
        }

        public Criteria andMomentIsNull() {
            addCriterion("moment is null");
            return (Criteria) this;
        }

        public Criteria andMomentIsNotNull() {
            addCriterion("moment is not null");
            return (Criteria) this;
        }

        public Criteria andMomentEqualTo(String value) {
            addCriterion("moment =", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotEqualTo(String value) {
            addCriterion("moment <>", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentGreaterThan(String value) {
            addCriterion("moment >", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentGreaterThanOrEqualTo(String value) {
            addCriterion("moment >=", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentLessThan(String value) {
            addCriterion("moment <", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentLessThanOrEqualTo(String value) {
            addCriterion("moment <=", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentLike(String value) {
            addCriterion("moment like", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotLike(String value) {
            addCriterion("moment not like", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentIn(List<String> values) {
            addCriterion("moment in", values, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotIn(List<String> values) {
            addCriterion("moment not in", values, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentBetween(String value1, String value2) {
            addCriterion("moment between", value1, value2, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotBetween(String value1, String value2) {
            addCriterion("moment not between", value1, value2, "moment");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delflag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delflag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(Integer value) {
            addCriterion("delflag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(Integer value) {
            addCriterion("delflag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(Integer value) {
            addCriterion("delflag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delflag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(Integer value) {
            addCriterion("delflag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(Integer value) {
            addCriterion("delflag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<Integer> values) {
            addCriterion("delflag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<Integer> values) {
            addCriterion("delflag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(Integer value1, Integer value2) {
            addCriterion("delflag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(Integer value1, Integer value2) {
            addCriterion("delflag not between", value1, value2, "delflag");
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