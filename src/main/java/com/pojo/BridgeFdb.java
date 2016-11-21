package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class BridgeFdb implements Serializable {
    private String address;

    private Long nodeId;

    private Long ifIndex;

    private Long vlanIndex;

    private Date sampletime;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getIfIndex() {
        return ifIndex;
    }

    public void setIfIndex(Long ifIndex) {
        this.ifIndex = ifIndex;
    }

    public Long getVlanIndex() {
        return vlanIndex;
    }

    public void setVlanIndex(Long vlanIndex) {
        this.vlanIndex = vlanIndex;
    }

    public Date getSampletime() {
        return sampletime;
    }

    public void setSampletime(Date sampletime) {
        this.sampletime = sampletime;
    }
}