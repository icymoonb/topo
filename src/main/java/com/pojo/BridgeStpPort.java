package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class BridgeStpPort implements Serializable {
    private Long vlanIndex;

    private Long port;

    private Long nodeId;

    private String designatedRoot;

    private String designatedBridge;

    private Long designatedPort;

    private Long state;

    private Date sampletime;

    public Long getVlanIndex() {
        return vlanIndex;
    }

    public void setVlanIndex(Long vlanIndex) {
        this.vlanIndex = vlanIndex;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getDesignatedRoot() {
        return designatedRoot;
    }

    public void setDesignatedRoot(String designatedRoot) {
        this.designatedRoot = designatedRoot;
    }

    public String getDesignatedBridge() {
        return designatedBridge;
    }

    public void setDesignatedBridge(String designatedBridge) {
        this.designatedBridge = designatedBridge;
    }

    public Long getDesignatedPort() {
        return designatedPort;
    }

    public void setDesignatedPort(Long designatedPort) {
        this.designatedPort = designatedPort;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Date getSampletime() {
        return sampletime;
    }

    public void setSampletime(Date sampletime) {
        this.sampletime = sampletime;
    }
}