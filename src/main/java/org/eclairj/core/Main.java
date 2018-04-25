package org.eclairj.core;

public class Main {
    public static void main(String[] args) {
        NodeInfo nodeInfoResult = Eclair.api.getInfo();
        System.out.println(nodeInfoResult);

        NodeInfoResult info = nodeInfoResult.getResult();

        System.out.println(info.getAlias());
    }
}
