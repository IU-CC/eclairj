package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class LocalCommit
{
    private Integer index;
    private Spec spec;
    private PublishableTxs publishableTxs;

    public LocalCommit()
    {
    }

    public Integer getIndex()
    {
        return index;
    }

    public void setIndex(Integer index)
    {
        this.index = index;
    }

    public Spec getSpec()
    {
        return spec;
    }

    public void setSpec(Spec spec)
    {
        this.spec = spec;
    }

    public PublishableTxs getPublishableTxs()
    {
        return publishableTxs;
    }

    public void setPublishableTxs(PublishableTxs publishableTxs)
    {
        this.publishableTxs = publishableTxs;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
