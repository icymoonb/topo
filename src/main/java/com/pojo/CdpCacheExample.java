package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class CdpCacheExample {
    protected String pk_name;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CdpCacheExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setPk_name(String pk_name) {
        this.pk_name = pk_name;
    }

    public String getPk_name() {
        return pk_name;
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

        public Criteria andIfIndexIsNull() {
            addCriterion("IF_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andIfIndexIsNotNull() {
            addCriterion("IF_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andIfIndexEqualTo(Long value) {
            addCriterion("IF_INDEX =", value, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexNotEqualTo(Long value) {
            addCriterion("IF_INDEX <>", value, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexGreaterThan(Long value) {
            addCriterion("IF_INDEX >", value, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("IF_INDEX >=", value, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexLessThan(Long value) {
            addCriterion("IF_INDEX <", value, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexLessThanOrEqualTo(Long value) {
            addCriterion("IF_INDEX <=", value, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexIn(List<Long> values) {
            addCriterion("IF_INDEX in", values, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexNotIn(List<Long> values) {
            addCriterion("IF_INDEX not in", values, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexBetween(Long value1, Long value2) {
            addCriterion("IF_INDEX between", value1, value2, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andIfIndexNotBetween(Long value1, Long value2) {
            addCriterion("IF_INDEX not between", value1, value2, "ifIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Long value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Long value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Long value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Long value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Long> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Long> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Long value1, Long value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrIsNull() {
            addCriterion("REMOTE_IPADDR is null");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrIsNotNull() {
            addCriterion("REMOTE_IPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrEqualTo(String value) {
            addCriterion("REMOTE_IPADDR =", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrNotEqualTo(String value) {
            addCriterion("REMOTE_IPADDR <>", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrGreaterThan(String value) {
            addCriterion("REMOTE_IPADDR >", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_IPADDR >=", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrLessThan(String value) {
            addCriterion("REMOTE_IPADDR <", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_IPADDR <=", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrLike(String value) {
            addCriterion("REMOTE_IPADDR like", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrNotLike(String value) {
            addCriterion("REMOTE_IPADDR not like", value, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrIn(List<String> values) {
            addCriterion("REMOTE_IPADDR in", values, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrNotIn(List<String> values) {
            addCriterion("REMOTE_IPADDR not in", values, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrBetween(String value1, String value2) {
            addCriterion("REMOTE_IPADDR between", value1, value2, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIpaddrNotBetween(String value1, String value2) {
            addCriterion("REMOTE_IPADDR not between", value1, value2, "remoteIpaddr");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameIsNull() {
            addCriterion("REMOTE_IFNAME is null");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameIsNotNull() {
            addCriterion("REMOTE_IFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameEqualTo(String value) {
            addCriterion("REMOTE_IFNAME =", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameNotEqualTo(String value) {
            addCriterion("REMOTE_IFNAME <>", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameGreaterThan(String value) {
            addCriterion("REMOTE_IFNAME >", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_IFNAME >=", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameLessThan(String value) {
            addCriterion("REMOTE_IFNAME <", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_IFNAME <=", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameLike(String value) {
            addCriterion("REMOTE_IFNAME like", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameNotLike(String value) {
            addCriterion("REMOTE_IFNAME not like", value, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameIn(List<String> values) {
            addCriterion("REMOTE_IFNAME in", values, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameNotIn(List<String> values) {
            addCriterion("REMOTE_IFNAME not in", values, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameBetween(String value1, String value2) {
            addCriterion("REMOTE_IFNAME between", value1, value2, "remoteIfname");
            return (Criteria) this;
        }

        public Criteria andRemoteIfnameNotBetween(String value1, String value2) {
            addCriterion("REMOTE_IFNAME not between", value1, value2, "remoteIfname");
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