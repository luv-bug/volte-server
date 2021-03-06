package com.yuwei.volte.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer rows;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public CallDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public CallDetailExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public CallDetailExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public CallDetailExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public CallDetailExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public CallDetailExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
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

        public Criteria andCallidIsNull() {
            addCriterion("callid is null");
            return (Criteria) this;
        }

        public Criteria andCallidIsNotNull() {
            addCriterion("callid is not null");
            return (Criteria) this;
        }

        public Criteria andCallidEqualTo(Integer value) {
            addCriterion("callid =", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotEqualTo(Integer value) {
            addCriterion("callid <>", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidGreaterThan(Integer value) {
            addCriterion("callid >", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidGreaterThanOrEqualTo(Integer value) {
            addCriterion("callid >=", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidLessThan(Integer value) {
            addCriterion("callid <", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidLessThanOrEqualTo(Integer value) {
            addCriterion("callid <=", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidIn(List<Integer> values) {
            addCriterion("callid in", values, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotIn(List<Integer> values) {
            addCriterion("callid not in", values, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidBetween(Integer value1, Integer value2) {
            addCriterion("callid between", value1, value2, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotBetween(Integer value1, Integer value2) {
            addCriterion("callid not between", value1, value2, "callid");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNull() {
            addCriterion("calltype is null");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNotNull() {
            addCriterion("calltype is not null");
            return (Criteria) this;
        }

        public Criteria andCalltypeEqualTo(String value) {
            addCriterion("calltype =", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotEqualTo(String value) {
            addCriterion("calltype <>", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThan(String value) {
            addCriterion("calltype >", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThanOrEqualTo(String value) {
            addCriterion("calltype >=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThan(String value) {
            addCriterion("calltype <", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThanOrEqualTo(String value) {
            addCriterion("calltype <=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLike(String value) {
            addCriterion("calltype like", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotLike(String value) {
            addCriterion("calltype not like", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeIn(List<String> values) {
            addCriterion("calltype in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotIn(List<String> values) {
            addCriterion("calltype not in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeBetween(String value1, String value2) {
            addCriterion("calltype between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotBetween(String value1, String value2) {
            addCriterion("calltype not between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalllongIsNull() {
            addCriterion("calllong is null");
            return (Criteria) this;
        }

        public Criteria andCalllongIsNotNull() {
            addCriterion("calllong is not null");
            return (Criteria) this;
        }

        public Criteria andCalllongEqualTo(Integer value) {
            addCriterion("calllong =", value, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongNotEqualTo(Integer value) {
            addCriterion("calllong <>", value, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongGreaterThan(Integer value) {
            addCriterion("calllong >", value, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongGreaterThanOrEqualTo(Integer value) {
            addCriterion("calllong >=", value, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongLessThan(Integer value) {
            addCriterion("calllong <", value, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongLessThanOrEqualTo(Integer value) {
            addCriterion("calllong <=", value, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongIn(List<Integer> values) {
            addCriterion("calllong in", values, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongNotIn(List<Integer> values) {
            addCriterion("calllong not in", values, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongBetween(Integer value1, Integer value2) {
            addCriterion("calllong between", value1, value2, "calllong");
            return (Criteria) this;
        }

        public Criteria andCalllongNotBetween(Integer value1, Integer value2) {
            addCriterion("calllong not between", value1, value2, "calllong");
            return (Criteria) this;
        }

        public Criteria andRecordpathIsNull() {
            addCriterion("recordpath is null");
            return (Criteria) this;
        }

        public Criteria andRecordpathIsNotNull() {
            addCriterion("recordpath is not null");
            return (Criteria) this;
        }

        public Criteria andRecordpathEqualTo(String value) {
            addCriterion("recordpath =", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathNotEqualTo(String value) {
            addCriterion("recordpath <>", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathGreaterThan(String value) {
            addCriterion("recordpath >", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathGreaterThanOrEqualTo(String value) {
            addCriterion("recordpath >=", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathLessThan(String value) {
            addCriterion("recordpath <", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathLessThanOrEqualTo(String value) {
            addCriterion("recordpath <=", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathLike(String value) {
            addCriterion("recordpath like", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathNotLike(String value) {
            addCriterion("recordpath not like", value, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathIn(List<String> values) {
            addCriterion("recordpath in", values, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathNotIn(List<String> values) {
            addCriterion("recordpath not in", values, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathBetween(String value1, String value2) {
            addCriterion("recordpath between", value1, value2, "recordpath");
            return (Criteria) this;
        }

        public Criteria andRecordpathNotBetween(String value1, String value2) {
            addCriterion("recordpath not between", value1, value2, "recordpath");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andTestresultIsNull() {
            addCriterion("testresult is null");
            return (Criteria) this;
        }

        public Criteria andTestresultIsNotNull() {
            addCriterion("testresult is not null");
            return (Criteria) this;
        }

        public Criteria andTestresultEqualTo(String value) {
            addCriterion("testresult =", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotEqualTo(String value) {
            addCriterion("testresult <>", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultGreaterThan(String value) {
            addCriterion("testresult >", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultGreaterThanOrEqualTo(String value) {
            addCriterion("testresult >=", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultLessThan(String value) {
            addCriterion("testresult <", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultLessThanOrEqualTo(String value) {
            addCriterion("testresult <=", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultLike(String value) {
            addCriterion("testresult like", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotLike(String value) {
            addCriterion("testresult not like", value, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultIn(List<String> values) {
            addCriterion("testresult in", values, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotIn(List<String> values) {
            addCriterion("testresult not in", values, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultBetween(String value1, String value2) {
            addCriterion("testresult between", value1, value2, "testresult");
            return (Criteria) this;
        }

        public Criteria andTestresultNotBetween(String value1, String value2) {
            addCriterion("testresult not between", value1, value2, "testresult");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table call_detail
     *
     * @mbg.generated do_not_delete_during_merge Thu Jun 06 17:24:06 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table call_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private CallDetailExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table call_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(CallDetailExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table call_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public CallDetailExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table call_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table call_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table call_detail
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
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