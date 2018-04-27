package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class RemoteParams {
    private String nodeId;
    private Long dustLimitSatoshis;
    private Long maxHtlcValueInFlightMsat;
    private Long channelReserveSatoshis;
    private Long htlcMinimumMsat;
    private Integer toSelfDelay;
    private Integer maxAcceptedHtlcs;
    private String fundingPubKey;
    private String revocationBasepoint;
    private String paymentBasepoint;
    private String delayedPaymentBasepoint;
    private String htlcBasepoint;
    private String globalFeatures;
    private String localFeatures;

    public RemoteParams() {

    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Long getDustLimitSatoshis() {
        return dustLimitSatoshis;
    }

    public void setDustLimitSatoshis(Long dustLimitSatoshis) {
        this.dustLimitSatoshis = dustLimitSatoshis;
    }

    public Long getMaxHtlcValueInFlightMsat() {
        return maxHtlcValueInFlightMsat;
    }

    public void setMaxHtlcValueInFlightMsat(Long maxHtlcValueInFlightMsat) {
        this.maxHtlcValueInFlightMsat = maxHtlcValueInFlightMsat;
    }

    public Long getChannelReserveSatoshis() {
        return channelReserveSatoshis;
    }

    public void setChannelReserveSatoshis(Long channelReserveSatoshis) {
        this.channelReserveSatoshis = channelReserveSatoshis;
    }

    public Long getHtlcMinimumMsat() {
        return htlcMinimumMsat;
    }

    public void setHtlcMinimumMsat(Long htlcMinimumMsat) {
        this.htlcMinimumMsat = htlcMinimumMsat;
    }

    public Integer getToSelfDelay() {
        return toSelfDelay;
    }

    public void setToSelfDelay(Integer toSelfDelay) {
        this.toSelfDelay = toSelfDelay;
    }

    public Integer getMaxAcceptedHtlcs() {
        return maxAcceptedHtlcs;
    }

    public void setMaxAcceptedHtlcs(Integer maxAcceptedHtlcs) {
        this.maxAcceptedHtlcs = maxAcceptedHtlcs;
    }

    public String getFundingPubKey() {
        return fundingPubKey;
    }

    public void setFundingPubKey(String fundingPubKey) {
        this.fundingPubKey = fundingPubKey;
    }

    public String getRevocationBasepoint() {
        return revocationBasepoint;
    }

    public void setRevocationBasepoint(String revocationBasepoint) {
        this.revocationBasepoint = revocationBasepoint;
    }

    public String getPaymentBasepoint() {
        return paymentBasepoint;
    }

    public void setPaymentBasepoint(String paymentBasepoint) {
        this.paymentBasepoint = paymentBasepoint;
    }

    public String getDelayedPaymentBasepoint() {
        return delayedPaymentBasepoint;
    }

    public void setDelayedPaymentBasepoint(String delayedPaymentBasepoint) {
        this.delayedPaymentBasepoint = delayedPaymentBasepoint;
    }

    public String getHtlcBasepoint() {
        return htlcBasepoint;
    }

    public void setHtlcBasepoint(String htlcBasepoint) {
        this.htlcBasepoint = htlcBasepoint;
    }

    public String getGlobalFeatures() {
        return globalFeatures;
    }

    public void setGlobalFeatures(String globalFeatures) {
        this.globalFeatures = globalFeatures;
    }

    public String getLocalFeatures() {
        return localFeatures;
    }

    public void setLocalFeatures(String localFeatures) {
        this.localFeatures = localFeatures;
    }
}
