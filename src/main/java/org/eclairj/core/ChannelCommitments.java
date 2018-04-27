package org.eclairj.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class ChannelCommitments {
    private LocalParams localParams;
    private RemoteParams remoteParams;
    private Integer channelFlags;
    private LocalCommit localCommit;
    private RemoteCommit remoteCommit;
    private Changes localChanges;
    private Changes remoteChanges;
    private Integer localNextHtlcId;
    private Integer remoteNextHtlcId;
    private OriginChannels originChannels;
    private String remoteNextCommitInfo;
    private CommitInput commitInput;
    private RemotePerCommitmentSecrets remotePerCommitmentSecrets;
    private String channelId;

    public ChannelCommitments() {
    }

    public LocalParams getLocalParams() {
        return localParams;
    }

    public void setLocalParams(LocalParams localParams) {
        this.localParams = localParams;
    }

    public RemoteParams getRemoteParams() {
        return remoteParams;
    }

    public void setRemoteParams(RemoteParams remoteParams) {
        this.remoteParams = remoteParams;
    }

    public Integer getChannelFlags() {
        return channelFlags;
    }

    public void setChannelFlags(Integer channelFlags) {
        this.channelFlags = channelFlags;
    }

    public LocalCommit getLocalCommit() {
        return localCommit;
    }

    public void setLocalCommit(LocalCommit localCommit) {
        this.localCommit = localCommit;
    }

    public RemoteCommit getRemoteCommit() {
        return remoteCommit;
    }

    public void setRemoteCommit(RemoteCommit remoteCommit) {
        this.remoteCommit = remoteCommit;
    }

    public Changes getLocalChanges() {
        return localChanges;
    }

    public void setLocalChanges(Changes localChanges) {
        this.localChanges = localChanges;
    }

    public Changes getRemoteChanges() {
        return remoteChanges;
    }

    public void setRemoteChanges(Changes remoteChanges) {
        this.remoteChanges = remoteChanges;
    }

    public Integer getLocalNextHtlcId() {
        return localNextHtlcId;
    }

    public void setLocalNextHtlcId(Integer localNextHtlcId) {
        this.localNextHtlcId = localNextHtlcId;
    }

    public Integer getRemoteNextHtlcId() {
        return remoteNextHtlcId;
    }

    public void setRemoteNextHtlcId(Integer remoteNextHtlcId) {
        this.remoteNextHtlcId = remoteNextHtlcId;
    }

    public OriginChannels getOriginChannels() {
        return originChannels;
    }

    public void setOriginChannels(OriginChannels originChannels) {
        this.originChannels = originChannels;
    }

    public String getRemoteNextCommitInfo() {
        return remoteNextCommitInfo;
    }

    public void setRemoteNextCommitInfo(String remoteNextCommitInfo) {
        this.remoteNextCommitInfo = remoteNextCommitInfo;
    }

    public CommitInput getCommitInput() {
        return commitInput;
    }

    public void setCommitInput(CommitInput commitInput) {
        this.commitInput = commitInput;
    }

    public RemotePerCommitmentSecrets getRemotePerCommitmentSecrets() {
        return remotePerCommitmentSecrets;
    }

    public void setRemotePerCommitmentSecrets(RemotePerCommitmentSecrets remotePerCommitmentSecrets) {
        this.remotePerCommitmentSecrets = remotePerCommitmentSecrets;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }

}
