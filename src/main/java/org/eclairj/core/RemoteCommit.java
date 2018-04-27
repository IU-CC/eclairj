package org.eclairj.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class RemoteCommit {
    private Integer index;
    private Spec spec;
    private String txid;
    private String remotePerCommitmentPoint;

    public RemoteCommit() {
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getRemotePerCommitmentPoint() {
        return remotePerCommitmentPoint;
    }

    public void setRemotePerCommitmentPoint(String remotePerCommitmentPoint) {
        this.remotePerCommitmentPoint = remotePerCommitmentPoint;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
