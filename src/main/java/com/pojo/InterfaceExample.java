package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InterfaceExample {
    protected String pk_name = "IF_ID";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterfaceExample() {
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

        public Criteria andIpAddressIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("IP_ADDRESS like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpNumIsNull() {
            addCriterion("IP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIpNumIsNotNull() {
            addCriterion("IP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIpNumEqualTo(Long value) {
            addCriterion("IP_NUM =", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumNotEqualTo(Long value) {
            addCriterion("IP_NUM <>", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumGreaterThan(Long value) {
            addCriterion("IP_NUM >", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumGreaterThanOrEqualTo(Long value) {
            addCriterion("IP_NUM >=", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumLessThan(Long value) {
            addCriterion("IP_NUM <", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumLessThanOrEqualTo(Long value) {
            addCriterion("IP_NUM <=", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumIn(List<Long> values) {
            addCriterion("IP_NUM in", values, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumNotIn(List<Long> values) {
            addCriterion("IP_NUM not in", values, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumBetween(Long value1, Long value2) {
            addCriterion("IP_NUM between", value1, value2, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumNotBetween(Long value1, Long value2) {
            addCriterion("IP_NUM not between", value1, value2, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskIsNull() {
            addCriterion("IP_NETMASK is null");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskIsNotNull() {
            addCriterion("IP_NETMASK is not null");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskEqualTo(String value) {
            addCriterion("IP_NETMASK =", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskNotEqualTo(String value) {
            addCriterion("IP_NETMASK <>", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskGreaterThan(String value) {
            addCriterion("IP_NETMASK >", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskGreaterThanOrEqualTo(String value) {
            addCriterion("IP_NETMASK >=", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskLessThan(String value) {
            addCriterion("IP_NETMASK <", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskLessThanOrEqualTo(String value) {
            addCriterion("IP_NETMASK <=", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskLike(String value) {
            addCriterion("IP_NETMASK like", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskNotLike(String value) {
            addCriterion("IP_NETMASK not like", value, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskIn(List<String> values) {
            addCriterion("IP_NETMASK in", values, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskNotIn(List<String> values) {
            addCriterion("IP_NETMASK not in", values, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskBetween(String value1, String value2) {
            addCriterion("IP_NETMASK between", value1, value2, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpNetmaskNotBetween(String value1, String value2) {
            addCriterion("IP_NETMASK not between", value1, value2, "ipNetmask");
            return (Criteria) this;
        }

        public Criteria andIpStateIsNull() {
            addCriterion("IP_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIpStateIsNotNull() {
            addCriterion("IP_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIpStateEqualTo(Long value) {
            addCriterion("IP_STATE =", value, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateNotEqualTo(Long value) {
            addCriterion("IP_STATE <>", value, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateGreaterThan(Long value) {
            addCriterion("IP_STATE >", value, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateGreaterThanOrEqualTo(Long value) {
            addCriterion("IP_STATE >=", value, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateLessThan(Long value) {
            addCriterion("IP_STATE <", value, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateLessThanOrEqualTo(Long value) {
            addCriterion("IP_STATE <=", value, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateIn(List<Long> values) {
            addCriterion("IP_STATE in", values, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateNotIn(List<Long> values) {
            addCriterion("IP_STATE not in", values, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateBetween(Long value1, Long value2) {
            addCriterion("IP_STATE between", value1, value2, "ipState");
            return (Criteria) this;
        }

        public Criteria andIpStateNotBetween(Long value1, Long value2) {
            addCriterion("IP_STATE not between", value1, value2, "ipState");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNull() {
            addCriterion("ADMIN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNotNull() {
            addCriterion("ADMIN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusEqualTo(Long value) {
            addCriterion("ADMIN_STATUS =", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotEqualTo(Long value) {
            addCriterion("ADMIN_STATUS <>", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThan(Long value) {
            addCriterion("ADMIN_STATUS >", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("ADMIN_STATUS >=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThan(Long value) {
            addCriterion("ADMIN_STATUS <", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThanOrEqualTo(Long value) {
            addCriterion("ADMIN_STATUS <=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIn(List<Long> values) {
            addCriterion("ADMIN_STATUS in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotIn(List<Long> values) {
            addCriterion("ADMIN_STATUS not in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusBetween(Long value1, Long value2) {
            addCriterion("ADMIN_STATUS between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotBetween(Long value1, Long value2) {
            addCriterion("ADMIN_STATUS not between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andLegalityIsNull() {
            addCriterion("LEGALITY is null");
            return (Criteria) this;
        }

        public Criteria andLegalityIsNotNull() {
            addCriterion("LEGALITY is not null");
            return (Criteria) this;
        }

        public Criteria andLegalityEqualTo(Long value) {
            addCriterion("LEGALITY =", value, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityNotEqualTo(Long value) {
            addCriterion("LEGALITY <>", value, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityGreaterThan(Long value) {
            addCriterion("LEGALITY >", value, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityGreaterThanOrEqualTo(Long value) {
            addCriterion("LEGALITY >=", value, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityLessThan(Long value) {
            addCriterion("LEGALITY <", value, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityLessThanOrEqualTo(Long value) {
            addCriterion("LEGALITY <=", value, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityIn(List<Long> values) {
            addCriterion("LEGALITY in", values, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityNotIn(List<Long> values) {
            addCriterion("LEGALITY not in", values, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityBetween(Long value1, Long value2) {
            addCriterion("LEGALITY between", value1, value2, "legality");
            return (Criteria) this;
        }

        public Criteria andLegalityNotBetween(Long value1, Long value2) {
            addCriterion("LEGALITY not between", value1, value2, "legality");
            return (Criteria) this;
        }

        public Criteria andBindStatusIsNull() {
            addCriterion("BIND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBindStatusIsNotNull() {
            addCriterion("BIND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBindStatusEqualTo(Long value) {
            addCriterion("BIND_STATUS =", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotEqualTo(Long value) {
            addCriterion("BIND_STATUS <>", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusGreaterThan(Long value) {
            addCriterion("BIND_STATUS >", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("BIND_STATUS >=", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLessThan(Long value) {
            addCriterion("BIND_STATUS <", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLessThanOrEqualTo(Long value) {
            addCriterion("BIND_STATUS <=", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusIn(List<Long> values) {
            addCriterion("BIND_STATUS in", values, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotIn(List<Long> values) {
            addCriterion("BIND_STATUS not in", values, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusBetween(Long value1, Long value2) {
            addCriterion("BIND_STATUS between", value1, value2, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotBetween(Long value1, Long value2) {
            addCriterion("BIND_STATUS not between", value1, value2, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexIsNull() {
            addCriterion("SNMP_IFINDEX is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexIsNotNull() {
            addCriterion("SNMP_IFINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexEqualTo(Long value) {
            addCriterion("SNMP_IFINDEX =", value, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexNotEqualTo(Long value) {
            addCriterion("SNMP_IFINDEX <>", value, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexGreaterThan(Long value) {
            addCriterion("SNMP_IFINDEX >", value, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFINDEX >=", value, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexLessThan(Long value) {
            addCriterion("SNMP_IFINDEX <", value, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFINDEX <=", value, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexIn(List<Long> values) {
            addCriterion("SNMP_IFINDEX in", values, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexNotIn(List<Long> values) {
            addCriterion("SNMP_IFINDEX not in", values, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFINDEX between", value1, value2, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfindexNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFINDEX not between", value1, value2, "snmpIfindex");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrIsNull() {
            addCriterion("SNMP_IFDESCR is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrIsNotNull() {
            addCriterion("SNMP_IFDESCR is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrEqualTo(String value) {
            addCriterion("SNMP_IFDESCR =", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrNotEqualTo(String value) {
            addCriterion("SNMP_IFDESCR <>", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrGreaterThan(String value) {
            addCriterion("SNMP_IFDESCR >", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_IFDESCR >=", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrLessThan(String value) {
            addCriterion("SNMP_IFDESCR <", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrLessThanOrEqualTo(String value) {
            addCriterion("SNMP_IFDESCR <=", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrLike(String value) {
            addCriterion("SNMP_IFDESCR like", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrNotLike(String value) {
            addCriterion("SNMP_IFDESCR not like", value, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrIn(List<String> values) {
            addCriterion("SNMP_IFDESCR in", values, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrNotIn(List<String> values) {
            addCriterion("SNMP_IFDESCR not in", values, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrBetween(String value1, String value2) {
            addCriterion("SNMP_IFDESCR between", value1, value2, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfdescrNotBetween(String value1, String value2) {
            addCriterion("SNMP_IFDESCR not between", value1, value2, "snmpIfdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeIsNull() {
            addCriterion("SNMP_IFTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeIsNotNull() {
            addCriterion("SNMP_IFTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeEqualTo(Long value) {
            addCriterion("SNMP_IFTYPE =", value, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeNotEqualTo(Long value) {
            addCriterion("SNMP_IFTYPE <>", value, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeGreaterThan(Long value) {
            addCriterion("SNMP_IFTYPE >", value, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFTYPE >=", value, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeLessThan(Long value) {
            addCriterion("SNMP_IFTYPE <", value, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFTYPE <=", value, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeIn(List<Long> values) {
            addCriterion("SNMP_IFTYPE in", values, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeNotIn(List<Long> values) {
            addCriterion("SNMP_IFTYPE not in", values, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFTYPE between", value1, value2, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIftypeNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFTYPE not between", value1, value2, "snmpIftype");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuIsNull() {
            addCriterion("SNMP_IFMTU is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuIsNotNull() {
            addCriterion("SNMP_IFMTU is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuEqualTo(Long value) {
            addCriterion("SNMP_IFMTU =", value, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuNotEqualTo(Long value) {
            addCriterion("SNMP_IFMTU <>", value, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuGreaterThan(Long value) {
            addCriterion("SNMP_IFMTU >", value, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFMTU >=", value, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuLessThan(Long value) {
            addCriterion("SNMP_IFMTU <", value, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFMTU <=", value, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuIn(List<Long> values) {
            addCriterion("SNMP_IFMTU in", values, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuNotIn(List<Long> values) {
            addCriterion("SNMP_IFMTU not in", values, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFMTU between", value1, value2, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfmtuNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFMTU not between", value1, value2, "snmpIfmtu");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedIsNull() {
            addCriterion("SNMP_IFSPEED is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedIsNotNull() {
            addCriterion("SNMP_IFSPEED is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedEqualTo(Long value) {
            addCriterion("SNMP_IFSPEED =", value, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedNotEqualTo(Long value) {
            addCriterion("SNMP_IFSPEED <>", value, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedGreaterThan(Long value) {
            addCriterion("SNMP_IFSPEED >", value, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFSPEED >=", value, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedLessThan(Long value) {
            addCriterion("SNMP_IFSPEED <", value, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFSPEED <=", value, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedIn(List<Long> values) {
            addCriterion("SNMP_IFSPEED in", values, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedNotIn(List<Long> values) {
            addCriterion("SNMP_IFSPEED not in", values, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFSPEED between", value1, value2, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfspeedNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFSPEED not between", value1, value2, "snmpIfspeed");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusIsNull() {
            addCriterion("SNMP_IFOPERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusIsNotNull() {
            addCriterion("SNMP_IFOPERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusEqualTo(Long value) {
            addCriterion("SNMP_IFOPERSTATUS =", value, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusNotEqualTo(Long value) {
            addCriterion("SNMP_IFOPERSTATUS <>", value, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusGreaterThan(Long value) {
            addCriterion("SNMP_IFOPERSTATUS >", value, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFOPERSTATUS >=", value, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusLessThan(Long value) {
            addCriterion("SNMP_IFOPERSTATUS <", value, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFOPERSTATUS <=", value, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusIn(List<Long> values) {
            addCriterion("SNMP_IFOPERSTATUS in", values, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusNotIn(List<Long> values) {
            addCriterion("SNMP_IFOPERSTATUS not in", values, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFOPERSTATUS between", value1, value2, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoperstatusNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFOPERSTATUS not between", value1, value2, "snmpIfoperstatus");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrIsNull() {
            addCriterion("SNMP_IFPHYSADDR is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrIsNotNull() {
            addCriterion("SNMP_IFPHYSADDR is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrEqualTo(String value) {
            addCriterion("SNMP_IFPHYSADDR =", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrNotEqualTo(String value) {
            addCriterion("SNMP_IFPHYSADDR <>", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrGreaterThan(String value) {
            addCriterion("SNMP_IFPHYSADDR >", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_IFPHYSADDR >=", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrLessThan(String value) {
            addCriterion("SNMP_IFPHYSADDR <", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrLessThanOrEqualTo(String value) {
            addCriterion("SNMP_IFPHYSADDR <=", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrLike(String value) {
            addCriterion("SNMP_IFPHYSADDR like", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrNotLike(String value) {
            addCriterion("SNMP_IFPHYSADDR not like", value, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrIn(List<String> values) {
            addCriterion("SNMP_IFPHYSADDR in", values, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrNotIn(List<String> values) {
            addCriterion("SNMP_IFPHYSADDR not in", values, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrBetween(String value1, String value2) {
            addCriterion("SNMP_IFPHYSADDR between", value1, value2, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfphysaddrNotBetween(String value1, String value2) {
            addCriterion("SNMP_IFPHYSADDR not between", value1, value2, "snmpIfphysaddr");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameIsNull() {
            addCriterion("SNMP_IFNAME is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameIsNotNull() {
            addCriterion("SNMP_IFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameEqualTo(String value) {
            addCriterion("SNMP_IFNAME =", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameNotEqualTo(String value) {
            addCriterion("SNMP_IFNAME <>", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameGreaterThan(String value) {
            addCriterion("SNMP_IFNAME >", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_IFNAME >=", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameLessThan(String value) {
            addCriterion("SNMP_IFNAME <", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameLessThanOrEqualTo(String value) {
            addCriterion("SNMP_IFNAME <=", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameLike(String value) {
            addCriterion("SNMP_IFNAME like", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameNotLike(String value) {
            addCriterion("SNMP_IFNAME not like", value, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameIn(List<String> values) {
            addCriterion("SNMP_IFNAME in", values, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameNotIn(List<String> values) {
            addCriterion("SNMP_IFNAME not in", values, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameBetween(String value1, String value2) {
            addCriterion("SNMP_IFNAME between", value1, value2, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfnameNotBetween(String value1, String value2) {
            addCriterion("SNMP_IFNAME not between", value1, value2, "snmpIfname");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasIsNull() {
            addCriterion("SNMP_IFALIAS is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasIsNotNull() {
            addCriterion("SNMP_IFALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasEqualTo(String value) {
            addCriterion("SNMP_IFALIAS =", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasNotEqualTo(String value) {
            addCriterion("SNMP_IFALIAS <>", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasGreaterThan(String value) {
            addCriterion("SNMP_IFALIAS >", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_IFALIAS >=", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasLessThan(String value) {
            addCriterion("SNMP_IFALIAS <", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasLessThanOrEqualTo(String value) {
            addCriterion("SNMP_IFALIAS <=", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasLike(String value) {
            addCriterion("SNMP_IFALIAS like", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasNotLike(String value) {
            addCriterion("SNMP_IFALIAS not like", value, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasIn(List<String> values) {
            addCriterion("SNMP_IFALIAS in", values, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasNotIn(List<String> values) {
            addCriterion("SNMP_IFALIAS not in", values, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasBetween(String value1, String value2) {
            addCriterion("SNMP_IFALIAS between", value1, value2, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSnmpIfaliasNotBetween(String value1, String value2) {
            addCriterion("SNMP_IFALIAS not between", value1, value2, "snmpIfalias");
            return (Criteria) this;
        }

        public Criteria andSwitchPortIsNull() {
            addCriterion("SWITCH_PORT is null");
            return (Criteria) this;
        }

        public Criteria andSwitchPortIsNotNull() {
            addCriterion("SWITCH_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchPortEqualTo(Long value) {
            addCriterion("SWITCH_PORT =", value, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortNotEqualTo(Long value) {
            addCriterion("SWITCH_PORT <>", value, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortGreaterThan(Long value) {
            addCriterion("SWITCH_PORT >", value, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortGreaterThanOrEqualTo(Long value) {
            addCriterion("SWITCH_PORT >=", value, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortLessThan(Long value) {
            addCriterion("SWITCH_PORT <", value, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortLessThanOrEqualTo(Long value) {
            addCriterion("SWITCH_PORT <=", value, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortIn(List<Long> values) {
            addCriterion("SWITCH_PORT in", values, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortNotIn(List<Long> values) {
            addCriterion("SWITCH_PORT not in", values, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortBetween(Long value1, Long value2) {
            addCriterion("SWITCH_PORT between", value1, value2, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSwitchPortNotBetween(Long value1, Long value2) {
            addCriterion("SWITCH_PORT not between", value1, value2, "switchPort");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsIsNull() {
            addCriterion("SNMP_IFINOCTETS is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsIsNotNull() {
            addCriterion("SNMP_IFINOCTETS is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsEqualTo(Long value) {
            addCriterion("SNMP_IFINOCTETS =", value, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsNotEqualTo(Long value) {
            addCriterion("SNMP_IFINOCTETS <>", value, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsGreaterThan(Long value) {
            addCriterion("SNMP_IFINOCTETS >", value, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFINOCTETS >=", value, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsLessThan(Long value) {
            addCriterion("SNMP_IFINOCTETS <", value, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFINOCTETS <=", value, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsIn(List<Long> values) {
            addCriterion("SNMP_IFINOCTETS in", values, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsNotIn(List<Long> values) {
            addCriterion("SNMP_IFINOCTETS not in", values, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFINOCTETS between", value1, value2, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfinoctetsNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFINOCTETS not between", value1, value2, "snmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsIsNull() {
            addCriterion("SNMP_IFOUTOCTETS is null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsIsNotNull() {
            addCriterion("SNMP_IFOUTOCTETS is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsEqualTo(Long value) {
            addCriterion("SNMP_IFOUTOCTETS =", value, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsNotEqualTo(Long value) {
            addCriterion("SNMP_IFOUTOCTETS <>", value, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsGreaterThan(Long value) {
            addCriterion("SNMP_IFOUTOCTETS >", value, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsGreaterThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFOUTOCTETS >=", value, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsLessThan(Long value) {
            addCriterion("SNMP_IFOUTOCTETS <", value, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsLessThanOrEqualTo(Long value) {
            addCriterion("SNMP_IFOUTOCTETS <=", value, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsIn(List<Long> values) {
            addCriterion("SNMP_IFOUTOCTETS in", values, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsNotIn(List<Long> values) {
            addCriterion("SNMP_IFOUTOCTETS not in", values, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFOUTOCTETS between", value1, value2, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andSnmpIfoutoctetsNotBetween(Long value1, Long value2) {
            addCriterion("SNMP_IFOUTOCTETS not between", value1, value2, "snmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsIsNull() {
            addCriterion("LAST_SNMP_IFINOCTETS is null");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsIsNotNull() {
            addCriterion("LAST_SNMP_IFINOCTETS is not null");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFINOCTETS =", value, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsNotEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFINOCTETS <>", value, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsGreaterThan(Long value) {
            addCriterion("LAST_SNMP_IFINOCTETS >", value, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFINOCTETS >=", value, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsLessThan(Long value) {
            addCriterion("LAST_SNMP_IFINOCTETS <", value, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsLessThanOrEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFINOCTETS <=", value, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsIn(List<Long> values) {
            addCriterion("LAST_SNMP_IFINOCTETS in", values, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsNotIn(List<Long> values) {
            addCriterion("LAST_SNMP_IFINOCTETS not in", values, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsBetween(Long value1, Long value2) {
            addCriterion("LAST_SNMP_IFINOCTETS between", value1, value2, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfinoctetsNotBetween(Long value1, Long value2) {
            addCriterion("LAST_SNMP_IFINOCTETS not between", value1, value2, "lastSnmpIfinoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsIsNull() {
            addCriterion("LAST_SNMP_IFOUTOCTETS is null");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsIsNotNull() {
            addCriterion("LAST_SNMP_IFOUTOCTETS is not null");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFOUTOCTETS =", value, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsNotEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFOUTOCTETS <>", value, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsGreaterThan(Long value) {
            addCriterion("LAST_SNMP_IFOUTOCTETS >", value, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFOUTOCTETS >=", value, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsLessThan(Long value) {
            addCriterion("LAST_SNMP_IFOUTOCTETS <", value, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsLessThanOrEqualTo(Long value) {
            addCriterion("LAST_SNMP_IFOUTOCTETS <=", value, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsIn(List<Long> values) {
            addCriterion("LAST_SNMP_IFOUTOCTETS in", values, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsNotIn(List<Long> values) {
            addCriterion("LAST_SNMP_IFOUTOCTETS not in", values, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsBetween(Long value1, Long value2) {
            addCriterion("LAST_SNMP_IFOUTOCTETS between", value1, value2, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andLastSnmpIfoutoctetsNotBetween(Long value1, Long value2) {
            addCriterion("LAST_SNMP_IFOUTOCTETS not between", value1, value2, "lastSnmpIfoutoctets");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("COLLECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("COLLECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_TIME =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_TIME <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("COLLECT_TIME >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_TIME >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterionForJDBCDate("COLLECT_TIME <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_TIME <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterionForJDBCDate("COLLECT_TIME in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("COLLECT_TIME not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COLLECT_TIME between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COLLECT_TIME not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeIsNull() {
            addCriterion("LAST_COLLECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeIsNotNull() {
            addCriterion("LAST_COLLECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME =", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME <>", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME >", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME >=", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeLessThan(Date value) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME <", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME <=", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME in", values, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME not in", values, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME between", value1, value2, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_COLLECT_TIME not between", value1, value2, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeIsNull() {
            addCriterion("LAST_STATUS_CHANGE is null");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeIsNotNull() {
            addCriterion("LAST_STATUS_CHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE =", value, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE <>", value, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE >", value, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE >=", value, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeLessThan(Date value) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE <", value, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE <=", value, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE in", values, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE not in", values, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE between", value1, value2, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andLastStatusChangeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_STATUS_CHANGE not between", value1, value2, "lastStatusChange");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("DISPLAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("DISPLAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("DISPLAYNAME =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("DISPLAYNAME <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("DISPLAYNAME >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAYNAME >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("DISPLAYNAME <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("DISPLAYNAME <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("DISPLAYNAME like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("DISPLAYNAME not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("DISPLAYNAME in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("DISPLAYNAME not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("DISPLAYNAME between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("DISPLAYNAME not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andModifyFlagIsNull() {
            addCriterion("MODIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andModifyFlagIsNotNull() {
            addCriterion("MODIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andModifyFlagEqualTo(String value) {
            addCriterion("MODIFY_FLAG =", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotEqualTo(String value) {
            addCriterion("MODIFY_FLAG <>", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagGreaterThan(String value) {
            addCriterion("MODIFY_FLAG >", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_FLAG >=", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagLessThan(String value) {
            addCriterion("MODIFY_FLAG <", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_FLAG <=", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagLike(String value) {
            addCriterion("MODIFY_FLAG like", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotLike(String value) {
            addCriterion("MODIFY_FLAG not like", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagIn(List<String> values) {
            addCriterion("MODIFY_FLAG in", values, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotIn(List<String> values) {
            addCriterion("MODIFY_FLAG not in", values, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagBetween(String value1, String value2) {
            addCriterion("MODIFY_FLAG between", value1, value2, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotBetween(String value1, String value2) {
            addCriterion("MODIFY_FLAG not between", value1, value2, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeIsNull() {
            addCriterion("IF_WORKMODE is null");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeIsNotNull() {
            addCriterion("IF_WORKMODE is not null");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeEqualTo(Long value) {
            addCriterion("IF_WORKMODE =", value, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeNotEqualTo(Long value) {
            addCriterion("IF_WORKMODE <>", value, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeGreaterThan(Long value) {
            addCriterion("IF_WORKMODE >", value, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeGreaterThanOrEqualTo(Long value) {
            addCriterion("IF_WORKMODE >=", value, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeLessThan(Long value) {
            addCriterion("IF_WORKMODE <", value, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeLessThanOrEqualTo(Long value) {
            addCriterion("IF_WORKMODE <=", value, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeIn(List<Long> values) {
            addCriterion("IF_WORKMODE in", values, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeNotIn(List<Long> values) {
            addCriterion("IF_WORKMODE not in", values, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeBetween(Long value1, Long value2) {
            addCriterion("IF_WORKMODE between", value1, value2, "ifWorkmode");
            return (Criteria) this;
        }

        public Criteria andIfWorkmodeNotBetween(Long value1, Long value2) {
            addCriterion("IF_WORKMODE not between", value1, value2, "ifWorkmode");
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