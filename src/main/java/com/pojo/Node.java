package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Node implements Serializable {
    private Long nodeId;

    private Long type;

    private String hostname;

    private String communityRo;

    private String communityRw;

    private String snmpSysname;

    private String snmpSysdescr;

    private String snmpSyslocation;

    private String snmpSyscontact;

    private String snmpSysobjid;

    private Long producerCode;

    private Long ifCount;

    private String ipAddress;

    private Long ipNum;

    private Date sysUptime;

    private Long adminStatus;

    private Date pollTime;

    private String bridgeAddress;

    private Long vlanCount;

    private Long alarmLevel;

    private Long waterbox;

    private Long pollInterval;

    private Long issnmpsupported;

    private Long iscomputer;

    private Long isrouter;

    private Long isswitch;

    private Long isprinter;

    private String displayname;

    private Long iconId;

    private Long severity;

    private Long isHandwork;

    private Long panelId;

    private String snmpConf;

    private Long eventId;

    private Date sysLastconfigsavedtime;

    private String modifyFlag;

    private Date severityChangeTime;

    private String spareIpAddresses;

    private Long type2;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getCommunityRo() {
        return communityRo;
    }

    public void setCommunityRo(String communityRo) {
        this.communityRo = communityRo;
    }

    public String getCommunityRw() {
        return communityRw;
    }

    public void setCommunityRw(String communityRw) {
        this.communityRw = communityRw;
    }

    public String getSnmpSysname() {
        return snmpSysname;
    }

    public void setSnmpSysname(String snmpSysname) {
        this.snmpSysname = snmpSysname;
    }

    public String getSnmpSysdescr() {
        return snmpSysdescr;
    }

    public void setSnmpSysdescr(String snmpSysdescr) {
        this.snmpSysdescr = snmpSysdescr;
    }

    public String getSnmpSyslocation() {
        return snmpSyslocation;
    }

    public void setSnmpSyslocation(String snmpSyslocation) {
        this.snmpSyslocation = snmpSyslocation;
    }

    public String getSnmpSyscontact() {
        return snmpSyscontact;
    }

    public void setSnmpSyscontact(String snmpSyscontact) {
        this.snmpSyscontact = snmpSyscontact;
    }

    public String getSnmpSysobjid() {
        return snmpSysobjid;
    }

    public void setSnmpSysobjid(String snmpSysobjid) {
        this.snmpSysobjid = snmpSysobjid;
    }

    public Long getProducerCode() {
        return producerCode;
    }

    public void setProducerCode(Long producerCode) {
        this.producerCode = producerCode;
    }

    public Long getIfCount() {
        return ifCount;
    }

    public void setIfCount(Long ifCount) {
        this.ifCount = ifCount;
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

    public Date getSysUptime() {
        return sysUptime;
    }

    public void setSysUptime(Date sysUptime) {
        this.sysUptime = sysUptime;
    }

    public Long getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Long adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Date getPollTime() {
        return pollTime;
    }

    public void setPollTime(Date pollTime) {
        this.pollTime = pollTime;
    }

    public String getBridgeAddress() {
        return bridgeAddress;
    }

    public void setBridgeAddress(String bridgeAddress) {
        this.bridgeAddress = bridgeAddress;
    }

    public Long getVlanCount() {
        return vlanCount;
    }

    public void setVlanCount(Long vlanCount) {
        this.vlanCount = vlanCount;
    }

    public Long getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Long getWaterbox() {
        return waterbox;
    }

    public void setWaterbox(Long waterbox) {
        this.waterbox = waterbox;
    }

    public Long getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(Long pollInterval) {
        this.pollInterval = pollInterval;
    }

    public Long getIssnmpsupported() {
        return issnmpsupported;
    }

    public void setIssnmpsupported(Long issnmpsupported) {
        this.issnmpsupported = issnmpsupported;
    }

    public Long getIscomputer() {
        return iscomputer;
    }

    public void setIscomputer(Long iscomputer) {
        this.iscomputer = iscomputer;
    }

    public Long getIsrouter() {
        return isrouter;
    }

    public void setIsrouter(Long isrouter) {
        this.isrouter = isrouter;
    }

    public Long getIsswitch() {
        return isswitch;
    }

    public void setIsswitch(Long isswitch) {
        this.isswitch = isswitch;
    }

    public Long getIsprinter() {
        return isprinter;
    }

    public void setIsprinter(Long isprinter) {
        this.isprinter = isprinter;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public Long getIconId() {
        return iconId;
    }

    public void setIconId(Long iconId) {
        this.iconId = iconId;
    }

    public Long getSeverity() {
        return severity;
    }

    public void setSeverity(Long severity) {
        this.severity = severity;
    }

    public Long getIsHandwork() {
        return isHandwork;
    }

    public void setIsHandwork(Long isHandwork) {
        this.isHandwork = isHandwork;
    }

    public Long getPanelId() {
        return panelId;
    }

    public void setPanelId(Long panelId) {
        this.panelId = panelId;
    }

    public String getSnmpConf() {
        return snmpConf;
    }

    public void setSnmpConf(String snmpConf) {
        this.snmpConf = snmpConf;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Date getSysLastconfigsavedtime() {
        return sysLastconfigsavedtime;
    }

    public void setSysLastconfigsavedtime(Date sysLastconfigsavedtime) {
        this.sysLastconfigsavedtime = sysLastconfigsavedtime;
    }

    public String getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public Date getSeverityChangeTime() {
        return severityChangeTime;
    }

    public void setSeverityChangeTime(Date severityChangeTime) {
        this.severityChangeTime = severityChangeTime;
    }

    public String getSpareIpAddresses() {
        return spareIpAddresses;
    }

    public void setSpareIpAddresses(String spareIpAddresses) {
        this.spareIpAddresses = spareIpAddresses;
    }

    public Long getType2() {
        return type2;
    }

    public void setType2(Long type2) {
        this.type2 = type2;
    }
    
	public boolean nodeEquals(Node localNode) {
		if (this.nodeId != 0 || localNode.getNodeId() != 0) {
			return this.nodeId == localNode.getNodeId();
		} else {
			return this.bridgeAddress.equals(localNode.getBridgeAddress());
		}
	}
}