package org.eclairj.core;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Response<NodeInfo> nodeInfo = Eclair.api.getInfo();
        System.out.println(nodeInfo);
        System.out.println();

        Response<List<Peer>> peers = Eclair.api.peers();
        System.out.println(peers);
        System.out.println();

        Response<List<Channel>> info = Eclair.api.channels("024fc11b24f670aebc2a3c76d3a59cc01f0364e5e194fb98cbc203746d43c578df");
        System.out.println(info);
        System.out.println();
    }
}
