package org.eclairj.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class ChannelUpdate {
    private String signature;
    private String chainHash;
    private String shortChannelId;
    private Long timestamp;
    private String flags;
    private Integer cltvExpiryDelta;
    private Integer htlcMinimumMsat;
    private Integer feeBaseMsat;
    private Integer feeProportionalMillionths;

    public ChannelUpdate() {

    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getChainHash() {
        return chainHash;
    }

    public void setChainHash(String chainHash) {
        this.chainHash = chainHash;
    }

    public String getShortChannelId() {
        return shortChannelId;
    }

    public void setShortChannelId(String shortChannelId) {
        this.shortChannelId = shortChannelId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public Integer getCltvExpiryDelta() {
        return cltvExpiryDelta;
    }

    public void setCltvExpiryDelta(Integer cltvExpiryDelta) {
        this.cltvExpiryDelta = cltvExpiryDelta;
    }

    public Integer getHtlcMinimumMsat() {
        return htlcMinimumMsat;
    }

    public void setHtlcMinimumMsat(Integer htlcMinimumMsat) {
        this.htlcMinimumMsat = htlcMinimumMsat;
    }

    public Integer getFeeBaseMsat() {
        return feeBaseMsat;
    }

    public void setFeeBaseMsat(Integer feeBaseMsat) {
        this.feeBaseMsat = feeBaseMsat;
    }

    public Integer getFeeProportionalMillionths() {
        return feeProportionalMillionths;
    }

    public void setFeeProportionalMillionths(Integer feeProportionalMillionths) {
        this.feeProportionalMillionths = feeProportionalMillionths;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
