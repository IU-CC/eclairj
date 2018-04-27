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

        Response<Channel> channel = Eclair.api.channel("1e666222e57c9420e1ee975e6bfcca91ad4a65c3604de312513b56d829d744fc");
        System.out.println(channel);
        System.out.println();

        try {
            Response<List<String>> route = Eclair.api.findroute("024fc11b24f670aebc2a3c76d3a59cc01f0364e5e194fb98cbc203746d43c578df");
            System.out.println(route);
            System.out.println();
        } catch (Exception e) {
            System.out.println("No route found");
            System.out.println();
        }

        Response<List<String>> methods = Eclair.api.help();
        System.out.println(methods);
        System.out.println();
    }
}
