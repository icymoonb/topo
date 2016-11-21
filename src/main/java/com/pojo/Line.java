package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Line implements Serializable {
    private Long lineId;

    private Long uplinkNodeId;

    private Long uplinkIfId;

    private Long nodeId;

    private Long ifId;

    private Long type;

    private Date sampletime;

    private Long speedIfId;

    private String edgeName;

    private Long isHide;

    private Long referSrvId;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getUplinkNodeId() {
        return uplinkNodeId;
    }

    public void setUplinkNodeId(Long uplinkNodeId) {
        this.uplinkNodeId = uplinkNodeId;
    }

    public Long getUplinkIfId() {
        return uplinkIfId;
    }

    public void setUplinkIfId(Long uplinkIfId) {
        this.uplinkIfId = uplinkIfId;
    }

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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Date getSampletime() {
        return sampletime;
    }

    public void setSampletime(Date sampletime) {
        this.sampletime = sampletime;
    }

    public Long getSpeedIfId() {
        return speedIfId;
    }

    public void setSpeedIfId(Long speedIfId) {
        this.speedIfId = speedIfId;
    }

    public String getEdgeName() {
        return edgeName;
    }

    public void setEdgeName(String edgeName) {
        this.edgeName = edgeName;
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