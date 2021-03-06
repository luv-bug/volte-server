package com.yuwei.volte.db.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer rows;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public AppInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
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
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
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
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public AppInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public AppInfoExample orderBy(String ... orderByClauses) {
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
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public AppInfoExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public AppInfoExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public AppInfoExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
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

        public Criteria andServerversionIsNull() {
            addCriterion("serverversion is null");
            return (Criteria) this;
        }

        public Criteria andServerversionIsNotNull() {
            addCriterion("serverversion is not null");
            return (Criteria) this;
        }

        public Criteria andServerversionEqualTo(String value) {
            addCriterion("serverversion =", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionNotEqualTo(String value) {
            addCriterion("serverversion <>", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionGreaterThan(String value) {
            addCriterion("serverversion >", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionGreaterThanOrEqualTo(String value) {
            addCriterion("serverversion >=", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionLessThan(String value) {
            addCriterion("serverversion <", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionLessThanOrEqualTo(String value) {
            addCriterion("serverversion <=", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionLike(String value) {
            addCriterion("serverversion like", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionNotLike(String value) {
            addCriterion("serverversion not like", value, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionIn(List<String> values) {
            addCriterion("serverversion in", values, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionNotIn(List<String> values) {
            addCriterion("serverversion not in", values, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionBetween(String value1, String value2) {
            addCriterion("serverversion between", value1, value2, "serverversion");
            return (Criteria) this;
        }

        public Criteria andServerversionNotBetween(String value1, String value2) {
            addCriterion("serverversion not between", value1, value2, "serverversion");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appname is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appname is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appname =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appname <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appname >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appname >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appname <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appname <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appname like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appname not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appname in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appname not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appname between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appname not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andServerflagIsNull() {
            addCriterion("serverflag is null");
            return (Criteria) this;
        }

        public Criteria andServerflagIsNotNull() {
            addCriterion("serverflag is not null");
            return (Criteria) this;
        }

        public Criteria andServerflagEqualTo(String value) {
            addCriterion("serverflag =", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagNotEqualTo(String value) {
            addCriterion("serverflag <>", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagGreaterThan(String value) {
            addCriterion("serverflag >", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagGreaterThanOrEqualTo(String value) {
            addCriterion("serverflag >=", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagLessThan(String value) {
            addCriterion("serverflag <", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagLessThanOrEqualTo(String value) {
            addCriterion("serverflag <=", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagLike(String value) {
            addCriterion("serverflag like", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagNotLike(String value) {
            addCriterion("serverflag not like", value, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagIn(List<String> values) {
            addCriterion("serverflag in", values, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagNotIn(List<String> values) {
            addCriterion("serverflag not in", values, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagBetween(String value1, String value2) {
            addCriterion("serverflag between", value1, value2, "serverflag");
            return (Criteria) this;
        }

        public Criteria andServerflagNotBetween(String value1, String value2) {
            addCriterion("serverflag not between", value1, value2, "serverflag");
            return (Criteria) this;
        }

        public Criteria andLastforceIsNull() {
            addCriterion("lastforce is null");
            return (Criteria) this;
        }

        public Criteria andLastforceIsNotNull() {
            addCriterion("lastforce is not null");
            return (Criteria) this;
        }

        public Criteria andLastforceEqualTo(String value) {
            addCriterion("lastforce =", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceNotEqualTo(String value) {
            addCriterion("lastforce <>", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceGreaterThan(String value) {
            addCriterion("lastforce >", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceGreaterThanOrEqualTo(String value) {
            addCriterion("lastforce >=", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceLessThan(String value) {
            addCriterion("lastforce <", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceLessThanOrEqualTo(String value) {
            addCriterion("lastforce <=", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceLike(String value) {
            addCriterion("lastforce like", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceNotLike(String value) {
            addCriterion("lastforce not like", value, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceIn(List<String> values) {
            addCriterion("lastforce in", values, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceNotIn(List<String> values) {
            addCriterion("lastforce not in", values, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceBetween(String value1, String value2) {
            addCriterion("lastforce between", value1, value2, "lastforce");
            return (Criteria) this;
        }

        public Criteria andLastforceNotBetween(String value1, String value2) {
            addCriterion("lastforce not between", value1, value2, "lastforce");
            return (Criteria) this;
        }

        public Criteria andUpdateurlIsNull() {
            addCriterion("updateurl is null");
            return (Criteria) this;
        }

        public Criteria andUpdateurlIsNotNull() {
            addCriterion("updateurl is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateurlEqualTo(String value) {
            addCriterion("updateurl =", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlNotEqualTo(String value) {
            addCriterion("updateurl <>", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlGreaterThan(String value) {
            addCriterion("updateurl >", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlGreaterThanOrEqualTo(String value) {
            addCriterion("updateurl >=", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlLessThan(String value) {
            addCriterion("updateurl <", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlLessThanOrEqualTo(String value) {
            addCriterion("updateurl <=", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlLike(String value) {
            addCriterion("updateurl like", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlNotLike(String value) {
            addCriterion("updateurl not like", value, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlIn(List<String> values) {
            addCriterion("updateurl in", values, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlNotIn(List<String> values) {
            addCriterion("updateurl not in", values, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlBetween(String value1, String value2) {
            addCriterion("updateurl between", value1, value2, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpdateurlNotBetween(String value1, String value2) {
            addCriterion("updateurl not between", value1, value2, "updateurl");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoIsNull() {
            addCriterion("upgradeinfo is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoIsNotNull() {
            addCriterion("upgradeinfo is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoEqualTo(String value) {
            addCriterion("upgradeinfo =", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoNotEqualTo(String value) {
            addCriterion("upgradeinfo <>", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoGreaterThan(String value) {
            addCriterion("upgradeinfo >", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("upgradeinfo >=", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoLessThan(String value) {
            addCriterion("upgradeinfo <", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoLessThanOrEqualTo(String value) {
            addCriterion("upgradeinfo <=", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoLike(String value) {
            addCriterion("upgradeinfo like", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoNotLike(String value) {
            addCriterion("upgradeinfo not like", value, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoIn(List<String> values) {
            addCriterion("upgradeinfo in", values, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoNotIn(List<String> values) {
            addCriterion("upgradeinfo not in", values, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoBetween(String value1, String value2) {
            addCriterion("upgradeinfo between", value1, value2, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andUpgradeinfoNotBetween(String value1, String value2) {
            addCriterion("upgradeinfo not between", value1, value2, "upgradeinfo");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_info
     *
     * @mbg.generated do_not_delete_during_merge Fri May 24 19:49:41 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table app_info
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private AppInfoExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table app_info
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(AppInfoExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table app_info
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public AppInfoExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table app_info
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
         * This interface corresponds to the database table app_info
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table app_info
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_info
     *
     * @mbg.generated Fri May 24 19:49:41 CST 2019
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