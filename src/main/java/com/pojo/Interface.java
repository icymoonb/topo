package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Interface implements Serializable {
    private Long ifId;//id

    private Long nodeId;

    private String ipAddress;

    private Long ipNum;

    private String ipNetmask;

    private Long ipState;

    private Long adminStatus;

    private Long legality;

    private Long bindStatus;

    private Long snmpIfindex;//index

    private String snmpIfdescr;

    private Long snmpIftype;

    private Long snmpIfmtu;

    private Long snmpIfspeed;

    private Long snmpIfoperstatus;

    private String snmpIfphysaddr;

    private String snmpIfname;//name

    private String snmpIfalias;

    private Long switchPort;

    private Long snmpIfinoctets;

    private Long snmpIfoutoctets;

    private Long lastSnmpIfinoctets;

    private Long lastSnmpIfoutoctets;

    private Date collectTime;

    private Date lastCollectTime;

    private Date lastStatusChange;

    private String displayname;

    private String modifyFlag;

    private Long ifWorkmode;

    private Long isHide;

    private Long type;

    public Long getIfId() {
        return ifId;
    }

    public void setIfId(Long ifId) {
        this.ifId = ifId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getIpNum() {
        return ipNum;
    }

    public void setIpNum(Long ipNum) {
        this.ipNum = ipNum;
    }

    public String getIpNetmask() {
        return ipNetmask;
    }

    public void setIpNetmask(String ipNetmask) {
        this.ipNetmask = ipNetmask;
    }

    public Long getIpState() {
        return ipState;
    }

    public void setIpState(Long ipState) {
        this.ipState = ipState;
    }

    public Long getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Long adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Long getLegality() {
        return legality;
    }

    public void setLegality(Long legality) {
        this.legality = legality;
    }

    public Long getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Long bindStatus) {
        this.bindStatus = bindStatus;
    }

    public Long getSnmpIfindex() {
        return snmpIfindex;
    }

    public void setSnmpIfindex(Long snmpIfindex) {
        this.snmpIfindex = snmpIfindex;
    }

    public String getSnmpIfdescr() {
        return snmpIfdescr;
    }

    public void setSnmpIfdescr(String snmpIfdescr) {
        this.snmpIfdescr = snmpIfdescr;
    }

    public Long getSnmpIftype() {
        return snmpIftype;
    }

    public void setSnmpIftype(Long snmpIftype) {
        this.snmpIftype = snmpIftype;
    }

    public Long getSnmpIfmtu() {
        return snmpIfmtu;
    }

    public void setSnmpIfmtu(Long snmpIfmtu) {
        this.snmpIfmtu = snmpIfmtu;
    }

    public Long getSnmpIfspeed() {
        return snmpIfspeed;
    }

    public void setSnmpIfspeed(Long snmpIfspeed) {
        this.snmpIfspeed = snmpIfspeed;
    }

    public Long getSnmpIfoperstatus() {
        return snmpIfoperstatus;
    }

    public void setSnmpIfoperstatus(Long snmpIfoperstatus) {
        this.snmpIfoperstatus = snmpIfoperstatus;
    }

    public String getSnmpIfphysaddr() {
        return snmpIfphysaddr;
    }

    public void setSnmpIfphysaddr(String snmpIfphysaddr) {
        this.snmpIfphysaddr = snmpIfphysaddr;
    }

    public String getSnmpIfname() {
        return snmpIfname;
    }

    public void setSnmpIfname(String snmpIfname) {
        this.snmpIfname = snmpIfname;
    }

    public String getSnmpIfalias() {
        return snmpIfalias;
    }

    public void setSnmpIfalias(String snmpIfalias) {
        this.snmpIfalias = snmpIfalias;
    }

    public Long getSwitchPort() {
        return switchPort;
    }

    public void setSwitchPort(Long switchPort) {
        this.switchPort = switchPort;
    }

    public Long getSnmpIfinoctets() {
        return snmpIfinoctets;
    }

    public void setSnmpIfinoctets(Long snmpIfinoctets) {
        this.snmpIfinoctets = snmpIfinoctets;
    }

    public Long getSnmpIfoutoctets() {
        return snmpIfoutoctets;
    }

    public void setSnmpIfoutoctets(Long snmpIfoutoctets) {
        this.snmpIfoutoctets = snmpIfoutoctets;
    }

    public Long getLastSnmpIfinoctets() {
        return lastSnmpIfinoctets;
    }

    public void setLastSnmpIfinoctets(Long lastSnmpIfinoctets) {
        this.lastSnmpIfinoctets = lastSnmpIfinoctets;
    }

    public Long getLastSnmpIfoutoctets() {
        return lastSnmpIfoutoctets;
    }

    public void setLastSnmpIfoutoctets(Long lastSnmpIfoutoctets) {
        this.lastSnmpIfoutoctets = lastSnmpIfoutoctets;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Date getLastCollectTime() {
        return lastCollectTime;
    }

    public void setLastCollectTime(Date lastCollectTime) {
        this.lastCollectTime = lastCollectTime;
    }

    public Date getLastStatusChange() {
        return lastStatusChange;
    }

    public void setLastStatusChange(Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public Long getIfWorkmode() {
        return ifWorkmode;
    }

    public void setIfWorkmode(Long ifWorkmode) {
        this.ifWorkmode = ifWorkmode;
    }

    public Long getIsHide() {
        return isHide;
    }

    public void setIsHide(Long isHide) {
        this.isHide = isHide;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}