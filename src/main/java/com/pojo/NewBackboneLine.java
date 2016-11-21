package com.pojo;

import java.io.Serializable;

public class NewBackboneLine implements Serializable {
    private Long nodeId;

    private Long ifIndex;

    private Long remoteNodeId;

    private Long remoteIfIndex;

    private Long status;

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

    public Long getRemoteNodeId() {
        return remoteNodeId;
    }

    public void setRemoteNodeId(Long remoteNodeId) {
        this.remoteNodeId = remoteNodeId;
    }

    public Long getRemoteIfIndex() {
        return remoteIfIndex;
    }

    public void setRemoteIfIndex(Long remoteIfIndex) {
        this.remoteIfIndex = remoteIfIndex;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}