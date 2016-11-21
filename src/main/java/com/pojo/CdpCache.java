package com.pojo;

import java.io.Serializable;

public class CdpCache implements Serializable {
    private Long ifIndex;

    private Long nodeId;

    private String remoteIpaddr;

    private String remoteIfname;

    public Long getIfIndex() {
        return ifIndex;
    }

    public void setIfIndex(Long ifIndex) {
        this.ifIndex = ifIndex;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getRemoteIpaddr() {
        return remoteIpaddr;
    }

    public void setRemoteIpaddr(String remoteIpaddr) {
        this.remoteIpaddr = remoteIpaddr;
    }

    public String getRemoteIfname() {
        return remoteIfname;
    }

    public void setRemoteIfname(String remoteIfname) {
        this.remoteIfname = remoteIfname;
    }
}