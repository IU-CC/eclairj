package org.eclairj.core;

public class Main {
    public static void main(String[] args) {
        RequestBody body = new RequestBody("getinfo");
        Result<NodeInfo> nodeInfo = Eclair.api.getInfo(body);
        System.out.println(nodeInfo);
    }
}
