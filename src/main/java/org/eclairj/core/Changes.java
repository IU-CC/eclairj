package org.eclairj.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class Changes {
    private List<String> proposed;
    private List<String> signed;
    private List<String> acked;

    public Changes() {
    }

    public List<String> getProposed() {
        return proposed;
    }

    public void setProposed(List<String> proposed) {
        this.proposed = proposed;
    }

    public List<String> getSigned() {
        return signed;
    }

    public void setSigned(List<String> signed) {
        this.signed = signed;
    }

    public List<String> getAcked() {
        return acked;
    }

    public void setAcked(List<String> acked) {
        this.acked = acked;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
