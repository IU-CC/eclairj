package org.eclairj.core;

class NodeInfoResult extends Result <NodeInfoResult>{
    public NodeInfoResult() {
    }

    private String nodeId;
    private String alias;
    private Integer port;
    private String chainHash;
    private Integer blockHeight;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getChainHash() {
        return chainHash;
    }

    public void setChainHash(String chainHash) {
        this.chainHash = chainHash;
    }

    public Integer getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    @Override
    public String toString() {
        return "Result{" +
                "\n\t\tnodeId='" + nodeId + '\'' +
                "\n\t\talias='" + alias + '\'' +
                "\n\t\tport=" + port +
                "\n\t\tchainHash='" + chainHash + '\'' +
                "\n\t\tblockHeight=" + blockHeight +
                '}';
    }
}
