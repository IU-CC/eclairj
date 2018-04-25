package org.eclairj.core;

public class NodeInfo {
    private Result result;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "NodeInfo{" +
                "\n\tresult=" + result +
                "\n\tid='" + id + '\'' +
                '}';
    }

    private class Result{
        public Result() {
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
}
