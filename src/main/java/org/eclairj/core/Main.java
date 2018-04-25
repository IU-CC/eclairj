package org.eclairj.core;

public class Main {
    public static void main(String[] args) {
        NodeInfo nodeInfo = Eclair.api.getInfo();
        System.out.println(nodeInfo);
    }
}
