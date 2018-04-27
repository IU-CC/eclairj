package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class CommitInput
{
    private String outPoint;
    private Long amountSatoshis;

    public CommitInput()
    {
    }

    public String getOutPoint()
    {
        return outPoint;
    }

    public void setOutPoint(String outPoint)
    {
        this.outPoint = outPoint;
    }

    public Long getAmountSatoshis()
    {
        return amountSatoshis;
    }

    public void setAmountSatoshis(Long amountSatoshis)
    {
        this.amountSatoshis = amountSatoshis;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
