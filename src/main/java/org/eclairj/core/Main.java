package org.eclairj.core;

public class Main {
    public static void main(String[] args) {
        RequestBody body = new RequestBody("getinfo");
        NodeInfo nodeInfoResult = Eclair.api.getInfo(body);
        System.out.println(nodeInfoResult);
    }
}
