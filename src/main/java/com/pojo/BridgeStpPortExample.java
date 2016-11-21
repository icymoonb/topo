package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BridgeStpPortExample {
    protected String pk_name;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BridgeStpPortExample() {
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

        public Criteria andVlanIndexIsNull() {
            addCriterion("VLAN_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andVlanIndexIsNotNull() {
            addCriterion("VLAN_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andVlanIndexEqualTo(Long value) {
            addCriterion("VLAN_INDEX =", value, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexNotEqualTo(Long value) {
            addCriterion("VLAN_INDEX <>", value, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexGreaterThan(Long value) {
            addCriterion("VLAN_INDEX >", value, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("VLAN_INDEX >=", value, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexLessThan(Long value) {
            addCriterion("VLAN_INDEX <", value, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexLessThanOrEqualTo(Long value) {
            addCriterion("VLAN_INDEX <=", value, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexIn(List<Long> values) {
            addCriterion("VLAN_INDEX in", values, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexNotIn(List<Long> values) {
            addCriterion("VLAN_INDEX not in", values, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexBetween(Long value1, Long value2) {
            addCriterion("VLAN_INDEX between", value1, value2, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andVlanIndexNotBetween(Long value1, Long value2) {
            addCriterion("VLAN_INDEX not between", value1, value2, "vlanIndex");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Long value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Long value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Long value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Long value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Long value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Long value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Long> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Long> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Long value1, Long value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Long value1, Long value2) {
            addCriterion("PORT not between", value1, value2, "port");
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

        public Criteria andDesignatedRootIsNull() {
            addCriterion("DESIGNATED_ROOT is null");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootIsNotNull() {
            addCriterion("DESIGNATED_ROOT is not null");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootEqualTo(String value) {
            addCriterion("DESIGNATED_ROOT =", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootNotEqualTo(String value) {
            addCriterion("DESIGNATED_ROOT <>", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootGreaterThan(String value) {
            addCriterion("DESIGNATED_ROOT >", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGNATED_ROOT >=", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootLessThan(String value) {
            addCriterion("DESIGNATED_ROOT <", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootLessThanOrEqualTo(String value) {
            addCriterion("DESIGNATED_ROOT <=", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootLike(String value) {
            addCriterion("DESIGNATED_ROOT like", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootNotLike(String value) {
            addCriterion("DESIGNATED_ROOT not like", value, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootIn(List<String> values) {
            addCriterion("DESIGNATED_ROOT in", values, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootNotIn(List<String> values) {
            addCriterion("DESIGNATED_ROOT not in", values, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootBetween(String value1, String value2) {
            addCriterion("DESIGNATED_ROOT between", value1, value2, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedRootNotBetween(String value1, String value2) {
            addCriterion("DESIGNATED_ROOT not between", value1, value2, "designatedRoot");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeIsNull() {
            addCriterion("DESIGNATED_BRIDGE is null");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeIsNotNull() {
            addCriterion("DESIGNATED_BRIDGE is not null");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeEqualTo(String value) {
            addCriterion("DESIGNATED_BRIDGE =", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeNotEqualTo(String value) {
            addCriterion("DESIGNATED_BRIDGE <>", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeGreaterThan(String value) {
            addCriterion("DESIGNATED_BRIDGE >", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGNATED_BRIDGE >=", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeLessThan(String value) {
            addCriterion("DESIGNATED_BRIDGE <", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeLessThanOrEqualTo(String value) {
            addCriterion("DESIGNATED_BRIDGE <=", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeLike(String value) {
            addCriterion("DESIGNATED_BRIDGE like", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeNotLike(String value) {
            addCriterion("DESIGNATED_BRIDGE not like", value, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeIn(List<String> values) {
            addCriterion("DESIGNATED_BRIDGE in", values, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeNotIn(List<String> values) {
            addCriterion("DESIGNATED_BRIDGE not in", values, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeBetween(String value1, String value2) {
            addCriterion("DESIGNATED_BRIDGE between", value1, value2, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedBridgeNotBetween(String value1, String value2) {
            addCriterion("DESIGNATED_BRIDGE not between", value1, value2, "designatedBridge");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortIsNull() {
            addCriterion("DESIGNATED_PORT is null");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortIsNotNull() {
            addCriterion("DESIGNATED_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortEqualTo(Long value) {
            addCriterion("DESIGNATED_PORT =", value, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortNotEqualTo(Long value) {
            addCriterion("DESIGNATED_PORT <>", value, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortGreaterThan(Long value) {
            addCriterion("DESIGNATED_PORT >", value, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortGreaterThanOrEqualTo(Long value) {
            addCriterion("DESIGNATED_PORT >=", value, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortLessThan(Long value) {
            addCriterion("DESIGNATED_PORT <", value, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortLessThanOrEqualTo(Long value) {
            addCriterion("DESIGNATED_PORT <=", value, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortIn(List<Long> values) {
            addCriterion("DESIGNATED_PORT in", values, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortNotIn(List<Long> values) {
            addCriterion("DESIGNATED_PORT not in", values, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortBetween(Long value1, Long value2) {
            addCriterion("DESIGNATED_PORT between", value1, value2, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andDesignatedPortNotBetween(Long value1, Long value2) {
            addCriterion("DESIGNATED_PORT not between", value1, value2, "designatedPort");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`STATE` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`STATE` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Long value) {
            addCriterion("`STATE` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Long value) {
            addCriterion("`STATE` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Long value) {
            addCriterion("`STATE` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Long value) {
            addCriterion("`STATE` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Long value) {
            addCriterion("`STATE` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Long value) {
            addCriterion("`STATE` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Long> values) {
            addCriterion("`STATE` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Long> values) {
            addCriterion("`STATE` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Long value1, Long value2) {
            addCriterion("`STATE` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Long value1, Long value2) {
            addCriterion("`STATE` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSampletimeIsNull() {
            addCriterion("SAMPLETIME is null");
            return (Criteria) this;
        }

        public Criteria andSampletimeIsNotNull() {
            addCriterion("SAMPLETIME is not null");
            return (Criteria) this;
        }

        public Criteria andSampletimeEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLETIME =", value, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLETIME <>", value, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SAMPLETIME >", value, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLETIME >=", value, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeLessThan(Date value) {
            addCriterionForJDBCDate("SAMPLETIME <", value, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLETIME <=", value, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeIn(List<Date> values) {
            addCriterionForJDBCDate("SAMPLETIME in", values, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SAMPLETIME not in", values, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAMPLETIME between", value1, value2, "sampletime");
            return (Criteria) this;
        }

        public Criteria andSampletimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAMPLETIME not between", value1, value2, "sampletime");
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