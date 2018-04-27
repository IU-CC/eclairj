package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class LocalParams
{
    private String nodeId;
    private ChannelKeyPath channelKeyPath;
    private Long dustLimitSatoshis;
    private Long maxHtlcValueInFlightMsat;
    private Long channelReserveSatoshis;
    private Long htlcMinimumMsat;
    private Integer toSelfDelay;
    private Integer maxAcceptedHtlcs;
    private Boolean isFunder;
    private String defaultFinalScriptPubKey;
    private String globalFeatures;
    private String localFeatures;

    public LocalParams()
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

    public ChannelKeyPath getChannelKeyPath()
    {
        return channelKeyPath;
    }

    public void setChannelKeyPath(ChannelKeyPath channelKeyPath)
    {
        this.channelKeyPath = channelKeyPath;
    }

    public Long getDustLimitSatoshis()
    {
        return dustLimitSatoshis;
    }

    public void setDustLimitSatoshis(Long dustLimitSatoshis)
    {
        this.dustLimitSatoshis = dustLimitSatoshis;
    }

    public Long getMaxHtlcValueInFlightMsat()
    {
        return maxHtlcValueInFlightMsat;
    }

    public void setMaxHtlcValueInFlightMsat(Long maxHtlcValueInFlightMsat)
    {
        this.maxHtlcValueInFlightMsat = maxHtlcValueInFlightMsat;
    }

    public Long getChannelReserveSatoshis()
    {
        return channelReserveSatoshis;
    }

    public void setChannelReserveSatoshis(Long channelReserveSatoshis)
    {
        this.channelReserveSatoshis = channelReserveSatoshis;
    }

    public Long getHtlcMinimumMsat()
    {
        return htlcMinimumMsat;
    }

    public void setHtlcMinimumMsat(Long htlcMinimumMsat)
    {
        this.htlcMinimumMsat = htlcMinimumMsat;
    }

    public Integer getToSelfDelay()
    {
        return toSelfDelay;
    }

    public void setToSelfDelay(Integer toSelfDelay)
    {
        this.toSelfDelay = toSelfDelay;
    }

    public Integer getMaxAcceptedHtlcs()
    {
        return maxAcceptedHtlcs;
    }

    public void setMaxAcceptedHtlcs(Integer maxAcceptedHtlcs)
    {
        this.maxAcceptedHtlcs = maxAcceptedHtlcs;
    }

    public Boolean getFunder()
    {
        return isFunder;
    }

    public void setFunder(Boolean funder)
    {
        isFunder = funder;
    }

    public String getDefaultFinalScriptPubKey()
    {
        return defaultFinalScriptPubKey;
    }

    public void setDefaultFinalScriptPubKey(String defaultFinalScriptPubKey)
    {
        this.defaultFinalScriptPubKey = defaultFinalScriptPubKey;
    }

    public String getGlobalFeatures()
    {
        return globalFeatures;
    }

    public void setGlobalFeatures(String globalFeatures)
    {
        this.globalFeatures = globalFeatures;
    }

    public String getLocalFeatures()
    {
        return localFeatures;
    }

    public void setLocalFeatures(String localFeatures)
    {
        this.localFeatures = localFeatures;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
