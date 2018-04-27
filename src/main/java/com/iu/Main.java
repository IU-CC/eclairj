package com.iu;

import com.iu.lightning.eclair.domain.Channel;
import com.iu.lightning.eclair.domain.NodeInfo;
import com.iu.lightning.eclair.domain.Peer;
import com.iu.lightning.eclair.domain.Response;

import static com.iu.Config.*;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Response<NodeInfo> nodeInfo = LN_NODE_1.getInfo();
        System.out.println(nodeInfo);
        System.out.println();

        Response<List<Peer>> peers = LN_NODE_1.peers();
        System.out.println(peers);
        System.out.println();

        Response<List<Channel>> info = LN_NODE_1.channels(LN_NODE_2_PUB);
        System.out.println(info);
        System.out.println();

        Response<Channel> channel = LN_NODE_1.channel(LN_TEST_CHANNEL);
        System.out.println(channel);
        System.out.println();

        try
        {
            Response<List<String>> route = LN_NODE_1.findroute(LN_NODE_2_PUB);
            System.out.println(route);
            System.out.println();
        } catch (Exception e)
        {
            System.out.println("No route found");
            System.out.println(e);
        }

        Response<List<String>> methods = LN_NODE_1.help();
        System.out.println(methods);
        System.out.println();
    }
}
