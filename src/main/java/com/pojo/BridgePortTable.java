package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class BridgePortTable implements Serializable {
    private Long vlanIndex;

    private Long nodeId;

    private Long port;

    private Long ifIndex;

    private Date sampletime;

    public Long getVlanIndex() {
        return vlanIndex;
    }

    public void setVlanIndex(Long vlanIndex) {
        this.vlanIndex = vlanIndex;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public Long getIfIndex() {
        return ifIndex;
    }

    public void setIfIndex(Long ifIndex) {
        this.ifIndex = ifIndex;
    }

    public Date getSampletime() {
        return sampletime;
    }

    public void setSampletime(Date sampletime) {
        this.sampletime = sampletime;
    }
}