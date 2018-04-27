package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class ChannelAnnouncement
{
    private String nodeSignature1;
    private String nodeSignature2;
    private String bitcoinSignature1;
    private String bitcoinSignature2;
    private String features;
    private String chainHash;
    private String shortChannelId;
    private String nodeId1;
    private String nodeId2;
    private String bitcoinKey1;
    private String bitcoinKey2;

    public ChannelAnnouncement()
    {

    }

    public String getNodeSignature1()
    {
        return nodeSignature1;
    }

    public void setNodeSignature1(String nodeSignature1)
    {
        this.nodeSignature1 = nodeSignature1;
    }

    public String getNodeSignature2()
    {
        return nodeSignature2;
    }

    public void setNodeSignature2(String nodeSignature2)
    {
        this.nodeSignature2 = nodeSignature2;
    }

    public String getBitcoinSignature1()
    {
        return bitcoinSignature1;
    }

    public void setBitcoinSignature1(String bitcoinSignature1)
    {
        this.bitcoinSignature1 = bitcoinSignature1;
    }

    public String getBitcoinSignature2()
    {
        return bitcoinSignature2;
    }

    public void setBitcoinSignature2(String bitcoinSignature2)
    {
        this.bitcoinSignature2 = bitcoinSignature2;
    }

    public String getFeatures()
    {
        return features;
    }

    public void setFeatures(String features)
    {
        this.features = features;
    }

    public String getChainHash()
    {
        return chainHash;
    }

    public void setChainHash(String chainHash)
    {
        this.chainHash = chainHash;
    }

    public String getShortChannelId()
    {
        return shortChannelId;
    }

    public void setShortChannelId(String shortChannelId)
    {
        this.shortChannelId = shortChannelId;
    }

    public String getNodeId1()
    {
        return nodeId1;
    }

    public void setNodeId1(String nodeId1)
    {
        this.nodeId1 = nodeId1;
    }

    public String getNodeId2()
    {
        return nodeId2;
    }

    public void setNodeId2(String nodeId2)
    {
        this.nodeId2 = nodeId2;
    }

    public String getBitcoinKey1()
    {
        return bitcoinKey1;
    }

    public void setBitcoinKey1(String bitcoinKey1)
    {
        this.bitcoinKey1 = bitcoinKey1;
    }

    public String getBitcoinKey2()
    {
        return bitcoinKey2;
    }

    public void setBitcoinKey2(String bitcoinKey2)
    {
        this.bitcoinKey2 = bitcoinKey2;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }

}
