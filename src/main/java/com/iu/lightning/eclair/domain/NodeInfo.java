package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class NodeInfo
{
    private String nodeId;
    private String alias;
    private Integer port;
    private String chainHash;
    private Integer blockHeight;

    public NodeInfo()
    {
    }

    public String getNodeId()
    {
        return nodeId;
    }

    public void setNodeId(String nodeId)
    {
        this.nodeId = nodeId;
    }

    public String getAlias()
    {
        return alias;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public Integer getPort()
    {
        return port;
    }

    public void setPort(Integer port)
    {
        this.port = port;
    }

    public String getChainHash()
    {
        return chainHash;
    }

    public void setChainHash(String chainHash)
    {
        this.chainHash = chainHash;
    }

    public Integer getBlockHeight()
    {
        return blockHeight;
    }

    public void setBlockHeight(Integer blockHeight)
    {
        this.blockHeight = blockHeight;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
