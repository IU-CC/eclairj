package com.iu.lightning.eclair.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Arrays;

public class InvoiceDetails
{
    @JsonDeserialize(using = TagDeserializer.class)
    private Tag[] tags;

    private String timestamp;

    private Amount amount;

    private String nodeId;

    private String prefix;

    private String signature;

    public Tag[] getTags()
    {
        return tags;
    }

    public void setTags(Tag[] tags)
    {
        this.tags = tags;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(String timestamp)
    {
        this.timestamp = timestamp;
    }

    public Amount getAmount()
    {
        return amount;
    }

    public void setAmount(Amount amount)
    {
        this.amount = amount;
    }

    public String getNodeId()
    {
        return nodeId;
    }

    public void setNodeId(String nodeId)
    {
        this.nodeId = nodeId;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

    public String getSignature()
    {
        return signature;
    }

    public void setSignature(String signature)
    {
        this.signature = signature;
    }

    @Override
    public String toString()
    {
        return "InvoiceDetails{" +
                "tags=" + Arrays.toString(tags) +
                ", timestamp='" + timestamp + '\'' +
                ", amount=" + amount +
                ", nodeId='" + nodeId + '\'' +
                ", prefix='" + prefix + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}

class Amount
{
    private String amount;

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    @Override
    public String toString()
    {
        return "Amount{" +
                "amount='" + amount + '\'' +
                '}';
    }
}