package org.eclairj.core;

import java.io.Serializable;

public class NodeInfo implements Serializable {
    private String nodeId;
    private String alias;
    private Integer port;
    private String chainHash;
    private Integer blockHeight;
}
