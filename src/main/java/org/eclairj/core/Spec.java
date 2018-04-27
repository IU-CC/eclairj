package org.eclairj.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class Spec {
    private List<String> htlcs;
    private Integer feeratePerKw;
    private Long toLocalMsat;
    private Long toRemoteMsat;

    public Spec() {

    }

    public List<String> getHtlcs() {
        return htlcs;
    }

    public void setHtlcs(List<String> htlcs) {
        this.htlcs = htlcs;
    }

    public Integer getFeeratePerKw() {
        return feeratePerKw;
    }

    public void setFeeratePerKw(Integer feeratePerKw) {
        this.feeratePerKw = feeratePerKw;
    }

    public Long getToLocalMsat() {
        return toLocalMsat;
    }

    public void setToLocalMsat(Long toLocalMsat) {
        this.toLocalMsat = toLocalMsat;
    }

    public Long getToRemoteMsat() {
        return toRemoteMsat;
    }

    public void setToRemoteMsat(Long toRemoteMsat) {
        this.toRemoteMsat = toRemoteMsat;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }

}
