package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewBackboneLineExample {
    protected String pk_name;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewBackboneLineExample() {
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

        public Criteria andRemoteNodeIdIsNull() {
            addCriterion("REMOTE_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdIsNotNull() {
            addCriterion("REMOTE_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdEqualTo(Long value) {
            addCriterion("REMOTE_NODE_ID =", value, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdNotEqualTo(Long value) {
            addCriterion("REMOTE_NODE_ID <>", value, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdGreaterThan(Long value) {
            addCriterion("REMOTE_NODE_ID >", value, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REMOTE_NODE_ID >=", value, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdLessThan(Long value) {
            addCriterion("REMOTE_NODE_ID <", value, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("REMOTE_NODE_ID <=", value, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdIn(List<Long> values) {
            addCriterion("REMOTE_NODE_ID in", values, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdNotIn(List<Long> values) {
            addCriterion("REMOTE_NODE_ID not in", values, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdBetween(Long value1, Long value2) {
            addCriterion("REMOTE_NODE_ID between", value1, value2, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("REMOTE_NODE_ID not between", value1, value2, "remoteNodeId");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexIsNull() {
            addCriterion("REMOTE_IF_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexIsNotNull() {
            addCriterion("REMOTE_IF_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexEqualTo(Long value) {
            addCriterion("REMOTE_IF_INDEX =", value, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexNotEqualTo(Long value) {
            addCriterion("REMOTE_IF_INDEX <>", value, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexGreaterThan(Long value) {
            addCriterion("REMOTE_IF_INDEX >", value, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("REMOTE_IF_INDEX >=", value, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexLessThan(Long value) {
            addCriterion("REMOTE_IF_INDEX <", value, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexLessThanOrEqualTo(Long value) {
            addCriterion("REMOTE_IF_INDEX <=", value, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexIn(List<Long> values) {
            addCriterion("REMOTE_IF_INDEX in", values, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexNotIn(List<Long> values) {
            addCriterion("REMOTE_IF_INDEX not in", values, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexBetween(Long value1, Long value2) {
            addCriterion("REMOTE_IF_INDEX between", value1, value2, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andRemoteIfIndexNotBetween(Long value1, Long value2) {
            addCriterion("REMOTE_IF_INDEX not between", value1, value2, "remoteIfIndex");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
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