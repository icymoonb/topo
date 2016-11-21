package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class LinkExample {
    protected String pk_name;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkExample() {
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

        public Criteria andIfIdIsNull() {
            addCriterion("IF_ID is null");
            return (Criteria) this;
        }

        public Criteria andIfIdIsNotNull() {
            addCriterion("IF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIfIdEqualTo(Long value) {
            addCriterion("IF_ID =", value, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdNotEqualTo(Long value) {
            addCriterion("IF_ID <>", value, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdGreaterThan(Long value) {
            addCriterion("IF_ID >", value, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("IF_ID >=", value, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdLessThan(Long value) {
            addCriterion("IF_ID <", value, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdLessThanOrEqualTo(Long value) {
            addCriterion("IF_ID <=", value, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdIn(List<Long> values) {
            addCriterion("IF_ID in", values, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdNotIn(List<Long> values) {
            addCriterion("IF_ID not in", values, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdBetween(Long value1, Long value2) {
            addCriterion("IF_ID between", value1, value2, "ifId");
            return (Criteria) this;
        }

        public Criteria andIfIdNotBetween(Long value1, Long value2) {
            addCriterion("IF_ID not between", value1, value2, "ifId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdIsNull() {
            addCriterion("NETWORK_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIdIsNotNull() {
            addCriterion("NETWORK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkIdEqualTo(Long value) {
            addCriterion("NETWORK_ID =", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotEqualTo(Long value) {
            addCriterion("NETWORK_ID <>", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdGreaterThan(Long value) {
            addCriterion("NETWORK_ID >", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NETWORK_ID >=", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdLessThan(Long value) {
            addCriterion("NETWORK_ID <", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdLessThanOrEqualTo(Long value) {
            addCriterion("NETWORK_ID <=", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdIn(List<Long> values) {
            addCriterion("NETWORK_ID in", values, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotIn(List<Long> values) {
            addCriterion("NETWORK_ID not in", values, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdBetween(Long value1, Long value2) {
            addCriterion("NETWORK_ID between", value1, value2, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotBetween(Long value1, Long value2) {
            addCriterion("NETWORK_ID not between", value1, value2, "networkId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdIsNull() {
            addCriterion("SPEED_IF_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdIsNotNull() {
            addCriterion("SPEED_IF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdEqualTo(Long value) {
            addCriterion("SPEED_IF_ID =", value, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdNotEqualTo(Long value) {
            addCriterion("SPEED_IF_ID <>", value, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdGreaterThan(Long value) {
            addCriterion("SPEED_IF_ID >", value, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SPEED_IF_ID >=", value, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdLessThan(Long value) {
            addCriterion("SPEED_IF_ID <", value, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdLessThanOrEqualTo(Long value) {
            addCriterion("SPEED_IF_ID <=", value, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdIn(List<Long> values) {
            addCriterion("SPEED_IF_ID in", values, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdNotIn(List<Long> values) {
            addCriterion("SPEED_IF_ID not in", values, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdBetween(Long value1, Long value2) {
            addCriterion("SPEED_IF_ID between", value1, value2, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andSpeedIfIdNotBetween(Long value1, Long value2) {
            addCriterion("SPEED_IF_ID not between", value1, value2, "speedIfId");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("ISDELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("ISDELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Long value) {
            addCriterion("ISDELETED =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Long value) {
            addCriterion("ISDELETED <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Long value) {
            addCriterion("ISDELETED >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Long value) {
            addCriterion("ISDELETED >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Long value) {
            addCriterion("ISDELETED <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Long value) {
            addCriterion("ISDELETED <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Long> values) {
            addCriterion("ISDELETED in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Long> values) {
            addCriterion("ISDELETED not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Long value1, Long value2) {
            addCriterion("ISDELETED between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Long value1, Long value2) {
            addCriterion("ISDELETED not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andEdgeNameIsNull() {
            addCriterion("EDGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEdgeNameIsNotNull() {
            addCriterion("EDGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEdgeNameEqualTo(String value) {
            addCriterion("EDGE_NAME =", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameNotEqualTo(String value) {
            addCriterion("EDGE_NAME <>", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameGreaterThan(String value) {
            addCriterion("EDGE_NAME >", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EDGE_NAME >=", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameLessThan(String value) {
            addCriterion("EDGE_NAME <", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameLessThanOrEqualTo(String value) {
            addCriterion("EDGE_NAME <=", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameLike(String value) {
            addCriterion("EDGE_NAME like", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameNotLike(String value) {
            addCriterion("EDGE_NAME not like", value, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameIn(List<String> values) {
            addCriterion("EDGE_NAME in", values, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameNotIn(List<String> values) {
            addCriterion("EDGE_NAME not in", values, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameBetween(String value1, String value2) {
            addCriterion("EDGE_NAME between", value1, value2, "edgeName");
            return (Criteria) this;
        }

        public Criteria andEdgeNameNotBetween(String value1, String value2) {
            addCriterion("EDGE_NAME not between", value1, value2, "edgeName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`TYPE` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`TYPE` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Long value) {
            addCriterion("`TYPE` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Long value) {
            addCriterion("`TYPE` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Long value) {
            addCriterion("`TYPE` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("`TYPE` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Long value) {
            addCriterion("`TYPE` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Long value) {
            addCriterion("`TYPE` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Long> values) {
            addCriterion("`TYPE` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Long> values) {
            addCriterion("`TYPE` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Long value1, Long value2) {
            addCriterion("`TYPE` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Long value1, Long value2) {
            addCriterion("`TYPE` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("IS_HIDE is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("IS_HIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(Long value) {
            addCriterion("IS_HIDE =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(Long value) {
            addCriterion("IS_HIDE <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(Long value) {
            addCriterion("IS_HIDE >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_HIDE >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(Long value) {
            addCriterion("IS_HIDE <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(Long value) {
            addCriterion("IS_HIDE <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<Long> values) {
            addCriterion("IS_HIDE in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<Long> values) {
            addCriterion("IS_HIDE not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(Long value1, Long value2) {
            addCriterion("IS_HIDE between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(Long value1, Long value2) {
            addCriterion("IS_HIDE not between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdIsNull() {
            addCriterion("REFER_SRV_ID is null");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdIsNotNull() {
            addCriterion("REFER_SRV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdEqualTo(Long value) {
            addCriterion("REFER_SRV_ID =", value, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdNotEqualTo(Long value) {
            addCriterion("REFER_SRV_ID <>", value, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdGreaterThan(Long value) {
            addCriterion("REFER_SRV_ID >", value, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REFER_SRV_ID >=", value, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdLessThan(Long value) {
            addCriterion("REFER_SRV_ID <", value, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdLessThanOrEqualTo(Long value) {
            addCriterion("REFER_SRV_ID <=", value, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdIn(List<Long> values) {
            addCriterion("REFER_SRV_ID in", values, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdNotIn(List<Long> values) {
            addCriterion("REFER_SRV_ID not in", values, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdBetween(Long value1, Long value2) {
            addCriterion("REFER_SRV_ID between", value1, value2, "referSrvId");
            return (Criteria) this;
        }

        public Criteria andReferSrvIdNotBetween(Long value1, Long value2) {
            addCriterion("REFER_SRV_ID not between", value1, value2, "referSrvId");
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