package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class ChannelKeyPath
{
    private List<Long> path;

    public ChannelKeyPath()
    {

    }

    public List<Long> getPath()
    {
        return path;
    }

    public void setPath(List<Long> path)
    {
        this.path = path;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }

}
