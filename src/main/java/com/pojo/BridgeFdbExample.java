package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BridgeFdbExample {
    protected String pk_name;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BridgeFdbExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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