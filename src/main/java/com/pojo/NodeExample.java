package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NodeExample {
    protected String pk_name = "NODE_ID";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
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

        public Criteria andHostnameIsNull() {
            addCriterion("HOSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("HOSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("HOSTNAME =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("HOSTNAME <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("HOSTNAME >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSTNAME >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("HOSTNAME <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("HOSTNAME <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("HOSTNAME like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("HOSTNAME not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("HOSTNAME in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("HOSTNAME not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("HOSTNAME between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("HOSTNAME not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andCommunityRoIsNull() {
            addCriterion("COMMUNITY_RO is null");
            return (Criteria) this;
        }

        public Criteria andCommunityRoIsNotNull() {
            addCriterion("COMMUNITY_RO is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityRoEqualTo(String value) {
            addCriterion("COMMUNITY_RO =", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoNotEqualTo(String value) {
            addCriterion("COMMUNITY_RO <>", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoGreaterThan(String value) {
            addCriterion("COMMUNITY_RO >", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITY_RO >=", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoLessThan(String value) {
            addCriterion("COMMUNITY_RO <", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITY_RO <=", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoLike(String value) {
            addCriterion("COMMUNITY_RO like", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoNotLike(String value) {
            addCriterion("COMMUNITY_RO not like", value, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoIn(List<String> values) {
            addCriterion("COMMUNITY_RO in", values, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoNotIn(List<String> values) {
            addCriterion("COMMUNITY_RO not in", values, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoBetween(String value1, String value2) {
            addCriterion("COMMUNITY_RO between", value1, value2, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRoNotBetween(String value1, String value2) {
            addCriterion("COMMUNITY_RO not between", value1, value2, "communityRo");
            return (Criteria) this;
        }

        public Criteria andCommunityRwIsNull() {
            addCriterion("COMMUNITY_RW is null");
            return (Criteria) this;
        }

        public Criteria andCommunityRwIsNotNull() {
            addCriterion("COMMUNITY_RW is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityRwEqualTo(String value) {
            addCriterion("COMMUNITY_RW =", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwNotEqualTo(String value) {
            addCriterion("COMMUNITY_RW <>", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwGreaterThan(String value) {
            addCriterion("COMMUNITY_RW >", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITY_RW >=", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwLessThan(String value) {
            addCriterion("COMMUNITY_RW <", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITY_RW <=", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwLike(String value) {
            addCriterion("COMMUNITY_RW like", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwNotLike(String value) {
            addCriterion("COMMUNITY_RW not like", value, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwIn(List<String> values) {
            addCriterion("COMMUNITY_RW in", values, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwNotIn(List<String> values) {
            addCriterion("COMMUNITY_RW not in", values, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwBetween(String value1, String value2) {
            addCriterion("COMMUNITY_RW between", value1, value2, "communityRw");
            return (Criteria) this;
        }

        public Criteria andCommunityRwNotBetween(String value1, String value2) {
            addCriterion("COMMUNITY_RW not between", value1, value2, "communityRw");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameIsNull() {
            addCriterion("SNMP_SYSNAME is null");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameIsNotNull() {
            addCriterion("SNMP_SYSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameEqualTo(String value) {
            addCriterion("SNMP_SYSNAME =", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameNotEqualTo(String value) {
            addCriterion("SNMP_SYSNAME <>", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameGreaterThan(String value) {
            addCriterion("SNMP_SYSNAME >", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSNAME >=", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameLessThan(String value) {
            addCriterion("SNMP_SYSNAME <", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameLessThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSNAME <=", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameLike(String value) {
            addCriterion("SNMP_SYSNAME like", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameNotLike(String value) {
            addCriterion("SNMP_SYSNAME not like", value, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameIn(List<String> values) {
            addCriterion("SNMP_SYSNAME in", values, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameNotIn(List<String> values) {
            addCriterion("SNMP_SYSNAME not in", values, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameBetween(String value1, String value2) {
            addCriterion("SNMP_SYSNAME between", value1, value2, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysnameNotBetween(String value1, String value2) {
            addCriterion("SNMP_SYSNAME not between", value1, value2, "snmpSysname");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrIsNull() {
            addCriterion("SNMP_SYSDESCR is null");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrIsNotNull() {
            addCriterion("SNMP_SYSDESCR is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrEqualTo(String value) {
            addCriterion("SNMP_SYSDESCR =", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrNotEqualTo(String value) {
            addCriterion("SNMP_SYSDESCR <>", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrGreaterThan(String value) {
            addCriterion("SNMP_SYSDESCR >", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSDESCR >=", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrLessThan(String value) {
            addCriterion("SNMP_SYSDESCR <", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrLessThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSDESCR <=", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrLike(String value) {
            addCriterion("SNMP_SYSDESCR like", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrNotLike(String value) {
            addCriterion("SNMP_SYSDESCR not like", value, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrIn(List<String> values) {
            addCriterion("SNMP_SYSDESCR in", values, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrNotIn(List<String> values) {
            addCriterion("SNMP_SYSDESCR not in", values, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrBetween(String value1, String value2) {
            addCriterion("SNMP_SYSDESCR between", value1, value2, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSysdescrNotBetween(String value1, String value2) {
            addCriterion("SNMP_SYSDESCR not between", value1, value2, "snmpSysdescr");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationIsNull() {
            addCriterion("SNMP_SYSLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationIsNotNull() {
            addCriterion("SNMP_SYSLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationEqualTo(String value) {
            addCriterion("SNMP_SYSLOCATION =", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationNotEqualTo(String value) {
            addCriterion("SNMP_SYSLOCATION <>", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationGreaterThan(String value) {
            addCriterion("SNMP_SYSLOCATION >", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSLOCATION >=", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationLessThan(String value) {
            addCriterion("SNMP_SYSLOCATION <", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationLessThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSLOCATION <=", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationLike(String value) {
            addCriterion("SNMP_SYSLOCATION like", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationNotLike(String value) {
            addCriterion("SNMP_SYSLOCATION not like", value, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationIn(List<String> values) {
            addCriterion("SNMP_SYSLOCATION in", values, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationNotIn(List<String> values) {
            addCriterion("SNMP_SYSLOCATION not in", values, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationBetween(String value1, String value2) {
            addCriterion("SNMP_SYSLOCATION between", value1, value2, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyslocationNotBetween(String value1, String value2) {
            addCriterion("SNMP_SYSLOCATION not between", value1, value2, "snmpSyslocation");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactIsNull() {
            addCriterion("SNMP_SYSCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactIsNotNull() {
            addCriterion("SNMP_SYSCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactEqualTo(String value) {
            addCriterion("SNMP_SYSCONTACT =", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactNotEqualTo(String value) {
            addCriterion("SNMP_SYSCONTACT <>", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactGreaterThan(String value) {
            addCriterion("SNMP_SYSCONTACT >", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSCONTACT >=", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactLessThan(String value) {
            addCriterion("SNMP_SYSCONTACT <", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactLessThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSCONTACT <=", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactLike(String value) {
            addCriterion("SNMP_SYSCONTACT like", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactNotLike(String value) {
            addCriterion("SNMP_SYSCONTACT not like", value, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactIn(List<String> values) {
            addCriterion("SNMP_SYSCONTACT in", values, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactNotIn(List<String> values) {
            addCriterion("SNMP_SYSCONTACT not in", values, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactBetween(String value1, String value2) {
            addCriterion("SNMP_SYSCONTACT between", value1, value2, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSyscontactNotBetween(String value1, String value2) {
            addCriterion("SNMP_SYSCONTACT not between", value1, value2, "snmpSyscontact");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidIsNull() {
            addCriterion("SNMP_SYSOBJID is null");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidIsNotNull() {
            addCriterion("SNMP_SYSOBJID is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidEqualTo(String value) {
            addCriterion("SNMP_SYSOBJID =", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidNotEqualTo(String value) {
            addCriterion("SNMP_SYSOBJID <>", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidGreaterThan(String value) {
            addCriterion("SNMP_SYSOBJID >", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSOBJID >=", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidLessThan(String value) {
            addCriterion("SNMP_SYSOBJID <", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidLessThanOrEqualTo(String value) {
            addCriterion("SNMP_SYSOBJID <=", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidLike(String value) {
            addCriterion("SNMP_SYSOBJID like", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidNotLike(String value) {
            addCriterion("SNMP_SYSOBJID not like", value, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidIn(List<String> values) {
            addCriterion("SNMP_SYSOBJID in", values, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidNotIn(List<String> values) {
            addCriterion("SNMP_SYSOBJID not in", values, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidBetween(String value1, String value2) {
            addCriterion("SNMP_SYSOBJID between", value1, value2, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andSnmpSysobjidNotBetween(String value1, String value2) {
            addCriterion("SNMP_SYSOBJID not between", value1, value2, "snmpSysobjid");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIsNull() {
            addCriterion("PRODUCER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIsNotNull() {
            addCriterion("PRODUCER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProducerCodeEqualTo(Long value) {
            addCriterion("PRODUCER_CODE =", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotEqualTo(Long value) {
            addCriterion("PRODUCER_CODE <>", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeGreaterThan(Long value) {
            addCriterion("PRODUCER_CODE >", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCER_CODE >=", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLessThan(Long value) {
            addCriterion("PRODUCER_CODE <", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCER_CODE <=", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIn(List<Long> values) {
            addCriterion("PRODUCER_CODE in", values, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotIn(List<Long> values) {
            addCriterion("PRODUCER_CODE not in", values, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeBetween(Long value1, Long value2) {
            addCriterion("PRODUCER_CODE between", value1, value2, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCER_CODE not between", value1, value2, "producerCode");
            return (Criteria) this;
        }

        public Criteria andIfCountIsNull() {
            addCriterion("IF_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andIfCountIsNotNull() {
            addCriterion("IF_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIfCountEqualTo(Long value) {
            addCriterion("IF_COUNT =", value, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountNotEqualTo(Long value) {
            addCriterion("IF_COUNT <>", value, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountGreaterThan(Long value) {
            addCriterion("IF_COUNT >", value, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountGreaterThanOrEqualTo(Long value) {
            addCriterion("IF_COUNT >=", value, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountLessThan(Long value) {
            addCriterion("IF_COUNT <", value, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountLessThanOrEqualTo(Long value) {
            addCriterion("IF_COUNT <=", value, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountIn(List<Long> values) {
            addCriterion("IF_COUNT in", values, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountNotIn(List<Long> values) {
            addCriterion("IF_COUNT not in", values, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountBetween(Long value1, Long value2) {
            addCriterion("IF_COUNT between", value1, value2, "ifCount");
            return (Criteria) this;
        }

        public Criteria andIfCountNotBetween(Long value1, Long value2) {
            addCriterion("IF_COUNT not between", value1, value2, "ifCount");
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

        public Criteria andSysUptimeIsNull() {
            addCriterion("SYS_UPTIME is null");
            return (Criteria) this;
        }

        public Criteria andSysUptimeIsNotNull() {
            addCriterion("SYS_UPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysUptimeEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_UPTIME =", value, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_UPTIME <>", value, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SYS_UPTIME >", value, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_UPTIME >=", value, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeLessThan(Date value) {
            addCriterionForJDBCDate("SYS_UPTIME <", value, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_UPTIME <=", value, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeIn(List<Date> values) {
            addCriterionForJDBCDate("SYS_UPTIME in", values, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SYS_UPTIME not in", values, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYS_UPTIME between", value1, value2, "sysUptime");
            return (Criteria) this;
        }

        public Criteria andSysUptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYS_UPTIME not between", value1, value2, "sysUptime");
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

        public Criteria andPollTimeIsNull() {
            addCriterion("POLL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPollTimeIsNotNull() {
            addCriterion("POLL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPollTimeEqualTo(Date value) {
            addCriterionForJDBCDate("POLL_TIME =", value, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("POLL_TIME <>", value, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("POLL_TIME >", value, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("POLL_TIME >=", value, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeLessThan(Date value) {
            addCriterionForJDBCDate("POLL_TIME <", value, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("POLL_TIME <=", value, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeIn(List<Date> values) {
            addCriterionForJDBCDate("POLL_TIME in", values, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("POLL_TIME not in", values, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("POLL_TIME between", value1, value2, "pollTime");
            return (Criteria) this;
        }

        public Criteria andPollTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("POLL_TIME not between", value1, value2, "pollTime");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressIsNull() {
            addCriterion("BRIDGE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressIsNotNull() {
            addCriterion("BRIDGE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressEqualTo(String value) {
            addCriterion("BRIDGE_ADDRESS =", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressNotEqualTo(String value) {
            addCriterion("BRIDGE_ADDRESS <>", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressGreaterThan(String value) {
            addCriterion("BRIDGE_ADDRESS >", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BRIDGE_ADDRESS >=", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressLessThan(String value) {
            addCriterion("BRIDGE_ADDRESS <", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressLessThanOrEqualTo(String value) {
            addCriterion("BRIDGE_ADDRESS <=", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressLike(String value) {
            addCriterion("BRIDGE_ADDRESS like", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressNotLike(String value) {
            addCriterion("BRIDGE_ADDRESS not like", value, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressIn(List<String> values) {
            addCriterion("BRIDGE_ADDRESS in", values, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressNotIn(List<String> values) {
            addCriterion("BRIDGE_ADDRESS not in", values, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressBetween(String value1, String value2) {
            addCriterion("BRIDGE_ADDRESS between", value1, value2, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andBridgeAddressNotBetween(String value1, String value2) {
            addCriterion("BRIDGE_ADDRESS not between", value1, value2, "bridgeAddress");
            return (Criteria) this;
        }

        public Criteria andVlanCountIsNull() {
            addCriterion("VLAN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVlanCountIsNotNull() {
            addCriterion("VLAN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVlanCountEqualTo(Long value) {
            addCriterion("VLAN_COUNT =", value, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountNotEqualTo(Long value) {
            addCriterion("VLAN_COUNT <>", value, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountGreaterThan(Long value) {
            addCriterion("VLAN_COUNT >", value, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountGreaterThanOrEqualTo(Long value) {
            addCriterion("VLAN_COUNT >=", value, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountLessThan(Long value) {
            addCriterion("VLAN_COUNT <", value, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountLessThanOrEqualTo(Long value) {
            addCriterion("VLAN_COUNT <=", value, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountIn(List<Long> values) {
            addCriterion("VLAN_COUNT in", values, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountNotIn(List<Long> values) {
            addCriterion("VLAN_COUNT not in", values, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountBetween(Long value1, Long value2) {
            addCriterion("VLAN_COUNT between", value1, value2, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andVlanCountNotBetween(Long value1, Long value2) {
            addCriterion("VLAN_COUNT not between", value1, value2, "vlanCount");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNull() {
            addCriterion("ALARM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNotNull() {
            addCriterion("ALARM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelEqualTo(Long value) {
            addCriterion("ALARM_LEVEL =", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotEqualTo(Long value) {
            addCriterion("ALARM_LEVEL <>", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThan(Long value) {
            addCriterion("ALARM_LEVEL >", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("ALARM_LEVEL >=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThan(Long value) {
            addCriterion("ALARM_LEVEL <", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThanOrEqualTo(Long value) {
            addCriterion("ALARM_LEVEL <=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIn(List<Long> values) {
            addCriterion("ALARM_LEVEL in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotIn(List<Long> values) {
            addCriterion("ALARM_LEVEL not in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelBetween(Long value1, Long value2) {
            addCriterion("ALARM_LEVEL between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotBetween(Long value1, Long value2) {
            addCriterion("ALARM_LEVEL not between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andWaterboxIsNull() {
            addCriterion("WATERBOX is null");
            return (Criteria) this;
        }

        public Criteria andWaterboxIsNotNull() {
            addCriterion("WATERBOX is not null");
            return (Criteria) this;
        }

        public Criteria andWaterboxEqualTo(Long value) {
            addCriterion("WATERBOX =", value, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxNotEqualTo(Long value) {
            addCriterion("WATERBOX <>", value, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxGreaterThan(Long value) {
            addCriterion("WATERBOX >", value, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxGreaterThanOrEqualTo(Long value) {
            addCriterion("WATERBOX >=", value, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxLessThan(Long value) {
            addCriterion("WATERBOX <", value, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxLessThanOrEqualTo(Long value) {
            addCriterion("WATERBOX <=", value, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxIn(List<Long> values) {
            addCriterion("WATERBOX in", values, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxNotIn(List<Long> values) {
            addCriterion("WATERBOX not in", values, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxBetween(Long value1, Long value2) {
            addCriterion("WATERBOX between", value1, value2, "waterbox");
            return (Criteria) this;
        }

        public Criteria andWaterboxNotBetween(Long value1, Long value2) {
            addCriterion("WATERBOX not between", value1, value2, "waterbox");
            return (Criteria) this;
        }

        public Criteria andPollIntervalIsNull() {
            addCriterion("POLL_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andPollIntervalIsNotNull() {
            addCriterion("POLL_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andPollIntervalEqualTo(Long value) {
            addCriterion("POLL_INTERVAL =", value, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalNotEqualTo(Long value) {
            addCriterion("POLL_INTERVAL <>", value, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalGreaterThan(Long value) {
            addCriterion("POLL_INTERVAL >", value, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("POLL_INTERVAL >=", value, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalLessThan(Long value) {
            addCriterion("POLL_INTERVAL <", value, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalLessThanOrEqualTo(Long value) {
            addCriterion("POLL_INTERVAL <=", value, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalIn(List<Long> values) {
            addCriterion("POLL_INTERVAL in", values, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalNotIn(List<Long> values) {
            addCriterion("POLL_INTERVAL not in", values, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalBetween(Long value1, Long value2) {
            addCriterion("POLL_INTERVAL between", value1, value2, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andPollIntervalNotBetween(Long value1, Long value2) {
            addCriterion("POLL_INTERVAL not between", value1, value2, "pollInterval");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedIsNull() {
            addCriterion("ISSNMPSUPPORTED is null");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedIsNotNull() {
            addCriterion("ISSNMPSUPPORTED is not null");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedEqualTo(Long value) {
            addCriterion("ISSNMPSUPPORTED =", value, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedNotEqualTo(Long value) {
            addCriterion("ISSNMPSUPPORTED <>", value, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedGreaterThan(Long value) {
            addCriterion("ISSNMPSUPPORTED >", value, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedGreaterThanOrEqualTo(Long value) {
            addCriterion("ISSNMPSUPPORTED >=", value, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedLessThan(Long value) {
            addCriterion("ISSNMPSUPPORTED <", value, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedLessThanOrEqualTo(Long value) {
            addCriterion("ISSNMPSUPPORTED <=", value, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedIn(List<Long> values) {
            addCriterion("ISSNMPSUPPORTED in", values, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedNotIn(List<Long> values) {
            addCriterion("ISSNMPSUPPORTED not in", values, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedBetween(Long value1, Long value2) {
            addCriterion("ISSNMPSUPPORTED between", value1, value2, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIssnmpsupportedNotBetween(Long value1, Long value2) {
            addCriterion("ISSNMPSUPPORTED not between", value1, value2, "issnmpsupported");
            return (Criteria) this;
        }

        public Criteria andIscomputerIsNull() {
            addCriterion("ISCOMPUTER is null");
            return (Criteria) this;
        }

        public Criteria andIscomputerIsNotNull() {
            addCriterion("ISCOMPUTER is not null");
            return (Criteria) this;
        }

        public Criteria andIscomputerEqualTo(Long value) {
            addCriterion("ISCOMPUTER =", value, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerNotEqualTo(Long value) {
            addCriterion("ISCOMPUTER <>", value, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerGreaterThan(Long value) {
            addCriterion("ISCOMPUTER >", value, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerGreaterThanOrEqualTo(Long value) {
            addCriterion("ISCOMPUTER >=", value, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerLessThan(Long value) {
            addCriterion("ISCOMPUTER <", value, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerLessThanOrEqualTo(Long value) {
            addCriterion("ISCOMPUTER <=", value, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerIn(List<Long> values) {
            addCriterion("ISCOMPUTER in", values, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerNotIn(List<Long> values) {
            addCriterion("ISCOMPUTER not in", values, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerBetween(Long value1, Long value2) {
            addCriterion("ISCOMPUTER between", value1, value2, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIscomputerNotBetween(Long value1, Long value2) {
            addCriterion("ISCOMPUTER not between", value1, value2, "iscomputer");
            return (Criteria) this;
        }

        public Criteria andIsrouterIsNull() {
            addCriterion("ISROUTER is null");
            return (Criteria) this;
        }

        public Criteria andIsrouterIsNotNull() {
            addCriterion("ISROUTER is not null");
            return (Criteria) this;
        }

        public Criteria andIsrouterEqualTo(Long value) {
            addCriterion("ISROUTER =", value, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterNotEqualTo(Long value) {
            addCriterion("ISROUTER <>", value, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterGreaterThan(Long value) {
            addCriterion("ISROUTER >", value, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterGreaterThanOrEqualTo(Long value) {
            addCriterion("ISROUTER >=", value, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterLessThan(Long value) {
            addCriterion("ISROUTER <", value, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterLessThanOrEqualTo(Long value) {
            addCriterion("ISROUTER <=", value, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterIn(List<Long> values) {
            addCriterion("ISROUTER in", values, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterNotIn(List<Long> values) {
            addCriterion("ISROUTER not in", values, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterBetween(Long value1, Long value2) {
            addCriterion("ISROUTER between", value1, value2, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsrouterNotBetween(Long value1, Long value2) {
            addCriterion("ISROUTER not between", value1, value2, "isrouter");
            return (Criteria) this;
        }

        public Criteria andIsswitchIsNull() {
            addCriterion("ISSWITCH is null");
            return (Criteria) this;
        }

        public Criteria andIsswitchIsNotNull() {
            addCriterion("ISSWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsswitchEqualTo(Long value) {
            addCriterion("ISSWITCH =", value, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchNotEqualTo(Long value) {
            addCriterion("ISSWITCH <>", value, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchGreaterThan(Long value) {
            addCriterion("ISSWITCH >", value, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchGreaterThanOrEqualTo(Long value) {
            addCriterion("ISSWITCH >=", value, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchLessThan(Long value) {
            addCriterion("ISSWITCH <", value, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchLessThanOrEqualTo(Long value) {
            addCriterion("ISSWITCH <=", value, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchIn(List<Long> values) {
            addCriterion("ISSWITCH in", values, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchNotIn(List<Long> values) {
            addCriterion("ISSWITCH not in", values, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchBetween(Long value1, Long value2) {
            addCriterion("ISSWITCH between", value1, value2, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsswitchNotBetween(Long value1, Long value2) {
            addCriterion("ISSWITCH not between", value1, value2, "isswitch");
            return (Criteria) this;
        }

        public Criteria andIsprinterIsNull() {
            addCriterion("ISPRINTER is null");
            return (Criteria) this;
        }

        public Criteria andIsprinterIsNotNull() {
            addCriterion("ISPRINTER is not null");
            return (Criteria) this;
        }

        public Criteria andIsprinterEqualTo(Long value) {
            addCriterion("ISPRINTER =", value, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterNotEqualTo(Long value) {
            addCriterion("ISPRINTER <>", value, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterGreaterThan(Long value) {
            addCriterion("ISPRINTER >", value, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterGreaterThanOrEqualTo(Long value) {
            addCriterion("ISPRINTER >=", value, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterLessThan(Long value) {
            addCriterion("ISPRINTER <", value, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterLessThanOrEqualTo(Long value) {
            addCriterion("ISPRINTER <=", value, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterIn(List<Long> values) {
            addCriterion("ISPRINTER in", values, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterNotIn(List<Long> values) {
            addCriterion("ISPRINTER not in", values, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterBetween(Long value1, Long value2) {
            addCriterion("ISPRINTER between", value1, value2, "isprinter");
            return (Criteria) this;
        }

        public Criteria andIsprinterNotBetween(Long value1, Long value2) {
            addCriterion("ISPRINTER not between", value1, value2, "isprinter");
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

        public Criteria andIconIdIsNull() {
            addCriterion("ICON_ID is null");
            return (Criteria) this;
        }

        public Criteria andIconIdIsNotNull() {
            addCriterion("ICON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIconIdEqualTo(Long value) {
            addCriterion("ICON_ID =", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotEqualTo(Long value) {
            addCriterion("ICON_ID <>", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThan(Long value) {
            addCriterion("ICON_ID >", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ICON_ID >=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThan(Long value) {
            addCriterion("ICON_ID <", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThanOrEqualTo(Long value) {
            addCriterion("ICON_ID <=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdIn(List<Long> values) {
            addCriterion("ICON_ID in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotIn(List<Long> values) {
            addCriterion("ICON_ID not in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdBetween(Long value1, Long value2) {
            addCriterion("ICON_ID between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotBetween(Long value1, Long value2) {
            addCriterion("ICON_ID not between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNull() {
            addCriterion("SEVERITY is null");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNotNull() {
            addCriterion("SEVERITY is not null");
            return (Criteria) this;
        }

        public Criteria andSeverityEqualTo(Long value) {
            addCriterion("SEVERITY =", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotEqualTo(Long value) {
            addCriterion("SEVERITY <>", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThan(Long value) {
            addCriterion("SEVERITY >", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThanOrEqualTo(Long value) {
            addCriterion("SEVERITY >=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThan(Long value) {
            addCriterion("SEVERITY <", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThanOrEqualTo(Long value) {
            addCriterion("SEVERITY <=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityIn(List<Long> values) {
            addCriterion("SEVERITY in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotIn(List<Long> values) {
            addCriterion("SEVERITY not in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityBetween(Long value1, Long value2) {
            addCriterion("SEVERITY between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotBetween(Long value1, Long value2) {
            addCriterion("SEVERITY not between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andIsHandworkIsNull() {
            addCriterion("IS_HANDWORK is null");
            return (Criteria) this;
        }

        public Criteria andIsHandworkIsNotNull() {
            addCriterion("IS_HANDWORK is not null");
            return (Criteria) this;
        }

        public Criteria andIsHandworkEqualTo(Long value) {
            addCriterion("IS_HANDWORK =", value, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkNotEqualTo(Long value) {
            addCriterion("IS_HANDWORK <>", value, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkGreaterThan(Long value) {
            addCriterion("IS_HANDWORK >", value, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_HANDWORK >=", value, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkLessThan(Long value) {
            addCriterion("IS_HANDWORK <", value, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkLessThanOrEqualTo(Long value) {
            addCriterion("IS_HANDWORK <=", value, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkIn(List<Long> values) {
            addCriterion("IS_HANDWORK in", values, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkNotIn(List<Long> values) {
            addCriterion("IS_HANDWORK not in", values, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkBetween(Long value1, Long value2) {
            addCriterion("IS_HANDWORK between", value1, value2, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andIsHandworkNotBetween(Long value1, Long value2) {
            addCriterion("IS_HANDWORK not between", value1, value2, "isHandwork");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNull() {
            addCriterion("PANEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNotNull() {
            addCriterion("PANEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPanelIdEqualTo(Long value) {
            addCriterion("PANEL_ID =", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotEqualTo(Long value) {
            addCriterion("PANEL_ID <>", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThan(Long value) {
            addCriterion("PANEL_ID >", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PANEL_ID >=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThan(Long value) {
            addCriterion("PANEL_ID <", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThanOrEqualTo(Long value) {
            addCriterion("PANEL_ID <=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdIn(List<Long> values) {
            addCriterion("PANEL_ID in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotIn(List<Long> values) {
            addCriterion("PANEL_ID not in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdBetween(Long value1, Long value2) {
            addCriterion("PANEL_ID between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotBetween(Long value1, Long value2) {
            addCriterion("PANEL_ID not between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andSnmpConfIsNull() {
            addCriterion("SNMP_CONF is null");
            return (Criteria) this;
        }

        public Criteria andSnmpConfIsNotNull() {
            addCriterion("SNMP_CONF is not null");
            return (Criteria) this;
        }

        public Criteria andSnmpConfEqualTo(String value) {
            addCriterion("SNMP_CONF =", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfNotEqualTo(String value) {
            addCriterion("SNMP_CONF <>", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfGreaterThan(String value) {
            addCriterion("SNMP_CONF >", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfGreaterThanOrEqualTo(String value) {
            addCriterion("SNMP_CONF >=", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfLessThan(String value) {
            addCriterion("SNMP_CONF <", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfLessThanOrEqualTo(String value) {
            addCriterion("SNMP_CONF <=", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfLike(String value) {
            addCriterion("SNMP_CONF like", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfNotLike(String value) {
            addCriterion("SNMP_CONF not like", value, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfIn(List<String> values) {
            addCriterion("SNMP_CONF in", values, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfNotIn(List<String> values) {
            addCriterion("SNMP_CONF not in", values, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfBetween(String value1, String value2) {
            addCriterion("SNMP_CONF between", value1, value2, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andSnmpConfNotBetween(String value1, String value2) {
            addCriterion("SNMP_CONF not between", value1, value2, "snmpConf");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeIsNull() {
            addCriterion("SYS_LASTCONFIGSAVEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeIsNotNull() {
            addCriterion("SYS_LASTCONFIGSAVEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME =", value, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME <>", value, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME >", value, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME >=", value, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeLessThan(Date value) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME <", value, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME <=", value, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME in", values, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME not in", values, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME between", value1, value2, "sysLastconfigsavedtime");
            return (Criteria) this;
        }

        public Criteria andSysLastconfigsavedtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYS_LASTCONFIGSAVEDTIME not between", value1, value2, "sysLastconfigsavedtime");
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

        public Criteria andSeverityChangeTimeIsNull() {
            addCriterion("SEVERITY_CHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeIsNotNull() {
            addCriterion("SEVERITY_CHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME =", value, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME <>", value, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME >", value, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME >=", value, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeLessThan(Date value) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME <", value, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME <=", value, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME in", values, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME not in", values, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME between", value1, value2, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSeverityChangeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SEVERITY_CHANGE_TIME not between", value1, value2, "severityChangeTime");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesIsNull() {
            addCriterion("SPARE_IP_ADDRESSES is null");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesIsNotNull() {
            addCriterion("SPARE_IP_ADDRESSES is not null");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesEqualTo(String value) {
            addCriterion("SPARE_IP_ADDRESSES =", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesNotEqualTo(String value) {
            addCriterion("SPARE_IP_ADDRESSES <>", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesGreaterThan(String value) {
            addCriterion("SPARE_IP_ADDRESSES >", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesGreaterThanOrEqualTo(String value) {
            addCriterion("SPARE_IP_ADDRESSES >=", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesLessThan(String value) {
            addCriterion("SPARE_IP_ADDRESSES <", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesLessThanOrEqualTo(String value) {
            addCriterion("SPARE_IP_ADDRESSES <=", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesLike(String value) {
            addCriterion("SPARE_IP_ADDRESSES like", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesNotLike(String value) {
            addCriterion("SPARE_IP_ADDRESSES not like", value, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesIn(List<String> values) {
            addCriterion("SPARE_IP_ADDRESSES in", values, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesNotIn(List<String> values) {
            addCriterion("SPARE_IP_ADDRESSES not in", values, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesBetween(String value1, String value2) {
            addCriterion("SPARE_IP_ADDRESSES between", value1, value2, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andSpareIpAddressesNotBetween(String value1, String value2) {
            addCriterion("SPARE_IP_ADDRESSES not between", value1, value2, "spareIpAddresses");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(Long value) {
            addCriterion("TYPE2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(Long value) {
            addCriterion("TYPE2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(Long value) {
            addCriterion("TYPE2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(Long value) {
            addCriterion("TYPE2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(Long value) {
            addCriterion("TYPE2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(Long value) {
            addCriterion("TYPE2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<Long> values) {
            addCriterion("TYPE2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<Long> values) {
            addCriterion("TYPE2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(Long value1, Long value2) {
            addCriterion("TYPE2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(Long value1, Long value2) {
            addCriterion("TYPE2 not between", value1, value2, "type2");
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