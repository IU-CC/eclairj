package com.iu.lightning.eclair.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class PublishableTxs
{
    private String commitTx;
    private List<String> htlcTxsAndSigs;

    public PublishableTxs()
    {
    }

    public String getCommitTx()
    {
        return commitTx;
    }

    public void setCommitTx(String commitTx)
    {
        this.commitTx = commitTx;
    }

    public List<String> getHtlcTxsAndSigs()
    {
        return htlcTxsAndSigs;
    }

    public void setHtlcTxsAndSigs(List<String> htlcTxsAndSigs)
    {
        this.htlcTxsAndSigs = htlcTxsAndSigs;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
