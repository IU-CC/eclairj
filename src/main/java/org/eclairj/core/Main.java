package org.eclairj.core;

public class Main {
    public static void main(String[] args) {
        Result nodeInfoResult = Eclair.api.getInfo();
        System.out.println(nodeInfoResult);
    }
}
