package com.pojo;

import java.io.Serializable;

public class Link implements Serializable {
    private Long nodeId;

    private Long ifId;

    private Long networkId;

    private Long speedIfId;

    private Long isdeleted;

    private String edgeName;

    private Long type;

    private Long isHide;

    private Long referSrvId;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getIfId() {
        return ifId;
    }

    public void setIfId(Long ifId) {
        this.ifId = ifId;
    }

    public Long getNetworkId() {
        return networkId;
    }

    public void setNetworkId(Long networkId) {
        this.networkId = networkId;
    }

    public Long getSpeedIfId() {
        return speedIfId;
    }

    public void setSpeedIfId(Long speedIfId) {
        this.speedIfId = speedIfId;
    }

    public Long getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Long isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getEdgeName() {
        return edgeName;
    }

    public void setEdgeName(String edgeName) {
        this.edgeName = edgeName;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getIsHide() {
        return isHide;
    }

    public void setIsHide(Long isHide) {
        this.isHide = isHide;
    }

    public Long getReferSrvId() {
        return referSrvId;
    }

    public void setReferSrvId(Long referSrvId) {
        this.referSrvId = referSrvId;
    }
}