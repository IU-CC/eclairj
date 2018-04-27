package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class ChannelData
{
    private ChannelCommitments commitments;
    private String shortChannelId;
    private Boolean buried;
    private ChannelAnnouncement channelAnnouncement;
    private ChannelUpdate channelUpdate;

    public ChannelData()
    {
    }

    public ChannelCommitments getCommitments()
    {
        return commitments;
    }

    public void setCommitments(ChannelCommitments commitments)
    {
        this.commitments = commitments;
    }

    public String getShortChannelId()
    {
        return shortChannelId;
    }

    public void setShortChannelId(String shortChannelId)
    {
        this.shortChannelId = shortChannelId;
    }

    public Boolean getBuried()
    {
        return buried;
    }

    public void setBuried(Boolean buried)
    {
        this.buried = buried;
    }

    public ChannelAnnouncement getChannelAnnouncement()
    {
        return channelAnnouncement;
    }

    public void setChannelAnnouncement(ChannelAnnouncement channelAnnouncement)
    {
        this.channelAnnouncement = channelAnnouncement;
    }

    public ChannelUpdate getChannelUpdate()
    {
        return channelUpdate;
    }

    public void setChannelUpdate(ChannelUpdate channelUpdate)
    {
        this.channelUpdate = channelUpdate;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }

}
